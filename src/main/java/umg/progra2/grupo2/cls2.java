package umg.progra2.grupo2;

import java.util.Scanner;

public class cls2 {

    public void areaPiramide(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nAREA DE UNA PIRAMIDE CUADRADA: ");
        System.out.print("Ingrese la base de la piramide: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura de la piramide: ");
        double altura = sc.nextDouble();

        double area = (base*altura)/2;
        System.out.println("El area de la piramide es: " + area);
    }

    public void volumenPiramide(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nVOLUMEN DE UNA PIRAMIDE CUADRADA: ");
        System.out.print("Ingrese la base de la piramide: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura de la piramide: ");
        double altura = sc.nextDouble();

        double volumen = (base*altura)/3;
        System.out.println("El volumen de la piramide es: " + volumen);
    }

    public void areaTriangulo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nAREA DE UN TRIANGULO: ");
        System.out.print("Ingrese la base del triangulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del triangulo: ");
        double altura = sc.nextDouble();

        double area = (base*altura)/2;
        System.out.println("El area del triangulo es: " + area);
    }
}
