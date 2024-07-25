package umg.progra2.grupo1;

import java.util.Scanner;

public class cls1 {

    public void areaCirculo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nAREA DE UN CIRCULO:");
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }

    public void circunferenciaCirculo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCIRCUNFERENCIA DE UN CIRCULO:");
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        double circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia del circulo es: " + circunferencia);
    }

    public void volumenCubo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nVOLUMEN DE UN CUBO:");
        System.out.print("Ingrese la longitud de cada lado: ");
        double lado = sc.nextDouble();

        double volumen = Math.pow(lado,3);
        System.out.println("El volumen del cubo es: " + lado);
    }
}
