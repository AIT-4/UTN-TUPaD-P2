/*
3.​ Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"
 */
package pkg3.condicionales.clasificacion.edad;

import java.util.Scanner;

public class CondicionalesClasificacionEdad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaramos variables
        int edad;
        
        // Pedimos al usuario su edad
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        // Verificamos la edad y devolvemos el mensaje
        
        if (edad < 12){
            System.out.println("Niño");
        }else if (edad >= 12 && edad <= 17){
            System.out.println("Adolecente");
        }else if (edad >= 18 && edad <= 59){
            System.out.println("Adulto");
        }else{
            System.out.println("Adulto mayor");
        }
    }
    
}
