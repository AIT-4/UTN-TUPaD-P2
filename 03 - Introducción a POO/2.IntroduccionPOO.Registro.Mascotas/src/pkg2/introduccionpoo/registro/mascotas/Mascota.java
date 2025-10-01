package pkg2.introduccionpoo.registro.mascotas;

public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo(){
        System.out.println("NOMBRE: " + nombre +
                           " ESPECIE: " + especie +
                           " EDAD: " + edad);
    }
    
    public int cumpliarAnios(int anios){
        return edad = edad + anios;
    }
}
