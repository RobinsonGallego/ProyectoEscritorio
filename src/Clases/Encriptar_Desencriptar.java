package Clases;
public class Encriptar_Desencriptar{
    /**
     * MÉTODO PARA ENCRIPTAR CONTRASEÑA
     * @param contrasena que contiene un String que se Encriptara
     * @return un String Encriptado
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public String Encriptar(String contrasena){
        //CREAMOS UN ARREGLO PARA LA CONTRASEÑA
        char arreglo[]=contrasena.toCharArray();
        /*CREAMOS UN CICLO PARA RECORRER EL
        ARREGLO Y MODIFICAMOS LA CONTRASEÑA*/
        for(int i=0;i<arreglo.length;i++){
            //ENCRIPTACIÓN
            arreglo[i]=(char)(arreglo[i]+(char)+10);}
        //CAPTURAMOS LA CONTRASEÑA ENCRIPTADA
        String encriptado=String.valueOf(arreglo);
        //RETORNAMOS LA ENCRIPCTACIÓN
        return encriptado;
    }
    /**
     * MÉTODO PARA DESENCRIPTAR CONTRASEÑA
     * @param contrasena que contiene un String que se Desencriptara
     * @return un String Desencriptado
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public String Desencriptar(String contrasena){
        //CREAMOS UN ARREGLO PARA LA CONTRASEÑA
        char arreglo[]=contrasena.toCharArray();
        /*CREAMOS UN CICLO PARA RECORRER EL
        ARREGLO Y MODIFICAMOS LA CONTRASEÑA*/
        for(int i=0;i<arreglo.length;i++){
            //ENCRIPTACIÓN
            arreglo[i]=(char)(arreglo[i]-(char)+10);}
        //CAPTURAMOS LA CONTRASEÑA DESENCRIPTADA
        String desencriptado=String.valueOf(arreglo);
        //RETORNAMOS LA DESENCRIPTACIÓN
        return desencriptado;
    }
}
