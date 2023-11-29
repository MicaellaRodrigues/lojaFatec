package com.loja.lojabackend.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.loja.lojabackend.repository.CestaRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cesta")
@AllArgsConstructor

public class CestaController {

    private CestaRepository cestaRepository;

    @GetMapping
    public List<Long> list() {
        return cestaRepository.findAll();
    }
}
