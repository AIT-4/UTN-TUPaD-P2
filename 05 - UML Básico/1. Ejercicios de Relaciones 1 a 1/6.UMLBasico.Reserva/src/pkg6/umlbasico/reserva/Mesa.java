package pkg6.umlbasico.reserva;

public class Mesa {
    private int numero;
    private int capacidad;
    
    // Constructor

    public Mesa(int numeroMesa, int capacidadMesa) {
        this.numero = numeroMesa;
        this.capacidad = capacidadMesa;
    }
    
    // Getters
    public int getNumero() {
        return numero;
    }
    public int getCapacidad() {
        return capacidad;
    }
    
}
