/*
Registro de Mascotas
a.​ Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo
y verificar los cambios.
*/

package pkg2.introduccionpoo.registro.mascotas;

public class IntroduccionPOORegistroMascotas {

    public static void main(String[] args) {
        
        // Creamos nueva instancia
        Mascota mascota = new Mascota();
        
        mascota.nombre = "Pampa";
        mascota.especie = "Punky";
        mascota.edad = 9;
        
        mascota.mostrarInfo();
        
        // Cumplimos años y mostramos cambio.
        
        mascota.cumpliarAnios(2);
        mascota.mostrarInfo();
        
    }
    
}
