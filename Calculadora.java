public class Calculadora {

    public String marca;

    public Calculadora(String marca) {
        this.marca = marca;
    }

    
    public double calcular_media(double a1, double a2, double a3) {
        return (a1 + a2 + a3) / 3;
    }
}
