/*
7.​ Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario ingresa un número fuera de este rango,
debe seguir pidiéndole la nota hasta que ingrese un valor válido.
 */
package pkg7.repeticion.validacion.nota;

import java.util.Scanner;

public class RepeticionValidacionNota {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaramos las variables
        int nota = 1;
        
        // Solicitamos al usuario las notas mediantes una estructura repetitiva.
        do {     
            if (nota < 0 || nota > 10 ){
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
            System.out.print("Ingrese la nota (Debe ser de 0 a 10): ");
            nota = Integer.parseInt(input.nextLine());
        } while (nota < 0 || nota > 10 );        
        
        // Mostrasmos el mensaje de funcionamiento proceso correcto.
        System.out.println("La nota se guardo correctamente.");
    }
    
}
