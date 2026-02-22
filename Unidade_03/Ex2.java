package Unidade_03;

public class Ex2 {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();

        try {
            double resultado = conversor.converterCelsiusParaFahrenheit(-300);
            System.out.println("Temperatura em Fahrenheit: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class ConversorTemperatura {

    public double converterCelsiusParaFahrenheit(double temperaturaCelsius) {
        if (temperaturaCelsius < -273.15) {
            throw new IllegalArgumentException("Temperatura abaixo do zero absoluto.");
        }
        return (temperaturaCelsius * 9/5) + 32;
    }
}