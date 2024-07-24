package com.andreoli.pedro.demo.repository;

import com.andreoli.pedro.demo.model.Escritor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscritorRepository extends JpaRepository<Escritor, Long> {
}
