/*
11. Cálculo de descuento especial usando variable global.

Declara una variable global Ejemplo de entrada/salida: = 0.10.

Luego,  crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%.

Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.
 */
package pkg11.funciones.calculo.descuento;

import java.util.Scanner;

public class FuncionesCalculoDescuento {
    
    final static double DESCUENTO10 = 0.1; 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaramos variables.
        double precioProducto;
        
        // Solicitamos al usuario el precio del producto
        System.out.println("CALCULADORA DE DESCUENTO");
        System.out.print("Ingrese el precio (en pesos) del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        // Mostramos el descuento que se le hizo y el precio final.
        calcularDescuentoEspecial(precioProducto);
    }
    
    public static void calcularDescuentoEspecial(double precio){
        //Declaramos variables.
        double descuentoAplicado, precioFinal;
        
        // Calculamos el descuento y precio final.
        descuentoAplicado = precio * DESCUENTO10;
        precioFinal = precio - descuentoAplicado;
        
        // Mostramos los resueltados.
        System.out.println("El descuento aplicado es de: " + descuentoAplicado + " pesos.");
        System.out.println("El precio final del producto: " + precioFinal + " pesos.");
    }
}
