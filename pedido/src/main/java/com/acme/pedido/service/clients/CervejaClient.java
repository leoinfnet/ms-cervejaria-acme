package com.acme.pedido.service.clients;

import com.acme.pedido.model.Cerveja;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("CERVEJA-SERVICE")
public interface CervejaClient {
    @GetMapping
    List<Cerveja> getAll();
    @GetMapping("/{id}")
    Cerveja getById(@PathVariable("id") Long id);
}
