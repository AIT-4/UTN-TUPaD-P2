package pkg2.umlbasico.celular;

public class Bateria {
    private String modelo;
    private int capacidad;
    
    // Construtor
    public Bateria(String nombreModelo, int capacidadValor){
        setModelo(nombreModelo);
        setCapacidad(capacidadValor);
    }
    
    // Setters
    public void setModelo(String nombreModelo){
        this.modelo = nombreModelo;
    }
    public void setCapacidad(int capacidadValor){
        this.capacidad = capacidadValor;
    }
    
    @Override
    public String toString(){
        return "BATERIA:" +
               " Modelo: " + modelo +
               ", Capacidad: " + capacidad +" mAh";
    }
}
