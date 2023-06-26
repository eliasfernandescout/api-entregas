package com.apientregas.modelo;

public class Produto {
    private String nome;
    private double valorTotal;

    public Produto(String nome, double valorTotal) {
        this.nome = nome;
        this.valorTotal = valorTotal;
    }

    public String getNome() {
        return nome;
    }

    public double getValorTotal() {
        return valorTotal;
    }

}
