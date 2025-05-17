package mercadoL.modelo;

import java.util.Objects;

public class Usuario {

    private String usuario;
    private String contrasena;
    private Nodo<Zapatilla> favoritos = null;
    private Nodo<Zapatilla> hitoricoCompra = null;

    public Usuario() {
    }

    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void agregarComoFavorito(Zapatilla zapatilla) {
        if (null == favoritos) {
            favoritos = new Nodo(zapatilla);
        } else {
            Nodo<Zapatilla> fav = new Nodo(zapatilla);
            favoritos.getUltimo().sig = fav;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.usuario);
        hash = 37 * hash + Objects.hashCode(this.contrasena);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return Objects.equals(this.contrasena, other.contrasena);
    }
  
}
