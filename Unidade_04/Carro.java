public class Carro extends Veiculo {
    private int nPortar;
    private String tipoCombustivel;
    private int capacidadePortaMalas;

    public Carro(String marca, String modelo, int ano, String cor, double preco,
            int nPortar, String tipoCombustivel, int capacidadePortaMalas) {

        super(marca, modelo, ano, cor, preco);
        this.nPortar = nPortar;
        this.tipoCombustivel = tipoCombustivel;
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public void abrirPortaMalas() {
        System.out.println("Abrindo porta malas...");
    }

    public void fecharPortaMalas() {
        System.out.println("Fechando porta malas...");
    }

    public int getnPortar() {
        return nPortar;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setnPortar(int nPortar) {
        this.nPortar = nPortar;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Numero de portas: " + nPortar);
        System.out.println("Tipo de combustivel: " + tipoCombustivel);
        System.out.println("Capacidade do porta malas: " + capacidadePortaMalas + " litros");
    }
}
