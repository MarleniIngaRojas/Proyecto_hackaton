
package sise.com.dao;

import java.util.List;
import sise.com.bean.BeanUsuario;


public interface DaoUsuario {
    public List<BeanUsuario> MostrarUsuario();
    //buscar
    public List<BeanUsuario> BuscarUsuario(BeanUsuario bu);
    //ingresar
    public boolean InsertarUsuario(BeanUsuario bu);
    //actualizar
    public boolean ActualizarUsuario(BeanUsuario bu);
    //eliminar
    public boolean EliminarUsuario(BeanUsuario bu);
    //validar usuario --> Login
    public boolean ValidarUsuario(BeanUsuario bu);
    
    public boolean EstadoUsuario(BeanUsuario bu);
    
    public List<String> SesionUsuario(BeanUsuario bu);
    
}
