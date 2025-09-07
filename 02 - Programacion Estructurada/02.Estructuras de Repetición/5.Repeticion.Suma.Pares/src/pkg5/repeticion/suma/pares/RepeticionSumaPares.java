/*
5.​ Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los números pares. 
El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.
 */
package pkg5.repeticion.suma.pares;

import java.util.Scanner;

public class RepeticionSumaPares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaramos e inicializamos las variables
        int numero, suma;
        
        numero = 1;
        suma = 0;

        // Solicitamos al usuario los numeros mediante una estructura repetitiva
        while (numero != 0) {
            System.out.print("Ingrese un numero (Para terminar ingrese 0):");
            numero = Integer.parseInt(input.nextLine());
            if (numero % 2 == 0) {
                suma = suma + numero;
            }
        }
        // Mostramos el resueltado de sumar los pares
        System.out.println("La suma total de los pares ingresados es: " + suma);
    }
    
}
