package figurasbasicas;

public class Cuadrado extends FigurasBasicas {
    
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double CalcularArea() {
        return lado*lado;
    }

    @Override
    public double CalcularPerimetro() {
        return lado*4;
    }
    
}
