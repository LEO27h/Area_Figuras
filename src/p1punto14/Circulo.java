
package p1punto14;

import java.util.Scanner;
import java.lang.Math; 

public class Circulo {
    double radio,area;
    Scanner lector;
    public void Area_Circulo(){
        lector = new Scanner(System.in);
        System.out.print("Digite radio del círculo: ");
        //area = (double)Math.Pi*(lector.nextInt())^2; 
        area = 3.1416*(int)Math.pow((lector.nextInt()),2);
        //area = 3.1416*(lector.nextInt())*(lector.nextInt());
        System.out.println("El area del círculo es: "+area);
    }
}
