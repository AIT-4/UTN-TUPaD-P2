package pkg14.umlbasico.editorvideo;

public class EditorVideo {
    public void exportar(String formato, String nombre, int duracionMin) {
        Proyecto proyecto = new Proyecto(nombre, duracionMin);
        System.out.println(
                "Nombre del proyecto: " + proyecto.getNombre() +
                "\nDuracion en minutos: " + proyecto.getDuracionMin() +
                "\nFormato: " + formato);
    } 
}
