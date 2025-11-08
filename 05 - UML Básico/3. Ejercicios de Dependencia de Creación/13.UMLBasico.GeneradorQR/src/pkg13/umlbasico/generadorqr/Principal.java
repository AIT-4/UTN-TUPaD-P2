/*
3.​GeneradorQR - Usuario - CódigoQR
a.​Asociación unidireccional: CódigoQR → Usuario
b.​Dependencia de creación: GeneradorQR.generar(String, Usuario)

Clases y atributos:
i.​CodigoQR: valor.
ii.​Usuario: nombre, email.
iii.​GeneradorQR->método: void generar(String valor, Usuario usuario)
 */
package pkg13.umlbasico.generadorqr;

public class Principal {

    public static void main(String[] args) {
        GeneradorQR generdorQR = new GeneradorQR();
        
        generdorQR.generar("https://ussr.obys.agency", "Octavio Ortiz", "octavio.ortiz@proton.com");
    }
    
}
