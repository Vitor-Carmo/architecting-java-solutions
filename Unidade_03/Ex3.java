package Unidade_03;

public class Ex3 {
    public static void main(String[] args) {
        Idade idade = new Idade();

        try {
            idade.verificarIdade(200);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class Idade {

    public void verificarIdade(int idade) {
        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("Idade inválida.");
        }
        System.out.println("Idade válida: " + idade);
    }
}