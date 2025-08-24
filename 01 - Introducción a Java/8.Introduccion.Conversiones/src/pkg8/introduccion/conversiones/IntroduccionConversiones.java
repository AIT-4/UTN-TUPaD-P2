/* 
Manejar conversiones de tipo y división en Java.
a.​ Escribe un programa que divida dos números enteros ingresados por el
usuario.
b.​ Modifica el código para usar double en lugar de int y compara los
resultados.
*/

package pkg8.introduccion.conversiones;

import java.util.Scanner;

public class IntroduccionConversiones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaramos variables
        int dividendo, divisor, resultado;
        
        // Pedimos al usuario los valores
        System.out.print("Ingrese el número a dividir: ");
        dividendo = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese por cuanto lo va dividir: ");
        divisor =  Integer.parseInt(input.nextLine());
        
        resultado = dividendo / divisor;
        
        // Imprimimos resultado
        System.out.println("Su resultado es: " + resultado);
    }
    
}
