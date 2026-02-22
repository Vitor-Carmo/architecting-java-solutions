package Unidade_02;
public class Ex4 {
    public static void main(String[] args) {
        Veiculo v1 = new Carro("Corolla", 2023, 4);
        Veiculo v2 = new Moto("Honda CG", 2022, 160);

        v1.imprimirInformacoes();
        v2.imprimirInformacoes();
    }
}

class Veiculo {
    String modelo;
    int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void imprimirInformacoes() {
        System.out.println("Veículo: " + modelo + " - " + ano);
    }
}

class Carro extends Veiculo {
    int portas;

    public Carro(String modelo, int ano, int portas) {
        super(modelo, ano);
        this.portas = portas;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Carro: " + modelo + " - " + ano + " | Portas: " + portas);
    }
}

class Moto extends Veiculo {
    int cilindradas;

    public Moto(String modelo, int ano, int cilindradas) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Moto: " + modelo + " - " + ano + " | Cilindradas: " + cilindradas);
    }
}