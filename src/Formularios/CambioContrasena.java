package Formularios;
//LIBRERÍAS IMPORTADAS
import Clases.ClasePersonalMedico;
import Clases.ClaseUsuarios;
import Clases.Encriptar_Desencriptar;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CambioContrasena extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    //CONTRUCTOR CAMBIO CONTRASEÑA
    public CambioContrasena(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Cambio de Contraseña");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        ImageIcon logo=new ImageIcon("src/Imagenes/llave.png");//CREAMOS UN OBJETO IMAGEICON PARA LLAMAR LA IMAGEN
        Icon icono=new ImageIcon(logo.getImage().getScaledInstance(lblfondo.getWidth(),lblfondo.getHeight(),Image.SCALE_DEFAULT));//CONVERTIMOS LA IMAGEN EN ICONO CON LAS MEDIDAS DEL JLABEL
        lblfondo.setIcon(icono);//CAPTURAMOS LA IMAGEN EN EL JLABEL
        lblusuario.setVisible(false);
        Letras(txtrespuesta);
        LetrasyNumeros(txtcontranueva);}
    /**
     * MÉTODO PREGUNTA QUE CONTIENE UN USUARIO
     * @param rs que contiene un objeto ResultSet con la información del Usuario
     */
    public void Pregunta(ResultSet rs){
        try{
            lblusuario.setText(rs.getString(2));
            lblpregunta.setText(rs.getString(5));}
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        lblcontranueva = new javax.swing.JLabel();
        txtcontranueva = new javax.swing.JTextField();
        lblpregunta = new javax.swing.JLabel();
        lblrespuesta = new javax.swing.JLabel();
        txtrespuesta = new javax.swing.JTextField();
        btnguardar = new org.edisoncor.gui.button.ButtonTask();
        lblfondo = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblespe1 = new javax.swing.JLabel();
        lblespe2 = new javax.swing.JLabel();
        lblespe3 = new javax.swing.JLabel();
        lblespe4 = new javax.swing.JLabel();
        lblespe5 = new javax.swing.JLabel();
        lblespe6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(245, 245, 245));

        lblcontranueva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcontranueva.setText("Contraseña Nueva *");

        txtcontranueva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcontranueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontranuevaKeyTyped(evt);
            }
        });

        lblpregunta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpregunta.setForeground(new java.awt.Color(255, 0, 0));

        lblrespuesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblrespuesta.setText("Respuesta *");

        txtrespuesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtrespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrespuestaKeyTyped(evt);
            }
        });

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar2_opt.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnguardar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnguardar.setDescription("Save");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        btnguardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnguardarKeyTyped(evt);
            }
        });

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbltitulo.setText("Especificaciones de la Contraseña");

        lblespe1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblespe1.setForeground(new java.awt.Color(255, 0, 0));
        lblespe1.setText("* Mayúscula Inical");

        lblespe2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblespe2.setForeground(new java.awt.Color(255, 0, 0));
        lblespe2.setText("* Formato: Letras + Números");

        lblespe3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblespe3.setForeground(new java.awt.Color(255, 0, 0));
        lblespe3.setText("* Menor de 15 Caracteres");

        lblespe4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblespe4.setForeground(new java.awt.Color(255, 0, 0));
        lblespe4.setText("* Mayor o igual a 8 Caracteres");

        lblespe5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblespe5.setForeground(new java.awt.Color(255, 0, 0));
        lblespe5.setText("* No permite Caracteres Especiales");

        lblespe6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblespe6.setForeground(new java.awt.Color(255, 0, 0));
        lblespe6.setText("* No Nombres ni Apellidos de usuario");

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addComponent(lblfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addComponent(lblcontranueva)
                                .addGap(18, 18, 18)
                                .addComponent(txtcontranueva, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addComponent(lblrespuesta)
                                .addGap(65, 65, 65)
                                .addComponent(txtrespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfondoLayout.createSequentialGroup()
                                .addGap(0, 74, Short.MAX_VALUE)
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltitulo)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblespe2)
                                    .addComponent(lblespe1)
                                    .addComponent(lblespe3)
                                    .addComponent(lblespe4)
                                    .addComponent(lblespe5)
                                    .addComponent(lblespe6))))))
                .addGap(6, 6, 6))
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblcontranueva))
                            .addComponent(txtcontranueva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblrespuesta))
                            .addComponent(txtrespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblespe1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addComponent(lblespe2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblespe3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblespe4)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblespe5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblespe6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //LIMITANTES Y TRANSFERENCIA DE FOCUS
    private void txtcontranuevaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontranuevaKeyTyped
        if(txtcontranueva.getText().length()==15){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtcontranueva){
            if(Contador==10){
                txtrespuesta.requestFocus();}}
        //MÉTODO PARA PONER MAYÚSCULA INICIAL
        JTextField txtrespu=(JTextField)evt.getComponent();
        String texto=txtrespu.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtcontranueva.setText(texto);}
    }//GEN-LAST:event_txtcontranuevaKeyTyped
    private void txtrespuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrespuestaKeyTyped
        if(txtrespuesta.getText().length()==30){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtrespuesta){
            if(Contador==10){
                btnguardar.requestFocus();}}
    }//GEN-LAST:event_txtrespuestaKeyTyped
   //ACCIÓN DEL BOTÓN ACEPTAR CON CLIC
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Guardar();
    }//GEN-LAST:event_btnguardarActionPerformed
    //ACCIÓN DEL BOTÓN ACEPTAR CON TECLADO
    private void btnguardarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnguardarKeyTyped
        Guardar();
    }//GEN-LAST:event_btnguardarKeyTyped
    /**
     * MÉTODO PARA GUARDAR LOS DATOS NUEVOS
     */
    private void Guardar(){
        if(txtcontranueva.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir la Contraseña Nueva.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtcontranueva.requestFocus();}
        else if(EsNumero(String.valueOf(txtcontranueva.getText().charAt(0)))==true){
            JOptionPane.showMessageDialog(null,"La Contraseña esta mal Ingresada.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtcontranueva.requestFocus();
            txtcontranueva.setText("");}
        else if(txtcontranueva.getText().length()<8){
            JOptionPane.showMessageDialog(null,"La Contraseña debe ser de mínimo 8 caracteres.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtcontranueva.requestFocus();}
        else if(Formato(txtcontranueva.getText())==false){
            JOptionPane.showMessageDialog(null,"La Contraseña esta mal Ingresada.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtcontranueva.requestFocus();}
        else if(txtrespuesta.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir la respuesta a la pregunta asignada.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtrespuesta.requestFocus();}
        else{
            long identificacion=Long.parseLong(lblusuario.getText());
            String aComparar="";
            int contador=0;
            String con=txtcontranueva.getText();
            for(int i=0;i<con.length();i++){
                char caracter=con.charAt(i);
                if(!EsNumero2(caracter)){
                    aComparar+=caracter;}}
            //CREAMOS UN OBJETO DE LA CLASEUSUARIOS
            ClasePersonalMedico cpm=new ClasePersonalMedico();
            ResultSet rs=cpm.Buscar(identificacion);
            try{
                if(rs.next()){
                    String nombre=rs.getString(2),pNombre="",sNombre="";
                    for(int i=0;i<nombre.length();i++){
                        char caracter=nombre.charAt(i);
                        if(caracter!=' '&&contador==0){
                            pNombre+=caracter;}
                        else{
                            contador=1;
                            sNombre+=caracter;}}
                    if(!"".equals(sNombre)){
                        if(sNombre.charAt(0)==' '){
                            sNombre=sNombre.replace(" ","");}}
                    String pApellido=rs.getString(3);
                    String sApellido=rs.getString(4);
                    if(aComparar.compareToIgnoreCase(pNombre)==0||aComparar.compareToIgnoreCase(sNombre)==0||aComparar.compareToIgnoreCase(pApellido)==0||aComparar.compareToIgnoreCase(sApellido)==0){
                        JOptionPane.showMessageDialog(null,"Error en la Contraseña ingresada. No puede ser\nsu Nombre, Primer Apellido o Segundo Apellido.","Error",JOptionPane.ERROR_MESSAGE,error);
                        txtcontranueva.setText("");
                        txtcontranueva.requestFocus();}
                    else{
                        //ENCRIPTAMOS LA CONTRASEÑA
                        Encriptar_Desencriptar ed=new Encriptar_Desencriptar();
                        String contraNueva=ed.Encriptar(txtcontranueva.getText());
                        String respuesta=txtrespuesta.getText();
                        //CREAMOS UN OBJETO DE LA CLASEUSUARIOS
                        ClaseUsuarios cu=new ClaseUsuarios();
                        cu.ActualizarContrasena(identificacion,contraNueva,1,respuesta);
                        JOptionPane.showMessageDialog(null,"Registros Actualizados con Exito.","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
                        this.dispose();
                        InicioSesion inicio=new InicioSesion();
                        inicio.setVisible(true);}}}
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error en los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
    /**
     * MÉTODO QUE VALIDA LETRAS
     * @param a que contiene un JTextField
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void Letras(final JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent KE){
                char c=KE.getKeyChar();
                if(!Character.isLetter(c)){//AQUÍ ESTOY COMPARANDO SI ES UNA LETRA
                    KE.consume();}}});}//ANULA EVENTOS DEL TECLADO
    /**
     * MÉTODO QUE VALIDA LETRAS Y NÚMEROS
     * @param a que contiene un JTextField
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void LetrasyNumeros(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent KE){
                char c=KE.getKeyChar();
                if(!Character.isLetterOrDigit(c)){//AQUÍ ESTOY COMPARANDO QUE SEAN LETRAS Y NÚMEROS SOLAMENTE
                    KE.consume();}}});}//ANULA EVENTOS DEL TECLADO 
    /**
     * MÉTODO PARA DAR FORMATO ESPECIAL
     * @param texto que contiene un String que sera Validado
     * @return un dato tipo Booleano
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    protected static boolean Formato(String texto){
    	boolean valido=false;
    	Pattern patron=Pattern.compile("(\\D{1,10})(\\d{1,5})");
    	Matcher mTarje=patron.matcher(texto.toLowerCase());
    	if(mTarje.matches()){
            valido=true;}
        return valido;}
    /**
     * MÉTODO QUE VALIDA SI RESPUESTA ES UN NÚMERO
     * @param Respuesta que contiene un String que sera Analizado
     * @return un dato tipo Booleano
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private static boolean EsNumero(String Respuesta){
        try{
            Integer.parseInt(Respuesta);
            return true;}
        catch(NumberFormatException e){
           return false;}}
    /**
     * MÉTODO QUE VALIDA SI CARACTER ES UN NÚMERO
     * @param Caracter que contiene un Caracter que sera Analizado
     * @return un dato tipo Booleano
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private static boolean EsNumero2(char Caracter){
        try{
            Integer.parseInt(String.valueOf(Caracter));
            return true;}
        catch(NumberFormatException e){
           return false;}}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CambioContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new CambioContrasena().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnguardar;
    private javax.swing.JLabel lblcontranueva;
    private javax.swing.JLabel lblespe1;
    private javax.swing.JLabel lblespe2;
    private javax.swing.JLabel lblespe3;
    private javax.swing.JLabel lblespe4;
    private javax.swing.JLabel lblespe5;
    private javax.swing.JLabel lblespe6;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblpregunta;
    private javax.swing.JLabel lblrespuesta;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel pfondo;
    private javax.swing.JTextField txtcontranueva;
    private javax.swing.JTextField txtrespuesta;
    // End of variables declaration//GEN-END:variables
}
