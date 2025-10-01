/*
Encapsulamiento con la Clase Libro

a.​ Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.

Métodos requeridos: Getters para todos los atributos. Setter con validación
para añoPublicacion.

Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
uno válido, mostrar la información final.
*/
package pkg3.introduccionpoo.encapsulamiento.libros;

public class IntroduccionPOOEncapsulamientoLibros {

    public static void main(String[] args) {
        
        // Creamos un libro
        Libro libro = new Libro();
        libro.setTitulo("Todos los fuegos el fuego.");
        libro.setAutor("Julio Cortázar");
        libro.setAnioPublicacion(1000);
        
        libro.mostrarLibro();

        // Ingresamos los datos para el nuevo libro con el año inválido
        libro.setAnioPublicacion(-78);
        libro.mostrarLibro();
        
        // Ingresamos el dato correcto del año de publicacion del libro
        
        libro.setAnioPublicacion(1966);
        libro.mostrarLibro();
        
    }
    
}
