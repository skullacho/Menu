package com.SGP.util;

import java.util.Scanner;

public class Validacoes {

    private static Scanner sc = new Scanner(System.in);

    public static int lerInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Digite um número válido.");
            }
        }
    }

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

    public static String lerString(String msg) {
        while (true) {
            System.out.print(msg);
            String texto = sc.nextLine();

            if (!texto.trim().isEmpty()) {
                return texto;
            }

            System.out.println("Campo não pode estar vazio.");
        }
    }
}