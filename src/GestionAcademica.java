import java.util.ArrayList;

public class GestionAcademica {

    private ArrayList <Estudiante> estudiantes = new ArrayList<>();
    private ArrayList <Profesor> profesores = new ArrayList<>();
    private ArrayList <Materia> materias = new ArrayList<>();

    public void registrarEstudiante(String matricula, String nombre, String apellido, int edad, String carrera) {

        for (Estudiante estudiante : estudiantes) {

            if (matricula.equals(estudiante.getMatricula())) {

                System.out.println("MATRICULA EXISTENTE ");
                return;
            }
        }

        Estudiante estudiante = new Estudiante(nombre, apellido, edad, matricula, carrera);
        estudiantes.add(estudiante);
        System.out.println("ESTUDIANTE: " + nombre.toUpperCase() + " " + apellido.toUpperCase() + " REGISTRADO ");

    }

    public void registrarProfesor(String nombre, String apellido, String especialidad, int codigo) {

        for (Profesor profesor : profesores) {

            if (codigo == profesor.getCodigo()) {

                System.out.println("CODIGO EXISTENTE ");
                return;
            }
        }

        Profesor profesor = new Profesor(nombre, apellido, especialidad, codigo);
        profesores.add(profesor);
        System.out.println("PROFESOR: " + nombre.toUpperCase() + " " + nombre.toUpperCase() + " REGISTRADO ");
    }

    public void registrarMateria(String nombreMateria, int cantidadCreditos, int codigo) {

        for (Materia materia : materias) {

            if (codigo == materia.getCodigo()) {

                System.out.println("CODIGO EXISTENTE ");
                return;
            }
        }

        Materia materia = new Materia(codigo, nombreMateria, cantidadCreditos);
        materias.add(materia);
        System.out.println("MATERIA: " + nombreMateria.toUpperCase() + " " +  "REGISTRADA");
    }

    public void asignarMateria(String matricula, int codigo) {
        
        for (Estudiante estudiante : estudiantes) {

            if (matricula.equals(estudiante.getMatricula())) {

                ArrayList<Materia> materiasEstudiante = estudiante.getMaterias();

                for (Materia materia : materias) {

                    if (codigo == materia.getCodigo()) {

                        materiasEstudiante.add(materia);
                        System.out.println("MATERIA ASIGNADA A: " + estudiante.getNombre().toUpperCase());
                        return;
                    }
                }
                System.out.println("CODIGO NO ENCONTRADO ");
                return;
            }
        }
        System.out.println("MATRICULA NO ENCONTRADA ");
    }

    public void registrarCalificacion(String matricula, double calificacion, int codigo) {

        for (Estudiante estudiante : estudiantes) {

            if (matricula.equals(estudiante.getMatricula())) {

                ArrayList<Materia> materiasEstudiante = estudiante.getMaterias();
                
                for (Materia materia : materiasEstudiante) {

                    if (codigo == materia.getCodigo()) {

                        materia.setCalificacion(calificacion);
                        System.out.println("CALIFICACION " + calificacion + "REGISTRADA A " + estudiante.getNombre() + " - " + materia.getNombreMateria());
                        return;
                    }
                }
                System.out.println("MATERIA NO ENCONTRADA ");
                return;
            }
        }
        System.out.println("MATRICULA NO ENCONTRADA ");
    }

    public void buscarEstudianteMatricula(String matricula) {

        for (Estudiante estudiante : estudiantes) {

            if (matricula.equals(estudiante.getMatricula())) {
                System.out.println("ENCONTRADO" + matricula.toUpperCase() + "\n");
                mostrarEstudiante(estudiante);
                return;
            }

            System.out.println("NO ENCONTRADO" + matricula.toUpperCase());
        }
    }

    public void buscarEstudianteNombre(String nombre) {

        for (Estudiante estudiante : estudiantes) {

            if (nombre.equals(estudiante.getNombre())) {
                System.out.println("ENCONTRADO" + nombre.toUpperCase() + "\n");
                mostrarEstudiante(estudiante);
                return;
            }

            System.out.println("NO ENCONTRADO" + nombre.toUpperCase());
        }
    }

    public void mostrarEstudiantes() {

        System.out.println("====================================");
        System.out.println("       ESTUDIANTES REGISTRADOS \n" );

        for (Estudiante estudiante : estudiantes) {

            System.out.println("MATRICULA: " + estudiante.getMatricula());
            System.out.println("NOMBRE: " + estudiante.getNombre());
            System.out.println("APELLIDO: " + estudiante.getApellido());
            System.out.println("EDAD: " + estudiante.getEdad());
            System.out.println("CARRERA: " + estudiante.getCarrera());
            System.out.println("FECHA INSCRIPCION: " + estudiante.getFechaInscripcion());

            System.out.println("====================================");
        }
    }

    public void mostrarMaterias() {

        System.out.println("====================================");
        System.out.println("       MATERIAS REGISTRADAS \n" );

        for (Materia materia : materias) {

            System.out.println("CODIGO: " + materia.getCodigo());
            System.out.println("NOMBRE: " + materia.getNombreMateria());
            System.out.println("CREDITOS: " + materia.getCantidadCreditos());

            System.out.println("====================================");
        }
    }

    public void mostrarPromedio() {

        System.out.println("====================================");
        System.out.println("         REPORTE PROMEDIOS ");

        for (Estudiante estudiante : estudiantes) {

            double sumaPromedio = 0;
            double promedio = 0;
            String aprobadoDesaprobado = "";

            ArrayList<Materia> materiasEstudiante = estudiante.getMaterias();

            int cantidadMaterias = materiasEstudiante.size();

            for (Materia materia : materiasEstudiante) {

                sumaPromedio+= materia.getCalificacion();
            }

            if (cantidadMaterias == 0) {

            System.out.println(estudiante.getNombre().toUpperCase() + " NO LLEVA MATERIAS ");
            System.out.println("====================================");
            continue;
        }

            promedio = sumaPromedio / cantidadMaterias;

            if (promedio >= 70) {

                aprobadoDesaprobado = "APROBADO";

                System.out.println(estudiante.getNombre().toUpperCase() + ": " + promedio + " - " + aprobadoDesaprobado);
                System.out.println("====================================");
            }

            else {

                aprobadoDesaprobado = "DESAPROBADO";

                System.out.println(estudiante.getNombre().toUpperCase() + ": " + promedio + " - " + aprobadoDesaprobado);
                System.out.println("====================================");
            }   
        }
    }

    public void mostrarEstudiante(Estudiante estudiante) {

        System.out.println("====================================");
        System.out.println("MATRICULA: " + estudiante.getMatricula());
        System.out.println("NOMBRE: " + estudiante.getNombre());
        System.out.println("APELLIDO: " + estudiante.getApellido());
        System.out.println("EDAD: " + estudiante.getEdad());
        System.out.println("CARRERA: " + estudiante.getCarrera());
        System.out.println("FECHA INSCRIPCION: " + estudiante.getFechaInscripcion());
        System.out.println("====================================");
    }
}