package org.example;

public class _6 {
    public static void main(String[] args) {
        // 6)Imprima os números de 1 a 10, pulando a impressão do número 5, usando continue.
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Pula a impressão do número 5
            }
            System.out.println(i);
        }
    }
}
