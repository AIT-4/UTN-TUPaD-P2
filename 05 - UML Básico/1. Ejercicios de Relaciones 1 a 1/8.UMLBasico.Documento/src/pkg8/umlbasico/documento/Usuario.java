package pkg8.umlbasico.documento;

public class Usuario {
    private String nombre;
    private String email;
    
    // Constructor
    public Usuario(String nombreUsuario, String emailUsuario) {
        this.nombre = nombreUsuario;
        this.email = emailUsuario;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    
    
}
