package Unidade_02;

public class Ex6 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma int: " + calc.soma(5, 3));
        System.out.println("Soma double: " + calc.soma(2.5, 1.5));
        System.out.println("Subtração: " + calc.subtrair(10, 4));
        System.out.println("Multiplicação: " + calc.multiplicar(6, 2));
        System.out.println("Divisão: " + calc.dividir(10.0, 2.0));
    }
}

class Calculadora {

    // Sobrecarga de métodos (polimorfismo)
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero");
            return 0;
        }
        return a / b;
    }
}