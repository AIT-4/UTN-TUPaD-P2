package pkg5.umlbasico.computadora;

public class Principal {

    public static void main(String[] args) {
        // Instanciamos objetos con constructores.
        Computadora computadora = new Computadora("ASAS", 4839473, "MSI-23", "B-6283");
        Propietario propietario = new Propietario("Oliver Garrido", 46282322);
                        
        // Se prueba bidireccionalidad con el metodo de asignacion       
        //propietario.setComputadora(computadora);
        computadora.setPropietario(propietario);
        
        // Mostramos el resultado imprimiendo las variables de cada clase
        System.out.println(computadora.toString());
    }
    
}
