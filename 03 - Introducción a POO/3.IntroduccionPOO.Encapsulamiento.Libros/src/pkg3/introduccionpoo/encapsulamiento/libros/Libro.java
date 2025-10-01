package pkg3.introduccionpoo.encapsulamiento.libros;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void setTitulo(String nombre) {
        titulo = nombre;        
    }
    
    public void setAutor(String escritor) {
        autor = escritor;   
    }
    public void setAnioPublicacion(int anio) {
        if (anio > 0) {
            anioPublicacion = anio;     
        }
        else {
            System.out.println("El año ingresado es inválido.");
        }
    }
    
    public void mostrarLibro(){
        System.out.println("TITULO: "+ titulo +
                           " AUTOR: " + autor +
                           " AÑO DE PUBLICACIÓN: " + anioPublicacion);
    }
    
    
}
