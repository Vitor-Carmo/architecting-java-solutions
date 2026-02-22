package Unidade_02;

import java.util.ArrayList;

public class Ex10 {
    public static void main(String[] args) {

        ArrayList<Autenticavel> lista = new ArrayList<>();

        lista.add(new Usuario("Vitor"));
        lista.add(new Administrador("Admin"));

        for (Autenticavel a : lista) {
            a.autenticar();
        }
    }
}

interface Autenticavel {
    void autenticar();
}

class Usuario implements Autenticavel {
    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void autenticar() {
        System.out.println("Usuário " + nome + " autenticado com sucesso.");
    }
}

class Administrador implements Autenticavel {
    String nome;

    public Administrador(String nome) {
        this.nome = nome;
    }

    @Override
    public void autenticar() {
        System.out.println("Administrador " + nome + " autenticado com sucesso.");
    }
}