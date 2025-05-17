package mercadoL;

import mercadoL.modelo.Nodo;
import mercadoL.modelo.Usuario;
import mercadoL.modelo.Zapatilla;
import mercadoL.vista.CatalogoUI;
import mercadoL.vista.SplashUI;

public class Main {

    public static Nodo<Usuario> usuariosRegistrados = null;
    public static Usuario usuario = null;
    public static Nodo<Zapatilla> carrito = null;
     
    public static Nodo<Zapatilla> catalogo = null;
   
    
    static {
        Nodo<Zapatilla> producto001 = new Nodo(new Zapatilla(1, "Nike Cortez", 590700, "/mercadoL/imagen/001.png"));
        Nodo<Zapatilla> producto002 = new Nodo(new Zapatilla(2, "Nike rhtor", 600000, "/mercadoL/imagen/002.png"));
        Nodo<Zapatilla> producto003 = new Nodo(new Zapatilla(3, "Nike Duck", 1000000, "/mercadoL/imagen/003.png"));
        Nodo<Zapatilla> producto004 = new Nodo(new Zapatilla(4, "Nike SB", 400000, "/mercadoL/imagen/004.png"));
        Nodo<Zapatilla> producto005 = new Nodo(new Zapatilla(5, "Nike Tiempo", 300000, "/mercadoL/imagen/005.png"));
        Nodo<Zapatilla> producto006 = new Nodo(new Zapatilla(6, "Nike Romero", 500000, "/mercadoL/imagen/006.png"));
        Nodo<Zapatilla> producto007 = new Nodo(new Zapatilla(7, "Nike Invisible", 590700, "/mercadoL/imagen/007.png"));
        Nodo<Zapatilla> producto008 = new Nodo(new Zapatilla(8, "Nike Mercurial", 600000, "/mercadoL/imagen/008.png"));
        Nodo<Zapatilla> producto009 = new Nodo(new Zapatilla(9, "Nike Vapormax", 1200000, "/mercadoL/imagen/009.png"));
        
        
        producto001.sig = producto002;
        producto002.sig = producto003;
        producto003.sig = producto004;
        producto004.sig = producto005;
        producto005.sig = producto006;
        producto006.sig = producto007;
        producto007.sig = producto008;
        producto008.sig = producto009;
        
        catalogo = producto001;
    }
    
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
