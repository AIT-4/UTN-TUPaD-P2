/*
8.​ Cálculo del Precio Final con impuesto y descuento.
​
Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce.
La fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
 */
package pkg8.funciones.calculo.precio;

import java.util.Scanner;

public class FuncionesCalculoPrecio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declaramos variables
        double precioFinal, precioProducto, impuesto, descuento;
        
        // Solicitamos al usuario el precio, porcentaje de impuesto y el porcentaje de descuento.
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el porcentaje del impuesto (10 para 10%): ");
        impuesto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el porcentaje del descuento (5 para 5%): ");
        descuento = Double.parseDouble(input.nextLine());
       
        // Mostramos el precio final en pantalla
        precioFinal = calcularPrecioFinal(precioProducto, impuesto, descuento);
        
        System.out.println("El precio final es de: " + precioFinal);
    }
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        impuesto = impuesto / 100;
        descuento = descuento / 100;
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
    
}
