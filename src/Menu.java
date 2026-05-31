import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    static GestionAcademica sistema = new GestionAcademica();

    public static void main(String[] args) {

        int opcion;

        do {

            opcion = mostrarMenu();

            switch (opcion) {

                case 1:

                    System.out.print("NOMBRE ESTUDIANTE: ");
                    String nombreEstudiante = scanner.nextLine();

                    System.out.print("APELLIDO ESTUDIANTE: ");
                    String apellidoEstudiante = scanner.nextLine();

                    System.out.print("EDAD ESTUDIANTE: ");
                    int edadEstudiante = scanner.nextInt();

                    System.out.print("MATRICULA ESTUDIANTE: ");
                    String matriculaEstudiante = scanner.next();

                    System.out.print("CARRERA ESTUDIANTE: ");
                    String carreraEstudiante = scanner.nextLine();

                    sistema.registrarEstudiante(matriculaEstudiante, nombreEstudiante, apellidoEstudiante, edadEstudiante, carreraEstudiante);

                    break;

                case 2:

                    System.out.print("NOMBRE PROFESOR: ");
                    String nombreProfesor = scanner.nextLine();

                    System.out.print("APELLIDO PROFESOR: ");
                    String apellidoProfesor = scanner.nextLine();

                    System.out.print("ESPECIALIDAD PROFESOR: ");
                    String especialidadProfesor = scanner.nextLine();

                    System.out.print("CODIGO PROFESOR: ");
                    int codigoProfesor = scanner.nextInt();

                   sistema.registrarProfesor(nombreProfesor, apellidoProfesor, especialidadProfesor, codigoProfesor);

                   break;

                case 3:

                    System.out.print("NOMBRE MATERIA: ");
                    String nombreMateria = scanner.nextLine();

                    System.out.print("CANTIDAD CREDITOS: ");
                    int cantidadCrditos = scanner.nextInt();

                    System.out.print("CODIGO PROFESOR: ");
                    int codigoMateria = scanner.nextInt();

                   sistema.registrarMateria(nombreMateria, cantidadCrditos, codigoMateria);

                   break;

                case 4:

                    System.out.print("MATRICULA ESTUDIANTE: ");
                    String matriculaEstudianteBuscado = scanner.next();

                    System.out.print("CODIGO MATERIA: ");
                    int codigoMateriaBuscado = scanner.nextInt();

                    sistema.asignarMateria(matriculaEstudianteBuscado, codigoMateriaBuscado);

                    break;

                case 5:

                    System.out.print("MATRICULA ESTUDIANTE: ");
                    String matriculaEstudianteRegistrado = scanner.next();

                    System.out.print("CODIGO MATERIA: ");
                    int codigoMateriaRegistrado = scanner.nextInt();

                    System.out.print("CALIFICACION: ");
                    double calificacionEstudiante = scanner.nextDouble();

                    sistema.registrarCalificacion(matriculaEstudianteRegistrado, calificacionEstudiante, codigoMateriaRegistrado);

                    break;

                case 6:

                    System.out.print("MATRICULA ESTUDIANTE: ");
                    String buscarEstudianteMatricula = scanner.next();

                    System.out.print("NOMBRE ESTUDIANTE: ");
                    String buscarEstudianteNombre = scanner.nextLine();

                    sistema.buscarEstudiante(buscarEstudianteMatricula, buscarEstudianteNombre);

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
