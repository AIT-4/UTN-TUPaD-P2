package pkg13.umlbasico.generadorqr;

public class Usuario {
    private String nombre;
    private String email;
    
    // Constructor
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    
}
