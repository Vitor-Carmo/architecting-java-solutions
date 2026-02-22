package Unidade_02;
public class Ex3 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("123", 1000);
        ContaPoupanca cp = new ContaPoupanca("456", 2000);

        System.out.println("Saldo Conta Corrente: " + cc.saldo);
        System.out.println("Saldo Conta Poupança: " + cp.saldo);
    }
}

class ContaBancaria {
    double saldo;
    String numeroConta;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
}

class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }
}

class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }
}