/*
Celular - Batería - Usuario
a.​ Agregación: Celular → Batería
b.​ Asociación bidireccional: Celular ↔ Usuario

Clases y atributos:
i.​ Celular: imei, marca, modelo
ii.​ Batería: modelo, capacidad
iii.​ Usuario: nombre, dni
 */
package pkg2.umlbasico.celular;

public class Principal {

    public static void main(String[] args) {
        // Instanciamos objetos con constructores.
        Bateria bateria = new Bateria("Litio", 5010);
        Celular celular = new Celular(364738283, "TLC", "502A", bateria);
        Usuario usuario = new Usuario("Armando Paredes", 29273848);
        
        // Seteamos a celular el usuario
        celular.setUsuario(usuario);
        
        // Mostramos el resultado imprimiendo las variables de cada clase
        System.out.println(celular.toString());
    }
    
}
