package pkg4.umlbasico.tarjetadecredito;

public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjetaDeCredito;
    
    // Constructor
    public Cliente(String nombreCliente, int dniCliente) {
        setNombre(nombreCliente);
        setCuit(dniCliente);
    }
    
    // Setters
    public void setNombre(String nombreCliente) {
        this.nombre = nombreCliente;
    }
    public void setCuit(int dniCliente) {
        this.dni = dniCliente;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }
    
    // Método para la bidireccionalidad
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
            tarjetaDeCredito.setCliente(this);
        }
    }
}
