/*
Reserva - Cliente - Mesa
a.​ Asociación unidireccional: Reserva → Cliente
b.​ Agregación: Reserva → Mesa

Clases y atributos:
i. ​Reserva: fecha, hora
ii.​ Cliente: nombre, telefono
iii.​ Mesa: numero, capacidad
*/

package pkg6.umlbasico.reserva;

public class Principal {
    
    
    public static void main(String[] args) {    
        
        // Instanciamos objetos con constructores.
        Mesa mesa1 = new Mesa(22, 4);
        Mesa mesa2 = new Mesa(15, 6);
        Mesa mesa3 = new Mesa(10, 2);
        
        Reserva reserva1 = new Reserva("16/11/2025", 20, mesa1);
        Reserva reserva2 = new Reserva("17/11/2025", 21, mesa2);
        Reserva reserva3 = new Reserva("22/11/2025", 21, mesa3);
        
        Cliente cliente1 = new Cliente("Roque Villa", 22265656);
        reserva1.setCliente(cliente1); // Asignamos el cliente a la reserva
        Cliente cliente2 = new Cliente("Cristina Maria Vazquez", 59854756);
        reserva2.setCliente(cliente2);
        Cliente cliente3 = new Cliente("Marta Boix", 45745965);
        reserva3.setCliente(cliente3);
                
        // Mostramos el resultado imprimiendo las variables de cada clase
        System.out.println(reserva1.toString());
        System.out.println(reserva2.toString());
        System.out.println(reserva3.toString());
    }    
}
