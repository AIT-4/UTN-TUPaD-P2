package sistema.gestion.empleados;

public class Principal {

    public static void main(String[] args) {
        
        // Instanciamos objetos con ambos contructores.
        Empleado empleado1 = new Empleado(1001,"Aydin Choi","Funcional Analyst", 989000.89);
        Empleado empleado2 = new Empleado(1002,"Bruce Knapp","QA Tester", 1200590.39);
        Empleado empleado3 = new Empleado(1003,"Zayd Dickerson","Product Owner", 1150929.99);
        Empleado empleado4 = new Empleado("Elina Tanner", "Developer");
        Empleado empleado5 = new Empleado("Samantha Sampson", "Developer");
        Empleado empleado6 = new Empleado("Rosalyn Barrera", "Developer");
        
        System.out.println("------");
        
        // Mostramos estado antes del cambio:
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        System.out.println(empleado5.toString());
        System.out.println(empleado6.toString());
        
        // Actualizamos los sueldos de algunos empleados:
        empleado2.actualizarSalario(0.8);
        empleado4.actualizarSalario(0.7);
        empleado5.actualizarSalario(200000);
        
        System.out.println("------");
        
        // Volvemos a mostrar estado:
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        System.out.println(empleado5.toString());
        System.out.println(empleado6.toString());
        
        System.out.println("------");
           
        // Mostramos el total de empleados:   
        Empleado.mostrarTotalEmpleados();
        
    }    
}
