package Clases;
//LIBRERIAS
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

public class ValidarEMail extends InputVerifier{
    //IMAGENES UTILIZADAS EN LA VENTANA
    ImageIcon Error=new ImageIcon(this.getClass().getResource("/Imagenes/error2.png"));
    private Pattern pattern;//OBJETO QUE ESTABLECE EL PATRÓN QUE CONTENDRA EL CAMPO DE TEXTO
    private Matcher matcher;
    //ESTE ES EL PATRÓN POR EL CUAL SE RIGE EL CAMPO DE TEXTO
    private static final String EMAIL_PATTERN="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    //SE PASA UN OBJETO A TIPO JCOMPONENT
    @Override
    public boolean verify(JComponent input){
        JTextComponent cmp=(JTextComponent)input;//EL JCOMPONENT LO CONVIERTO EN UN COMPONENTE DE TEXTO
    	String texto=cmp.getText();
    	//VALIDAMOS QUE LA CAJA DE TEXTO CUMPLA EL PATRÓN
        if(esValido(texto)){
                return true;}
        JOptionPane.showMessageDialog(null,"El correo no es válido","Validar E-Mail",JOptionPane.ERROR_MESSAGE,Error);
    	return false;}
    //MÉTODO QUE VALIDA QUE LA CADENA CUMPLA EL PATRÓN ESTABLECIDO	
    private boolean esValido(String string){
        pattern=Pattern.compile(EMAIL_PATTERN);//SE COMPILA LA CADENA
        matcher=pattern.matcher(string);//SE COMPARA LA CADENA
        return matcher.matches();}//RETORNA LA CADENA CUANDO CUMPLE EL PATRÓN ESTABLECIDO
}
