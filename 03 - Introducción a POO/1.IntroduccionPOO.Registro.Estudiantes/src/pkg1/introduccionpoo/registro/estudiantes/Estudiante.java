package pkg1.introduccionpoo.registro.estudiantes;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion = 0;
    
    public void mostrarInfo(){
        System.out.println(
                "NOMBRE: " + nombre +
                " APELLIDO: " + apellido +
                " Curso: " + curso +
                " Calificación: " + calificacion);
    }
            
    public int subirCalificacion(int puntos){
        return calificacion = calificacion + puntos;
    }
            
    public int bajarCalificacion(int puntos){
        if (calificacion >= 0) {
            calificacion = calificacion - puntos;           
        }
        return calificacion;
    }
}
