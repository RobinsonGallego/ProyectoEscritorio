package Clases;
//LIBRERÍAS IMPORTADAS
import Conexion.Conectate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ClasePacientes{
    Connection cn;
    //CONSTRUCTOR
    public ClasePacientes(){
        //ESTE OBJETO NOS PERMITIRA COMUNICARNOS CON LA BASE DE DATOS
        Conectate con=new Conectate();
        cn=con.Conectate();}    
    /**
     * MÉTODO PARA LLENAR COMBOBOX EPS CON DATOS
     * @param lista que contiene una Lista de datos que se carga en un JComboBox
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void LlenarEPS(JComboBox lista){
        try{
            //SENTENCIA SQL
            String sql="select DescripcionEps from EPS";
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
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA LLENAR COMBOBOX PAÍS CON DATOS
     * @param lista que contiene una Lista de datos que se carga en un JComboBox
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void LlenarPais(JComboBox lista){
        try{
            //SENTENCIA SQL
            String sql="select DescripcionPais from Paises";
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
     * MÉTODO PARA LLENAR COMBOBOX CIUDAD CON DATOS
     * @param lista que contiene una Lista de datos que se carga en un JComboBox
     * @param pais que contiene un int del País seleccionado
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void LlenarCiudad(JComboBox lista,int pais){
        try{
            //SENTENCIA SQL
            String sql="select DescripcionCiudad from Ciudades where IdPais="+pais;
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
     * MÉTODO PARA BUSCAR UN PACIENTE POR SU IDENTIFICACIÓN
     * @param identificacion que contiene un String que se va a Buscar
     * @return un ResultSet si encuentra la Identificación o un null sino lo encuentra
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public ResultSet BuscarIdentificacion(String identificacion){
        try{
            String sql="select *from Pacientes where Identificacion='"+identificacion+"'";
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch(Exception e){
            System.out.println(e.getMessage());}
        return null;}
    /**
     * MÉTODO PARA BUSCAR UN PACIENTE POR DOS PARAMETROS
     * @param tipoDocumento que contiene un String con el Tipo de Documento que se buscara
     * @param identificacion que contiene un String con la identificación que se buscara
     * @return un objeto de tipo ResultSet si encuentra la información o null sino la encuentra
     */
    public ResultSet BuscarPaciente(String tipoDocumento,String identificacion){
        try{
            String sql="select * from Pacientes where TipoDocumento='"+tipoDocumento+"'and Identificacion='"+identificacion+"'";
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch(Exception e){
            System.out.println(e.getMessage());}
        return null;}
    /**
     * MÉTODO PARA BUSCAR UN PACIENTE POR TRES PARAMETROS
     * @param nombres que contiene un String con los Nombres que se buscara
     * @param pApellido que contiene un String con el Primer Apellido que se buscara
     * @param sApellido que contiene un String con el Segundo Apellido que se buscara
     * @return un objeto de tipo ResultSet si encuentra la información o null sino la encuentra
     */
    public ResultSet BuscarPacienteNombres(String nombres,String pApellido,String sApellido){
        try{
            String sql="select * from Pacientes where Nombres='"+nombres+"' and PrimerApellido='"+pApellido+"' and SegundoApellido='"+sApellido+"'";
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch(Exception e){
            System.out.println(e.getMessage());}
        return null;}
    /**
     * MÉTODO PARA BUSCAR EL VALORCOPAGO DE UNA EPS
     * @param eps que contiene un int de la EPS seleccionada
     * @return el valor que tiene la EPS seleccionada en String
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public String ValorCoPago(int eps){
        String valor="";
        try{
            //SENTENCIA SQL
            String sql="select ValorCoPago from EPS where CodigoEps="+eps;
            //COMO RECIBIMOS DATOS, ENTONCES USAREMOS EL CALLABLESTATEMENT
            CallableStatement cmd=cn.prepareCall(sql);
            //CREAMOS UN OBJETO QUE GUARDARA LOS RESULTADOS
            ResultSet rs=cmd.executeQuery();
            //LEEMOS TODAS LAS FILAS QUE NOS ENVIA EL SQL
            while(rs.next()){
                valor=rs.getString(1);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}
        return valor;}
    /**
     * MÉTODO PARA BUSCAR UNA EPS
     * @param codigoeps que contiene un dato int que sera buscado
     * @return 
     */
    public ResultSet BuscasEPS(int codigoeps){
        try{
            String sql="select EPS.DescripcionEps from EPS where CodigoEps="+codigoeps;
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch(Exception e){
            System.out.println(e.getMessage());}
        return null;}
    /**
     * MÉTODO PARA GUARDAR UN PACIENTE
     * @param pa que contiene un objeto ObjetoPaciente con toda la información obtenida del Formulario
     */
    public void Guardar(ObjetoPaciente pa){
        try{
            //CONVERTIMOS LA FOTO EN UN ARCHIVO BINARIO
            FileInputStream fis=null;
            File file=new File(pa.getFoto());
            fis=new FileInputStream(file);
            //AQUÍ EJECUTAMOS EL PROCEDIMIENTO ALMACENADO
            String sql="execute GuardarPacientes ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";//LOS SIGNOS SON SEGÚN EL NÚMERO DE DATOS
            //COMO NO RECIBIMOS NINGÚN DATO DE RETORNO ENTONCES SOLO HACEMOS UN PREPARED
            PreparedStatement cmd=cn.prepareCall(sql);
            //AHORA AGREGAMOS LOS DATOS
            cmd.setString(1,pa.getTipoDocumento());
            cmd.setString(2,pa.getNumeroDocumento());
            cmd.setString(3,pa.getNombres());
            cmd.setString(4,pa.getPrimerApellido());
            cmd.setString(5,pa.getSegundoApellido());
            cmd.setInt(6,pa.getNumeroTelefono());
            cmd.setLong(7,pa.getNumeroMovil());
            cmd.setString(8,pa.getDireccion());
            cmd.setString(9,pa.getGenero());
            cmd.setString(10,pa.getCorreo());
            cmd.setString(11,pa.getFechaNacimiento());
            cmd.setInt(12,pa.getEdad());
            cmd.setString(13,pa.getEstadoCivil());
            cmd.setInt(14,pa.getPaisNacimiento());
            cmd.setInt(15,pa.getCiudadNacimiento());
            cmd.setString(16,pa.getProfesion());
            cmd.setString(17,pa.getTipoSangre());
            cmd.setString(18,pa.getFechaIngreso());
            cmd.setInt(19,pa.getEps());
            cmd.setString(20,pa.getFormaPago());
            cmd.setString(21,pa.getNumeroTarjeta());
            cmd.setString(22,pa.getTipoTarjeta());
            cmd.setString(23,pa.getFranquicia());
            cmd.setString(24,pa.getNumeroCheque());
            cmd.setString(25,pa.getBanco());
            cmd.setBinaryStream(26,fis,(int)file.length());
            cmd.setString(27,pa.getFoto());
            cmd.setString(28,pa.getEstado());
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(FileNotFoundException|SQLException e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA ACTUALIZAR UN PACIENTE
     * @param pa que contiene un objeto ObjetoPaciente con toda la información obtenida del Formulario
     */
    public void Actualizar(ObjetoPaciente pa){
        try{
            //CONVERTIMOS LA FOTO EN UN ARCHIVO BINARIO
            FileInputStream fis=null;
            File file=new File(pa.getFoto());
            fis=new FileInputStream(file);
            //AQUÍ EJECUTAMOS EL PROCEDIMIENTO ALMACENADO
            String sql="execute ActualizarPacientes ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";//LOS SIGNOS SON SEGÚN EL NÚMERO DE DATOS
            //COMO NO RECIBIMOS NINGÚN DATO DE RETORNO ENTONCES SOLO HACEMOS UN PREPARED
            PreparedStatement cmd=cn.prepareCall(sql);
            //AHORA AGREGAMOS LOS DATOS
            cmd.setString(1,pa.getTipoDocumento());
            cmd.setString(2,pa.getNumeroDocumento());
            cmd.setString(3,pa.getNombres());
            cmd.setString(4,pa.getPrimerApellido());
            cmd.setString(5,pa.getSegundoApellido());
            cmd.setInt(6,pa.getNumeroTelefono());
            cmd.setLong(7,pa.getNumeroMovil());
            cmd.setString(8,pa.getDireccion());
            cmd.setString(9,pa.getGenero());
            cmd.setString(10,pa.getCorreo());
            cmd.setString(11,pa.getFechaNacimiento());
            cmd.setInt(12,pa.getEdad());
            cmd.setString(13,pa.getEstadoCivil());
            cmd.setInt(14,pa.getPaisNacimiento());
            cmd.setInt(15,pa.getCiudadNacimiento());
            cmd.setString(16,pa.getProfesion());
            cmd.setString(17,pa.getTipoSangre());
            cmd.setString(18,pa.getFechaIngreso());
            cmd.setInt(19,pa.getEps());
            cmd.setString(20,pa.getFormaPago());
            cmd.setString(21,pa.getNumeroTarjeta());
            cmd.setString(22,pa.getTipoTarjeta());
            cmd.setString(23,pa.getFranquicia());
            cmd.setString(24,pa.getNumeroCheque());
            cmd.setString(25,pa.getBanco());
            cmd.setBinaryStream(26,fis,(int)file.length());
            cmd.setString(27,pa.getFoto());
            cmd.setString(28,pa.getEstado());
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(FileNotFoundException|SQLException e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA LLENAR LOS DATOS EN UNA TABLA
     * @param modelo que contiene un DefaultTableModel para mostrar los Datos
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void LlenarDatos(DefaultTableModel modelo){
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Pacientes";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[11];
                //SE PONE 11, PORQUE SOLO SON 11 COLUMNAS
                for (int i=0;i<11;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    datos[4]=rs.getString(5);
                    datos[5]=rs.getString(12);
                    datos[6]=rs.getString(17);
                    datos[7]=rs.getString(18);
                    //TRANSFORMAMOS EL DATO DE LA EPS
                    int eps=rs.getInt(19);
                    //CREAMOS UN OBJETO DE LA CLASEPACIENTES
                    ClasePacientes cpa=new ClasePacientes();
                    ResultSet rs2=cpa.BuscasEPS(eps);
                    if(rs2.next()){
                        datos[8]=rs2.getString(1);}
                    datos[9]=rs.getString(20);
                    datos[10]=rs.getString(28);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA BUSQUEDAS DINÁMICAS POR IDENTIFICACIÓN
     * @param modelo que contiene un DefaultTableModel que mostrara la información
     * @param identificacion que contiene un Long que sera Buscado 
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void BusquedaIdentificacion(DefaultTableModel modelo,String identificacion){
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Pacientes where Identificacion like '%"+identificacion+"%'";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[11];
                //SE PONE 11, PORQUE SOLO SON 11 COLUMNAS
                for (int i=0;i<11;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    datos[4]=rs.getString(5);
                    datos[5]=rs.getString(12);
                    datos[6]=rs.getString(17);
                    datos[7]=rs.getString(18);
                    //TRANSFORMAMOS EL DATO DE LA EPS
                    int eps=rs.getInt(19);
                    //CREAMOS UN OBJETO DE LA CLASEPACIENTES
                    ClasePacientes cpa=new ClasePacientes();
                    ResultSet rs2=cpa.BuscasEPS(eps);
                    if(rs2.next()){
                        datos[8]=rs2.getString(1);}
                    datos[9]=rs.getString(20);
                    datos[10]=rs.getString(28);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA BUSQUEDAS DINÁMICAS POR NOMBRES
     * @param modelo que contiene un DefaultTableModel que mostrara la información
     * @param nombres que contiene un String que sera Buscado 
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void BusquedaNombres(DefaultTableModel modelo,String nombres){
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Pacientes where Nombres like '%"+nombres+"%'";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[11];
                //SE PONE 11, PORQUE SOLO SON 11 COLUMNAS
                for (int i=0;i<11;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    datos[4]=rs.getString(5);
                    datos[5]=rs.getString(12);
                    datos[6]=rs.getString(17);
                    datos[7]=rs.getString(18);
                    //TRANSFORMAMOS EL DATO DE LA EPS
                    int eps=rs.getInt(19);
                    //CREAMOS UN OBJETO DE LA CLASEPACIENTES
                    ClasePacientes cpa=new ClasePacientes();
                    ResultSet rs2=cpa.BuscasEPS(eps);
                    if(rs2.next()){
                        datos[8]=rs2.getString(1);}
                    datos[9]=rs.getString(20);
                    datos[10]=rs.getString(28);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA BUSQUEDAS DINÁMICAS POR PRIMER APELLIDO
     * @param modelo que contiene un DefaultTableModel que mostrara la información
     * @param primerape que contiene un String que sera Buscado 
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void BusquedaPrimerApe(DefaultTableModel modelo,String primerape){
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Pacientes where PrimerApellido like '%"+primerape+"%'";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[11];
                //SE PONE 11, PORQUE SOLO SON 11 COLUMNAS
                for (int i=0;i<11;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    datos[4]=rs.getString(5);
                    datos[5]=rs.getString(12);
                    datos[6]=rs.getString(17);
                    datos[7]=rs.getString(18);
                    //TRANSFORMAMOS EL DATO DE LA EPS
                    int eps=rs.getInt(19);
                    //CREAMOS UN OBJETO DE LA CLASEPACIENTES
                    ClasePacientes cpa=new ClasePacientes();
                    ResultSet rs2=cpa.BuscasEPS(eps);
                    if(rs2.next()){
                        datos[8]=rs2.getString(1);}
                    datos[9]=rs.getString(20);
                    datos[10]=rs.getString(28);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}}
    /**
     * MÉTODO PARA BUSQUEDAS DINÁMICAS POR ESTADO
     * @param modelo que contiene un DefaultTableModel que mostrara la información
     * @param estado que contiene un String que sera Buscado
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void BusquedaEstado(DefaultTableModel modelo,String estado){
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from Pacientes where Estado='"+estado+"'";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[11];
                //SE PONE 11, PORQUE SOLO SON 11 COLUMNAS
                for (int i=0;i<11;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    datos[4]=rs.getString(5);
                    datos[5]=rs.getString(12);
                    datos[6]=rs.getString(17);
                    datos[7]=rs.getString(18);
                    //TRANSFORMAMOS EL DATO DE LA EPS
                    int eps=rs.getInt(19);
                    //CREAMOS UN OBJETO DE LA CLASEPACIENTES
                    ClasePacientes cpa=new ClasePacientes();
                    ResultSet rs2=cpa.BuscasEPS(eps);
                    if(rs2.next()){
                        datos[8]=rs2.getString(1);}
                    datos[9]=rs.getString(20);
                    datos[10]=rs.getString(28);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());}}
}
