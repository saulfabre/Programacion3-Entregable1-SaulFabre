import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    static GestionAcademica sistema = new GestionAcademica();

    public static void main(String[] args) {

        int opcion;

        do {

            opcion = mostrarMenu();

            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\n====================================");
                    System.out.println("       REGISTRO ESTUDIANTIL " );

                    System.out.print("\nNOMBRE ESTUDIANTE     : ");
                    String nombreEstudiante = scanner.nextLine();

                    System.out.print("APELLIDO ESTUDIANTE   : ");
                    String apellidoEstudiante = scanner.nextLine();

                    System.out.print("EDAD ESTUDIANTE       : ");
                    int edadEstudiante = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("MATRICULA ESTUDIANTE  : ");
                    String matriculaEstudiante = scanner.nextLine();

                    System.out.print("CARRERA ESTUDIANTE    : ");
                    String carreraEstudiante = scanner.nextLine();

                    sistema.registrarEstudiante(matriculaEstudiante, nombreEstudiante, apellidoEstudiante, edadEstudiante, carreraEstudiante);
                    System.out.println("====================================");

                    break;

                case 2:

                    System.out.println("\n====================================");
                    System.out.println("       REGISTRO DE PROFESORES " );

                    System.out.print("\nNOMBRE PROFESOR         : ");
                    String nombreProfesor = scanner.nextLine();

                    System.out.print("APELLIDO PROFESOR       : ");
                    String apellidoProfesor = scanner.nextLine();

                    System.out.print("ESPECIALIDAD PROFESOR   : ");
                    String especialidadProfesor = scanner.nextLine();

                    System.out.print("CODIGO PROFESOR         : ");
                    int codigoProfesor = scanner.nextInt();

                   sistema.registrarProfesor(nombreProfesor, apellidoProfesor, especialidadProfesor, codigoProfesor);
                   System.out.println("====================================");

                   break;

                case 3:

                    System.out.println("\n====================================");
                    System.out.println("       REGISTRO DE MATERIAS " );

                    System.out.print("\nNOMBRE MATERIA      : ");
                    String nombreMateria = scanner.nextLine();

                    System.out.print("CANTIDAD CREDITOS   : ");
                    int cantidadCrditos = scanner.nextInt();

                    System.out.print("CODIGO MATERIA      : ");
                    int codigoMateria = scanner.nextInt();

                   sistema.registrarMateria(nombreMateria, cantidadCrditos, codigoMateria);
                   System.out.println("====================================");

                   break;

                case 4:

                    System.out.println("\n====================================");
                    System.out.println("          ASIGNAR MATERIA " );

                    System.out.print("\nMATRICULA ESTUDIANTE   : ");
                    String matriculaEstudianteBuscado = scanner.nextLine();

                    System.out.print("CODIGO MATERIA         : ");
                    int codigoMateriaBuscado = scanner.nextInt();

                    sistema.asignarMateria(matriculaEstudianteBuscado, codigoMateriaBuscado);
                    System.out.println("====================================");

                    break;

                case 5:

                    System.out.println("\n====================================");
                    System.out.println("      REGISTRAR CALIFICACION " );

                    System.out.print("\nMATRICULA ESTUDIANTE: ");
                    String matriculaEstudianteRegistrado = scanner.nextLine();

                    System.out.print("CODIGO MATERIA: ");
                    int codigoMateriaRegistrado = scanner.nextInt();

                    System.out.print("CALIFICACION: ");
                    double calificacionEstudiante = scanner.nextDouble();

                    sistema.registrarCalificacion(matriculaEstudianteRegistrado, calificacionEstudiante, codigoMateriaRegistrado);
                    System.out.println("====================================");

                    break;

                case 6:

                    int op;

                    System.out.println("\n1. MATRICULA ");
                    System.out.println("2. NOMBRE \n");
                    System.out.print("Opcion: ");

                    op = scanner.nextInt();
                    scanner.nextLine();

                    switch (op) {

                        case 1:

                            System.out.println("\n====================================");
                            System.out.println("         BUSCAR ESTUDIANTE " );

                            System.out.print("\nMATRICULA: ");
                            String matricula = scanner.nextLine();

                            sistema.buscarEstudianteMatricula(matricula);
                            System.out.println("====================================");

                            break;
                    
                        case 2:

                            System.out.println("\n====================================");
                            System.out.println("         BUSCAR ESTUDIANTE " );

                            System.out.print("\nNOMBRE: ");
                            String nombre = scanner.nextLine();

                            System.out.print("APELLIDO: ");
                            String apellido = scanner.nextLine();

                            sistema.buscarEstudianteNombre(nombre, apellido);
                            System.out.println("====================================");

                            break;
                    }

                    break;

                case 7:

                    sistema.mostrarEstudiantes();

                    break;

                case 8:

                sistema.mostrarMaterias();

                break;

            case 9:

                sistema.mostrarPromedio();

                break;

            case 10:

                break;

                default:
                    System.out.println("OPCION INVALIDA!!!");
            }

        } while (opcion != 10);
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
