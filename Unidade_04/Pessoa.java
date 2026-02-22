public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    private String email;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, String endereco, String telefone, 
        String email, double altura, double peso){
        
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void fazerAniversario(){
        idade++;
        System.out.println("Feliz aniversario, "+nome+". Agora voce tem "+idade+" anos!");
    }

    public void exibirInformacoes(){
        System.out.println("Nome:     "+nome);
        System.out.println("Idade:    "+idade);
        System.out.println("Endereço: "+endereco);
        System.out.println("Telefone: "+telefone);
        System.out.println("Email:    "+email);
        System.out.println("Altura:   "+altura+" CM");
        System.out.println("Peso:     "+peso+" KG");
    }
}
