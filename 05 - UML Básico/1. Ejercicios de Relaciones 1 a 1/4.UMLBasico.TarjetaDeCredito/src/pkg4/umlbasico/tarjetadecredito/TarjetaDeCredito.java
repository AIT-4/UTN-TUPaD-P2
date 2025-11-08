package pkg4.umlbasico.tarjetadecredito;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;
    
    // Constructor
    public TarjetaDeCredito(String numeroTarjeta, String fechaVencimientoTarjeta, Banco banco) {
        setNumero(numeroTarjeta);
        setFechaVencimiento(fechaVencimientoTarjeta);
        this.banco = banco;
    }
    
    // Setters
    public void setNumero(String numeroTarjeta) {
        this.numero = numeroTarjeta;
    }
    public void setFechaVencimiento(String fechaVencimientoTarjeta) {
        this.fechaVencimiento = fechaVencimientoTarjeta;
    }
    
    // Getters
    public Cliente getCliente() {
        return cliente;
    }
            
    // Método para la bidireccionalidad
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    @Override
    public String toString(){
        return "Numero de TC: " + numero +
               "\nFecha de vencimiento: " + fechaVencimiento +
               "\nEntiedad bancaria: " + banco.getNombre() +
               "\nCUIT: " + banco.getCuit() +
               "\nNombre del cliente: " + cliente.getNombre() +
               "\nDNI: " + cliente.getDni();
    }
}
