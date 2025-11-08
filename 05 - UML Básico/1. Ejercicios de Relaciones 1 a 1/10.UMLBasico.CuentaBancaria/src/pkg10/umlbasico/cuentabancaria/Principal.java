/*
10.​CuentaBancaria - ClaveSeguridad - Titular
a.​ Composición: CuentaBancaria → ClaveSeguridad
b.​ Asociación bidireccional: CuentaBancaria ↔ Titular

Clases y atributos:
i.CuentaBancaria: cbu, saldo
ii.​ClaveSeguridad: codigo, ultimaModificacion
iii.​Titular: nombre, dni.
 */
package pkg10.umlbasico.cuentabancaria;

public class Principal {

    public static void main(String[] args) {
        // Instanciamos objetos con constructores.
        CuentaBancaria cuentaBancaria = new CuentaBancaria("5674213622100000125", 1200000, "hjk.4562", 45);
        Titular titular = new Titular("Morena Martínez", "35123698");
        
        // Se prueba bidireccionalidad con el metodo de asignacion con un metodo u el otro
        
        // cuentaBancaria.setTitular(titular);
        titular.setCuentaBancaria(cuentaBancaria);
        
        // Mostramos el resultado imprimiendo las variables de cada clase
        System.out.println(cuentaBancaria.toString());
    }
    
}
