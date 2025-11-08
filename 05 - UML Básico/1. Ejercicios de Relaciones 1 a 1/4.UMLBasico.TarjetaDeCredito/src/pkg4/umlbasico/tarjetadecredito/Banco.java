package pkg4.umlbasico.tarjetadecredito;

public class Banco {
    private String nombre;
    private String cuit;
    
    // Constructor
    public Banco(String nombreBanco, String ciutBanco) {
        setNombre(nombreBanco);
        setCuit(ciutBanco);
    }
    
    // Setters
    public void setNombre(String nombreBanco) {
        this.nombre = nombreBanco;
    }
    public void setCuit(String cuitBanco) {
        this.cuit = cuitBanco;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getCuit() {
        return cuit;
    }
}
