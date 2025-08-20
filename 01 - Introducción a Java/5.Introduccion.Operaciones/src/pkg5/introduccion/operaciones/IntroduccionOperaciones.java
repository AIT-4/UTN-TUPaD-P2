/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.introduccion.operaciones;

import java.util.Scanner;

public class IntroduccionOperaciones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primerNumero;
        int segundoNumero;
        
        System.out.println("CALCULADORA");
        System.out.print("Ingrese un número: ");
        primerNumero = input.nextInt();
        System.out.print("Ingrese otro número: ");
        segundoNumero = input.nextInt();
        
        System.out.println(primerNumero + segundoNumero);
        System.out.println(primerNumero - segundoNumero);
        System.out.println(primerNumero * segundoNumero);
        System.out.println(primerNumero / segundoNumero);
    }
    
}
