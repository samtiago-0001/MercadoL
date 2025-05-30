/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoL.controlador;

import mercadoL.Main;
import mercadoL.modelo.Nodo;
import mercadoL.modelo.Zapatilla;

public class Catalogo {

    public void agregarACarrito(Nodo<Zapatilla> zapatilla) {
        if (Main.carrito == null) {
            Main.carrito = zapatilla;
        } else {
            Nodo<Zapatilla> ultimo = Main.carrito.getUltimo();
            if (null == ultimo) {
                ultimo = zapatilla;
            } else {
                ultimo.sig = zapatilla;
            }
        }

    }

    public void agregarAFavoritos(Nodo<Zapatilla> zapatilla) {
        Main.usuario.agregarComoFavorito(zapatilla.dato);
    }
}
