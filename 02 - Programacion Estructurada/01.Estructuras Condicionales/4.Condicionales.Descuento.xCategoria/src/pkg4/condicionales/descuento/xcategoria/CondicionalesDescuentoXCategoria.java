/*
4.​ Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el precio final
*/
package pkg4.condicionales.descuento.xcategoria;

import java.util.Scanner;

public class CondicionalesDescuentoXCategoria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaramos las variables
        double precio;
        char categoria;
        
        // Pedimos al usuario el valor del producto y la categoria
        System.out.println("CALCULADORA DE DESCUENTO");
        System.out.print("Ingrese el valor del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        // Consultamos categoria y aplicamos el descuento
        System.out.print("Ingrese la categoria (A, B o C): ");
        categoria = input.nextLine().charAt(0);
        
        switch (categoria) {
            case 'A':
            case 'a':
                precio = precio * 0.9;
                System.out.println("El descuento aplicado: 10%");
                break;
            case 'B':
            case 'b':
                precio = precio * 0.85;
                System.out.println("El descuento aplicado: 15%");
                break;
            case 'C':
            case 'c':
                precio = precio * 0.8;
                System.out.println("El descuento aplicado: 20%");
                break;
            default:
                System.out.println("No ingreso una categoria correcta.");
        }
        // Mostramos el precio final con el descuento aplicado
        System.out.println("El precio final con el descuento aplicado es: " + precio);
    }
    
}
