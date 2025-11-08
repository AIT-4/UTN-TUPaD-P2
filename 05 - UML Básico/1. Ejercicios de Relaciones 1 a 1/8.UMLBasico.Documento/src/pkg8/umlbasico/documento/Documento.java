package pkg8.umlbasico.documento;

public class Documento {
    private String titulo;
    private String contenido;
    FirmaDigital firmaDigital;
    
    // Constructor
    public Documento(String tituloDocumento, String contenidoDocumento, String codigoHash, String fecha, Usuario usuario) {
        setTitulo(tituloDocumento);
        setContenido(contenidoDocumento);
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }
    
    // Setters
    public void setTitulo(String tituloDocumento) {
        this.titulo = tituloDocumento;
    }

    public void setContenido(String contenidoDocumento) {
        this.contenido = contenidoDocumento;
    }
    
    @Override
    public String toString() {
        return "\nTitulo del documento: " + titulo +
               "\nContenido: " + contenido +
               firmaDigital.toString();
    }
    
}
