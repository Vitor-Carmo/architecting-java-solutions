package Unidade_02;
public class Ex1 {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic", 2022, 4, "Gasolina");
        Moto moto = new Moto("Yamaha", 2021, 150, true);

        carro.buzinar();
        moto.empinar();
    }
}

class Veiculo {
    String modelo;
    int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
}

class Carro extends Veiculo {
    int portas;
    String combustivel;

    public Carro(String modelo, int ano, int portas, String combustivel) {
        super(modelo, ano);
        this.portas = portas;
        this.combustivel = combustivel;
    }

    public void buzinar() {
        System.out.println("Carro " + modelo + " buzinando: BEEP BEEP!");
    }
}

class Moto extends Veiculo {
    int cilindradas;
    boolean partidaEletrica;

    public Moto(String modelo, int ano, int cilindradas, boolean partidaEletrica) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
    }

    public void empinar() {
        System.out.println("Moto " + modelo + " empinando!");
    }
}