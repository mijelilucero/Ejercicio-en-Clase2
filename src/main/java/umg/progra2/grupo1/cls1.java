package umg.progra2.grupo1;

import java.util.Scanner;

public class cls1 {

    public void areaCirculo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }
}
