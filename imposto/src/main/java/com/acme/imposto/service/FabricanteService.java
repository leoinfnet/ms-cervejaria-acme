package com.acme.imposto.service;

import com.acme.imposto.model.Fabricante;
import com.acme.imposto.service.clients.FabricanteClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class FabricanteService {
    private final FabricanteClient client;
    public Fabricante getById(long fabricanteId) {
         return client.getById(fabricanteId);
//        RestClient client = RestClient.create();
//        String serverUrl = String.format("http://localhost:8083/%d", fabricanteId);
//        return client.get().uri(serverUrl).retrieve()
//                .toEntity(Fabricante.class).getBody();
    }
}
