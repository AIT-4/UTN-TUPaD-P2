/*
Vehículo - Motor - Conductor
a.​ Agregación: Vehículo → Motor
b.​ Asociación bidireccional: Vehículo ↔ Conductor

Clases y atributos:
i.​ Vehículo: patente, modelo
ii.​ Motor: tipo, numeroSerie
iii.​Conductor: nombre, licencia
 */
package pkg7.umlbasico.vehiculo;

public class Principal {

    public static void main(String[] args) {
        // Instanciamos objetos con constructores.
        Motor motor = new Motor("Nafta", "1452566874");
        Vehiculo vehiculo = new Vehiculo("HKG856", "FIAT IDEA HLX", motor);
        Conductor conductor = new Conductor("SD-4569","Bibiana Castillo");
        
        // Se prueba bidireccionalidad con el metodo de asignacion con un metodo u el otro
        
        //vehiculo.setConductor(conductor);
        conductor.setVehiculo(vehiculo);
        
        // Mostramos el resultado imprimiendo las variables de cada clase
        System.out.println(vehiculo.toString());
    }  
}
