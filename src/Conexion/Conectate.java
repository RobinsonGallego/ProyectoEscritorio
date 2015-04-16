package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conectate
{
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
    public Connection Conectate()
    {
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,login,password);
            /*if(conn!=null)
            {
                JOptionPane.showMessageDialog(null,"Conexión Exitosa");
            }*/
        }
        catch (SQLException|ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error en Conexión: "+e);
        }
        return conn;
    }
}
