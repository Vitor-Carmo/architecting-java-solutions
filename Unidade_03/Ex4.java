package Unidade_03;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            int resultado = numero / 0; // Forçando erro
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro amigável: Não é possível dividir por zero!");
        }

        scanner.close();
    }
}