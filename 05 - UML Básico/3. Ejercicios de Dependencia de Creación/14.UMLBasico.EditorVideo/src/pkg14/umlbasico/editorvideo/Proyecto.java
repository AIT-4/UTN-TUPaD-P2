package pkg14.umlbasico.editorvideo;

public class Proyecto {
    private String nombre;
    private int duracionMin;
    private Render render;
    
    // Constructor
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    // Setters
    public void setRender(Render render) {
        this.render = render;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getDuracionMin() {
        return duracionMin;
    }
    
}
