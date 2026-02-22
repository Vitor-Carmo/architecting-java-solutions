public class Carro {
    String marca;
    String modelo;
    int ano;
    boolean ligado = false;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        ligado = true;
        System.out.println("O carro foi ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("O carro foi desligado.");
    }

    public void acelerar() {
        if (ligado) {
            System.out.println("O carro está acelerando.");
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }
}