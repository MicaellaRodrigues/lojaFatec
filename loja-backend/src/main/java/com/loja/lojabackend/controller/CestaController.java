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

import com.loja.lojabackend.model.Cesta;
import com.loja.lojabackend.repository.CestaRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cesta")
@AllArgsConstructor

public class CestaController {

  private CestaRepository cestaRepository;

  @GetMapping
  public List<Cesta> list() {
    return cestaRepository.findAll();
  }

  @GetMapping("/id")
  public ResponseEntity<Cesta> getByID(@PathVariable Long id) {
    return cestaRepository.findById(id)
        .map(result -> ResponseEntity.ok().body(result))
        .orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  public Cesta create(@RequestBody Cesta cesta) {
    return cestaRepository.save(cesta);

  }

  @PutMapping("/{id}")
  public ResponseEntity<Cesta> update(@PathVariable Long id, @RequestBody Cesta cesta) {
    return cestaRepository.findById(id)
        .map(result -> {
          result.setItem(cesta.getItem());
          Cesta updated = cestaRepository.save(result);
          return ResponseEntity.ok().body(updated);
        })
        .orElse(ResponseEntity.notFound().build());
  }

}
