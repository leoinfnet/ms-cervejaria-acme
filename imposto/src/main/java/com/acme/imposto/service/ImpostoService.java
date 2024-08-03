package com.acme.imposto.service;

import com.acme.imposto.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ImpostoService {
    private final CervejaService cervejaService;
    private final FabricanteService fabricanteService;
    public BigDecimal getTotal(PedidoPayload pedidoPayload) {
        return  pedidoPayload.items()
                .stream().map(this::calcularImposto)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
    private BigDecimal calcularImposto(ItemPedido itemPedido) {
        Cerveja cerveja = cervejaService.getById(itemPedido.getCervejaId());
        Fabricante fabricante = fabricanteService.getById(cerveja.getFabricanteId());
        BigDecimal taxas = getTaxas(fabricante.getPais());
        return cerveja.getPreco().multiply(taxas).multiply(new BigDecimal(itemPedido.getQuantidade()));
    }

    private BigDecimal getTaxas(Pais pais){
        return switch (pais){
            case USA -> new BigDecimal("0.05");
            case BRASIL ->  new BigDecimal("0.03");
            case EUROPA -> new BigDecimal("0.15");
        };
    }
}
