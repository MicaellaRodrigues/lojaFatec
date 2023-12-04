package com.loja.lojabackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 120, nullable = false)
    private String nome;

    @Column(length = 120, nullable = false)
    private String sobrenome;

    @Column(length = 120, nullable = false)
    private String dataNascimento;

    @Column(length = 320, nullable = false)
    private String email;

    @Column(length = 12, nullable = false)
    private String senha;

    @Column(length = 15, nullable = false)
    private String cpf;

    @Column(length = 15, nullable = false)
    private String celular;

    @Column(length = 100, nullable = false)
    private String rua;

    @Column(length = 15, nullable = false)
    private String cep;

    @Column(length = 50, nullable = false)
    private String bairro;

    @Column(length = 50, nullable = false)
    private String cidade;

    @Column(length = 2, nullable = false)
    private String estado;

}