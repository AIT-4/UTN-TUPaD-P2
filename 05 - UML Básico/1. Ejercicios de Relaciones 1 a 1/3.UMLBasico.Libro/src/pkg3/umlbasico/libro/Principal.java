/*
Libro - Autor - Editorial
a.​ Asociación unidireccional: Libro → Autor
b.​ Agregación: Libro → Editorial

Clases y atributos:
Libro: titulo, isbn
Autor: nombre, nacionalidad
Editorial: nombre, direccion
 */
package pkg3.umlbasico.libro;

public class Principal {

    public static void main(String[] args) {
        // Instanciamos objetos con constructores.
        Autor autor = new Autor("Dolores Reyes", "Argentina");
        Editorial editorial = new Editorial("Editorial Sigilo S.R.L", "Ciudad Autónoma de Buenos Aires");
        Libro libro = new Libro("Cometierra", "978-987-4063-65-6", editorial);
        
        // Seteamos a Libro el autor para generar la asociación
        libro.setAutor(autor);
        
        // Mostramos el resultado imprimiendo las variables de cada clase
        System.out.println(libro.toString());
        
    }
    
}
