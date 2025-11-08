package pkg1.umlbasico.pasaporte;

public class Foto {
    private boolean imagenExiste;
    private String tipoFormato;
    private String texto;
    
    // Constructor
    public Foto(boolean existe, String formato){
        setImagenExiste(existe);
        setTipoFormato(formato);
    }
    
    // Setters
    public void setImagenExiste(boolean existe){
        this.imagenExiste = existe;
    }
    public void setTipoFormato(String formato){
        this.tipoFormato = formato;
    }
    
    private String booleanATexto(boolean imagenExiste) {
        if (imagenExiste) {
            texto = "Tiene";
            return texto;
        }
        else {
            texto = "No tiene";
            return texto;
        }
    
    }
    
    @Override
    public String toString(){
        return "Foto tiene? " + booleanATexto(imagenExiste) + 
               ", Formato: " + tipoFormato;
    }
    
}
