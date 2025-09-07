/*
6.​ Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros.
 */
package pkg6.repeticion.contador.signos;

import java.util.Scanner;

public class RepeticionContadorSignos {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaramos e inicializamos las variables
        int numero, cantidadPositivos = 0, cantidadNegativos = 0, cantidadCeros = 0;        
        
        // Solicitamos al usuario los numeros mediante una estructura repetitiva
        System.out.println("Contador de positivos, negativos y ceros.");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            numero = Integer.parseInt(input.nextLine());
            
            // Contamos los numeros dependiendo del signo.
            if (numero > 0) {
                cantidadPositivos += 1;
            } else if (numero < 0) {
                cantidadNegativos += 1;
            } else {
                cantidadCeros += 1;
            }
        }
        // Mostramos la cantidad de numeros contados.
        System.out.println("RESULTADOS");
        System.out.println("Cantidad de numeros positivos: " + cantidadPositivos);
        System.out.println("Cantidad de numeros negativos: " + cantidadNegativos);
        System.out.println("Cantidad de ceros: " + cantidadCeros);
    }
    
}
