package com.SGP.app;

import com.SGP.model.Imovel;
import com.SGP.util.Validacoes;

import java.util.ArrayList;

// essa é a classe principal do sistema
// é aqui que o programa vai começar a rodar
public class SistemaImobiliaria {

    // lista pra guardar todos os imóveis cadastrados
    static ArrayList<Imovel> imoveis = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;

        // loop do menu, só para quando o usuário escolher sair
        do {

            System.out.println("\n===== SISTEMA DA IMOBILIÁRIA =====");
            System.out.println("1 - Cadastrar imóvel");
            System.out.println("2 - Listar imóveis");
            System.out.println("3 - Buscar imóvel");
            System.out.println("0 - Sair");

            // chama o método de validação para ler o número
            opcao = Validacoes.lerInt("Escolha uma opção: ");

            // switch para escolher o que o sistema vai fazer
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

    // método pra cadastrar um novo imóvel
    public static void cadastrarImovel() {

        String endereco = Validacoes.lerString("Endereço: ");
        String tipo = Validacoes.lerString("Tipo do imóvel: ");
        double preco = Validacoes.lerDouble("Preço: ");

        // cria o objeto imóvel
        Imovel imovel = new Imovel(endereco, tipo, preco);

        // adiciona o imóvel na lista
        imoveis.add(imovel);

        System.out.println("Imóvel cadastrado com sucesso!");
    }

    // método pra listar todos os imóveis
    public static void listarImoveis() {

        // verifica se a lista ta vazia
        if (imoveis.isEmpty()) {
            System.out.println("Nenhum imóvel cadastrado.");
            return;
        }

        // percorre a lista mostrando cada imóvel
        for (Imovel i : imoveis) {
            System.out.println(i);
        }
    }

    // método pra procurar um imóvel pelo endereço
    public static void buscarImovel() {

        String endereco = Validacoes.lerString("Digite o endereço: ");

        // percorre a lista
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
