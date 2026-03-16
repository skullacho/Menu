package com.SGP.util;

import java.util.Scanner;

// serve para validar os dados digitados pelo usuário
public class Validacoes {

    // scanner para ler o que o usuário digita
    private static Scanner sc = new Scanner(System.in);

    // método para ler números inteiros
    public static int lerInt(String msg) {

        // loop para repetir até o usuário digitar o que é pra digitar certo
        while (true) {

            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());

            } catch (Exception e) {

                // se o usuário digitar algo errado
                System.out.println("Digite um número válido.");
            }
        }
    }

    // método para ler números com decimal
    public static double lerDouble(String msg) {

        while (true) {

            try {
                System.out.print(msg);
                return Double.parseDouble(sc.nextLine());

            } catch (Exception e) {

                System.out.println("Digite um valor válido.");
            }
        }
    }

    // método para ler o texto
    public static String lerString(String msg) {

        while (true) {

            System.out.print(msg);
            String texto = sc.nextLine();

            // verifica se o texto não ta vazio
            if (!texto.trim().isEmpty()) {
                return texto;
            }

            System.out.println("Esse campo não pode ficar vazio.");
        }
    }
}