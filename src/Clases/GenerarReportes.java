package Clases;
/**
 * LIBRERÍAS IMPORTADAS
 * @author Robinson Gallego Alzate
 * @version 1.1
 */
import Conexion.Conectate;
import java.awt.Frame;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
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
    /**
     * CONSTRUCTOR GenerarReportes
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public GenerarReportes(){
        //ESTE OBJETO NOS PERMITIRA COMUNICARNOS CON LA BASE DE DATOS
        Conectate con=new Conectate();
        cn=con.Conectate();
    }
    /**
     * MÉTODO PARA GENERAR REPORTE PERSONAL MÉDICO
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void ReportePM(){
        //RUTA DEL ARCHIVO
        String path="D:/NetBeans/ProyectoEscritorio/src/Reportes/PersonalMedico.jasper";
        //OBJETO JASPER
        JasperReport jr=null;
        try{
            //CARGAMOS EL OBJETO
            jr=(JasperReport)JRLoader.loadObjectFromFile(path);
            //CREAMOS OBJETO DE IMPRESIÓN DE REPORTES. LE MANDAMOS EL REPORTE CARGADO,LOS PARAMETROS Y LA CONEXIÓN
            JasperPrint jp=JasperFillManager.fillReport(jr,null,cn);
            //CREAMOS OBJETO DE VIEWER PARA VER EL REPORTE
            JasperViewer ver=new JasperViewer(jp,false);//SE LE PONE EL FALSE, PARA QUE NO CIERRE LA APLICACIÓN
            //LE DAMOS UN TÍTULO AL REPORTE
            ver.setTitle("Personal Médico");
            //HACEMOS EL REPORTE DEL TAMAÑO DE LA PANTALLA
            ver.setExtendedState(Frame.MAXIMIZED_BOTH);
            //MOSTRAMOS EL REPORTE
            ver.setVisible(true);}
        catch(JRException ex){
            Logger.getLogger(GenerarReportes.class.getName()).log(Level.SEVERE,null,ex);}
    }
    /**
     * MÉTODO PARA GENERAR REPORTE PERSONAL MÉDICO HOJA DE VIDA
     * @param Identificacion que contiene un Long que se Buscara
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void ReporteHV(long Identificacion){
        //RUTA DEL ARCHIVO
        String path="D:/NetBeans/ProyectoEscritorio/src/Reportes/HojadeVida.jasper";
        //OBJETO JASPER
        JasperReport jr=null;
        try{
            //CARGAMOS EL OBJETO
            jr=(JasperReport)JRLoader.loadObjectFromFile(path);
            Map parametro=new HashMap();
            parametro.put("ID",Identificacion);
            //CREAMOS OBJETO DE IMPRESIÓN DE REPORTES. LE MANDAMOS EL REPORTE CARGADO,LOS PARAMETROS Y LA CONEXIÓN
            JasperPrint jp=JasperFillManager.fillReport(jr,parametro,cn);
            //CREAMOS OBJETO DE VIEWER PARA VER EL REPORTE
            JasperViewer ver=new JasperViewer(jp,false);//SE LE PONE EL FALSE, PARA QUE NO CIERRE LA APLICACIÓN
            //LE DAMOS UN TÍTULO AL REPORTE
            ver.setTitle("Hoja de Vida");
            //HACEMOS EL REPORTE DEL TAMAÑO DE LA PANTALLA
            ver.setExtendedState(Frame.MAXIMIZED_BOTH);
            //MOSTRAMOS EL REPORTE
            ver.setVisible(true);}
        catch(JRException ex){
            Logger.getLogger(GenerarReportes.class.getName()).log(Level.SEVERE,null,ex);}
    }
}
