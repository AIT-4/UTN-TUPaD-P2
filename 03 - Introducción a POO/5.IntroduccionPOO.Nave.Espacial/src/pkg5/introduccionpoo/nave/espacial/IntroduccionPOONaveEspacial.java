/*
 Simulación de Nave Espacial

Crear una clase NaveEspacial con los atributos: nombre, combustible. 

Métodos requeridos: despegar(), avanzar(distancia),recargarCombustible(cantidad),
mostrarEstado().

Reglas: Validar que haya suficiente combustible antes de avanzar y evitar
que se supere el límite al recargar.

Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar
sin recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
 */
package pkg5.introduccionpoo.nave.espacial;

public class IntroduccionPOONaveEspacial {

    public static void main(String[] args) {
        // Creamos la instancia con menos del combustible necesario.
        NaveEspacial naveEspacial = new NaveEspacial();
        
        naveEspacial.setNombre("USS Enterprise");
        naveEspacial.setCombustible(50);
        
        naveEspacial.mostrarEstado();
        
        // Intentamos iniciar el viaje sin controlar combustible
        naveEspacial.despegar(98);
        
        // Recargamos combustible
        naveEspacial.recargarCombustible();
        naveEspacial.mostrarEstado();
        
        // Volvemos a intentar despegar
        naveEspacial.despegar(98);
        naveEspacial.mostrarEstado();
    }
    
}
