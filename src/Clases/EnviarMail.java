package Clases;
//LIBRERÍAS IMPORTADAS
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EnviarMail{
    String usuarioCorreo;
    String password;
    String destinatario;
    String asunto;
    String mensaje;
    String rutaArchivo;
    String nombreArchivo;
    //CONSTRUCTOR PRINCIPAL
    public EnviarMail(String usuarioCorreo,String password,String destinatario,String asunto,String mensaje,String rutaArchivo,String nombreArchivo){
        this.usuarioCorreo=usuarioCorreo;
        this.password=password;
        this.destinatario=destinatario;
        this.asunto=asunto;
        this.mensaje=mensaje;
        this.rutaArchivo=rutaArchivo;
        this.nombreArchivo=nombreArchivo;}
    //CONSTRUCTOR SECUNDARIO
    public EnviarMail(String usuarioCorreo,String password,String destinatario,String asunto,String mensaje){
        this(usuarioCorreo,password,destinatario,asunto,mensaje,"","");}
    /**
     * MÉTODO ENVIAR CORREO
     * @return un dato Booleano confirmando o negando el envio del correo
     */
    public boolean sendMail(){
        try{
            Properties props=new Properties();
            props.put("mail.smtp.host","smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable","true");
            props.setProperty("mail.smtp.port","587");
            props.setProperty("mail.smtp.user",usuarioCorreo);
            props.setProperty("mail.smtp.auth","true");
            
            Session session=Session.getDefaultInstance(props,null);
            BodyPart texto=new MimeBodyPart();
            texto.setText(mensaje);
            
            BodyPart adjunto=new MimeBodyPart();
            if(!rutaArchivo.equals("")){
                adjunto.setDataHandler(new DataHandler(new FileDataSource(rutaArchivo)));
                adjunto.setFileName(nombreArchivo);
            }
            MimeMultipart multiparte=new MimeMultipart();
            multiparte.addBodyPart(texto);
            if(!rutaArchivo.equals("")){
                multiparte.addBodyPart(adjunto);
            }
            
            MimeMessage message=new MimeMessage(session);
            message.setFrom(new InternetAddress(usuarioCorreo));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(destinatario));
            message.setSubject(asunto);
            message.setContent(multiparte);
            Transport t=session.getTransport("smtp");
            t.connect(usuarioCorreo,password);
            t.sendMessage(message,message.getAllRecipients());
            t.close();
            return true;}
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;}}
}
