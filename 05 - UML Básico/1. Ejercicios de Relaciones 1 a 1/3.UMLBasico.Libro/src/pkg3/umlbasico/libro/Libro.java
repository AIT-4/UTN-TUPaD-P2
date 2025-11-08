package pkg3.umlbasico.libro;

public class Libro {
    private String titulo;
    private String isbn;
    private Editorial editorial;
    private Autor autor;
            
    // Constructor
    public Libro(String tituloLibro, String numeroIsbn, Editorial editorial) {
        setTitulo(tituloLibro);
        setIsbn(numeroIsbn);
        this.editorial = editorial;
    }
    
    // Setters
    public void setTitulo(String tituloLibro) {
        this.titulo = tituloLibro;
    }
    public void setIsbn(String numeroIsbn) {
        this.isbn = numeroIsbn;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        return "Titulo: " + titulo +
               "\nISBN: " + isbn +
               "\nAutor: " + autor.getNombre() +
               "\nNacionalidad: " + autor.getNacionalidad() +
               "\nEditorial: " + editorial.getNombre() +
               "\nDireccion: " + editorial.getDireccion();
    }
}
