package org.example;

public class _5 {
    public static void main(String[] args) {
        // 5)Imprima os números de 1 a 10, mas pare o loop quando encontrar um número maior que 7.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i > 7) {
                break; // Para o loop quando encontrar um número maior que 7
            }
        }
    }
}
