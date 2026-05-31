import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int mostrarMenu() {

        int opcion;

        System.out.println("====================================");
        System.out.println("   SISTEMA DE GESTIÓN ACADÉMICA");
        System.out.println("====================================\n");

        System.out.println("1. Registrar estudiante");
        System.out.println("2. Registrar profesor");
        System.out.println("3. Registrar materia");
        System.out.println("4. Asignar materia a estudiante");
        System.out.println("5. Registrar calificación");
        System.out.println("6. Buscar estudiante");
        System.out.println("7. Mostrar estudiantes");
        System.out.println("8. Mostrar materias");
        System.out.println("9. Mostrar reporte de promedios");
        System.out.println("10. Salir\n");

        System.out.print("Opcion: ");

        opcion = scanner.nextInt();

        return opcion;
    }
}
