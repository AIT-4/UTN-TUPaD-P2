/*
9.​ Composición de funciones para calcular costo de envío y total de compra.

a.​calcularCostoEnvio(double peso, String zona): 
Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.​

Nacional: $5 por kg
Internacional: $10 por kg

b. calcularTotalCompra(double precioProducto, double costoEnvio): 
Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.​

Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar.
 */
package pkg9.funciones.costo.envio;

import java.util.Scanner;

public class FuncionesCostoEnvio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Definimos variables
        double pesoPaquete, precioProducto, precioFinal;
        char zonaEnvio;
        
        // Solicitamos al usuario el peso del paquete, la zona de envio y el precio del producto
        System.out.println("CALCULADORA DE PRECIO DE ENVIO");
        System.out.print("Ingrese el peso del paquete expresado en kilogramos: ");
        pesoPaquete = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la zona de envio (N para Nacional e I para Internacional): ");
        zonaEnvio = input.nextLine().charAt(0);
        
        System.out.print("Ingrese el valor del producto (valor en pesos): ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        // Mostramos el precio a pagar por las condiciones ingresadas
        precioFinal = calcularTotalCompra(precioProducto, calcularCostoEnvio(pesoPaquete, zonaEnvio));
        
        System.out.println("El valor total que debe pagar para el envio es de: " + precioFinal + " pesos.");
    }
    // Definimos las funciones que van a calcular el costo de envio y total de la compra
    public static double calcularCostoEnvio(double peso, char zona){
        double costoEnvio = 0;
        switch (zona) {
            case 'N', 'n' -> costoEnvio = peso * 5;
            case 'I', 'i' -> costoEnvio = peso * 10;
        }
        return costoEnvio;
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
    
}
