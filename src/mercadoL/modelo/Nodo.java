package mercadoL.modelo;

public class Nodo<I> {
    public I dato;
    public Nodo<I> sig;

    public Nodo(I dato) {
        this.dato = dato;
        this.sig = null;
    }
    
    public Nodo<I> getUltimo() {
        Nodo aux = this;
        
        while (null != aux && null != aux.sig) {
            aux = aux.sig;
        }
        
        return aux;
    }
    
    public I getBuscarDato(I dato){
        Nodo<I> aux = this;
        while (aux != null) {
            if (aux.dato.equals(dato)) {
                return aux.dato;
            }
            aux = aux.sig;
        }
        return null;
    }
}
