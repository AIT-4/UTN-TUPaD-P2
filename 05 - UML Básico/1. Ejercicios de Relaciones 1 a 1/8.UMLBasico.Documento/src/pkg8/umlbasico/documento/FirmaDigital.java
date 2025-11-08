package pkg8.umlbasico.documento;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    Usuario usuario;
    
    // Constructor
    public FirmaDigital(String codigoHashFirma, String fechaFirma, Usuario usuario) {
        setCodigoHash(codigoHashFirma);
        setFecha(fechaFirma);
        this.usuario = usuario;
    }
    // Setters
    public void setCodigoHash(String codigoHashFirma) {
        this.codigoHash = codigoHashFirma;
    }
    public void setFecha(String fechaFirma) {
        this.fecha = fechaFirma;
    }
    
    // Getters
    public String getCodigoHash() {
        return codigoHash;
    }
    public String getFecha() {
        return fecha;
    }
    
    @Override
    public String toString() {
        return "\nUsuario: " + usuario.getNombre() +
               "\nEmail: " + usuario.getEmail() +
               "\nCodigo Hash de firma digital: " + codigoHash +
               "\nFecha de la firma digital: " + fecha;
    }
    
    
    
}
