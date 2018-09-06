package figurasbasicas;

public class Triangulo extends FigurasBasicas{
    
    private double base;
    private double altura;
    double hipotenusa;

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
        return (base*altura)/2;
    }

    @Override
    public double CalcularPerimetro() {
        hipotenusa = Math.sqrt((Math.pow(base, 2)+(Math.pow(altura, 2))));
        return hipotenusa + base + altura;
    }
    
    
    
}
