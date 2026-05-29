public class Materia {

    private int codigo;
    private String nombreMateria;
    private int cantidadCreditos;

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

    public void setCodigo(int codigo) {

        this.codigo = codigo;
    }

    public void setNombreMateria(String nombreMateria) {

        this.nombreMateria = nombreMateria;
    }

    public void setCantidadCreditos(int cantidadCreditos) {

        this.cantidadCreditos = cantidadCreditos;
    }  
}
