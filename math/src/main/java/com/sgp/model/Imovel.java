package com.sgp.model;

// representa um imóvel da imobiliária
public class Imovel {

    // atributos do imóvel
    private String endereco;
    private String tipo;
    private double preco;

    // construtor que cria o imóvel com os dados
    public Imovel(String endereco, String tipo, double preco) {
        this.endereco = endereco;
        this.tipo = tipo;
        this.preco = preco;
    }

    // método para pegar o endereço
    public String getEndereco() {
        return endereco;
    }

    // método para pegar o tipo
    public String getTipo() {
        return tipo;
    }

    // método para pegar o preço
    public double getPreco() {
        return preco;
    }

    // serve para mostrar o imóvel de forma organizada
    @Override
    public String toString() {
        return "Endereço: " + endereco +
               " | Tipo: " + tipo +
               " | Preço: R$ " + preco;
    }
}
