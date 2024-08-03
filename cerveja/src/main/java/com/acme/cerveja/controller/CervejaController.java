package com.acme.cerveja.controller;

import com.acme.cerveja.conf.ApplicationCache;
import com.acme.cerveja.model.Cerveja;
import com.acme.cerveja.service.CervejaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/")
@AllArgsConstructor
@Slf4j
public class CervejaController {
    private final CervejaService cervejaService;
    private final ApplicationCache cache;
    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(cervejaService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        log.info("NAME: "+ cache.appName);
        log.info("Find cerveja by id: {}", id);
        Optional<Cerveja> byId = cervejaService.findById(id);
        if (byId.isPresent()) {
            return ResponseEntity.ok(byId);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
