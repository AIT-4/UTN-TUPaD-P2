/*
​Impuesto - Contribuyente - Calculadora
a.​Asociación unidireccional: Impuesto → Contribuyente
b.​Dependencia de uso: Calculadora.calcular(Impuesto)

Clases y atributos:
i.​ Impuesto: monto.
ii.​ Contribuyente: nombre, cuil.
iii.​ Calculadora->método: void calcular(Impuesto impuesto)
 */
package pkg12.umlbasico.impuesto;

public class Principal {

    public static void main(String[] args) {
        // Instanciamos objetos con constructores.
        Calculadora calculadora = new Calculadora();
        Impuesto impuesto = new Impuesto(15256.56);
        Contribuyente contribuyente = new Contribuyente("Francesca Álvarez", "27-35698412-4");
        
        impuesto.setContribuyente(contribuyente);
        
        // ​Dependencia de uso: de la clase reproductor hacia la clase cancion
        calculadora.calcular(impuesto);
    }
    
}
