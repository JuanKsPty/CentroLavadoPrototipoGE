import java.util.Scanner;
import milibreria.Funcionalidades_Logicas;

public class CentroLavadoUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Centro de Lavado GE-S5 ---");
            System.out.println("1. Iniciar ciclo de lavado.");
            System.out.println("2. Salir.");
            System.out.print("Seleccione una opción: ");

            int opcion;
            while (true) {
                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.print("Entrada inválida. Seleccione una opción: ");
                    scanner.next();
                }
            }

            switch (opcion) {
                case 1:
                    double peso;
                    while (true) {
                        System.out.print("\nIngrese el peso de la carga (libras): ");
                        if (scanner.hasNextDouble()) {
                            peso = scanner.nextDouble();
                            break;
                        } else {
                            System.out.println("Entrada inválida.");
                            scanner.next();
                        }
                    }

                    int tipoRopa;
                    System.out.println("Seleccione el tipo de ropa:");
                    System.out.println("1. Suave o delicada");
                    System.out.println("2. Normal o común");
                    System.out.println("3. Pesada o gruesa");
                    System.out.print("Tipo de ropa: ");
                    while (true) {
                        if (scanner.hasNextInt()) {
                            tipoRopa = scanner.nextInt();
                            break;
                        } else {
                            System.out.print("Entrada inválida. Tipo de ropa: ");
                            scanner.next();
                        }
                    }

                    double volumenAgua;
                    while (true) {
                        System.out.print("Ingrese el volumen de agua (pies cúbicos): ");
                        if (scanner.hasNextDouble()) {
                            volumenAgua = scanner.nextDouble();
                            break;
                        } else {
                            System.out.println("Entrada inválida.");
                            scanner.next();
                        }
                    }
                    System.out.println("\n");
                    Funcionalidades_Logicas centro = new Funcionalidades_Logicas(peso, tipoRopa, volumenAgua);
                    centro.CicloLogicoTerminado();
                    break;

                case 2:
                    System.out.println("Gracias por usar el Centro de Lavado GE-S5.");
                    return;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}
