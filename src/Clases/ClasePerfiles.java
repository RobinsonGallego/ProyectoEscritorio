package Clases;
//LIBRERÍAS
import Conexion.Conectate;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClasePerfiles{
    Connection cn;
    //CONSTRUCTOR
    public ClasePerfiles(){
        Conectate con=new Conectate();
        cn=con.Conectate();
    }
    //MÉTODO PARA GUARDAR UN PERFIL
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
    //MÉTODO PARA BUSCAR UN PERFIL
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
    //MÉTODO PARA BUSCAR UNA DESCRIPCIÓN
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
