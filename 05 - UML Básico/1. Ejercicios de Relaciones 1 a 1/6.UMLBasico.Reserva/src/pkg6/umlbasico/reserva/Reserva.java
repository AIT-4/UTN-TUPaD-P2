package pkg6.umlbasico.reserva;

public class Reserva {
    private String fecha;
    private int hora;
    private Cliente cliente;
    private Mesa mesa;
    public static int contador = 1;
    
    // Constructor

    public Reserva(String fechaReserva, int horaReserva, Mesa mesa) {
        setFecha(fechaReserva);
        setHora(horaReserva);
        this.mesa = mesa; // Relacion por agregación
    }
    
    // Setters
    public void setFecha(String fechaReserva) {
        this.fecha = fechaReserva;
    }
    public void setHora(int horaReserva) {
        this.hora = horaReserva;
    }
    // Metodo de asociación unidireccional
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public String toString() {
        return "\nRESERVA N°" + contador++ + ": " +
               "\nFecha: " + fecha +
               "\nHora: " + hora + " hs " +
               "\nNumero de mesa: " + mesa.getNumero() +
               "\nCantidad de personas: " + mesa.getCapacidad() +
               "\nA nombre de: " + cliente.getNombre() +
               "\nTelefono: " + cliente.getTelefono();
    }
}
