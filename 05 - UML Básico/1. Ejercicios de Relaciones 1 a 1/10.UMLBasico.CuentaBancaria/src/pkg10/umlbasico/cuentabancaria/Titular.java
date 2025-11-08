package pkg10.umlbasico.cuentabancaria;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;
    
    // Constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    } 
    // Setters
    // Método para la bidireccionalidad
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        // Actualizamos la referencia en la cuenta bancaria
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }
    
    // Getters
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    
    
}
