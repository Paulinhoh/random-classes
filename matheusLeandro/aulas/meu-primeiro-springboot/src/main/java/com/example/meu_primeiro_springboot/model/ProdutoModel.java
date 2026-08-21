package com.example.meu_primeiro_springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class ProdutoModel {

    @Id // indica que e um id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que e uma chave primaria e vai incrementando sequencialmente (controlado pelo banco de dados)
    private Long id;

    private String nome;
    private Double preco;


    // construtores (com e sem argumentos)
    public ProdutoModel() {
    }

    public ProdutoModel(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    // getters
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }


    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
