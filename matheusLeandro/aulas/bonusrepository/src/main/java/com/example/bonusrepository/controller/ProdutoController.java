package com.example.bonusrepository.controller;

import com.example.bonusrepository.model.ProdutoModel;
import com.example.bonusrepository.repository.ProdutoReposiitory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoReposiitory produtoReposiitory;

    @PostMapping
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody ProdutoModel produto) {
        ProdutoModel produtoSalvo = produtoReposiitory.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> listarProdutos() {
        return ResponseEntity.ok(produtoReposiitory.findAll());
    }
}
