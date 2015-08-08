package Clases;

import Conexion.Conectate;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ClaseHabitaciones{
    Connection cn;
    //CONSTRUCTOR
    public ClaseHabitaciones(){
        //ESTE OBJETO NOS PERMITIRA COMUNICARNOS CON LA BASE DE DATOS
        Conectate con=new Conectate();
        cn=con.Conectate();}    
    /**
     * MÉTODO PARA LLENAR COMBOBOX TIPO DE SERVICIO CON DATOS
     * @param lista que contiene una Lista de datos que se carga en un JComboBox
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void LlenarTipoServicio(JComboBox lista){
        try{
            //SENTENCIA SQL
            String sql="select Descripcion from TipoServicio";
            //COMO RECIBIMOS DATOS, ENTONCES USAREMOS EL CALLABLESTATEMENT
            CallableStatement cmd=cn.prepareCall(sql);
            //CREAMOS UN OBJETO QUE GUARDARA LOS RESULTADOS
            ResultSet rs=cmd.executeQuery();
            //LEEMOS TODAS LAS FILAS QUE NOS ENVIA EL SQL
            while(rs.next()){
                for(int i=0;i<1;i++){//SE PONE i<1 PORQUE SOLO TENEMOS UNA COLUMNA
                    lista.addItem(rs.getString(i+1));}}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch (Exception e){
            System.out.println(e.getMessage());}
    }
    /**
     * MÉTODO PARA GUARDAR UNA HABITACIÓN
     * @param numhabitacion que contiene un int para ser guardado
     * @param piso que contiene un int para ser guardado
     * @param numcamas que contiene un int para ser guardado
     * @param tiposervicio que contiene un int para ser guardado
     * @param estado que contiene un String para ser guardado
     */
    public void Guardar(int numhabitacion,int piso,int numcamas,int tiposervicio,String estado){
        try{
            //AQUÍ EJECUTAMOS EL PROCEDIMIENTO ALMACENADO
            String sql="execute GuardarHabitacion ?,?,?,?,?";//LOS SIGNOS SON SEGÚN EL NÚMERO DE DATOS
            //COMO NO RECIBIMOS NINGÚN DATO DE RETORNO ENTONCES SOLO HACEMOS UN PREPARED
            PreparedStatement cmd=cn.prepareCall(sql);
            //AHORA AGREGAMOS LOS DATOS
            cmd.setInt(1,numhabitacion);
            cmd.setInt(2,piso);
            cmd.setInt(3,numcamas);
            cmd.setInt(4,tiposervicio);
            cmd.setString(5,estado);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
    /**
     * MÉTODO PARA ACTUALIZAR UNA HABITACIÓN
     * @param idhabitacion que contiene un int para ser actualizado
     * @param numhabitacion que contiene un int para ser actualizado
     * @param piso que contiene un int para ser actualizado
     * @param numcamas que contiene un int para ser actualizado
     * @param tiposervicio que contiene un int para ser actualizado
     * @param estado que contiene un String para ser actualizado
     */
    public void Actualizar(int idhabitacion,int numhabitacion,int piso,int numcamas,int tiposervicio,String estado){
        try{
            //AQUÍ EJECUTAMOS EL PROCEDIMIENTO ALMACENADO
            String sql="execute ActualizarHabitacion ?,?,?,?,?,?";//LOS SIGNOS SON SEGÚN EL NÚMERO DE DATOS
            //COMO NO RECIBIMOS NINGÚN DATO DE RETORNO ENTONCES SOLO HACEMOS UN PREPARED
            PreparedStatement cmd=cn.prepareCall(sql);
            //AHORA AGREGAMOS LOS DATOS
            cmd.setInt(1,idhabitacion);
            cmd.setInt(2,numhabitacion);
            cmd.setInt(3,piso);
            cmd.setInt(4,numcamas);
            cmd.setInt(5,tiposervicio);
            cmd.setString(6,estado);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
    /**
     * MÉTODO PARA BUSCAR UN DATO
     * @param ID que contiene un int que se va a Buscar
     * @return un ResultSet si encuentra la Identificación o un null sino lo encuentra
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public ResultSet Buscar(int ID){
        try{
            String sql="select * from Habitaciones where IdHabitacion="+ID;
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch(Exception e){
            System.out.println(e.getMessage());}
        return null;
    }
    /**
     * MÉTODO PARA LLENAR LOS DATOS EN UNA TABLA
     * @param modelo que contiene un DefaultTableModel para mostrar los Datos
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void LlenarDatos(DefaultTableModel modelo){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Habitaciones";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[6];
                //SE PONE 6, PORQUE SOLO SON 6 COLUMNAS
                for (int i=0;i<6;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    int tiposervicio=Integer.parseInt(rs.getString(5));
                    ClaseHabitaciones ch=new ClaseHabitaciones();
                    ResultSet rs2=ch.BuscarTipoServicio(tiposervicio);
                    if(rs2.next()){
                        datos[4]=rs2.getString(1);}
                    datos[5]=rs.getString(6);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
    /**
     * MÉTODO PARA BUSCAR UN TIPO DE SERVICIO
     * @param tiposervicio que contiene un int que se va a Buscar
     * @return un ResultSet si encuentra la Identificación o un null sino lo encuentra
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public ResultSet BuscarTipoServicio(int tiposervicio){
        try{
            String sql="select Descripcion from TipoServicio where IdTipoServicio="+tiposervicio;
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch(Exception e){
            System.out.println(e.getMessage());}
        return null;
    }
    /**
     * MÉTODO PARA BUSQUEDAS DINÁMICAS POR ESTADO
     * @param modelo que contiene un DefaultTableModel que mostrara la información
     * @param estado que contiene un String que sera Buscado
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void BusquedaEstado(DefaultTableModel modelo,String estado){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL Y UNA PALABRA ACTUAL
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Habitaciones where Estado='"+estado+"'";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[6];
                //SE PONE 6, PORQUE SOLO SON 6 COLUMNAS
                for (int i=0;i<6;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    int tiposervicio=Integer.parseInt(rs.getString(5));
                    ClaseHabitaciones ch=new ClaseHabitaciones();
                    ResultSet rs2=ch.BuscarTipoServicio(tiposervicio);
                    if(rs2.next()){
                        datos[4]=rs2.getString(1);}
                    datos[5]=rs.getString(6);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
    /**
     * MÉTODO PARA BUSQUEDAS DINÁMICAS POR TIPO SERVICIO
     * @param modelo que contiene un DefaultTableModel que mostrara la información
     * @param seleccion que contiene un int que sera Buscado
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void BusquedaTipoServicio(DefaultTableModel modelo,int seleccion){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL Y UNA PALABRA ACTUAL
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Habitaciones where TipoServicio="+seleccion;
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[6];
                //SE PONE 6, PORQUE SOLO SON 6 COLUMNAS
                for (int i=0;i<6;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    int tiposervicio=Integer.parseInt(rs.getString(5));
                    ClaseHabitaciones ch=new ClaseHabitaciones();
                    ResultSet rs2=ch.BuscarTipoServicio(tiposervicio);
                    if(rs2.next()){
                        datos[4]=rs2.getString(1);}
                    datos[5]=rs.getString(6);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
}
