package umg.progra2.grupo2;

import java.util.Scanner;

public class cls2 {

    public void areaPiramide(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base de la piramide: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura de la piramide: ");
        double altura = sc.nextDouble();

        double area = (base*altura)/2;
        System.out.println("El area de la piramide es: " + area);
    }
}
