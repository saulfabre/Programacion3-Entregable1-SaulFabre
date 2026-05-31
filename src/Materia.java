public class Materia {

    private int codigo;
    private String nombreMateria;
    private int cantidadCreditos;
    private double calificacion;

    public Materia(int codigo, String nombreMateria, int cantidadCreditos) {

        setCodigo(codigo);
        setNombreMateria(nombreMateria);
        setCantidadCreditos(cantidadCreditos);
    }

    public int getCodigo() {

        return codigo;
    }

    public String getNombreMateria() {

        return nombreMateria;
    }

    public int getCantidadCreditos() {

        return cantidadCreditos;
    }

    public double getCalificacion() {

        return calificacion;
    }

    public void setCodigo(int codigo) {

        if (codigo < 0) {

            System.out.println("ERROR: CODIGO MINIMO 1 ");
            this.codigo = 1;
            return;
        }

        this.codigo = codigo;
    }

    public void setNombreMateria(String nombreMateria) {

        if (nombreMateria.isBlank()) {

            System.out.println("ERROR: NOMBRE MATERIA VACIO ");
            this.nombreMateria = "ERROR";
            return;
        }

        this.nombreMateria = nombreMateria;
    }

    public void setCantidadCreditos(int cantidadCreditos) {

        if (cantidadCreditos < 1) {

            System.out.println("ERROR: CREDITOS MINIMO 1 ");
            this.cantidadCreditos = 1;
            return;
        }

        this.cantidadCreditos = cantidadCreditos;
    }  

    public void setCalificacion(double calificacion) {

        if (calificacion < 0) {

            System.out.println("ERROR: LA CALIFICACION DEBE SER MAYOR O IGUAL A 0 ");
            this.calificacion = 0;
            return;
        }

        this.calificacion = calificacion;
    }
}
