package com.acme.pedido.service.clients;

import com.acme.pedido.model.ImpostoPayload;
import com.acme.pedido.model.Pedido;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("IMPOSTO-SERVICE")
public interface ImpostoClient {
    @PostMapping
    ImpostoPayload calcular(@RequestBody Pedido pedido);
}
