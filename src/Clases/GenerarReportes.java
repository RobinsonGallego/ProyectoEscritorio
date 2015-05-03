package Clases;
//LIBRERÍAS
import Conexion.Conectate;
import java.awt.Frame;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class GenerarReportes{
    Connection cn;
    //CONSTRUCTOR
    public GenerarReportes(){
        //ESTE OBJETO NOS PERMITIRA COMUNICARNOS CON LA BASE DE DATOS
        Conectate con=new Conectate();
        cn=con.Conectate();}
    //MÉTODO PARA REPORTE PERSONAL MÉDICO
    public void ReportePM(){
        //RUTA DEL ARCHIVO
        String path="D:/NetBeans/ProyectoEscritorio/src/Reportes/Curriculums.jasper";
        //OBJETO JASPER
        JasperReport jr=null;
        try{
            //CARGAMOS EL OBJETO
            jr=(JasperReport) JRLoader.loadObjectFromFile(path);
            //CREAMOS OBJETO DE IMPRESIÓN DE REPORTES. LE MANDAMOS EL REPORTE CARGADO,LOS PARAMETROS Y LA CONEXIÓN
            JasperPrint jp=JasperFillManager.fillReport(jr,null,cn);
            //CREAMOS OBJETO DE VIEWER PARA VER EL REPORTE
            JasperViewer ver=new JasperViewer(jp);
            //LE DAMOS UN TÍTULO AL REPORTE
            ver.setTitle("Personal Médico");
            //HACEMOS EL REPORTE DEL TAMAÑO DE LA PANTALLA
            ver.setExtendedState(Frame.MAXIMIZED_BOTH);
            //MOSTRAMOS EL REPORTE
            ver.setVisible(true);}
        catch(JRException ex){
            Logger.getLogger(GenerarReportes.class.getName()).log(Level.SEVERE,null,ex);}
    }
}
