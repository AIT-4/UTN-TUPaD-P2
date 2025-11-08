package pkg13.umlbasico.generadorqr;

public class CodigoQR {
    private String valor;
    private Usuario usuario;
    
    // Constructor
    public CodigoQR(String valor) {
        this.valor = valor;
    }
    
    // Setters
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }   
    
}
