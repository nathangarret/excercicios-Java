package org.example;

public class _10 {
    public static void main(String[] args) {
        // 10)Dado um array de números inteiros, imprima cada número até encontrar um número negativo.
        // Use break para interromper o loop nesse ponto.
        int[] numeros = { 5, 8, -3, 10, 15, -6, 20 }; // Exemplo de array de números inteiros

        for (int numero : numeros) {
            if (numero < 0) {
                System.out.println("Número negativo encontrado. O loop foi interrompido.");
                break; // Interrompe o loop quando encontra um número negativo
            }
            System.out.println(numero);
        }
    }
}
