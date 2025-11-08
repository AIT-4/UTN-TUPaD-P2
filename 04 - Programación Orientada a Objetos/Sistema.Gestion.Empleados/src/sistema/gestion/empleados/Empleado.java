package sistema.gestion.empleados;

import java.util.Random;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario = 1200000;
    private static int TOTALEMPLEADOS = 0;

    // Constructores
    public Empleado(int id, String nombre, String puesto, double salario) {
        setId(id);
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
        TOTALEMPLEADOS++;
    }
    
    public Empleado(String nombre, String puesto){
        this.id = generarId();
        setNombre(nombre);
        setPuesto(puesto);
        this.salario = salario;
        TOTALEMPLEADOS++;
    }
    // Setters
    public void setId(int id){
        if (id > 0) {
            this.id = id;
        }   
    }
    
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
    
    public void setPuesto(String puesto) {
        if (nombre != null) {
            this.puesto = puesto;
        }
    }
    
    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    // Métodos
    private int generarId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
        
    public double actualizarSalario(int aumento) {
        return this.salario = salario + aumento; 
    }
    
    public double actualizarSalario(double aumento) {
        return this.salario = salario + (salario * aumento);
    }
    
    public static void mostrarTotalEmpleados(){
        System.out.println("Total de Empleados registrados: " + Empleado.TOTALEMPLEADOS); 
    }
    
    @Override
    public String toString(){
        return "Legajo: " + id + 
               ", Nombre: " + nombre + 
               ", Puesto: " + puesto +
               ", Salario: " + salario;
    }
}
