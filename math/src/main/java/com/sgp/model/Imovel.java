package com.SGP.model;

public class Imovel {

    private String endereco;
    private String tipo;
    private double preco;

    public Imovel(String endereco, String tipo, double preco) {
        this.endereco = endereco;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Endereço: " + endereco +
               " | Tipo: " + tipo +
               " | Preço: R$ " + preco;
    }
}