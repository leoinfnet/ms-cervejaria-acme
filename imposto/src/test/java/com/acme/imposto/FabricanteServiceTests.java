package com.acme.imposto;

import com.acme.imposto.model.Fabricante;
import com.acme.imposto.service.FabricanteService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
public class FabricanteServiceTests {
    @Autowired
    FabricanteService fabricanteService;
    @Test
    public void deveREtornarUmFabricante(){
        Fabricante byId = fabricanteService.getById(1L);
        log.info(byId.toString());
        assertNotNull(byId);

    }
}
