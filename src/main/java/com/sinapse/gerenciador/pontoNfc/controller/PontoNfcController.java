package com.sinapse.gerenciador.pontoNfc.controller;

import com.sinapse.gerenciador.pontoNfc.model.PontoNfc;
import com.sinapse.gerenciador.pontoNfc.repository.PontoNfcRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ponto-nfc")
public class PontoNfcController {

    private final PontoNfcRepository pontoNfcRepository;

    public PontoNfcController(PontoNfcRepository pontoNfcRepository) {
        this.pontoNfcRepository = pontoNfcRepository;
    }

    @PostMapping
    public ResponseEntity<PontoNfc> createPontoNfc(@RequestBody PontoNfc pontoNfc) {
        PontoNfc savedPontoNfc = pontoNfcRepository.save(pontoNfc);
        System.out.println("Ponto NFC recebido: " + pontoNfc.getNome());
        return new ResponseEntity<>(savedPontoNfc, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PontoNfc>> getAllPontosNfc() {
        List<PontoNfc> pontosNfc = pontoNfcRepository.findAll();
        return new ResponseEntity<>(pontosNfc, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PontoNfc> getPontoNfcById(@PathVariable Long id) {
        Optional<PontoNfc> pontoNfcOptional = pontoNfcRepository.findById(id);
        if (pontoNfcOptional.isPresent()) {
            return new ResponseEntity<>(pontoNfcOptional.get(), HttpStatus.OK);
            }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
