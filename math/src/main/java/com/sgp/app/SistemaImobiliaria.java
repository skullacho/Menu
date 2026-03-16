package com.SGP.app;

import com.SGP.model.Imovel;
import com.SGP.util.Validacoes;

import java.util.ArrayList;

public class SistemaImobiliaria {

    static ArrayList<Imovel> imoveis = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;

        do {

            System.out.println("\n===== SISTEMA IMOBILIÁRIA =====");
            System.out.println("1 - Cadastrar imóvel");
            System.out.println("2 - Listar imóveis");
            System.out.println("3 - Buscar imóvel");
            System.out.println("0 - Sair");

            opcao = Validacoes.lerInt("Escolha uma opção: ");

            switch (opcao) {

                case 1:
                    cadastrarImovel();
                    break;

                case 2:
                    listarImoveis();
                    break;

                case 3:
                    buscarImovel();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    public static void cadastrarImovel() {

        String endereco = Validacoes.lerString("Endereço: ");
        String tipo = Validacoes.lerString("Tipo do imóvel: ");
        double preco = Validacoes.lerDouble("Preço: ");

        Imovel imovel = new Imovel(endereco, tipo, preco);
        imoveis.add(imovel);

        System.out.println("Imóvel cadastrado com sucesso!");
    }

    public static void listarImoveis() {

        if (imoveis.isEmpty()) {
            System.out.println("Nenhum imóvel cadastrado.");
            return;
        }

        for (Imovel i : imoveis) {
            System.out.println(i);
        }
    }

    public static void buscarImovel() {

        String endereco = Validacoes.lerString("Digite o endereço: ");

        for (Imovel i : imoveis) {
            if (i.getEndereco().equalsIgnoreCase(endereco)) {
                System.out.println("Imóvel encontrado:");
                System.out.println(i);
                return;
            }
        }

        System.out.println("Imóvel não encontrado.");
    }
}