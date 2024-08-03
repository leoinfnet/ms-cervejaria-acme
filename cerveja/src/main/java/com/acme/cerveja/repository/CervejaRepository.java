package com.acme.cerveja.repository;

import com.acme.cerveja.model.Cerveja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CervejaRepository extends JpaRepository<Cerveja, Long> {
}
