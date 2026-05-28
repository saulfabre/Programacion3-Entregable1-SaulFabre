public class Estudiante extends Persona {

    private String matricula;
    private String carrera;
    private String fechaInscripcion;

    public Estudiante(String nombre, String apellido, int edad, String matricula, String carrera, String fechaInscripcion) {

        super(nombre, apellido, edad);
        setMatricula(matricula);
        setCarrera(carrera);
        setFechaInscripcion(fechaInscripcion);
    }

    public String getMatricula() {

        return matricula;
    }

    public String getCarrera() {

        return carrera;
    }

    public String getFechaInscripcion() {

        return fechaInscripcion;
    }

    public void setMatricula(String matricula) {

        this.matricula = matricula;
    }

    public void setCarrera(String carrera) {

        this.carrera = carrera;
    }

    public void setFechaInscripcion(String fechaInscripcion) {

        this.fechaInscripcion = fechaInscripcion;
    }  
}
