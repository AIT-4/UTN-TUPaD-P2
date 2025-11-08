/*
Documento - FirmaDigital - Usuario
a.​ Composición: Documento → FirmaDigital
b.​ Agregación: FirmaDigital → Usuario

Clases y atributos:
i.​Documento: titulo, contenido
ii.​FirmaDigital: codigoHash, fecha
iii.​Usuario: nombre, email
 */
package pkg8.umlbasico.documento;

public class Principal {

    public static void main(String[] args) {
        // Instanciamos objetos con constructores.
        Usuario usuario = new Usuario("Santi Sanz", "santi.sanz@disroot.org");
        Documento documento = new Documento("Frente de Póliza", "Seguro contra todo riesgo", "4d46a3541e7a6101a12ac222edffc6c2", "05/10/2025", usuario);

        // Mostramos el resultado imprimiendo las variables de cada clase
        System.out.println(documento.toString());
    }
    
}
