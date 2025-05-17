
package mercadoL.controlador;


import mercadoL.modelo.Usuario;
import mercadoL.modelo.Nodo;


public class Procesos {
    
    public Nodo<Usuario> cab;
    public Procesos(){ cab = null; }
    //por si el Nodo esta vacio  
    public boolean getvacia(){
        return cab == null ? true: false;
    }
    //recorrer el Nodo
    public int getLonglista(){
        int cont=0; 
        Nodo<Usuario> p;
        if(getvacia())
            return 0;
        else{
            p = cab;
            while(p!=null){
                cont++;
                p=p.sig;
            }
        }return cont;
        
    }
   
    //buscar el ultimo 
    public Nodo<Usuario> getUltimo() {
        if (getvacia()) {
            return null;
        } else {
            Nodo<Usuario> p = cab;
            while (p.sig != null) {
                p = p.sig;

            }
            return p;
        }

    }
    //antes del Nodo
    public Nodo<Usuario> getAntesNodo(Nodo q){
        if(getvacia()) return null;
        else{
            Nodo<Usuario> p=cab;
            while(p.sig!=q)
                p=p.sig;
            return p;
        }
    }
    
  /*  public Nodo<Usuario> getusuario(Object usuario){
        if (getvacia())
        return null;
        else{
            Nodo<Usuario> b=cab;
            while(b!=null){
            if (b.dato.usuario.equals(usuario))
                return b;
            else 
                 b=b.sig;
            
            
            }
            return null;
        }
    }*/
    
    
  /*  public Nodo<Usuario> getcontraseña(Object contraseña){
        if (getvacia())
        return null;
        else{
            Nodo<Usuario> b=cab;
            while(b!=null){
            if (b.dato.contrasena.equals(contraseña))
                return b;
            else 
                 b=b.sig;
            
            
            }
            return null;
        }
    }*/
    //crear un Usuario
  /*  public Usuario getCrearusuario( JTextField jtfusuario, JTextField jtfcontraseña){
        Usuario info; //Nuevo Investigador a crear
        Nodo<Usuario> b; //Nodo para realizar busqueda usuario
        try{
            b=getusuario(jtfusuario.getText());
            if(b!=null){
                JOptionPane.showMessageDialog(null,
                    "El usuario ya existe, intente "
                    + "nuevamente.");
                jtfusuario.setText("");
                jtfusuario.requestFocus();
                return null;
            }else{
                info = new Usuario(
                    jtfusuario.getText(),
                    jtfcontraseña.getText());
                    
                return info;
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,
                "Error: "+e+"\nEl nodo no fue creado, intente"
                + "nuevamente.");
            jtfusuario.setText("");
            jtfcontraseña.setText("");
            jtfusuario.requestFocus();
            return null;
        }
    }*/
   
  /*   public void setAddI(
        JTextField jtfusuario,
        JTextField jtfcontraseña
            
    ){
        Usuario inv;
        inv = getCrearusuario(jtfusuario, jtfcontraseña);
        
        if(inv!=null){
            Nodo<Login> info=new Nodo(inv);
            if(cab==null)
                cab=info;
            else{
                info.sig=cab;
                cab=info;
            }
            JOptionPane.showMessageDialog(null,
                "Nodo registrado satisfactoriamente al "
                + "inicio de la lista!");
        }

    }*/
    /* public void setAddF(
        JTextField  jtfusuario,
        JTextField  jtfcontraseña
    ){
        Usuario inv= getCrearusuario(jtfusuario, jtfcontraseña);
        
        if(inv!=null){
            Nodo<Login> info=new Nodo(inv);
            if(cab==null)
                cab=info;
            else{
                Nodo<Login> p=getUltimo();
                p.sig=info;
            }
            JOptionPane.showMessageDialog(null,
                "Nodo registrado satisfactoriamente al "
                + "final de la lista!");
        }
    }*/
    /* public void seteliusuarios(String usuario){
        if(getvacia())
            JOptionPane.showMessageDialog(null,
                "La lista esta vacía! no existen "
                + "elementos a eliminar");
        else{
            Nodo<Usuario> b=getusuario(usuario);
            Nodo<Usuario> a=null;
            if(b==null){
                JOptionPane.showMessageDialog(null, 
                    "Elemento a eliminar no existe!");
            }else{
                if((b==cab)&&(cab.sig==null))
                    cab=null;
                else if((b==cab)&&(cab.sig!=null)){
                    cab=cab.sig;
                    b.sig=null;
                    b=null;
                }
                else if(b.sig==null){
                    a=getAntesNodo(b);
                    a.sig=null;
                    b=null;
                }
                else{
                    a=getAntesNodo(b);
                    a.sig=b.sig;
                    b.sig=null;
                    b=null;
                }
                JOptionPane.showMessageDialog(null, 
                    "Elemento eliminado de la lista!");
            }
        }
    }*/
    
    /* public void setAddNodoF(
        JTextField jtfusuario,
        JTextField jtfcontraseña
    ){
        Usuario info=getCrearusuario(jtfusuario, jtfcontraseña);  //Información
        Nodo<Login> q;  //Nodo a registrar con la información
        if(info!=null){
            q = new Nodo(info);
            if(getvacia()){
                cab=q;
            }else{
                Nodo<Login> p=getUltimo();
                p.sig=q;
            }
        }
    }*/
     
  /*  public void setAddNodoI(
        JTextField jtfusuario,
        JTextField jtfcontraseña
    ){
        Usuario info=getCrearusuario( jtfusuario, jtfcontraseña);  //Información
        Nodo<Login> q;  //Nodo a registrar con la información
        if(info!=null){
            q = new Nodo(info);
            if(getvacia()){
                cab=q;
            }else{
                q.sig=cab;
                cab=q;
            }
        }
    }*/ 
     
 
   
}
