
package p1punto14;

import java.util.Scanner;

public class Ppal {
    public static void main(String[] args) {
        Scanner lector;
        lector = new Scanner(System.in);
        int seleccion;
        do{
        System.out.println("0. Cuadrado");
        System.out.println("1. Rectángulo");
        System.out.println("2. Triángulo");
        System.out.println("3. Círculo");
        System.out.println("4. Para salir");
        System.out.println("Ingrese la opción: ");
        seleccion=lector.nextInt();
        
        switch(seleccion){
            case 0:
                Cuadrado cua = new Cuadrado();
                cua.Area_Cuadrado();
                break;
            case 1:
                Rectangulo rec = new Rectangulo();
                rec.Area_Rectangulo();            
                break;
            case 2:
                Triangulo tri = new Triangulo();
                tri.Area_Triangulo();
                break;
            case 3:
                Circulo cir = new Circulo();
                cir.Area_Circulo();
                break; 
        }
        }while(seleccion!=4);
   }
}
