package com.sinapse.gerenciador.pontoNfc.controller;

import com.sinapse.gerenciador.pontoNfc.dto.PontoNfcResponseDTO;
import com.sinapse.gerenciador.pontoNfc.service.PontoNfcService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ponto-nfc")
public class PontoNfcController {

    private final PontoNfcService pontoNfcService;

    public PontoNfcController(PontoNfcService pontoNfcService) {
        this.pontoNfcService = pontoNfcService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PontoNfcResponseDTO> getPontoNfcById(@PathVariable Long id) {
        return ResponseEntity.ok(pontoNfcService.buscarPorId(id));
    }

    @GetMapping("/codigo/{codigoNfc}")
    public ResponseEntity<PontoNfcResponseDTO> getPontoNfcByCodigo(@PathVariable String codigoNfc) {
        return ResponseEntity.ok(pontoNfcService.buscarPorCodigo(codigoNfc));
    }
}