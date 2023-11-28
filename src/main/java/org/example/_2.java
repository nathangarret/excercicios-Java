package org.example;

public class _2 {
    public static void main(String[] args) {
        // 2) Imprima os números ímpares de 1 a 10, usando continue para pular os números pares.
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}