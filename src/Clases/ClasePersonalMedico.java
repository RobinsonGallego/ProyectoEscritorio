package Clases;
//LIBRERÍAS
import Conexion.Conectate;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ClasePersonalMedico{
    Connection cn;
    //CONSTRUCTOR
    public ClasePersonalMedico(){
        //ESTE OBJETO NOS PERMITIRA COMUNICARNOS CON LA BASE DE DATOS
        Conectate con=new Conectate();
        cn=con.Conectate();
    }    
    //MÉTODO PARA LLENAR COMBOBOX PAISES CON DATOS
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
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA LLENAR COMBOBOX CIUDADES CON DATOS
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
                for (int i=0;i<1;i++){//SE PONE i<1 PORQUE SOLO TENEMOS UNA COLUMNA
                    lista.addItem(rs.getString(i+1));}}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch (Exception e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA LLENAR COMBOBOX IDIOMAS CON DATOS
    public void LlenarIdiomas(JComboBox lista){
        try{
            //SENTENCIA SQL
            String sql="select DescripcionIdioma from Idiomas";
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
    //MÉTODO PARA GUARDAR UN PERSONAL MÉDICO
    public void Guardar(long identificacion,String nombres,String primerapellido,String segundoapellido,String fechanacimiento,String pais,String ciudad,String estadocivil,String direccion,int telefono,long movil,String correo,String tarjetaprofesional,String titulo,String institucion,String otrosestudios,String idiomas,String experiencialaboral,String ultimaempresa,String cargo,String motivosalida,int ultimosalario,String observaciones){
        try{
            //AQUÍ EJECUTAMOS EL PROCEDIMIENTO ALMACENADO
            String sql="execute GuardarPersonalMedico ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";//LOS SIGNOS SON SEGÚN EL NÚMERO DE DATOS
            //COMO NO RECIBIMOS NINGÚN DATO DE RETORNO ENTONCES SOLO HACEMOS UN PREPARED
            PreparedStatement cmd=cn.prepareCall(sql);
            //AHORA AGREGAMOS LOS DATOS
            cmd.setLong(1,identificacion);
            cmd.setString(2,nombres);
            cmd.setString(3,primerapellido);
            cmd.setString(4,segundoapellido);
            cmd.setString(5,fechanacimiento);
            cmd.setString(6,pais);
            cmd.setString(7,ciudad);
            cmd.setString(8,estadocivil);
            cmd.setString(9,direccion);
            cmd.setInt(10,telefono);
            cmd.setLong(11,movil);
            cmd.setString(12,correo);
            cmd.setString(13,tarjetaprofesional);
            cmd.setString(14,titulo);
            cmd.setString(15,institucion);
            cmd.setString(16,otrosestudios);
            cmd.setString(17,idiomas);
            cmd.setString(18,experiencialaboral);
            cmd.setString(19,ultimaempresa);
            cmd.setString(20,cargo);
            cmd.setString(21,motivosalida);
            cmd.setInt(22,ultimosalario);
            cmd.setString(23,observaciones);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch (Exception e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA BUSCAR UN DATO
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
    //MÉTODO PARA BUSCAR UN DATO CON 3 PARAMETROS
    public ResultSet Buscar2(String nombres,String PApellido,String SApellido){
        try{
            String sql="select * from PersonalMedico where Nombres='"+nombres+"' and PrimerApellido='"+PApellido+"' and SegundoApellido='"+SApellido+"'";
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            return rs;}
        catch (Exception e){
            System.out.println(e.getMessage());}
        return null;
    }
    //MÉTODO PARA ACTUALIZAR LOS DATOS
    public void Actualizar(long identificacion,String nombres,String primerapellido,String segundoapellido,String fechanacimiento,String pais,String ciudad,String estadocivil,String direccion,int telefono,long movil,String correo,String tarjetaprofesional,String titulo,String institucion,String otrosestudios,String idiomas,String experiencialaboral,String ultimaempresa,String cargo,String motivosalida,int ultimosalario,String observaciones){
        try{
            //CREAMOS LA SENTENCIA SQL
            String sql="execute ActualizarPersonalMedico ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?";
            //EJECUTAMOS EL PROCEDIMIENTO ALMACENADO CON LOS 4 PARAMETROS A RECIBIR
            PreparedStatement cmd=cn.prepareCall(sql);
            cmd.setLong(1,identificacion);
            cmd.setString(2,nombres);
            cmd.setString(3,primerapellido);
            cmd.setString(4,segundoapellido);
            cmd.setString(5,fechanacimiento);
            cmd.setString(6,pais);
            cmd.setString(7,ciudad);
            cmd.setString(8,estadocivil);
            cmd.setString(9,direccion);
            cmd.setInt(10,telefono);
            cmd.setLong(11,movil);
            cmd.setString(12,correo);
            cmd.setString(13,tarjetaprofesional);
            cmd.setString(14,titulo);
            cmd.setString(15,institucion);
            cmd.setString(16,otrosestudios);
            cmd.setString(17,idiomas);
            cmd.setString(18,experiencialaboral);
            cmd.setString(19,ultimaempresa);
            cmd.setString(20,cargo);
            cmd.setString(21,motivosalida);
            cmd.setInt(22,ultimosalario);
            cmd.setString(23,observaciones);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch (Exception e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA ELIMINAR UN DATO
    public void Eliminar(long identificacion){
        try{
            //CREAMOS UNA CONSULTA SIMPLE
            String sql="delete PersonalMedico from PersonalMedico where Identificacion="+identificacion;
            //COMO NO MOSTRAMOS NINGÚN DATO SOLO HACEMOS UN PREPARED
            PreparedStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA SENTENCIA
            cmd.execute();
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch (Exception e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA LLENAR LOS DATOS EN UNA TABLA
    public void LlenarDatos(DefaultTableModel modelo){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from PersonalMedico";
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
                    datos[5]=rs.getString(6);
                    datos[6]=rs.getString(7);
                    datos[7]=rs.getString(11);
                    datos[8]=rs.getString(12);
                    datos[9]=rs.getString(13);
                    datos[10]=rs.getString(18);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA BUSQUEDAS DINÁMICAS PARA DIRECCIÓN Y ESTADO CIVIL
    public void BusquedaDireEstCi(DefaultTableModel modelo,long identificacion){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL Y UNA IDENTIFICACIÓN
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from PersonalMedico where Identificacion like '%"+identificacion+"%'";
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
                    datos[5]=rs.getString(6);
                    datos[6]=rs.getString(7);
                    datos[7]=rs.getString(8);
                    datos[8]=rs.getString(9);
                    datos[9]=rs.getString(11);
                    datos[10]=rs.getString(12);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA BUSQUEDAS DINÁMICAS PARA INFORMACIÓN PROFESIONAL
    public void BusquedaInfoPer(DefaultTableModel modelo,long identificacion){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL Y UNA IDENTIFICACIÓN
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from PersonalMedico where Identificacion like '%"+identificacion+"%'";
            //PREPARAMOS LA LLAMADA
            CallableStatement cmd=cn.prepareCall(sql);
            //EJECUTAMOS LA LLAMADA Y RECIBIMOS LOS DATOS DE LA BASE DE DATOS
            ResultSet rs=cmd.executeQuery();
            //SE LEE EL MÁXIMO DE FILAS
            while(rs.next()){
                /*SE CREA UN OBJETO DE DATOS QUE GUARDARA
                LOS DATOS Y LUEGO LOS INSERTAREMOS EN LA TABLA*/
                Object[] datos=new Object[9];
                //SE PONE 9, PORQUE SOLO SON 9 COLUMNAS
                for (int i=0;i<9;i++){
                    //GUARDAMOS LOS DATOS EN EL OBJETO
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    datos[3]=rs.getString(4);
                    datos[4]=rs.getString(13);
                    datos[5]=rs.getString(14);
                    datos[6]=rs.getString(15);
                    datos[7]=rs.getString(16);
                    datos[8]=rs.getString(17);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA BUSCAR LA EXPERIENCIA LABORAL
    public void BusquedaExperienciaLaboral(DefaultTableModel modelo,long identificacion){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL Y UNA IDENTIFICACIÓN
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from PersonalMedico where Identificacion like '%"+identificacion+"%'";
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
                        datos[4]=rs.getString(12);
                        datos[5]=rs.getString(18);
                        datos[6]=rs.getString(19);
                        datos[7]=rs.getString(20);
                        datos[8]=rs.getString(21);
                        datos[9]=rs.getString(22);
                        datos[10]=rs.getString(23);}
                    //GUARDAMOS LOS DATOS EN LA TABLA
                    modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA BUSCAR NOMBRES
    public void BusquedaNombres(DefaultTableModel modelo,String nombres){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL Y NOMBRES
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from PersonalMedico where Nombres like '%"+nombres+"%'";
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
                    datos[5]=rs.getString(6);
                    datos[6]=rs.getString(7);
                    datos[7]=rs.getString(11);
                    datos[8]=rs.getString(12);
                    datos[9]=rs.getString(13);
                    datos[10]=rs.getString(18);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA BUSCAR NOMBRES
    public void BusquedaPrimerApe(DefaultTableModel modelo,String primerApe){
        //RECIBIMOS UN OBJETO DE TIPO DEFAULTTABLEMODEL Y NOMBRES
        try{
            //SE CREA LA SENTENCIA SQL
            String sql="select * from PersonalMedico where PrimerApellido like '%"+primerApe+"%'";
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
                    datos[5]=rs.getString(6);
                    datos[6]=rs.getString(7);
                    datos[7]=rs.getString(11);
                    datos[8]=rs.getString(12);
                    datos[9]=rs.getString(13);
                    datos[10]=rs.getString(18);}
                //GUARDAMOS LOS DATOS EN LA TABLA
                modelo.addRow(datos);}
            //CERRAMOS LA CONEXIÓN
            cmd.close();
            cn.close();}
        catch(Exception e){
            System.out.println(e.getMessage());}
    }
}
