package pkg2.umlbasico.celular;

public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;
    
    // Constructor
    public Usuario(String nombreCompleto, int numeroDni) {
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
    public void setCelular(Celular celular) {
        this.celular = celular;
        // Actualizamos la referencia en el celular
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }
    
    // Getters
    public Celular getCelular(){
        return celular;
    }
    
    @Override
    public String toString(){
        return "USUARIO:" +
               " Nombre: " + nombre +
               ", DNI: " + dni;
    }
}
