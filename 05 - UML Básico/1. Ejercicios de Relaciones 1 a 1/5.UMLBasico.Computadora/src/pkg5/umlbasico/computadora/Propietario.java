package pkg5.umlbasico.computadora;

public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora;
    
    // Constructor
    public Propietario(String nombrePropietario, int dniPropietario) {
        setNombre(nombrePropietario);
        setDni(dniPropietario);
    }
    
    // Setters
    public void setNombre(String nombrePropietario) {
        this.nombre = nombrePropietario;
    }
    public void setDni(int dniPropietario) {
        this.dni = dniPropietario;
    }
    
    // Getters
    public Computadora getComputadora() {
        return computadora;
    }
    
    // Metodo de asociacion bidireccional
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario()!= this) {
            computadora.setPropietario(this);
        }
    }
    @Override
    public String toString() {
        return "\nNombre del propietario: " + nombre +
               "\nDNI: " + dni;
    }
}
