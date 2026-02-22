package Unidade_03;

public class Ex10 {
    public static void main(String[] args) {
        DivisaoInteira divisao = new DivisaoInteira();

        try {
            int resultado = divisao.dividir(10, 3);
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoInteiraInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class DivisaoInteiraInvalidaException extends Exception {
    public DivisaoInteiraInvalidaException(String mensagem) {
        super(mensagem);
    }
}

class DivisaoInteira {

    public int dividir(int a, int b) throws DivisaoInteiraInvalidaException {
        if (b == 0) {
            throw new DivisaoInteiraInvalidaException("Divisão por zero não permitida.");
        }
        if (a % b != 0) {
            throw new DivisaoInteiraInvalidaException("A divisão não é inteira exata.");
        }
        return a / b;
    }
}