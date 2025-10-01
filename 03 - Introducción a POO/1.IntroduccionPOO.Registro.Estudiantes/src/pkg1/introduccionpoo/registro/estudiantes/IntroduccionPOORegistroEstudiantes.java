/*
Registro de Estudiantes
a.​ Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.

Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).

Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.
*/
package pkg1.introduccionpoo.registro.estudiantes;

public class IntroduccionPOORegistroEstudiantes {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        
        estudiante.nombre = "Federico";
        estudiante.apellido = "Durussel";
        estudiante.curso = "Marzo 2025";
        
        // Estado inicial 
        estudiante.mostrarInfo();
        
        // Subimos la calificación y mostramos el cambio
        estudiante.subirCalificacion(10);
        estudiante.mostrarInfo();
        
        // Bajamos la calificación y mostramos el cambio
        estudiante.bajarCalificacion(4);
        estudiante.mostrarInfo();
        
    }
    
}
