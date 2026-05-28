public class Profesor extends Persona{

    private int codigo;
    private String especialidad;

    public Profesor(String nombre, String apellido, String especialidad, int codigo ) {

        super(nombre, apellido);
        setEspecialidad(especialidad);
        setCodigo(codigo);
    }

    public int getCodigo() {

        return codigo;
    }

    public String getEspecialidad() {

        return especialidad;
    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;
    }

    public void setEspecialidad(String especialidad) {

        this.especialidad = especialidad;
    }   
}
