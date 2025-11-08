package pkg12.umlbasico.impuesto;

public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;
    
// Constructor
    public Impuesto(double monto) {
        this.monto = monto;
    }
    
    // Setters
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente; // Asociación unidireccional
    }

    @Override
    public String toString() {
        return  "Nombre del contribuyete: " + contribuyente.getNombre() +
                "\nCUIL: " + contribuyente.getCuil() +
                "\nMonto a pagar: $ " + monto + " Pesos";
    }
}
