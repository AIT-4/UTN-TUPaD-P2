package pkg1.umlbasico.pasaporte;

public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte;
    
    // Constructor
    public Titular(String nombreCompleto, int numeroDni) {
        setNombre(nombreCompleto);
        setDni(numeroDni);
    }
    
    // Setters
    public void setNombre(String nombreCompleto) {
        this.nombre = nombreCompleto;
    }
    public void setDni(int numeroDni) {
        this.dni = numeroDni;
    }
    // Método para la bidireccionalidad
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        // Actualizamos la referencia en el pasaporte
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
    
    // Getters
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getDni() {
        return dni;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + 
               ", DNI: " + dni;
    }
}
