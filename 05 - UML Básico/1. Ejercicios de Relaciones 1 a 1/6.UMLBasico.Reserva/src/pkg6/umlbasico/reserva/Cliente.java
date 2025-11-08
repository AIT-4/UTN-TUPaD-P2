package pkg6.umlbasico.reserva;

public class Cliente {
    private String nombre;
    private int telefono;
    
    // Constructor

    public Cliente(String nombreCliente, int telefonoCliente) {
        this.nombre = nombreCliente;
        this.telefono = telefonoCliente;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    
}
