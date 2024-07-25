package umg.progra2.grupo3;

import java.util.Scanner;

public class cls3 {

    public void volumenPrisma(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nVOLUMEN DE UN PRISMA RECTANGULAR:");
        System.out.print("Ingrese el area de la base del prisma: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del prisma: ");
        double altura = sc.nextDouble();

        double volumen = base*altura;
        System.out.println("El volumen del prisma es: " + volumen);
    }

    public void areaParalelogramo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nAREA DE UN PARALELOGRAMO:");
        System.out.print("Ingrese la base del paralelogramo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del paralelogramo: ");
        double altura = sc.nextDouble();

        double area = base*altura;
        System.out.println("El area del paralelogramo es: " + area);
    }

    public void volumenCilindro(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nVOLUMEN DE UN CILINDRO:");
        System.out.print("Ingrese el radio de la base del cilindro: ");
        double radio_base = sc.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = sc.nextDouble();

        double volumen = Math.PI * Math.pow(radio_base,2) * altura;
        System.out.println("El volumen del cilindro es: " + volumen);
    }

}
