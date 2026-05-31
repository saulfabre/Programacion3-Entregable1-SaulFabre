public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido) {

        setNombre(nombre);
        setApellido(apellido);
    }

    public Persona(String nombre, String apellido, int edad) {

        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
    }

    public String getNombre() {

        return nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public int getEdad() {

        return edad;
    }

    public void setNombre(String nombre) {

        if (nombre.isBlank()) {

            System.out.println("ERROR: NOMBRE VACIO ");
            this.nombre = "ERROR";
            return;
        }

        this.nombre = nombre;
    }

    public void setApellido(String apellido) {

        if (apellido.isBlank()) {

            System.out.println("ERROR: APELLIDO VACIO ");
            this.apellido = "ERROR";
            return;
        }

        this.apellido = apellido;
    }

    public void setEdad(int edad) {

        if (edad <= 0) {

            System.out.println("ERROR: EDAD INVALIDA ");
            this.edad = 1;
            return;
        }

        this.edad = edad;
    }
}
