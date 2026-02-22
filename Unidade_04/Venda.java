import java.time.LocalDateTime;

public class Venda {
    private Veiculo veiculo;
    private Pessoa comprador;
    private double valor;
    private LocalDateTime dataVenda;

    public Venda(Veiculo veiculo, Pessoa comprador, double valor, LocalDateTime dataVenda){
        this.veiculo = veiculo;
        this.comprador = comprador;
        this.valor = valor;
        this.dataVenda = dataVenda;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
    public Pessoa getComprador() {
        return comprador;
    }
    public double getValor() {
        return valor;
    }
    public LocalDateTime getDataVenda() {
        return dataVenda;
    }
    
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public void setComprador(Pessoa comprador) {
        this.comprador = comprador;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void exibirDetalhesVenda(){
        System.out.println("Detalhes da venda");
        System.out.println("Veiculo: "+veiculo.getModelo()+ " - Ano: "+veiculo.getAno());
        System.out.println("Comprador: "+comprador.getNome()+ " contato: "+comprador.getTelefone());
        System.out.println("Valor da venda: R$"+valor);
        System.out.println("Data da venda: "+ dataVenda);
    }
}
