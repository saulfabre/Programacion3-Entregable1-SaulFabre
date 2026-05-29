import java.util.ArrayList;

public class GestionAcademica {

    private ArrayList <Estudiante> estudiantes;
    private ArrayList <Profesor> profesores;
    private ArrayList <Materia> materias;

    public void registrarEstudiante(String matricula, String nombre, String apellido, int edad, String carrera, String fechaInscripcion) {

        for (Estudiante estudiante : estudiantes) {

            if (matricula.equals(estudiante.getMatricula())) {

                System.out.println("MATRICULA EXISTENTE ");
                return;
            }
        }

        Estudiante estudiante = new Estudiante(nombre, apellido, edad, matricula, carrera, fechaInscripcion);
        estudiantes.add(estudiante);
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
    }
}
