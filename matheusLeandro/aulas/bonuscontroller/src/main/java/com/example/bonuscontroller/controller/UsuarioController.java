package com.example.bonuscontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("/{id}")
    public String buscarPorId(@PathVariable Long id) {
        return "Usuario com id " + id;
    }

    @GetMapping("/buscar")
    public String buscarPorNome(@RequestParam String nome) {
        return "Usuario com nome " + nome;
    }
}
