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
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el peso de la carga (libras): ");
                    double peso = scanner.nextDouble();

                    System.out.println("Seleccione el tipo de ropa:");
                    System.out.println("1. Suave o delicada");
                    System.out.println("2. Normal o común");
                    System.out.println("3. Pesada o gruesa");
                    System.out.print("Tipo de ropa: ");
                    int tipoRopa = scanner.nextInt();

                    System.out.print("Ingrese el volumen de agua (pies cúbicos): ");
                    double volumenAgua = scanner.nextDouble();

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
