package pkg5.introduccionpoo.nave.espacial;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    
    public String setNombre(String denominacion){
        return nombre = denominacion;
    }
    
    public int setCombustible(int cantidad){
        return combustible = cantidad;
    }
    
    public int avanzar(int distancia){
        return combustible = combustible - distancia;
    }
    
    public void despegar(int distancia){
        System.out.println("Iniciando motores. Comprobando sistemas...");
        if (combustible == 100){
            System.out.println("La nave a despegado.");
            avanzar(distancia);
        }
        else{
            System.out.println("ADVERTENCIA: Debe recargar combustible.");
        }
    }
    
    public void recargarCombustible(){
        System.out.println("Recargado combustible");
        if (combustible <= 100) {
            combustible = 100;
        }
        System.out.println("Proceso terminado.");
    }
    
    public void mostrarEstado(){
        System.out.println("ID NAVE: " + nombre +
                           ", CANTIDAD COMBUSTIBLE: " + combustible);
    }
}
