package com.acme.pedido.service;

import com.acme.pedido.model.Cerveja;
import com.acme.pedido.service.clients.CervejaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class CervejaService {
    private final CervejaClient client;
     public Cerveja getById(Long id){
         return    client.getById(id);
//         var serverUrl = String.format("http://localhost:8082/%d", id);
//         RestClient client = RestClient.create();
//         return client.get()
//                 .uri(serverUrl).retrieve()
//                 .toEntity(Cerveja.class).getBody();
     }
}
