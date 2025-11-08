package pkg13.umlbasico.generadorqr;

public class GeneradorQR {
    
    public void generar(String valor, String nombre, String email) {
        Usuario usuario = new Usuario(nombre, email);
        System.out.println(
                "Usuario: " + usuario.getNombre() +
                "\nE-mail: " + usuario.getEmail() +
                "\nURL: " + valor);
    }
            
}
