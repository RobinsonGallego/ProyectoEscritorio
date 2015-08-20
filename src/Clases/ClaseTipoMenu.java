package Clases;
/**
 * LIBRERIAS IMPORTADAS
 * @author Robinson Gallego Alzate
 * @version 1.0
 */
import Conexion.Conectate;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ClaseTipoMenu{
    Connection cn;
    /**
     * CONSTRUCTOR ClaseTipoMenu
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public ClaseTipoMenu(){
        //ESTE OBJETO NOS PERMITIRA COMUNICARNOS CON LA BASE DE DATOS
        Conectate con=new Conectate();
        cn=con.Conectate();}
    /**
     * MÉTODO PARA GUARDAR UN TIPO MENÚ
     * @param tipomenu que contiene un String que se va a Guardar
     * @param componentes que contiene un String que se va a Guardar
     * @param contraindicaciones que contiene un String que se va a Guardar
     * @param pacientesEspeciales que contiene un String que se va a Guardar
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void Guardar(String tipomenu,String componentes,String contraindicaciones,String pacientesEspeciales){
        try{
            //AQUÍ EJECUTAMOS EL PROCEDIMIENTO ALMACENADO
            String sql="execute GuardarTipoMenu ?,?,?,?";//LOS SIGNOS SON SEGÚN EL NÚMERO DE DATOS
            //COMO NO RECIBIMOS NINGÚN DATO DE RETORNO ENTONCES SOLO HACEMOS UN PREPARED
            PreparedStatement cmd=cn.prepareCall(sql);
            //AHORA AGREGAMOS LOS DATOS
            cmd.setString(1,tipomenu);
            cmd.setString(2,componentes);
            cmd.setString(3,contraindicaciones);
            cmd.setString(4,pacientesEspeciales);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA BUSCAR UN DATO
     * @param codigo que contiene un int para Buscar
     * @return un ResultSet si encuentra el Codigo o un null sino lo encuentra
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public ResultSet Buscar(int codigo){
        try{
            String sql="select * from TipoMenu where Codigo="+codigo;
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch (Exception e){
            System.out.println(e.getMessage());}
        return null;}
    /**
     * MÉTODO PARA ACTUALIZAR LOS DATOS
     * @param codigo que contiene un int que se va a Actualizar
     * @param tipomenu que contiene un String que se va a Actualizar
     * @param componentes que contiene un String que se va a Actualizar
     * @param contraindicaciones que contiene un String que se va a Actualizar
     * @param pacientesEspeciales que contiene un String que se va a Actualizar
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void Actualizar(int codigo,String tipomenu,String componentes,String contraindicaciones,String pacientesEspeciales){
        try{
            //CREAMOS LA SENTENCIA SQL
            String sql="execute ActualizarTipoMenu ?,?,?,?,?";
            //EJECUTAMOS EL PROCEDIMIENTO ALMACENADO CON LOS 4 PARAMETROS A RECIBIR
            PreparedStatement cmd=cn.prepareCall(sql);
            cmd.setInt(1,codigo);
            cmd.setString(2,tipomenu);
            cmd.setString(3,componentes);
            cmd.setString(4,contraindicaciones);
            cmd.setString(5,pacientesEspeciales);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch (Exception e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA ELIMINAR UN DATO
     * @param codigo que contiene un int que se Eliminara
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void Eliminar(int codigo){
        try{
            //CREAMOS UNA CONSULTA SIMPLE
            String sql="delete TipoMenu from TipoMenu where Codigo="+codigo;
            //COMO NO MOSTRAMOS NINGÚN DATO SOLO HACEMOS UN PREPARED
            PreparedStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch (Exception e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA BUSQUEDAS DINÁMICAS POR TIPO MENÚ
     * @param modelo que contiene un DefaultTableModel que mostrara la información
     * @param palabraactual que contiene un String que se Buscara
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void BusquedaTipoMenu(DefaultTableModel modelo,String palabraactual){
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from TipoMenu where TipoMenu like '%"+palabraactual+"%'";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[5];
                //SE PONE 5, PORQUE SOLO SON 5 COLUMNAS
                for (int i=0;i<5;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[i]=rs.getString(i+1);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA BUSQUEDAS DINÁMICAS POR PACIENTE ESPECIAL
     * @param modelo que contiene un DefaultTableModel que mostrara la información
     * @param palabraactual que contiene un String que se Buscara
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void BusquedaPacienteE(DefaultTableModel modelo,String palabraactual){
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from TipoMenu where PacientesEspeciales like '%"+palabraactual+"%'";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[5];
                //SE PONE 5, PORQUE SOLO SON 5 COLUMNAS
                for (int i=0;i<5;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[i]=rs.getString(i+1);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA LLENAR LOS DATOS EN UNA TABLA
     * @param modelo que contiene un DefaultTableModel que mostrara la información
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void LlenarDatos(DefaultTableModel modelo){
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from TipoMenu";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[5];
                //SE PONE 5, PORQUE SOLO SON 5 COLUMNAS
                for (int i=0;i<5;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[i]=rs.getString(i+1);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA LLENAR COMBOBOX COMPONENTES CON DATOS
     * @param lista que contiene una Lista con datos para un JComboBox
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void LlenarComponente(JComboBox lista){
        try{
            //SENTENCIA SQL
            String sql="select Descripcion from Componentes";
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
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA LLENAR COMBOBOX PACIENTES ESPECIALES CON DATOS
     * @param lista que contiene una Lista con datos para un JComboBox
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void LlenarPacientesEspaciales(JComboBox lista){
        try{
            //SENTENCIA SQL
            String sql="select Descripcion from PacienteEspecial";
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
            System.out.println(e.getMessage());}}
}
