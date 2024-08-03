package com.acme.fabricante.controller;

import com.acme.fabricante.model.Fabricante;
import com.acme.fabricante.service.FabricanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class FabricanteController {
    private final FabricanteService fabricanteService;
    @GetMapping
    public ResponseEntity<?> getFabricantes() {
        return ResponseEntity.ok(fabricanteService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getFabricanteById(@PathVariable Long id) {
        return ResponseEntity.ok(fabricanteService.getById(id));
    }
}
