package Clases;
//LIBRERÍAS
import Conexion.Conectate;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

public class ClaseUsuarios{
    Connection cn;
    //CONSTRUCTOR
    public ClaseUsuarios(){
        Conectate con=new Conectate();
        cn=con.Conectate();}
    //MÉTODO PARA LLENAR COMBOBOX IDENTIFICACIONES CON DATOS
    public void LlenarIdentificaciones(JComboBox lista){
        try{
            //SENTENCIA SQL
            String sql="select Identificacion from PersonalMedico";
            //COMO RECIBIMOS DATOS, ENTONCES USAREMOS EL CALLABLESTATEMENT
            CallableStatement cmd=cn.prepareCall(sql);
            //CREAMOS UN OBJETO QUE GUARDARA LOS RESULTADOS
            ResultSet rs=cmd.executeQuery();
            //LEEMOS TODAS LAS FILAS QUE NOS ENVIA EL SQL
            while(rs.next()){
                for (int i=0;i<1;i++){//SE PONE i<1 PORQUE SOLO TENEMOS UNA COLUMNA
                    lista.addItem(rs.getString(i+1));}}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA BUSCAR UNA IDENTIFICACIÓN EN USUARIOS
    public ResultSet BuscarUsuario(long identificacion){
        try{
            String sql="select * from Usuarios where IdentificacionUsuario="+identificacion;
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch(Exception e){
            System.out.println(e.getMessage());}
        return null;
    }
    //MÉTODO PARA LLENAR COMBOBOX PERFILES CON DATOS
    public void LlenarPerfiles(JComboBox lista){
        try{
            //SENTENCIA SQL
            String sql="select Descripcion from Perfiles";
            //COMO RECIBIMOS DATOS, ENTONCES USAREMOS EL CALLABLESTATEMENT
            CallableStatement cmd=cn.prepareCall(sql);
            //CREAMOS UN OBJETO QUE GUARDARA LOS RESULTADOS
            ResultSet rs=cmd.executeQuery();
            //LEEMOS TODAS LAS FILAS QUE NOS ENVIA EL SQL
            while(rs.next()){
                for (int i=0;i<1;i++){//SE PONE i<1 PORQUE SOLO TENEMOS UNA COLUMNA
                    lista.addItem(rs.getString(i+1));}}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch (Exception e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA GUARDAR USUARIOS
    public void Guardar(long identificacion,String usuario,String correo,String preguntasecreta,String contrasena,String estado,String perfil){
        try{
            //AQUÍ EJECUTAMOS EL PROCEDIMIENTO ALMACENADO
            String sql="execute GuardarUsuarios ?,?,?,?,?,?,?";//LOS SIGNOS SON SEGÚN EL NÚMERO DE DATOS
            //COMO NO RECIBIMOS NINGÚN DATO DE RETORNO ENTONCES SOLO HACEMOS UN PREPARED
            PreparedStatement cmd=cn.prepareCall(sql);
            //AHORA AGREGAMOS LOS DATOS
            cmd.setLong(1,identificacion);
            cmd.setString(2,usuario);
            cmd.setString(3,correo);
            cmd.setString(4,preguntasecreta);
            cmd.setString(5,contrasena);
            cmd.setString(6,estado);
            //CREAMOS UN OBJETO DE LA CLASEPERFILES
            ClasePerfiles cp=new ClasePerfiles();
            ResultSet rs=cp.Buscar(perfil);
            int codigoPerfil=0;
            try{
                if(rs.next()){
                    codigoPerfil=Integer.parseInt(rs.getString(1));}}
            catch(SQLException e){
                System.out.println(e.getMessage());}
            cmd.setInt(7,codigoPerfil);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA ACTUALIZAR LOS DATOS
    public void Actualizar(long identificacion,String usuario,String correo,String preguntasecreta,String contrasena,String estado,String perfil){
        try{
            //CREAMOS LA SENTENCIA SQL
            String sql="execute ActualizarUsuario ?,?,?,?,?,?,?";
            //EJECUTAMOS EL PROCEDIMIENTO ALMACENADO CON LOS 4 PARAMETROS A RECIBIR
            PreparedStatement cmd=cn.prepareCall(sql);
            cmd.setLong(1,identificacion);
            cmd.setString(2,usuario);
            cmd.setString(3,correo);
            cmd.setString(4,preguntasecreta);
            cmd.setString(5,contrasena);
            cmd.setString(6,estado);
            //CREAMOS UN OBJETO DE LA CLASEPERFILES
            ClasePerfiles cp=new ClasePerfiles();
            ResultSet rs=cp.Buscar(perfil);
            try{
                if(rs.next()){
                    cmd.setInt(7,Integer.parseInt(rs.getString(1)));}}
            catch(SQLException e){
                System.out.println(e.getMessage());}
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
}
