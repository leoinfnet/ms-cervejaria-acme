package com.acme.imposto.controller;

import com.acme.imposto.model.PedidoPayload;
import com.acme.imposto.service.ImpostoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class ImpostoController {
    private final ImpostoService impostoService;
    @PostMapping
    public ResponseEntity<?> calcularImposto(@RequestBody PedidoPayload payload){
      log.info("Calculando pedido payload: {}", payload);
      BigDecimal total = impostoService.getTotal(payload);
      return ResponseEntity.ok(Map.of("totalImposto", total));
    }
}
