package Conexion;
//LIBRERÍAS
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conectate{
    //CREAMOS LAS VARIABLES DE LOGIN Y CONTRASEÑA DE LA BD
    static String login="sa";
    static String password="123";
    //CREAMOS VARIABLE DE URL
    static String url="jdbc:sqlserver://localhost:1433" + ";databaseName=ProyectoEscritorio";
    //CREAMOS DRIVER
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //VARIABLE DE CONECCIÓN
    Connection conn=null;
    //CONSTRUCTOR
    public Connection Conectate(){
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,login,password);}
        catch (SQLException|ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error en Conexión: "+e);}
        return conn;}
    //MÉTODO PARA LISTAR LAS CONSULTAS QUE RETORNAN VALORES
    public ResultSet Listar(String cadena){
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,login,password);
            PreparedStatement da=conn.prepareStatement(cadena);
            ResultSet tbl=da.executeQuery();
            return tbl;}
        catch (ClassNotFoundException|SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            return null;}
    }
}
