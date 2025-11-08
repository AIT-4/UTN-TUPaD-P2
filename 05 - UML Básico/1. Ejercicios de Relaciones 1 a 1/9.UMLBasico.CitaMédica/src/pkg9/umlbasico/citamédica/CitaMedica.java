package pkg9.umlbasico.citamédica;

public class CitaMedica {
    private String fecha;
    private int hora;
    private Paciente paciente;
    private Profesional profesional;
    
    // Constructor
    public CitaMedica(String fechaCita, int horaCita) {
        setFecha(fechaCita);
        setHora(horaCita);
    }
    
    // Setters
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente; // Asociación Unidireccional 
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional; // Asociación Unidireccional
    }
    
    @Override
    public String toString(){
        return  "- Registro de cita medica -" +
                "\nFecha: " + fecha +
                "\nHora: " + hora + " hs." +
                "\nNombre completo: " + paciente.getNombre() +
                "\nObra social: " + paciente.getObraSocial() +
                "\nNombre completo del profesional: " + profesional.getNombre() +
                "\nEspecialidad: " + profesional.getEspecialidad();
        
    }
}
