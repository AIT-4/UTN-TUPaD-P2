package pkg2.umlbasico.celular;

public class Celular {
    private int imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
    // Construtor
    public Celular(int numeroImei, String nombreMarca, String nombreModelo, Bateria bateria){
        setImei(numeroImei);
        setMarca(nombreMarca);
        setModelo(nombreModelo);
        this.bateria = bateria;
    }
    
    // Setters
    public void setImei(int numeroImei){
        this.imei = numeroImei;
    }
    public void setMarca(String nombreMarca){
        this.marca = nombreMarca;
    }
    public void setModelo(String nombreModelo){
        this.modelo = nombreModelo;
    }
    
    // Método para la bidireccionalidad
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        // Actualizamos la referencia en el usuario
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    // Getters
    public Usuario getUsuario(){
        return usuario;
    }
    
    @Override
    public String toString(){
        return "DATOS CELULAR:" +
               " IMEI: " + imei +
               ", Marca: " + marca +
               ", Modelo: " + modelo +
               ",  " + bateria.toString() +
               ",  " + usuario.toString();
    }
}
