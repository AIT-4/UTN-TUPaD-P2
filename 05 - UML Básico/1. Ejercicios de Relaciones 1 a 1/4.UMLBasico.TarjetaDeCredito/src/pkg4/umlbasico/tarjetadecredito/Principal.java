/*
TarjetaDeCrédito - Cliente - Banco
a.​ Asociación bidireccional: TarjetaDeCrédito ↔ Cliente
b.​ Agregación: TarjetaDeCrédito → Banco

Clases y atributos:
i.​TarjetaDeCrédito: numero, fechaVencimiento
ii.​Cliente: nombre, dni
iii.​Banco: nombre, cuit
 */
package pkg4.umlbasico.tarjetadecredito;

public class Principal {

    public static void main(String[] args) {
        // Instanciamos objetos con constructores.
        Banco banco = new Banco("Banco de Desarrollo Nacional", "30-34837223-0");
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("3742984521332134", "06/2030", banco);
        Cliente cliente = new Cliente("Salvador Juaquin", 34231234);
        
        // Se prueba bidireccionalidad con el metodo de asignacion
        
        cliente.setTarjetaDeCredito(tarjetaDeCredito);
        //tarjetaDeCredito.setCliente(cliente);
        
        // Mostramos el resultado imprimiendo las variables de cada clase
        System.out.println(tarjetaDeCredito.toString());
    }
    
}
