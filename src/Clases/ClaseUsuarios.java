package Clases;
//LIBRERÍAS
import Conexion.Conectate;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        catch (Exception e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA BUSCAR UNA IDENTIFICACIÓN
    public ResultSet Buscar(long identificacion){
        try{
            String sql="select * from PersonalMedico where Identificacion="+identificacion;
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch (Exception e){
            System.out.println(e.getMessage());}
        return null;
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
            cmd.setString(7,perfil);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch (Exception e){
            System.out.println(e.getMessage());}
    }
}
