package Clases;
//LIBRERÍAS
import Conexion.Conectate;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

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
    //MÉTODO PARA BUSCAR UN USUARIO
    public ResultSet BuscarUsuario2(String usuario){
        try{
            String sql="select * from Usuarios where Usuario='"+usuario+"'";
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
            //EJECUTAMOS EL PROCEDIMIENTO ALMACENADO
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
    //MÉTODO PARA LLENAR LOS DATOS EN UNA TABLA
    public void LlenarDatos(DefaultTableModel modelo){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Usuarios";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[7];
                //SE PONE 7, PORQUE SOLO SON 7 COLUMNAS
                for(int i=0;i<7;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(2);
                    datos[1]=rs.getString(3);
                    datos[2]=rs.getString(4);
                    datos[3]=rs.getString(5);
                    //ENCRIPTAMOS LA CONTRASEÑA
                    Encriptar_Desencriptar ed=new Encriptar_Desencriptar();
                    datos[4]=ed.Encriptar(rs.getString(6));
                    datos[5]=rs.getString(7);
                    //TRANSFORMAMOS EL DATO DEL PERFIL
                    int perfil=Integer.parseInt(rs.getString(8));
                    //CREAMOS UN OBJETO DE LA CLASEPERFILES
                    ClasePerfiles cp=new ClasePerfiles();
                    ResultSet rs2=cp.Buscar(perfil);
                    try{
                        if(rs2.next()){
                            datos[6]=rs2.getString(2);}}
                    catch(SQLException e){
                        System.out.println(e.getMessage());}}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA BUSQUEDAS DINÁMICAS POR IDENTIFICACIÓN
    public void BusquedaIdentificacion(DefaultTableModel modelo,long identificacion){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL Y UNA PALABRA ACTUAL
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Usuarios where IdentificacionUsuario like '%"+identificacion+"%'";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[7];
                //SE PONE 7, PORQUE SOLO SON 7 COLUMNAS
                for (int i=0;i<7;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(2);
                    datos[1]=rs.getString(3);
                    datos[2]=rs.getString(4);
                    datos[3]=rs.getString(5);
                    //ENCRIPTAMOS LA CONTRASEÑA
                    Encriptar_Desencriptar ed=new Encriptar_Desencriptar();
                    datos[4]=ed.Encriptar(rs.getString(6));
                    datos[5]=rs.getString(7);
                    //TRANSFORMAMOS EL DATO DEL PERFIL
                    int perfil=Integer.parseInt(rs.getString(8));
                    //CREAMOS UN OBJETO DE LA CLASEPERFILES
                    ClasePerfiles cp=new ClasePerfiles();
                    ResultSet rs2=cp.Buscar(perfil);
                    try{
                        if(rs2.next()){
                            datos[6]=rs2.getString(2);}}
                    catch(SQLException e){
                        System.out.println(e.getMessage());}}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA BUSQUEDAS DINÁMICAS POR USUARIO
    public void BusquedaUsuario(DefaultTableModel modelo,String usuario){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL Y UNA PALABRA ACTUAL
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Usuarios where Usuario like '%"+usuario+"%'";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[7];
                //SE PONE 7, PORQUE SOLO SON 7 COLUMNAS
                for (int i=0;i<7;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(2);
                    datos[1]=rs.getString(3);
                    datos[2]=rs.getString(4);
                    datos[3]=rs.getString(5);
                    //ENCRIPTAMOS LA CONTRASEÑA
                    Encriptar_Desencriptar ed=new Encriptar_Desencriptar();
                    datos[4]=ed.Encriptar(rs.getString(6));
                    datos[5]=rs.getString(7);
                    //TRANSFORMAMOS EL DATO DEL PERFIL
                    int perfil=Integer.parseInt(rs.getString(8));
                    //CREAMOS UN OBJETO DE LA CLASEPERFILES
                    ClasePerfiles cp=new ClasePerfiles();
                    ResultSet rs2=cp.Buscar(perfil);
                    try{
                        if(rs2.next()){
                            datos[6]=rs2.getString(2);}}
                    catch(SQLException e){
                        System.out.println(e.getMessage());}}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA BUSQUEDAS DINÁMICAS POR PERFIL
    public void BusquedaPerfil(DefaultTableModel modelo,int perfil){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL Y UNA PALABRA ACTUAL
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Usuarios where Perfil like '%"+perfil+"%'";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[7];
                //SE PONE 7, PORQUE SOLO SON 7 COLUMNAS
                for (int i=0;i<7;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(2);
                    datos[1]=rs.getString(3);
                    datos[2]=rs.getString(4);
                    datos[3]=rs.getString(5);
                    //ENCRIPTAMOS LA CONTRASEÑA
                    Encriptar_Desencriptar ed=new Encriptar_Desencriptar();
                    datos[4]=ed.Encriptar(rs.getString(6));
                    datos[5]=rs.getString(7);
                    //CREAMOS UN OBJETO DE LA CLASEPERFILES
                    ClasePerfiles cp=new ClasePerfiles();
                    ResultSet rs2=cp.Buscar(perfil);
                    try{
                        if(rs2.next()){
                            //TRANSFORMAMOS EL DATO DEL PERFIL
                            datos[6]=rs2.getString(2);}}
                    catch(SQLException e){
                        System.out.println(e.getMessage());}}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA BUSQUEDAS DINÁMICAS POR ESTADO
    public void BusquedaEstado(DefaultTableModel modelo,String estado){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL Y UNA PALABRA ACTUAL
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Usuarios where Estado='"+estado+"'";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[7];
                //SE PONE 7, PORQUE SOLO SON 7 COLUMNAS
                for (int i=0;i<7;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(2);
                    datos[1]=rs.getString(3);
                    datos[2]=rs.getString(4);
                    datos[3]=rs.getString(5);
                    //ENCRIPTAMOS LA CONTRASEÑA
                    Encriptar_Desencriptar ed=new Encriptar_Desencriptar();
                    datos[4]=ed.Encriptar(rs.getString(6));
                    datos[5]=rs.getString(7);
                    //TRANSFORMAMOS EL DATO DEL PERFIL
                    int perfil=Integer.parseInt(rs.getString(8));
                    //CREAMOS UN OBJETO DE LA CLASEPERFILES
                    ClasePerfiles cp=new ClasePerfiles();
                    ResultSet rs2=cp.Buscar(perfil);
                    try{
                        if(rs2.next()){
                            datos[6]=rs2.getString(2);}}
                    catch(SQLException e){
                        System.out.println(e.getMessage());}}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
}
