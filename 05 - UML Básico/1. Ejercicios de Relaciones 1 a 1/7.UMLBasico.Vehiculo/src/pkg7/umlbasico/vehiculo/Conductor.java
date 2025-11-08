package pkg7.umlbasico.vehiculo;

public class Conductor {
    private String licencia;
    private String nombre;
    private Vehiculo vehiculo;

    // Constructor
    public Conductor(String licenciaConductor, String nombreConductor) {
        setLicencia(licenciaConductor);
        setNombre(nombreConductor);
    }
    
    // Setters
    public void setLicencia(String licenciaConductor) {
        this.licencia = licenciaConductor;
    }

    public void setNombre(String nombreConductor) {
        this.nombre = nombreConductor;
    }
    // Getters
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getLicencia() {
        return licencia;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    // Método para la bidireccionalidad
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }    
}