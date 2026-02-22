package Unidade_03;

public class Ex6 {
    public static void main(String[] args) {
        String texto = "abc"; // inválido

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: A string não é um número válido.");
        }
    }
}