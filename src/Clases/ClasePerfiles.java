package Clases;
/**
 * LIBRERÍAS IMPORTADAS
 * @author Robinson Gallego Alzate
 * @version 1.1
 */
import Conexion.Conectate;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClasePerfiles{
    Connection cn;
    /**
     * CONSTRUCTOR ClasePerfiles
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public ClasePerfiles(){
        Conectate con=new Conectate();
        cn=con.Conectate();
    }
    /**
     * MÉTODO PARA GUARDAR UN PERFIL
     * @param descripcion que contiene el String que se va a Guardar
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void GuardarPerfil(String descripcion){
        try{
            //AQUÍ EJECUTAMOS EL PROCEDIMIENTO ALMACENADO
            String sql="execute GuardarPerfil ?";//LOS SIGNOS SON SEGÚN EL NÚMERO DE DATOS
            //COMO NO RECIBIMOS NINGÚN DATO DE RETORNO ENTONCES SOLO HACEMOS UN PREPARED
            PreparedStatement cmd=cn.prepareCall(sql);
            //AHORA AGREGAMOS LOS DATOS
            cmd.setString(1,descripcion);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}
    }
    /**
     * MÉTODO PARA ACTUALIZAR LOS DATOS
     * @param codigo que contiene el int que se va a Actualizar
     * @param descripcion que contiene el String que se va a Actualizar
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void Actualizar(int codigo,String descripcion){
        try{
            //CREAMOS LA SENTENCIA SQL
            String sql="execute ActualizarPerfil ?,?";
            //EJECUTAMOS EL PROCEDIMIENTO ALMACENADO
            PreparedStatement cmd=cn.prepareCall(sql);
            cmd.setInt(1,codigo);
            cmd.setString(2,descripcion);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
    /**
     * MÉTODO PARA BUSCAR UN PERFIL
     * @param codigo que contiene el int que se va a Buscar
     * @return un ResultSet si encuentra el Perfil o un null sino encuentra el Perfil
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public ResultSet Buscar(int codigo){
        try{
            String sql="select * from Perfiles where CodigoPerfil="+codigo;
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch (Exception e){
            System.out.println(e.getMessage());}
        return null;
    }
    /**
     * MÉTODO PARA BUSCAR UNA DESCRIPCIÓN
     * @param descripcion que contiene el String que se va a Buscar
     * @return un ResultSet si encuentra el Perfil o un null sino encuentra el Perfil
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public ResultSet Buscar(String descripcion){
        try{
            String sql="select * from Perfiles where Descripcion='"+descripcion+"'";
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch (Exception e){
            System.out.println(e.getMessage());}
        return null;
    }
}
