package Unidade_02;

import java.util.ArrayList;

public class Ex8 {
    public static void main(String[] args) {

        ArrayList<Animal> listaAnimais = new ArrayList<>();

        listaAnimais.add(new Cachorro());
        listaAnimais.add(new Gato());
        listaAnimais.add(new Passaro());

        for (Animal animal : listaAnimais) {
            animal.emitirSom();
        }
    }
}

class Animal {
    public void emitirSom() {
        System.out.println("Animal emitindo som...");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Cachorro: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Gato: Miau!");
    }
}

class Passaro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Pássaro: Piu Piu!");
    }
}