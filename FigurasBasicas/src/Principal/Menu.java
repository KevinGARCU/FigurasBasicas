package Principal;
  
import figurasbasicas.Circulo;
import figurasbasicas.Cuadrado;
import figurasbasicas.Rectangulo;
import figurasbasicas.Triangulo;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("Elija la opcion de la figura que desea operar");
        System.out.println("1)Circulo");
        System.out.println("2)Cuadrado");
        System.out.println("3)Triangulo");
        System.out.println("4)Rectangulo");
        
        opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                Circulo c = new Circulo();
                System.out.println("Ingrese el radio");
                c.setRadio(sc.nextDouble());
                System.out.println("Area: " + c.CalcularArea());
                System.out.println("Perimetro: " + c.CalcularPerimetro());
                break;
            case 2:
                Cuadrado c1 = new Cuadrado();
                System.out.println("Ingrese el lado");
                c1.setLado(sc.nextDouble());
                System.out.println("Area: " + c1.CalcularArea());
                System.out.println("Perimetro: " + c1.CalcularPerimetro());
                break;
            case 3:
                Triangulo t = new Triangulo();
                System.out.println("Ingrese la base");
                t.setBase(sc.nextDouble());
                System.out.println("Ingrese la altura");
                t.setAltura(sc.nextDouble());
                System.out.println("Area: " + t.CalcularArea());
                System.out.println("Perimetro: " + t.CalcularPerimetro());
                break;
            case 4:
                Rectangulo r = new Rectangulo();
                System.out.println("Ingrese la base");
                r.setBase(sc.nextDouble());
                System.out.println("Ingrese la altura");
                r.setAltura(sc.nextDouble());
                System.out.println("Area: " + r.CalcularArea());
                System.out.println("Perimetro: " + r.CalcularPerimetro());
                break;
        }
       
    }
    
}
