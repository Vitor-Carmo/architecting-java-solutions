public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, String cor, double preco, double capacidadeCarga) {
        super(marca, modelo, ano, cor, preco);
        this.capacidadeCarga = capacidadeCarga;

    }

    public void abrirPortaMalas() {
        System.out.println("Abrindo porta malas...");
    }

    public void fecharPortaMalas() {
        System.out.println("Fechando porta malas...");
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void carregar(double peso) {
        if (peso <= capacidadeCarga) {
            System.out.println("Carga adicionada com sucesso.");
        } else {
            System.out.println("Carga excede a capacidade máxima!");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");

    }
}
