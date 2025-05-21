package com.borges.curso_api.entity;


import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class Pessoa {

    protected String nome;
    protected String email;
    protected String cpf;
}
