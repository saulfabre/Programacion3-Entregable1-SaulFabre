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

        if (codigo < 0) {

            System.out.println("ERROR: CODIGO MINIMO 1 ");
            this.codigo = 1;
            return;
        }

        this.codigo = codigo;
    }

    public void setEspecialidad(String especialidad) {

        if (especialidad.isBlank()) {

            System.out.println("ERROR: ESPECIALIDAD VACIA ");
            this.especialidad = "ERROR";
            return;
        }

        this.especialidad = especialidad;
    }   
}
