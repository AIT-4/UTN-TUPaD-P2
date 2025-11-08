package pkg3.umlbasico.libro;

public class Autor {
    private String nombre;
    private String nacionalidad;
    
    // Constructor
    public Autor(String nombreAutor, String nacionalidadAutor) {
        setNombre(nombreAutor);
        setNacionalidad(nacionalidadAutor);
    }
    
    // Setters
    public void setNombre(String nombreAutor) {
        this.nombre = nombreAutor;
    }
    public void setNacionalidad(String nacionalidadAutor) {
        this.nacionalidad = nacionalidadAutor;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
}
