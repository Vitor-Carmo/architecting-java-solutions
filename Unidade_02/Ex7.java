package Unidade_02;

public class Ex7 {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo(3);
        FormaGeometrica retangulo = new Retangulo(4, 5);
        FormaGeometrica triangulo = new Triangulo(6, 2);

        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());

        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());

        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do Triângulo: " + triangulo.calcularPerimetro());
    }
}

abstract class FormaGeometrica {
    abstract double calcularArea();
    abstract double calcularPerimetro();
}

class Circulo extends FormaGeometrica {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

class Retangulo extends FormaGeometrica {
    double largura;
    double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return largura * altura;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

class Triangulo extends FormaGeometrica {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    double calcularPerimetro() {
        // Exemplo simples (não especificado no enunciado)
        return base * 3;
    }
}