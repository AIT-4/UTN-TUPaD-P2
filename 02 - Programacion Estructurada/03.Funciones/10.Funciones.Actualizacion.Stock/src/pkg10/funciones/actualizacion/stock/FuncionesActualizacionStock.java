/*
10.​Actualización de stock a partir de venta y recepción de productos.

Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), que calcule el nuevo stock después de una venta
y recepción de productos:

NuevoStock = StockActual − CantidadVendida + CantidadRecibida

Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
 */
package pkg10.funciones.actualizacion.stock;

import java.util.Scanner;

public class FuncionesActualizacionStock {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaramos variables.
        int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;
        
        // Solicitamos al usuario el stock actual, la cantidad vendida y la cantidad recibida.
        System.out.print("Ingrese la cantidad, actual, de unidades en stock: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        // Mostramos el resueltado.
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevos stock a partir de los datos ingresados es: " + nuevoStock + " unidades.");
    }
    // Metodos para el calculo
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
