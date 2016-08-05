
package p1punto14;

import java.util.Scanner;


public class Triangulo {
    double base,altura,area;
    Scanner lector;
    public void Area_Triangulo(){
        lector = new Scanner(System.in);
        System.out.print("Digite base del triángulo: ");
        base = lector.nextDouble();
        System.out.print("Digite altura del triángulo: ");
        altura = lector.nextDouble();
        System.out.println("El area es del triángulo es: "+base*altura/2);
    }
    
}
