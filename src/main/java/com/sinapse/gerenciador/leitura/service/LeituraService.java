package com.sinapse.gerenciador.leitura.service;

import com.sinapse.gerenciador.leitura.dto.LeituraRequestDTO;
import com.sinapse.gerenciador.leitura.model.Leituras;
import com.sinapse.gerenciador.leitura.model.StatusLeitura;
import com.sinapse.gerenciador.leitura.repository.LeituraRepository;
import com.sinapse.gerenciador.pontoNfc.model.PontoNfc;
import com.sinapse.gerenciador.pontoNfc.repository.PontoNfcRepository;
import com.sinapse.gerenciador.user.model.User;
import com.sinapse.gerenciador.user.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LeituraService {

    private final LeituraRepository leituraRepository;
    private final PontoNfcRepository pontoNfcRepository;
    private final UserRepository userRepository;

    public LeituraService(LeituraRepository leituraRepository, PontoNfcRepository pontoNfcRepository, UserRepository userRepository) {
        this.leituraRepository = leituraRepository;
        this.pontoNfcRepository = pontoNfcRepository;
        this.userRepository = userRepository;
    }

    public Leituras registrarLeitura(LeituraRequestDTO dto){

        //Buscar Usuario por id
        User user = userRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
        //Buscar PontoNfc por id
        PontoNfc pontoNfc = pontoNfcRepository.findById(dto.getPontoNfcId())
                .orElseThrow(() -> new EntityNotFoundException("Ponto NFC não encontrado"));

        //Criar nova leitura
        Leituras leitura = new Leituras();

        //Preencher dados vindos do DTO
        leitura.setUsuario(user);
        leitura.setPontoNfc(pontoNfc);
        leitura.setCodigoNfcLido(dto.getCodigoNfcLido());
        leitura.setLatitude(dto.getLatitude());
        leitura.setLongitude(dto.getLongitude());
        leitura.setPrecisao(dto.getPrecisao());
        leitura.setHoraAparelho(dto.getHoraAparelho());

        //Definir hora servidor como agora
        leitura.setHoraServidor(LocalDateTime.now());

        //Definir status inicial
        leitura.setStatus(StatusLeitura.SUCCESS);


        //Salvar no banco
        return leituraRepository.save(leitura);

    }
    //Buscar Todas as leituras
    public List<Leituras> listarLeituras(){
        return leituraRepository.findAll();
    }
    //Buscar leitura por ID
    public Leituras buscarPorId(Long id) {
        return leituraRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Leitura não encontrada"));
    }
    //Buscar leitura por Usuario
    public List<Leituras> buscarPorUsuario(Long usuarioId) {
        return leituraRepository.findByUsuarioId(usuarioId);
    }
}
