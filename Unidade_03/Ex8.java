package Unidade_03;

public class Ex8 {
    public static void main(String[] args) {
        ValidadorSenha validador = new ValidadorSenha();

        try {
            validador.validarSenha("123");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class SenhaInvalidaException extends Exception {
    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}

class ValidadorSenha {

    public void validarSenha(String senha) throws SenhaInvalidaException {
        if (senha == null || senha.length() < 6) {
            throw new SenhaInvalidaException("Senha muito curta. Mínimo 6 caracteres.");
        }
        System.out.println("Senha válida!");
    }
}