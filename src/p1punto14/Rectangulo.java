
package p1punto14;

import java.util.Scanner;


public class Rectangulo {
    double base,altura,area;
    Scanner lector;
    public void Area_Rectangulo(){
        lector = new Scanner(System.in);
        System.out.print("Digite base del rectángulo: ");
        base = lector.nextDouble();
        System.out.print("Digite altura del rectángulo: ");
        altura = lector.nextDouble();
        System.out.println("El area del rectángulo es: "+base*altura);
    }
    
}
