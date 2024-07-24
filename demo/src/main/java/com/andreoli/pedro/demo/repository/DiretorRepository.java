package com.andreoli.pedro.demo.repository;

import com.andreoli.pedro.demo.model.Diretor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretorRepository extends JpaRepository<Diretor,Long> {
}
