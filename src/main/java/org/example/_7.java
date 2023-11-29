package org.example;

import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {
        // 7)Use um loop para iterar sobre os números de 1 a 5. Pare o loop quando encontrar o número 3.
        // Use switch para imprimir uma mensagem diferente para cada número.
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("Número 1 - Mensagem 1");
                    break;
                case 2:
                    System.out.println("Número 2 - Mensagem 2");
                    break;
                case 3:
                    System.out.println("Número 3 - Mensagem 3");
                    return;
                case 4:
                    System.out.println("Número 4 - Mensagem 4");
                    break;
                case 5:
                    System.out.println("Número 5 - Mensagem 5");
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            }
        }
    }
}
