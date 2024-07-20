package umg.progra2.grupo3;

import java.util.Scanner;

public class cls3 {

    public void volumenPrisma(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el area de la base del prisma: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del prisma: ");
        double altura = sc.nextDouble();

        double area = base*altura;
        System.out.println("El volumen del prisma es: " + area);
    }

}
