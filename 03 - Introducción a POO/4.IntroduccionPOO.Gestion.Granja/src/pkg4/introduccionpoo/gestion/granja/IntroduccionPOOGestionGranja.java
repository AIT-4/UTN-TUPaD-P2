/*
4.​ Gestión de Gallinas en Granja Digital
Crear una clase Gallina con los atributos: idGallina, edad y huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
 */
package pkg4.introduccionpoo.gestion.granja;

public class IntroduccionPOOGestionGranja {

    public static void main(String[] args) {
        // Creamos 2 instancias de Gallina
        Gallina gallinaPrimera = new Gallina();
        Gallina gallinaSegunda = new Gallina();
        
        gallinaPrimera.setIdGallina("Roja y Negra");
        gallinaPrimera.envejecer(0);
        gallinaPrimera.ponerHuevos(0);
        gallinaPrimera.mostrarEstado();
        
        gallinaSegunda.setIdGallina("Negra");
        gallinaSegunda.envejecer(0);
        gallinaSegunda.ponerHuevos(0);
        gallinaSegunda.mostrarEstado();
        
        // Simulamos las acciones
        
        gallinaPrimera.envejecer(1);
        gallinaPrimera.ponerHuevos(253);
        gallinaSegunda.envejecer(1);
        gallinaSegunda.ponerHuevos(153);
        
        gallinaPrimera.mostrarEstado();
        gallinaSegunda.mostrarEstado();
    }
    
}
