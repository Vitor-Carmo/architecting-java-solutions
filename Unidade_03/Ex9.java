package Unidade_03;

public class Ex9 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(500);

        try {
            conta.transferir(-100);
        } catch (TransferenciaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class TransferenciaInvalidaException extends Exception {
    public TransferenciaInvalidaException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {
    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void transferir(double valor) throws TransferenciaInvalidaException {
        if (valor <= 0) {
            throw new TransferenciaInvalidaException("Valor de transferência inválido.");
        }
        saldo -= valor;
        System.out.println("Transferência realizada. Saldo atual: " + saldo);
    }
}