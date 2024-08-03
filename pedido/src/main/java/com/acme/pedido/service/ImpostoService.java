package com.acme.pedido.service;

import com.acme.pedido.model.ImpostoPayload;
import com.acme.pedido.model.Pedido;
import com.acme.pedido.service.clients.ImpostoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ImpostoService {
    private final ImpostoClient client;
    public ImpostoPayload getTotal(Pedido pedido){
           return  client.calcular(pedido);
//        RestClient client = RestClient.create();
//        var serverUrl = "http://localhost:8086";
//        return client.post().uri(serverUrl)
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(pedido)
//                .retrieve()
//                .toEntity(ImpostoPayload.class).getBody();

    }
}
