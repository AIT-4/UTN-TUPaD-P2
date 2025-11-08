package pkg10.umlbasico.cuentabancaria;

public class ClaveSeguridad {
    private String codigo;
    private int ultimaModificacion;
    
    // Constructor
    public ClaveSeguridad(String codigo, int ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    
    // Getters
    public String getCodigo() {
        return codigo;
    }
    public int getUltimaModificacion() {
        return ultimaModificacion;
    }
    
}
