public class Animal {
    String nome;
    String tipoAlimentacao;

    public Animal(String nome, String tipoAlimentacao) {
        this.nome = nome;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public void emitirSom() {
        System.out.println(nome + " está emitindo um som.");
    }
}