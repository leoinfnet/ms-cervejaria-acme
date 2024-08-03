package com.acme.pedido.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
@ToString
@Document(collection = "pedidos")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pedido {
    @Id
    private String id;
    private List<ItemPedido> items;
    private BigDecimal totalSemImposto;
    private BigDecimal imposto;
    private BigDecimal valorTotal;
}
