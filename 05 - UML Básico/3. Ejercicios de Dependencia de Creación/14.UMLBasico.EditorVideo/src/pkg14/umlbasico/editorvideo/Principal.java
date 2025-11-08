/*
14.​EditorVideo - Proyecto - Render
a.​ Asociación unidireccional: Render → Proyecto
b.​Dependencia de creación: EditorVideo.exportar(String, Proyecto)

c.​ Clases y atributos:
i.​ Render: formato.
ii.​ Proyecto: nombre, duracionMin.
iii.​ EditorVideo->método: void exportar(String formato, Proyecto proyecto)
 */
package pkg14.umlbasico.editorvideo;

public class Principal {

    public static void main(String[] args) {
        EditorVideo editorVideo = new EditorVideo();
        
        editorVideo.exportar("AVI", "Trabajo Practico Integrador", 15);
    }
    
}
