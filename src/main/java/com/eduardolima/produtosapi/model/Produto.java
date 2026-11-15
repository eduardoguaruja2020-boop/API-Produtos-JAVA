package com.eduardolima.produtosapi.model;

// POJO - Plain Old Java Object
// Bom e velho objeto java, com seus atributos, getters, setters e métodos
// Nesse arquivo, eu crio o objeto produto e seus atributos, que será enviado ao banco de dados

import org.springframework.web.bind.annotation.PostMapping;

public class Produto {
    private String id;
    private String nome;
    private String descricao;
    private double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
