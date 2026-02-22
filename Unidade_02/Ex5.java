package Unidade_02;

public class Ex5 {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.emitirSom();
        a2.emitirSom();
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
        System.out.println("Au Au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}