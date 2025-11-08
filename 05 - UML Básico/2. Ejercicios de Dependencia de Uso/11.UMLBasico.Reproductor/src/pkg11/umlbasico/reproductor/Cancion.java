package pkg11.umlbasico.reproductor;

public class Cancion {
    private String titulo;
    private Artista artista;
    
    // Constructor
    public Cancion(String titulo) {
        this.titulo = titulo;
    }
    
    // Setters
    public void setArtista(Artista artista) {
        this.artista = artista; // Asociación unidireccional
    }

    @Override
    public String toString() {
        return  "Titulo: " + titulo +
                "\nArtista: " + artista.getNombre() +
                "\nGenero: " + artista.getGenero();
    }
    
    
    
}
