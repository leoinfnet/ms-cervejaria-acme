package com.acme.cerveja.service;

import com.acme.cerveja.model.Cerveja;
import com.acme.cerveja.repository.CervejaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CervejaService {
    private final CervejaRepository cervejaRepository;
    public Optional<Cerveja> findById(Long id){
        return cervejaRepository.findById(id);
    }

    public List<Cerveja> findAll(){
        return cervejaRepository.findAll();
    }
}
