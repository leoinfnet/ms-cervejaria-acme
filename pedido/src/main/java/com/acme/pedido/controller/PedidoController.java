package com.acme.pedido.controller;

import com.acme.pedido.model.ImpostoPayload;
import com.acme.pedido.model.Pedido;
import com.acme.pedido.service.ImpostoService;
import com.acme.pedido.service.PedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class PedidoController {
    private final PedidoService pedidoService;
    private final ImpostoService impostoService;
    @PostMapping
    public ResponseEntity<Pedido> create(@RequestBody Pedido pedido){
        log.info("Creating Pedido:" + pedido.toString());
        BigDecimal totalImposto = impostoService.getTotal(pedido).getTotalImposto();
        BigDecimal valorSemImposto = pedidoService.calcularValorTotal(pedido);
        pedido.setTotalSemImposto(valorSemImposto);
        pedido.setImposto(totalImposto);
        pedido.setValorTotal(valorSemImposto.add(totalImposto));
        pedidoService.salvar(pedido);
        return ResponseEntity.ok(pedido);
    }
}
