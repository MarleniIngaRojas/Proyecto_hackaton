
package sise.com.imp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import sise.com.bean.BeanUsuario;
import sise.com.dao.DaoUsuario;
import sise.com.util.Conexion;

public class ImpUsuario implements DaoUsuario{
    
    //crear un objeto de la clase Conexion
    Conexion objconexion = new Conexion();
    //creamos 3 objetos de las clases principales de java para trabajar con BD
    //Connection, CallableStatement y ResultSet
    //para la conexion
    Connection xcon;
    //Para sentencia sql;
    CallableStatement cst;
    //Para almacenar el resultado de la consulta
    ResultSet rs;
    
    //creamos el metodo constructor vacio
    public ImpUsuario() {
       //realizamos la conexion a la base de datos
        xcon = objconexion.Conectar();
    }

    @Override
    public List<BeanUsuario> MostrarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BeanUsuario> BuscarUsuario(BeanUsuario bu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean InsertarUsuario(BeanUsuario bu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ActualizarUsuario(BeanUsuario bu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean EliminarUsuario(BeanUsuario bu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ValidarUsuario(BeanUsuario bu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean EstadoUsuario(BeanUsuario bu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> SesionUsuario(BeanUsuario bu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
