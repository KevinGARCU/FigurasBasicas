package figurasbasicas;

public class Rectangulo extends FigurasBasicas {
    
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double CalcularArea() {
        return base*altura;
    }

    @Override
    public double CalcularPerimetro() {
        return (2*base)+(2*altura);
    }
    
    
}
