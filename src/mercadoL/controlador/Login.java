/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoL.controlador;

import mercadoL.Main;
import mercadoL.modelo.Nodo;
import mercadoL.modelo.Usuario;

/**
 *
 * @author kevin
 */
public class Login {
    
    public void crearUsuario(Usuario usuario){
        Nodo<Usuario> nuevoUsuario = new Nodo<>(usuario);
        if (null == Main.usuariosRegistrados) {
            Main.usuariosRegistrados = nuevoUsuario;
        } else {
            Main.usuariosRegistrados.getUltimo().sig = nuevoUsuario;
        }
    }
    
    public Usuario login(Usuario usuario){
        if (null != Main.usuariosRegistrados) {
            return Main.usuariosRegistrados.getBuscarDato(usuario);
        }
        return null;
    }
}
