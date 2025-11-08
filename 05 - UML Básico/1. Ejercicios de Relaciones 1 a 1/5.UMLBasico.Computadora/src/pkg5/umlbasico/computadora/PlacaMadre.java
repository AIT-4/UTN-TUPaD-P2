package pkg5.umlbasico.computadora;

public class PlacaMadre {
    private String modelo;
    private String chipset;
    
    // Constructor
    public PlacaMadre(String modeloPlacaMadre, String chipsetPlacaMadre) {
        setModelo(modeloPlacaMadre);
        setChipset(chipsetPlacaMadre);
    }
    
    // Setters
    public void setModelo(String modeloPlacaMadre) {
        this.modelo = modeloPlacaMadre;
    }
    public void setChipset(String chipsetPlacaMadre) {
        this.chipset = chipsetPlacaMadre;
    }
    
    @Override
    public String toString(){
        return "\nModelo de la placa madre: " + modelo +
               "\nChipset: " + chipset;
    }
    
}
