package Unidade_02;

public class Ex9 {
    public static void main(String[] args) {

        ContaBancaria contaCorrente = new ContaCorrente(1000);
        ContaBancaria contaPoupanca = new ContaPoupanca(1000);

        contaCorrente.aplicarJuros();
        contaPoupanca.aplicarJuros();

        System.out.println("Saldo Conta Corrente (15%): " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança (6.5%): " + contaPoupanca.getSaldo());
    }
}

class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void aplicarJuros() {
        // Método genérico
    }

    public double getSaldo() {
        return saldo;
    }
}

class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void aplicarJuros() {
        saldo += saldo * 0.15;
    }
}

class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void aplicarJuros() {
        saldo += saldo * 0.065;
    }
}