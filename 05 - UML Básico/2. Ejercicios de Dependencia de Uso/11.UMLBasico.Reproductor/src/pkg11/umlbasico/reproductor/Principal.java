/*
Reproductor - Canción - Artista
a.​Asociación unidireccional: Canción → Artista
b.​Dependencia de uso: Reproductor.reproducir(Cancion)

Clases y atributos:
i.​Canción: titulo.
ii.​Artista: nombre, genero.
iii.​Reproductor->método: void reproducir(Cancion cancion)
 */
package pkg11.umlbasico.reproductor;

public class Principal {

    public static void main(String[] args) {
        // Instanciamos objetos con constructores.
        Reproductor reproductor = new Reproductor();
        Cancion cancion = new Cancion("Breed");
        Artista artista = new Artista("Nirvana", "Alternative Rock/Grunge");
        cancion.setArtista(artista);
        
        // ​Dependencia de uso: de la clase reproductor hacia la clase cancion
        reproductor.reproducir(cancion);
    }
    
}
