package pkg4.introduccionpoo.gestion.granja;

public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    public String setIdGallina(String nombre){
        if (nombre != null) {
            idGallina = nombre;
        }
        return idGallina;
    }
    
    public int envejecer(int anios){
        return edad = anios;
    }
    
    public int ponerHuevos(int cantidadHuevos){
        if (cantidadHuevos > 0){
            huevosPuestos =+ cantidadHuevos;
        }
        return huevosPuestos;
    }
    
    public void mostrarEstado(){
        System.out.println("GALLINA: " + idGallina +
                           ", EDAD(años): " + edad + 
                           ", CANTIDAD DE HUEVOS PUESTOS: " + huevosPuestos);
    }
    
    
}
