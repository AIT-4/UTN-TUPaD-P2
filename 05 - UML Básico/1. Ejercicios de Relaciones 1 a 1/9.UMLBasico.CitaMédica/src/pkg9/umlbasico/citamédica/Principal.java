/*
CitaMédica - Paciente - Profesional
a.​ Asociación unidireccional: CitaMédica → Paciente,
b.​ Asociación unidirecciona: CitaMédica → Profesional

Clases y atributos:
i.​CitaMédica: fecha, hora
ii.​Paciente: nombre, obraSocial
iii.​Profesional: nombre, especialidad
 */
package pkg9.umlbasico.citamédica;

public class Principal {

    public static void main(String[] args) {
        // Instanciamos objetos con constructores.
        Paciente paciente = new Paciente("Leonor Garcia", "Mutual Obrera de Cuyo");
        Profesional profesional = new Profesional("Maria Candelaria Mora", "Oftalmóloga");
        CitaMedica citaMedica = new CitaMedica("06/11/2025", 15);
        
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(profesional);
        
        // Mostramos el resultado imprimiendo las variables de cada clase
        System.out.println(citaMedica.toString());
        
    }
    
}
