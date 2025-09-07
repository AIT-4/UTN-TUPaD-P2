/*
13.​ Impresión recursiva de arrays antes y después de modificar un elemento.

Crea un programa que:
a.​Declare e inicialice un array con los precios de algunos productos.
b.​Use una función recursiva para mostrar los precios originales.
c.​Modifique el precio de un producto específico.
d.​Use otra función recursiva para mostrar los valores modificados.

Conceptos Clave Aplicados:
✔ Uso de arrays (double[]) para almacenar valores.​
✔ Recorrido del array con una función recursiva en lugar de un bucle.​
✔ Modificación de un valor en un array mediante un índice.​
✔ Uso de un índice como parámetro en la recursión para recorrer el
array.
 */
package pkg13.arrayrecursividad.precios.recursivo;

import java.util.Scanner;

public class ArrayRecursividadPreciosRecursivo {

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
        imprimeArray(Precios, Precios.length);
        
        // Modificamos el array con los valores agregados.
        Precios[indice] = nuevoPrecio;
        System.out.println("---");
       
        // Mostramos los valores los nuevos.
        System.out.println("PRECIOS NUEVOS");
        imprimeArray(Precios, Precios.length);
    }
    
    public static void imprimeArray(double[] precios, int indice) {
        if (indice == 0){
            System.out.println("Precio: $" + precios[0]);
        } else {
            System.out.println("Precio: $" + precios[indice - 1]);
            imprimeArray(precios, indice - 1);
        }
    } 
}
