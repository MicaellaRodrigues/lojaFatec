package com.loja.lojabackend.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.loja.lojabackend.repository.ClienteRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cliente")
@AllArgsConstructor

public class ClienteController {

    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Long> list() {
        return clienteRepository.findAll();
    }
}
