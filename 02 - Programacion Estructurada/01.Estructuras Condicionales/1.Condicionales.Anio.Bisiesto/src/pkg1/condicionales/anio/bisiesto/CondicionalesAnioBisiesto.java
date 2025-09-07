/*
1.​ Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. 
Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
*/

package pkg1.condicionales.anio.bisiesto;

import java.util.Scanner;

public class CondicionalesAnioBisiesto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaramos variables
        int anio = 0;
        
        // Pedimos al usuario que ingrese un numero
        System.out.print("Ingrese un año para verificar si es bisiesto: ");
        anio = Integer.parseInt(input.nextLine());
        
        // Verificamos si es año bisiesto
        while (anio < 0){
            System.out.print("Por favor, ingrese un año correcto: ");
            anio = Integer.parseInt(input.nextLine());
        }
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0){
                System.out.println(anio + " es año bisiesto.");
            } else{
                System.out.println(anio + " no es año bisiesto");
            }
    }  
}
