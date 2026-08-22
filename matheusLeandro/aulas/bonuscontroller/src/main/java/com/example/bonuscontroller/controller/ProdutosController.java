package com.example.bonuscontroller.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    @GetMapping
    public ResponseEntity<String> listarProdutos() {
        return ResponseEntity.ok("Lista de produtos");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> listarProduto(@PathVariable Long id) {
        return ResponseEntity.ok("Listando produto " + id);
    }

    @PostMapping
    public ResponseEntity<String> criarProduto(@RequestBody String produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Produto criado");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarProduto(@PathVariable Long id, @RequestBody String produto) {
        return ResponseEntity.ok("Produto " + produto + " de id " + id + " atualizado");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarProduto(@PathVariable Long id) {
        return ResponseEntity.ok("Produto " + id + " deletado");
    }
}
