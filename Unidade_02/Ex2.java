package Unidade_02;
public class Ex2 {
    public static void main(String[] args) {
        Mamifero cachorro = new Mamifero("Cachorro");
        Ave passaro = new Ave("Pardal");
        Peixe peixe = new Peixe("Nemo");

        System.out.println("Mamífero: " + cachorro.nome);
        System.out.println("Ave: " + passaro.nome);
        System.out.println("Peixe: " + peixe.nome);
    }
}

class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
}

class Mamifero extends Animal {
    public Mamifero(String nome) {
        super(nome);
    }
}

class Ave extends Animal {
    public Ave(String nome) {
        super(nome);
    }
}

class Peixe extends Animal {
    public Peixe(String nome) {
        super(nome);
    }
}