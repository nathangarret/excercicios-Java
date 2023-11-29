package org.example;

import java.util.Scanner;

public class _9 {
    public static void main(String[] args) {
        // 9) Crie um loop infinito que solicita ao usuário um número. Pare o loop quando o número 0
        // for inserido.
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número (0 para parar): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Número 0 inserido. O loop foi interrompido.");
                break; // Interrompe o loop quando o número 0 for inserido
            }

            // Aqui você pode realizar qualquer ação com o número inserido antes de continuar o loop
            System.out.println("Você digitou: " + numero);
        }

        scanner.close();
    }
}
