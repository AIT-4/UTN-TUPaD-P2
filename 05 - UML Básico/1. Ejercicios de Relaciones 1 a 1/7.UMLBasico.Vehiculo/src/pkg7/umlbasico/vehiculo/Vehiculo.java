package pkg7.umlbasico.vehiculo;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    // Constructor
    public Vehiculo(String patenteVehiculo, String modeloVehiculo, Motor motor) {
        setPatente(patenteVehiculo);
        setModelo(modeloVehiculo);
        this.motor = motor; // Relacion por agregación
    }
    
    // Setters
    public void setPatente(String patenteVehiculo) {
        this.patente = patenteVehiculo;
    }

    public void setModelo(String modeloVehiculo) {
        this.modelo = modeloVehiculo;
    }
    // Getters

    public Conductor getConductor() {
        return conductor;
    }
    
    // Método para la bidireccionalidad
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    
    @Override
    public String toString(){
        return "Vehiculo, patente: " + patente +
               "\nModelo: " + modelo +
               "\nMotor: " + motor.getTipo()+
               "\nNumero de serie: " + motor.getNumeroSerie() +
               "\nNombre del conductor: " + conductor.getNombre()+
               "\nLicencia: " + conductor.getLicencia();
    }
    
}
