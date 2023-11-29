package org.example;

public class _4 {
    public static void main(String[] args) {
        // 4)Crie um loop aninhado que imprima os números de 1 a 5 para cada iteração do loop externo,
        // pulando a impressão do número 3 em cada iteração interna usando continue.
        for (int i = 1; i <= 5; i++) { // Loop externo de 1 a 5
            System.out.println("Iteração externa " + i);
            for (int j = 1; j <= 5; j++) { // Loop interno de 1 a 5
                if (j == 3) {
                    continue; // Pula a impressão do número 3
                }
                System.out.println("Número interno: " + j);
            }
            System.out.println("---------");
        }
    }
}
