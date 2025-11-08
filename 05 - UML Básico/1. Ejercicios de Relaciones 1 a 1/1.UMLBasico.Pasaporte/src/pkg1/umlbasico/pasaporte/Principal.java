/*
Pasaporte - Foto - Titular
a.​ Composición: Pasaporte → Foto
b.​ Asociación bidireccional: Pasaporte ↔ Titular

Clases y atributos:
i.​ Pasaporte: numero, fechaEmision
ii.​ Foto: imagen, formato
iii.​ Titular: nombre, dni
 */
package pkg1.umlbasico.pasaporte;

public class Principal {

    public static void main(String[] args) {
        // Instanciamos objetos con ambos constructores.
        Pasaporte pasaporte1 = new Pasaporte(234847382, "17/08/1980", true, "16x16");
        Pasaporte pasaporte2 = new Pasaporte(343423423, "25/03/2010", true, "16x16");
        Titular titular1 = new Titular("Carolina Martinez", 23484738);
        Titular titular2 = new Titular("Lisandro Martinez", 34342342);
        titular1.setPasaporte(pasaporte1);
        titular2.setPasaporte(pasaporte2);
        
         // Mostramos el estado
        System.out.println(pasaporte1.toString());
        System.out.println(pasaporte2.toString());
    }
    
}
