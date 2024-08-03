package com.acme.imposto.service;

import com.acme.imposto.model.Cerveja;
import com.acme.imposto.service.clients.CervejaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CervejaService {
    private final CervejaClient client;
    public Cerveja getById(Long cervejaId) {
        return client.getById(cervejaId);
//        var serverUrl = String.format("http://localhost:8082/%d", cervejaId);
//        RestClient client = RestClient.create();
//        return client.get()
//                .uri(serverUrl).retrieve()
//                .toEntity(Cerveja.class).getBody();
    }
}
