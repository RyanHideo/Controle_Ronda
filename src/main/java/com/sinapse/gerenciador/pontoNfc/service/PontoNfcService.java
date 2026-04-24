package com.sinapse.gerenciador.pontoNfc.service;


import com.sinapse.gerenciador.pontoNfc.model.PontoNfc;
import com.sinapse.gerenciador.pontoNfc.dto.PontoNfcResponseDTO;
import com.sinapse.gerenciador.pontoNfc.repository.PontoNfcRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PontoNfcService {

    private final PontoNfcRepository pontoNfcRepository;

    public PontoNfcService(PontoNfcRepository pontoNfcRepository)
        {
        this.pontoNfcRepository = pontoNfcRepository;
    }

    //Buscar ponto por id
    public PontoNfcResponseDTO buscarPorId(Long id) {
        PontoNfc ponto = pontoNfcRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Ponto NFC não encontrado"));

        return toResponseDTO(ponto);
    }
    private PontoNfcResponseDTO toResponseDTO(PontoNfc ponto) {
        if (ponto == null) return null;

        PontoNfcResponseDTO dto = new PontoNfcResponseDTO();
        dto.setId(ponto.getId());
        dto.setCodigoNfc(ponto.getCodigoNfc());
        dto.setNome(ponto.getNome());
        dto.setLatitude(ponto.getLatitude());
        dto.setLongitude(ponto.getLongitude());
        dto.setRaioPermitido(ponto.getRaioPermitido());
        dto.setStatus(ponto.getStatus());
        return dto;
    }

    //Buscar por codigo nfc
    public PontoNfcResponseDTO buscarPorCodigo(String codigoNfc) {
        PontoNfc ponto = pontoNfcRepository.findByCodigoNfc(codigoNfc)
                .orElseThrow(() -> new EntityNotFoundException("Ponto NFC não encontrado"));

        return toResponseDTO(ponto);
    }

}
