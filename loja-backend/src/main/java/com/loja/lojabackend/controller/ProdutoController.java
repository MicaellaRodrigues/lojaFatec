package com.loja.lojabackend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.loja.lojabackend.model.Produto;
import com.loja.lojabackend.repository.ProdutoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/produto")
@AllArgsConstructor

public class ProdutoController {

  private ProdutoRepository produtoRepository;

  @GetMapping
  public List<Produto> list() {
    return produtoRepository.findAll();
  }

  @GetMapping("/id")
  public ResponseEntity<Produto> getByID(@PathVariable Long id) {
    return produtoRepository.findById(id)
        .map(result -> ResponseEntity.ok().body(result))
        .orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  public Produto create(@RequestBody Produto produto) {
    return produtoRepository.save(produto);

  }

  @PutMapping("/{id}")
  public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto) {
    return produtoRepository.findById(id)
        .map(result -> {
          result.setNomeProduto(produto.getNomeProduto());
          Produto updated = produtoRepository.save(result);
          return ResponseEntity.ok().body(updated);
        })
        .orElse(ResponseEntity.notFound().build());
  }

}
