package com.loja.lojabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.lojabackend.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
