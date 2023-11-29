package com.loja.lojabackend.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.loja.lojabackend.repository.ProdutoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/produto")
@AllArgsConstructor

public class ProdutoController {

    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Long> list() {
        return produtoRepository.findAll();
    }

}
