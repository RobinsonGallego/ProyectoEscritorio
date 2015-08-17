package Formularios;

import Clases.ClaseUsuarios;
import Clases.Encriptar_Desencriptar;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CambioContraseña extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    /**
     * CONTRUCTOR CAMBIO CONTRASEÑA
     */
    public CambioContraseña(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Cambio Contraseña");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        ImageIcon logo=new ImageIcon("src/Imagenes/candado.png");//CREAMOS UN OBJETO IMAGEICON PARA LLAMAR LA IMAGEN
        Icon icono=new ImageIcon(logo.getImage().getScaledInstance(lblfondo.getWidth(),lblfondo.getHeight(),Image.SCALE_DEFAULT));//CONVERTIMOS LA IMAGEN EN ICONO CON LAS MEDIDAS DEL JLABEL
        lblfondo.setIcon(icono);//CAPTURAMOS LA IMAGEN EN EL JLABEL
        lblusuario.setVisible(false);
        Letras(txtrespuesta);
        Letras(txtcontranueva);
    }
    /**
     * MÉTODO ALTERNO INICIAR
     * @param rs que contiene un objeto ResultSet con la información del Usuario
     */
    public void Pregunta(ResultSet rs){
        try{
            lblusuario.setText(rs.getString(2));
            lblpregunta.setText(rs.getString(5));}
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        lblcontranueva = new javax.swing.JLabel();
        txtcontranueva = new javax.swing.JTextField();
        lblpregunta = new javax.swing.JLabel();
        lblrespuesta = new javax.swing.JLabel();
        txtrespuesta = new javax.swing.JTextField();
        btnaceptar = new org.edisoncor.gui.button.ButtonTask();
        lblfondo = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));

        lblcontranueva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcontranueva.setText("Contraseña Nueva *");

        txtcontranueva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcontranueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontranuevaKeyReleased(evt);
            }
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

        btnaceptar.setText("Aceptar");
        btnaceptar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnaceptar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnaceptar.setDescription("Accept");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });
        btnaceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnaceptarKeyTyped(evt);
            }
        });

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addComponent(lblcontranueva)
                                .addGap(18, 18, 18)
                                .addComponent(txtcontranueva, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addComponent(lblrespuesta)
                                .addGap(65, 65, 65)
                                .addComponent(txtrespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfondoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addComponent(txtcontranueva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblrespuesta))
                            .addComponent(txtrespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblcontranueva)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }//GEN-LAST:event_txtcontranuevaKeyTyped
    private void txtrespuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrespuestaKeyTyped
        if(txtrespuesta.getText().length()==30){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtrespuesta){
            if(Contador==10){
                btnaceptar.requestFocus();}}
        //MÉTODO PARA PONER MAYÚSCULA INICIAL
        JTextField txtrespu=(JTextField)evt.getComponent();
        String texto=txtrespu.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtrespuesta.setText(texto);}
    }//GEN-LAST:event_txtrespuestaKeyTyped
    //CONVERTIR MAYÚSCULAS A MINÚSCULAS
    private void txtcontranuevaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontranuevaKeyReleased
        Minusculas(txtcontranueva);
    }//GEN-LAST:event_txtcontranuevaKeyReleased
    //ACCIÓN DEL BOTÓN ACEPTAR CON CLIC
    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        Guardar();
    }//GEN-LAST:event_btnaceptarActionPerformed
    //ACCIÓN DEL BOTÓN ACEPTAR CON TECLADO
    private void btnaceptarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnaceptarKeyTyped
        Guardar();
    }//GEN-LAST:event_btnaceptarKeyTyped
    /**
     * MÉTODO PARA GUARDAR LOS DATOS NUEVOS
     */
    private void Guardar(){
        if(txtcontranueva.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir la Contraseña Nueva.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtcontranueva.requestFocus();}
        else if(txtcontranueva.getText().length()<8){
            JOptionPane.showMessageDialog(null,"La Contraseña debe ser de mínimo 8 caracteres","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtcontranueva.requestFocus();}
        else if(String.valueOf(txtcontranueva.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"La Contraseña no debe iniciar con Espacio en Blanco.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtcontranueva.requestFocus();
            txtcontranueva.setText("");}
        else if(txtrespuesta.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir la respuesta a la pregunta asignada.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtrespuesta.requestFocus();}
        else if(String.valueOf(txtrespuesta.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"La respuesta no debe iniciar con Espacio en Blanco.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtrespuesta.requestFocus();
            txtrespuesta.setText("");}
        else{
            long identificacion=Long.parseLong(lblusuario.getText());
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
            inicio.setVisible(true);}}
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
     * MÉTODO PARA CONVERTIR MAYÚSCULAS A MINÚSCULAS
     * @param txt que contiene un JTextField
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void Minusculas(javax.swing.JTextField txt){
        String texto=(txt.getText().toLowerCase());
        txt.setText(texto);
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
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new CambioContraseña().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnaceptar;
    private javax.swing.JLabel lblcontranueva;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblpregunta;
    private javax.swing.JLabel lblrespuesta;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel pfondo;
    private javax.swing.JTextField txtcontranueva;
    private javax.swing.JTextField txtrespuesta;
    // End of variables declaration//GEN-END:variables
}
