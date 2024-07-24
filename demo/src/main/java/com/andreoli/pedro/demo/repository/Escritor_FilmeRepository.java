package com.andreoli.pedro.demo.repository;

import com.andreoli.pedro.demo.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Escritor_FilmeRepository extends JpaRepository<Filme, Long> {
}
