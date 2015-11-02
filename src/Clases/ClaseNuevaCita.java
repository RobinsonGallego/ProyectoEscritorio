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

public class ClaseNuevaCita{
    Connection cn;
    //CONSTRUCTOR
    public ClaseNuevaCita(){
        //ESTE OBJETO NOS PERMITIRA COMUNICARNOS CON LA BASE DE DATOS
        Conectate con=new Conectate();
        cn=con.Conectate();}
    /**
     * MÉTODO PARA LLENAR COMBOBOX TIPO CITA CON DATOS
     * @param lista que contiene una Lista de datos que se carga en un JComboBox
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void LlenarTipoCita(JComboBox lista){
        try{
            //SENTENCIA SQL
            String sql="select DescripcionCita from TipoCita";
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
        catch(Exception e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA GUARDAR UN PERSONAL MÉDICO
     * @param fechahora
     * @param identificacion
     * @param medico
     * @param tipocita
     * @param sintomas
     * @param peso
     * @param estatura
     * @param presion
     * @param antecedentes
     * @param diagnostico
     * @param medicacion
     * @param observaciones
     * @param procedimientos
     */
    public void Guardar(String fechahora,String identificacion,String medico,int tipocita,String sintomas,String peso,String estatura,String presion,String antecedentes,String diagnostico,String medicacion,String observaciones,String procedimientos){
        try {
            //AQUÍ EJECUTAMOS EL PROCEDIMIENTO ALMACENADO
            String sql="execute GuardarConsulta ?,?,?,?,?,?,?,?,?,?,?,?,?";
            //COMO NO RECIBIMOS NINGÚN DATO DE RETORNO ENTONCES SOLO HACEMOS UN PREPARED
            PreparedStatement cmd=cn.prepareCall(sql);
            //AHORA AGREGAMOS LOS DATOS
            cmd.setString(1,fechahora);
            cmd.setString(2,identificacion);
            cmd.setString(3,medico);
            cmd.setInt(4,tipocita);
            cmd.setString(5,sintomas);
            cmd.setString(6,peso);
            cmd.setString(7,estatura);
            cmd.setString(8,presion);
            cmd.setString(9,antecedentes);
            cmd.setString(10,diagnostico);
            cmd.setString(11,medicacion);
            cmd.setString(12,observaciones);
            cmd.setString(13,procedimientos);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException ex){
            System.out.println(ex.getMessage());}}
    /**
     * MÉTODO PARA LLENAR LOS DATOS EN UNA TABLA
     * @param modelo que contiene un DefaultTableModel para mostrar los Datos
     * @param identificacion
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void LlenarDatos1(DefaultTableModel modelo,String identificacion){
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Consulta where IdentificacionPaciente='"+identificacion+"'";
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
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(3);
                    int tipocita=rs.getInt(4);
                    ClaseNuevaCita cnc=new ClaseNuevaCita();
                    String tp=cnc.TipoCita(tipocita);
                    datos[2]=tp;
                    datos[3]=rs.getString(5);
                    datos[4]=rs.getString(6);
                    datos[5]=rs.getString(7);
                    datos[6]=rs.getString(8);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA SELECCIONAR LA DESCRIPCIÓN DE LA CITA
     * @param tipocita que es un dato tipo entero para ser buscado
     * @return un String con la Descripción de la Cita
     */
    public String TipoCita(int tipocita){
        String tipo="";
        try{
            String sql="select TipoCita.DescripcionCita from TipoCita where TipoCita="+tipocita;
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            while(rs.next()){
                tipo=rs.getString(1);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}
        return tipo;}
    /**
     * MÉTODO PARA OBTENER UN REGISTRO DESDE SU FECHA
     * @param fecha contiene un String que será buscado
     * @return un ResultSet con la información si lo encuentra o null sino esta
     */
    public ResultSet Detalles(String fecha){
        try{
            String sql="select *from Consulta where FechaConsulta='"+fecha+"'";
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch(Exception e){
            System.out.println(e.getMessage());}
        return  null;}
}
