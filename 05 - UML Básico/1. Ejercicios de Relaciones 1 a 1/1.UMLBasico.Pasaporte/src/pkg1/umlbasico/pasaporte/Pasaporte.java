package pkg1.umlbasico.pasaporte;

public class Pasaporte {
    private int numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    // Constructor
    public Pasaporte(int numeroPasaporte, String fecha, boolean imagenExiste, String tipoFormato){
        setNumero(numeroPasaporte);
        setFechaEmision(fecha);
        this.foto = new Foto(imagenExiste, tipoFormato);
    }
    
    // Setters
    public void setNumero(int numeroPasaporte) {
        this.numero = numeroPasaporte;
    }
    public void setFechaEmision(String fecha) {
        this.fechaEmision = fecha;
    }
    // Método para la bidireccionalidad
    public void setTitular(Titular titular) {
        this.titular = titular;
        // Actualizamos la referencia en el titular
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
    // Getters
    public Titular getTitular() {
        return titular;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getFechaEmision() {
        return fechaEmision;
    }
    
    @Override
    public String toString(){
        return titular.toString() +
               " N° Pasaporte: " + numero + 
               ", Fecha de emisión: " + fechaEmision + 
               " " + foto.toString();
               
    }
    
}
