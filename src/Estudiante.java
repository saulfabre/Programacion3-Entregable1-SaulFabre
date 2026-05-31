import java.util.ArrayList;
import java.time.LocalDate;

public class Estudiante extends Persona {

    private String matricula;
    private String carrera;
    private LocalDate fechaInscripcion;
    private ArrayList<Materia> materias = new ArrayList<>();

    public Estudiante(String nombre, String apellido, int edad, String matricula, String carrera) {

        super(nombre, apellido, edad);
        setMatricula(matricula);
        setCarrera(carrera);
        setFechaInscripcion(LocalDate.now());
    }

    public String getMatricula() {

        return matricula;
    }

    public String getCarrera() {

        return carrera;
    }

    public LocalDate getFechaInscripcion() {

        return fechaInscripcion;
    }

    public ArrayList<Materia> getMaterias() {

        return materias;
    }

    public void setMatricula(String matricula) {

        if (matricula.isBlank()) {

            System.out.println("ERROR: MATRICULA VACIA ");
            this.matricula = "ERROR";
            return;
        }

        this.matricula = matricula;
    }

    public void setCarrera(String carrera) {

        if (carrera.isBlank()) {

            System.out.println("ERROR: CARRERA VACIA ");
            this.carrera = "ERROR";
            return;
        }

        this.carrera = carrera;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {

        this.fechaInscripcion = fechaInscripcion;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }  
}