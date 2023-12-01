package com.loja.lojabackend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.loja.lojabackend.model.Cliente;
import com.loja.lojabackend.repository.ClienteRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cliente")
@AllArgsConstructor

public class ClienteController {

    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> list() {
        return clienteRepository.findAll();
    }

    @GetMapping("/id")
    public ResponseEntity<Cliente> getByID(@PathVariable Long id) {
        return clienteRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);

    }

}
