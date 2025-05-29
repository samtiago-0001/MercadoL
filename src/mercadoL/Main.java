package mercadoL;

import mercadoL.modelo.Cola;
import mercadoL.modelo.Historico;
import mercadoL.modelo.Nodo;
import mercadoL.modelo.Usuario;
import mercadoL.modelo.Zapatilla;
import mercadoL.vista.CatalogoUI;
import mercadoL.vista.SplashUI;

public class Main {

    public static Nodo<Usuario> usuariosRegistrados = null;
    public static Usuario usuario = null;
    public static Nodo<Zapatilla> carrito = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SplashUI().setVisible(true);
                //new CatalogoUI().setVisible(true);
            }
        });
    }
    
}
