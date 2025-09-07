/*
2.​ Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
*/
package pkg2.condicionales.mayor;

import java.util.Scanner;

public class CondicionalesMayor {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       // Declaramos variables
       int num1, num2, num3;
       
       // Pedimos al usuario los numeros
        System.out.println("VERIFICACIÓN DEL NÚMERO MAYOR");
        
        System.out.print("Por favor ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ahora, ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Y, ahora, ingrese el tercer numero: ");
        num3 = Integer.parseInt(input.nextLine());
        
       // Verificamos cual es mayor con una estructura condicional
        if (num1 > num3 && num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else if  (num2 > num3 && num2 > num1){
            System.out.println("El numero mayor es: " + num2);
        } else {
            System.out.println("El numero mayor es: " + num3);
        }
    }
    
}
