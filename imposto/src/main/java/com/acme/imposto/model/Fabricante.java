package com.acme.imposto.model;

import lombok.*;

@Data@AllArgsConstructor@NoArgsConstructor@Builder@ToString
public class Fabricante {
    private Long id;
    private String nome;
    private Pais pais;
}
