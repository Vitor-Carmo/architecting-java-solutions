public class ContaBancaria {
    double saldo;
    String numeroConta;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}