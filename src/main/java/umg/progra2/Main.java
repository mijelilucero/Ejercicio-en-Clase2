package umg.progra2;

import umg.progra2.grupo1.cls1;
import umg.progra2.grupo2.cls2;
import umg.progra2.grupo3.cls3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cls1 grupo1 = new cls1();
        cls2 grupo2 = new cls2();
        cls3 grupo3 = new cls3();
        int opcion;

        do {
            System.out.println("\nMENU DE EJERCICIOS:");
            System.out.println("1. Ejercicios Grupo 1");
            System.out.println("2. Ejercicios Grupo 2");
            System.out.println("3. Ejercicios Grupo 3");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nGRUPO 1");
                    grupo1.areaCirculo();
                    grupo1.circunferenciaCirculo();
                    grupo1.volumenCubo();
                    break;

                case 2:
                    System.out.println("\nGRUPO 2");
                    grupo2.areaPiramide();
                    grupo2.volumenPiramide();
                    grupo2.areaTriangulo();
                    break;

                case 3:
                    System.out.println("\nGRUPO 3");
                    grupo3.volumenPrisma();
                    grupo3.areaParalelogramo();
                    grupo3.volumenCilindro();
                    break;

                case 4:
                    System.out.println("\nEsta saliendo del programa...");
                    break;

                default:
                    System.out.println("\nOpcion no valida. Intente de nuevo.");
                    break;
            }
        }while(opcion!=4);

        scanner.close();
    }
}