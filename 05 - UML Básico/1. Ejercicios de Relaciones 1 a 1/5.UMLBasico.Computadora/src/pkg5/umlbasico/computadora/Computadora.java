package pkg5.umlbasico.computadora;

public class Computadora {
    private String marca;
    private int numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    // Constructor
    public Computadora(String marcaComputadora, int numeroSerieComputadora, String modeloPlacaMadre, String chipsetPlacaMadre) {
        setMarca(marcaComputadora);
        setNumeroSerie(numeroSerieComputadora);
        this.placaMadre = new PlacaMadre(modeloPlacaMadre, chipsetPlacaMadre);
    }
    
    // Setters
    public void setMarca(String marcaComputadora) {
        this.marca = marcaComputadora;
    }
    public void setNumeroSerie(int numeroSerieComputadora) {
        this.numeroSerie = numeroSerieComputadora;
    }    
    
    // Metodo de asociacion bidireccional
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
    // Getters
    public Propietario getPropietario() {
        return propietario;
    }    
    
    @Override
    public String toString() {
        return "Marca de la computadora: " + marca +
               "\nNúmero de serie: " + numeroSerie +
               placaMadre.toString() +
               propietario.toString();
               
    }
    
}
