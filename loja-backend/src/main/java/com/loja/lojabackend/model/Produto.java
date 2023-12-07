package com.loja.lojabackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Produto {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 120, nullable = false)
  private String nomeProduto;

  @Column(length = 120, nullable = false)
  private String descricao;

  @Column(length = 1, nullable = false)
  private String tamanho;

  @Column(length = 50, nullable = false)
  private double valorProduto;

  @Column(length = 10, nullable = false)
  private int codProduto;
}
