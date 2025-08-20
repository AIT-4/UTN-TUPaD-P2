/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.introduccion.captura.variables;

import java.util.Scanner;

public class IntroduccionCapturaVariables {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nombre;
        String edad;
        
        System.out.print("Ingrese, por favor, su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = input.nextLine();
        
        System.out.println("Su nombre es " + nombre + " y su edad es de " + edad + " años");
    }
    
}
