/*
12.​ Modificación de un array de precios y visualización de resultados.

Crea un programa que:
a.Declare e inicialice un array con los precios de algunos productos.
b.​Muestre los valores originales de los precios.
c.​Modifique el precio de un producto específico.
d.​Muestre los valores modificados.

Conceptos Clave Aplicados:
✔ Uso de arrays (double[]) para almacenar valores.​
✔ Recorrido del array con for-each para mostrar valores.​
✔ Modificación de un valor en un array mediante un índice.​
✔ Reimpresión del array después de la modificación.
 */
package pkg12.arrayrecursividad.precios.resultados;

import java.util.Scanner;

public class ArrayRecursividadPreciosResultados {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaramos las variables.
        double[] Precios = {52, 45, 56, 78, 41};
        double nuevoPrecio;
        int indice;
        
        // Solicitamos al usuario un valor e indice para modificar.
        System.out.print("Ingrese un el precio a almacenar: ");
        nuevoPrecio = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese donde se va guardar (del 0 al 4): ");
        indice = Integer.parseInt(input.nextLine());
        
        while (indice < 0 || indice > 4) {
            System.out.print("ERROR. Ingrese un valor correcto de índice: ");
            indice = Integer.parseInt(input.nextLine());            
        }
        // Mostramos los valores originales.
        System.out.println("PRECIOS ORIGINALES");
        imprimeArray(Precios);
        
        // Modificamos el array con los valores agregados.
        Precios[indice] = nuevoPrecio;
        System.out.println("---");
       
        // Mostramos los valores los nuevos.
        System.out.println("PRECIOS NUEVOS");
        imprimeArray(Precios);
    }
    
    public static void imprimeArray(double[] precios) {
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);   
        }
    }
    
}
