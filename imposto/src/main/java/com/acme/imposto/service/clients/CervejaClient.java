package com.acme.imposto.service.clients;

import com.acme.imposto.model.Cerveja;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("CERVEJA-SERVICE")
public interface CervejaClient {
    @GetMapping("/{id}")
    Cerveja getById(@PathVariable Long id);
}
