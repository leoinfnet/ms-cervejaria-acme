package com.acme.fabricante.service;

import com.acme.fabricante.model.Fabricante;
import com.acme.fabricante.repository.FabricanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service@RequiredArgsConstructor
public class FabricanteService {
    private final FabricanteRepository fabricanteRepository;
    public List<Fabricante> getAll(){
        return fabricanteRepository.findAll();
    }
    public Fabricante getById(long id){
        return fabricanteRepository.findById(id).get();
    }
}
