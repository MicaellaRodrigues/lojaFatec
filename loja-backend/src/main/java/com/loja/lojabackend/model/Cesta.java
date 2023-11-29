package com.loja.lojabackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Cesta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, nullable = false)
    private String item;

    @Column(length = 50, nullable = false)
    private double quantidade;

    @Column(length = 50, nullable = false)
    private double valorUnitario;

    @Column(length = 50, nullable = false)
    private double valorTotal;

    @Column(length = 50, nullable = false)
    private double valorFinal;

}