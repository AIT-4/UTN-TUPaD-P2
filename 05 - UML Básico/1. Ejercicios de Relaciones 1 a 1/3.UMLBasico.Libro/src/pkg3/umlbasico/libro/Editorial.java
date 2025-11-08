package pkg3.umlbasico.libro;

public class Editorial {
    private String nombre;
    private String direccion;
    
    // Constructor
    public Editorial(String nombreEditorial, String direccionEditorial) {
        setNombre(nombreEditorial);
        setDireccion(direccionEditorial);
    }
    
    // Setters
    public void setNombre(String nombreEditorial) {
        this.nombre = nombreEditorial;
    }
    public void setDireccion(String direccionEditorial) {
        this.direccion = direccionEditorial;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
}
