import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        String[] nombres = new String[2];
        int[] edades = new int[2];
        int[] cedulas = new int[2];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Estudiante " + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = entrada.nextLine();
            System.out.print("Edad: ");
            edades[i] = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Cédula: ");
            cedulas[i] = entrada.nextInt();
            entrada.nextLine();
        }

        System.out.println("\nDatos de los estudiantes guardados");
        System.out.println("***************************************");
    }
}