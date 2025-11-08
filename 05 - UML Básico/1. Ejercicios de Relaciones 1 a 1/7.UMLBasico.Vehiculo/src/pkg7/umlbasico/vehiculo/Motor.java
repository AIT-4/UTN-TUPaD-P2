package pkg7.umlbasico.vehiculo;

public class Motor {
    private String tipo;
    private String numeroSerie;
    
    // Constructor
    public Motor(String tipoMotor, String numeroSerieMotor) {
        setTipo(tipoMotor);
        setNumeroSerie(numeroSerieMotor);
    }
    // Setters
    public void setTipo(String tipoMotor) {
        this.tipo = tipoMotor;
    }

    public void setNumeroSerie(String numeroSerieMotor) {
        this.numeroSerie = numeroSerieMotor;
    }
    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
    
}
