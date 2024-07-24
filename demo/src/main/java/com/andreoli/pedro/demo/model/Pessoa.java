package com.andreoli.pedro.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@MappedSuperclass
@Getter
@Setter
public abstract class Pessoa {
    private String nome;
    private String bio;

}
