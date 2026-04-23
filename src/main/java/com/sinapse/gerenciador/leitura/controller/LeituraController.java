package com.sinapse.gerenciador.leitura.controller;

import com.sinapse.gerenciador.leitura.dto.LeituraRequestDTO;
import com.sinapse.gerenciador.leitura.model.Leituras;
import com.sinapse.gerenciador.leitura.service.LeituraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leitura")
public class LeituraController {

    private final LeituraService leituraService;

    public LeituraController (LeituraService leituraService){
        this.leituraService = leituraService;
    }

    @PostMapping
    public ResponseEntity<?> createLeitura(@RequestBody LeituraRequestDTO leituraRequestDTO) {

        Leituras savedLeituras = leituraService.registrarLeitura(leituraRequestDTO);

        return new ResponseEntity<>(savedLeituras, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Leituras>> getAllLeituras() {
        return ResponseEntity.ok(leituraService.listarLeituras());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Leituras> getLeituraById(@PathVariable Long id) {
        Leituras leitura = leituraService.buscarPorId(id);
        return ResponseEntity.ok(leitura);
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<Leituras>> getLeiturasByUsuario(@PathVariable Long usuarioId) {
        List<Leituras> leituras = leituraService.buscarPorUsuario(usuarioId);
        return ResponseEntity.ok(leituras);
    }
}
