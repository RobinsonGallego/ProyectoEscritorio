package Formularios;
//LIBRERÍAS IMPORTADAS
import Clases.ClaseUsuarios;
import Clases.Encriptar_Desencriptar;
import Clases.EnviarMail;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RecuperarContrasena extends javax.swing.JFrame{
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    int contadorerror=0;
    //CONSTRUCTOR
    public RecuperarContrasena(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Recuperar Contraseña");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        lblusuario.setVisible(false);
        lblrespubd.setVisible(false);
        lblcontrasena.setVisible(false);
        ImageIcon logo=new ImageIcon("src/Imagenes/recuperar contraseña.png");//CREAMOS UN OBJETO IMAGEICON PARA LLAMAR LA IMAGEN
        Icon icono=new ImageIcon(logo.getImage().getScaledInstance(lblimagen.getWidth(),lblimagen.getHeight(),Image.SCALE_DEFAULT));//CONVERTIMOS LA IMAGEN EN ICONO CON LAS MEDIDAS DEL JLABEL
        lblimagen.setIcon(icono);//CAPTURAMOS LA IMAGEN EN EL JLABEL
        String texto="<html>Correo\nEléctronico</html>";
        lblcorreo.setText(texto);
        Letras(txtrespuesta);
        txtrespuesta.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        lblimagen = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        lblpregunta = new javax.swing.JLabel();
        lblrespuesta = new javax.swing.JLabel();
        txtrespuesta = new javax.swing.JTextField();
        btnmodificar = new javax.swing.JButton();
        lblrespubd = new javax.swing.JLabel();
        btnenviar = new org.edisoncor.gui.button.ButtonTask();
        btncancelar = new org.edisoncor.gui.button.ButtonTask();
        lblcontrasena = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(245, 245, 245));

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltitulo.setText("Recuperación de Contraseña");

        lblcorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtcorreo.setEditable(false);
        txtcorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtcorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoKeyTyped(evt);
            }
        });

        lblpregunta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpregunta.setForeground(new java.awt.Color(255, 0, 0));

        lblrespuesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblrespuesta.setText("Respuesta");

        txtrespuesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtrespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrespuestaKeyTyped(evt);
            }
        });

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar_opt.png"))); // NOI18N
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        btnmodificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnmodificarKeyTyped(evt);
            }
        });

        lblrespubd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnenviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enviar_opt.png"))); // NOI18N
        btnenviar.setText("Enviar");
        btnenviar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnenviar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnenviar.setDescription("Send");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });
        btnenviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnenviarKeyTyped(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar_opt.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btncancelar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancelar.setDescription("Cancel");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        btncancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btncancelarKeyTyped(evt);
            }
        });

        lblcontrasena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblrespubd, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(lblimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addComponent(lblcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblpregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addComponent(lblrespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtrespuesta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addComponent(btnenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbltitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblrespubd, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltitulo)
                            .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblrespuesta)
                            .addComponent(txtrespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
    /**
     * MÉTODO PREGUNTA QUE CONTIENE UN USUARIO
     * @param rs que contiene un objeto ResultSet con la información del Usuario
     */
    public void Pregunta(ResultSet rs){
        try{
            lblusuario.setText(rs.getString(2));
            txtcorreo.setText(rs.getString(4));
            lblpregunta.setText(rs.getString(5));
            lblrespubd.setText(rs.getString(10));
            lblcontrasena.setText(rs.getString(6));}
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
    }
    //LIMITACIÓN Y TRASNFERENCIA DE FOCUS
    private void txtrespuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrespuestaKeyTyped
        if(txtrespuesta.getText().length()==30){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtrespuesta){
            if(Contador==10){
                btnenviar.requestFocus();}}
        //MÉTODO PARA PONER MAYÚSCULA INICIAL
        JTextField txtrespu=(JTextField)evt.getComponent();
        String texto=txtrespu.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtrespuesta.setText(texto);}
    }//GEN-LAST:event_txtrespuestaKeyTyped
    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyTyped
        if(txtcorreo.getText().length()==70){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtcorreo){
            if(Contador==10){
                txtrespuesta.requestFocus();}}
    }//GEN-LAST:event_txtcorreoKeyTyped
    //ACCIÓN DEL BOTÓN MODIFICAR CORREO CON CLIC
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        txtcorreo.setEditable(true);
        txtcorreo.requestFocus();
    }//GEN-LAST:event_btnmodificarActionPerformed
    //ACCIÓN DEL BOTÓN MODIFICAR CORREO CON TECLADO
    private void btnmodificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnmodificarKeyTyped
        txtcorreo.setEditable(true);
        txtcorreo.requestFocus();
    }//GEN-LAST:event_btnmodificarKeyTyped
    //ACCIÓN DEL BOTÓN ENVIAR CON CLIC
    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
        AccionEnviar();
    }//GEN-LAST:event_btnenviarActionPerformed
    //ACCIÓN DEL BOTÓN ENVIAR CON TECLADO
    private void btnenviarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnenviarKeyTyped
        AccionEnviar();
    }//GEN-LAST:event_btnenviarKeyTyped
    //ACCIÓN DEL BOTÓN CANCELAR CON CLIC
    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        Salir();
    }//GEN-LAST:event_btncancelarActionPerformed
    //ACCIÓN DEL BOTÓN CANCELAR CON TECLADO
    private void btncancelarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncancelarKeyTyped
        Salir();
    }//GEN-LAST:event_btncancelarKeyTyped
    /**
     * MÉTODO PARA ENVIAR CORREO CON LA CONTRASEÑA
     */
    private void AccionEnviar(){
        if(txtcorreo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtcorreo.requestFocus();}
        else if(EsNumero(String.valueOf(txtcorreo.getText().charAt(0)))==true){
            JOptionPane.showMessageDialog(null,"El Correo esta mal ingresado","Validación",JOptionPane.ERROR_MESSAGE,error);
            txtcorreo.requestFocus();
            txtcorreo.setText("");}
        else if(esMail(txtcorreo.getText())==false){
            JOptionPane.showMessageDialog(null,"El Correo esta mal ingresado","Validación",JOptionPane.ERROR_MESSAGE,error);
            txtcorreo.requestFocus();}
        else if(txtrespuesta.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir la Respuesta a la Pregunta realizada.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtrespuesta.requestFocus();}
        else if(String.valueOf(txtrespuesta.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"La Respuesta no puede iniciar con espacio en blanco.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtrespuesta.requestFocus();
            txtrespuesta.setText("");}
        else if(txtrespuesta.getText().equals(lblrespubd.getText())){
            String correoUsuario="shyourhospital@gmail.com";
            String password="cjxlxdvgxpyhahcw";//Shyourhospital123
            String destinatario=txtcorreo.getText();
            String asunto="Recuperación Contraseña Your Hospital";
            //DESENCRIPTAMOS LA CONTRASEÑA
            Encriptar_Desencriptar ed=new Encriptar_Desencriptar();
            String contra=ed.Desencriptar(lblcontrasena.getText());
            String mensaje="Su contraseña actual para ingresar al Sistema Hospitalario Your Hospital es "+contra;
            EnviarMail em=new EnviarMail(correoUsuario,password,destinatario,asunto,mensaje);
            if(em.sendMail()){
                JOptionPane.showMessageDialog(null,"Mensaje enviado con Exito.\nPor favor, verifique en su correo de Destino.","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
                Salir();}
            else{
                JOptionPane.showMessageDialog(null,"El mensaje no fue enviado.","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);}}
        else{
            JOptionPane.showMessageDialog(null,"La Respuesta no coincide con la Base de Datos.","Verificación",JOptionPane.ERROR_MESSAGE,error);
            txtrespuesta.setText("");
            txtrespuesta.requestFocus();
            contadorerror++;}
        if(contadorerror==3){
            long identificacion=Long.parseLong(lblusuario.getText());
            //CREAMOS UN OBJETO DE LA CLASEUSUARIOS
            ClaseUsuarios cu=new ClaseUsuarios();
            cu.ModificarEstado(identificacion,"Inactivo");
            JOptionPane.showMessageDialog(null,"El Usuario ha sido bloqueado, por número de intentos fallidos.\nPor favor comuniquese con el Personal de Sistemas para ser Desbloqueado.","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
            Salir();
        }
    }
    /**
     * MÉTODO SALIR DE LA VENTANA
     */
    private void Salir(){
        this.dispose();
        InicioSesion inicio=new InicioSesion();
        inicio.setVisible(true);}
    /**
     * MÉTODO PARA VALIDAR UN EMAIL
     * @param correo que contiene un String con un correo
     * @return un dato tipo Booleano informando si el correo es o no correcto
     */
    protected static boolean esMail(String correo){
        boolean correcto=false;
        Pattern patronEmail=Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcherMail=patronEmail.matcher(correo.toLowerCase());
        if(matcherMail.matches()){
            correcto=true;}
        return correcto;
    }
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
                if(Character.isDigit(c)){//AQUÍ ESTOY COMPARANDO SI ES UN NÚMERO
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();}}});//ANULA EVENTOS DEL TECLADO
    }
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
           return false;}
    }
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
            java.util.logging.Logger.getLogger(RecuperarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new RecuperarContrasena().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btncancelar;
    private org.edisoncor.gui.button.ButtonTask btnenviar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblpregunta;
    private javax.swing.JLabel lblrespubd;
    private javax.swing.JLabel lblrespuesta;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel pfondo;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtrespuesta;
    // End of variables declaration//GEN-END:variables
}
