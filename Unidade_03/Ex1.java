package Unidade_03;

public class Ex1 {
    public static void main(String[] args) {
        try {
            dividir(10, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("O segundo número não pode ser zero.");
        }
        return a / b;
    }
}