package pkg9.umlbasico.citamédica;

public class Paciente {
    private String nombre;
    private String obraSocial;
    
    // Constructor
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }  
}
