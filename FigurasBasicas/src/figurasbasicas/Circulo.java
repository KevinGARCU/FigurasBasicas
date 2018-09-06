package figurasbasicas;

public class Circulo extends FigurasBasicas {
    
    static final double PI = 3.1416;
    
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double CalcularArea() {
        return (PI*radio*radio);
    }

    @Override
    public double CalcularPerimetro() {
        return 2*PI*radio;
    }
    
    
}
