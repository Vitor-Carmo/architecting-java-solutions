public class Circulo {
    double raio;
    double area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        area = Math.PI * raio * raio;
        return area;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}