package pkg10.umlbasico.cuentabancaria;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;
    
    // Constructor
    public CuentaBancaria(String cbuCuenta, double saldoCuenta, String codigo, int ultimaModificacion) {
        setCbu(cbuCuenta);
        setSaldo(saldoCuenta);
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion); // Relación de Composición
    }
    
    // Setters
    public void setCbu(String cbuCuenta) {
        this.cbu = cbuCuenta;
    }
    public void setSaldo(double saldoCuenta) {
        this.saldo = saldoCuenta;
    }
    // Método para la bidireccionalidad
    public void setTitular(Titular titular) {
        this.titular = titular;
        // Actualizamos la referencia en el titular
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }
    
    // Getters
    public Titular getTitular() {
        return titular;
    }
    

    @Override
    public String toString() {
        return  "- Datos de la Cuenta Bancaria -" + 
                "\nTitular: " + titular.getNombre() +
                "\nDNI: " + titular.getDni() +
                "\nCBU: " + cbu +
                "\nSaldo: $" + saldo + " pesos" +
                "\nClave de seguridad: " + claveSeguridad.getCodigo() +
                "\nDias de la ultima modificación: " + claveSeguridad.getUltimaModificacion() + " dias";
    }
}
