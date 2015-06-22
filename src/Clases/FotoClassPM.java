package Clases;
/**
 * LIBRERÍAS IMPORTADAS
 * @author Robinson Gallego Alzate
 * @version 1.1
 */
import Conexion.Conectate;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class FotoClassPM{
    Connection cn;
    private Image data;
    /**
     * CONSTRUCTOR FotoClassPM
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public FotoClassPM(){
        //ESTE OBJETO NOS PERMITIRA COMUNICARNOS CON LA BASE DE DATOS
        Conectate con=new Conectate();
        cn=con.Conectate();
    }
    /**
     * MÉTODO QUE DADA UNA CADENA DE BYTES LA CONVIERTE EN UNA IMAGEN CON EXTENSIÓN jpeg
     * @param bytes que contiene un arreglo de Bytes, para ser convertido a Imegen
     * @return una Imagen convertida
     * @throws IOException que puede disparar las excepciones
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private Image ConvertirImagen(byte[] bytes) throws IOException{
        //RECIBIMOS UN ARRAYS DE BYTES
        ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
        Iterator readers=ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader reader=(ImageReader) readers.next();
        Object source=bis;
        ImageInputStream iis=ImageIO.createImageInputStream(source);
        reader.setInput(iis,true);
        ImageReadParam param=reader.getDefaultReadParam();
        return reader.read(0,param);
    }
    /**
     * MÉTODO PARA RECUPERAR LA IMAGEN DE LA BASE DE DATOS
     * @param identificacion que con tiene un Long que se Buscara
     * @return un dato con la Imagen
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public Image RecuperarFoto(long identificacion){
        try{
            //SENTENCIA SQL
            String sql="select PersonalMedico.Foto from PersonalMedico where Identificacion="+identificacion;
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs=cmd.executeQuery();
            int i=0;
            while(rs.next()){
                //SE LEE LA CADENA DE BYTES DE LA BASE DE DATOS
                byte[] b=rs.getBytes("Foto");
                //LA CADENA OBTENIDA SE CONVERTIRA EN UNA IMAGEN
                data=ConvertirImagen(b);
                i++;}
            //CERRAMOS LA CONEXIÓN
            rs.close();}
        catch (IOException|SQLException e){
            Logger.getLogger(Clases.FotoClassPM.class.getName()).log(Level.SEVERE,null,e);}
        return data;
    }
}
