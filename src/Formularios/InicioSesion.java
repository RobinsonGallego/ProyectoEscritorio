package Formularios;
/**
 * LIBRERÍAS IMPORTADAS
 * @author Robinson Gallego Alzate
 * @version 1.0
 */
import Clases.ClaseUsuarios;
import Clases.Encriptar_Desencriptar;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import proyectoescritorio.SplashInicio;

public class InicioSesion extends javax.swing.JFrame{
    private SplashInicio splashInicio;
    //IMAGENES DE LOS MENSAJES
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    /**
     * MÉTODO PARA ASIGNAR UN VALOR Y TEXTO AL SPLASH
     * @param splashInicio que contiene una Clase SplashInicio
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public InicioSesion(SplashInicio splashInicio){
        this.splashInicio=splashInicio;
        setProgress(0,"Cargando Componentes del Sistema");
        initComponents();
        setProgress(20,"Conectandose a la Base de Datos");
        setProgress(40,"Cargando Módulos");
        setProgress(60,"Módulos Cargados...");
        setProgress(80,"Cargando Interfaces");
        setProgress(90,"Interfaces Cargadas...");
        setProgress(100,"Bienvenido al Sistema");
        setTitle("Inicio Sesión Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Acceso.png")).getImage());//PONER IMAGEN ICONO
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        txtusuario.requestFocus();
        Letras(txtusuario);
    }
    private void setProgress(int percent,String information){
        splashInicio.getJLabel().setText(information);
        splashInicio.getJProgressBar().setValue(percent);
        try{
            Thread.sleep(1500);}//TIEMPO QUE DEMORA EL SISTEMA EN CARGAR
        catch(InterruptedException e){
            JOptionPane.showMessageDialog(null,"No se puedo ejecutar la presentación");}
    }
    /**
     * CONSTRUCTOR InicioSesion
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public InicioSesion(){
        initComponents();
        setTitle("Inicio Sesión Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Acceso.png")).getImage());//PONER IMAGEN ICONO
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        txtusuario.requestFocus();
        Letras(txtusuario);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpiniciosesion = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblcontrasena = new javax.swing.JLabel();
        btningresar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnrecordar = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        jpcontrasena = new javax.swing.JPasswordField();
        lblfondo = new javax.swing.JLabel();
        lblidiomas = new javax.swing.JLabel();
        cbidiomas = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jpiniciosesion.setBackground(new java.awt.Color(255, 255, 255));
        jpiniciosesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(255, 0, 0));
        lbltitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Acceso.png"))); // NOI18N
        lbltitulo.setText("Inicio de Sesión");
        jpiniciosesion.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        lblusuario.setText("Usuario");
        jpiniciosesion.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 70, 27));

        lblcontrasena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcontrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña.png"))); // NOI18N
        lblcontrasena.setText("Contraseña");
        jpiniciosesion.add(lblcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 90, 27));

        btningresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar3a.png"))); // NOI18N
        btningresar.setText("Ingresar");
        btningresar.setMaximumSize(new java.awt.Dimension(113, 25));
        btningresar.setMinimumSize(new java.awt.Dimension(113, 25));
        btningresar.setPreferredSize(new java.awt.Dimension(113, 25));
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        btningresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btningresarKeyTyped(evt);
            }
        });
        jpiniciosesion.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 120, 25));

        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIR.PNG"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setMaximumSize(new java.awt.Dimension(133, 25));
        btnsalir.setMinimumSize(new java.awt.Dimension(133, 25));
        btnsalir.setPreferredSize(new java.awt.Dimension(113, 25));
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        btnsalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnsalirKeyTyped(evt);
            }
        });
        jpiniciosesion.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, 25));

        btnrecordar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnrecordar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recordar2.png"))); // NOI18N
        btnrecordar.setText("Recordar Contraseña");
        btnrecordar.setPreferredSize(new java.awt.Dimension(193, 25));
        btnrecordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecordarActionPerformed(evt);
            }
        });
        jpiniciosesion.add(btnrecordar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 200, 25));

        txtusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtusuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });
        jpiniciosesion.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 130, 27));

        jpcontrasena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jpcontrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        jpcontrasena.setEchoChar('*');
        jpcontrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpcontrasenaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpcontrasenaKeyTyped(evt);
            }
        });
        jpiniciosesion.add(jpcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 130, 27));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hospital.gif"))); // NOI18N
        jpiniciosesion.add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 450, 270));

        lblidiomas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblidiomas.setText("Idiomas");
        jpiniciosesion.add(lblidiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 70, 27));

        cbidiomas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbidiomas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Spanish", "English" }));
        cbidiomas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbidiomasItemStateChanged(evt);
            }
        });
        jpiniciosesion.add(cbidiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 90, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiniciosesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpiniciosesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //INGRESO AL SISTEMA
    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        Ingresar();
    }//GEN-LAST:event_btningresarActionPerformed
    //SALIDA DEL SISTEMA
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed
    //CAMBIO DE IDIOMA
    private void cbidiomasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbidiomasItemStateChanged
        String idioma=cbidiomas.getSelectedItem().toString();
        if(idioma.equals("English")){
            lblusuario.setText("User");
            lblcontrasena.setText("Password");
            btningresar.setText("Log in");
            btnsalir.setText("Exit");
            btnrecordar.setText("Lost Password");
            lbltitulo.setText("Account Login");
            lblidiomas.setText("Languages");
            txtusuario.requestFocus();}
        else{
            lblusuario.setText("Usuario");
            lblcontrasena.setText("Contraseña");
            btningresar.setText("Ingresar");
            btnsalir.setText("Salir");
            btnrecordar.setText("Recordar Contraseña");
            lbltitulo.setText("Inicio Sesión");
            lblidiomas.setText("Idiomas");
            txtusuario.requestFocus();}
    }//GEN-LAST:event_cbidiomasItemStateChanged
    //LIMITACIONES Y TRASFERENCIA DE FOCUS
    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        if(txtusuario.getText().length()==10){
            evt.consume();}//ANULA LAS ACCIONES DEL TECLADO
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtusuario){
            if(Contador==10){
                jpcontrasena.requestFocus();}}
    }//GEN-LAST:event_txtusuarioKeyTyped
    private void jpcontrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpcontrasenaKeyTyped
        if(jpcontrasena.getText().length()==15){
            evt.consume();}//ANULA LAS ACCIONES DEL TECLADO
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==jpcontrasena){
            if(Contador==10){
                btningresar.requestFocus();}}
    }//GEN-LAST:event_jpcontrasenaKeyTyped
    //ACCIÓN DEL BOTÓN INGRESAR
    private void btningresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btningresarKeyTyped
        Ingresar();
    }//GEN-LAST:event_btningresarKeyTyped
    //ACCIÓN DEL BOTÓN SALIR
    private void btnsalirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsalirKeyTyped
        System.exit(0);
    }//GEN-LAST:event_btnsalirKeyTyped
    //CONVERTIR MAYÚSCULAS A MINÚSCULAS
    private void txtusuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyReleased
        Minusculas(txtusuario);
    }//GEN-LAST:event_txtusuarioKeyReleased
    //CONVERTIR MAYÚSCULAS A MINÚSCULAS
    private void jpcontrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpcontrasenaKeyReleased
        Minusculas(jpcontrasena);
    }//GEN-LAST:event_jpcontrasenaKeyReleased
    //ACCIÓN DEL BOTÓN RECUPERAR CONTRASEÑA
    private void btnrecordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecordarActionPerformed
        String respuesta=(String)JOptionPane.showInputDialog(null,"Ingrese el Usuario a Recuperar Contraseña.","Recuperar Contraseña",JOptionPane.QUESTION_MESSAGE,pregunta,null,null);
        if(respuesta==null){
            txtusuario.setText("");
            jpcontrasena.setText("");
            txtusuario.requestFocus();}
        else if(EsNumero(respuesta)){
            JOptionPane.showMessageDialog(null,"Error en el Usuario.\nEl Dato debe ser un texto.","Error",JOptionPane.ERROR_MESSAGE,error);
            txtusuario.setText("");
            jpcontrasena.setText("");
            txtusuario.requestFocus();}
        else{
            //CREAMOS UN OBJETO DE LA CLASE USUARIOS
            ClaseUsuarios cu=new ClaseUsuarios();
            ResultSet rs=cu.BuscarUsuario2(respuesta);
            try{
                if(rs.next()){
                    this.dispose();
                    RecuperarContrasena rc=new RecuperarContrasena();
                    rc.Pregunta(rs);
                    rc.setVisible(true);}
                else{
                    JOptionPane.showMessageDialog(null,"El Usuario ingresado no existe.","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
                    txtusuario.setText("");
                    jpcontrasena.setText("");
                    txtusuario.requestFocus();}}
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
    }//GEN-LAST:event_btnrecordarActionPerformed
    /**
     * MÉTODO PARA INGRESAR AL SISTEMA
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void Ingresar(){
        String user=txtusuario.getText();
        String contrasena=jpcontrasena.getText();
        if(user.equals("")&&contrasena.equals("")){
            JOptionPane.showMessageDialog(null,"Por favor ingrese los Datos.","Error",JOptionPane.ERROR_MESSAGE,error);
            txtusuario.requestFocus();}
        else{
            //CREAMOS UN OBJETO DE LA CLASE USUARIOS
            ClaseUsuarios cu=new ClaseUsuarios();
            ResultSet rs=cu.BuscarUsuario2(user);
            try{
                if(rs.next()){
                    //DESENCRIPTAMOS LA CONTRASEÑA
                    Encriptar_Desencriptar ed=new Encriptar_Desencriptar();
                    String password=rs.getString(6);
                    String passDesencriptado=ed.Desencriptar(rs.getString(6));
                    String estado=rs.getString(7);
                    if(password.equals(contrasena)){
                        if(estado.equals("Activo")){
                            int cambio=rs.getInt(9);
                            if(cambio==0){
                                int cambiocontra=JOptionPane.showOptionDialog(null,"Usted es un Usuario Nuevo. Por favor modifique su Contraseña.","Usuario Nuevo",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,informacion,null,null);
                                if(cambiocontra==0){
                                    this.dispose();
                                    CambioContrasena cc=new CambioContrasena();
                                    cc.Pregunta(rs);
                                    cc.setVisible(true);}
                                else{
                                    JOptionPane.showMessageDialog(null,"Debe actualizar la contraseña para ingresar al Sistema.","Error",JOptionPane.ERROR_MESSAGE,error);
                                    txtusuario.setText("");
                                    jpcontrasena.setText("");
                                    txtusuario.requestFocus();}}
                            else{
                                this.dispose();
                                Menu menu=new Menu();
                                menu.setText(user);
                                menu.setVisible(true);}}
                        else{
                            JOptionPane.showMessageDialog(null,"El Usuario ingresado no esta Activo.","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
                            txtusuario.setText("");
                            jpcontrasena.setText("");
                            txtusuario.requestFocus();}}
                    else if(passDesencriptado.equals(contrasena)){
                        if(estado.equals("Activo")){
                            this.dispose();
                            Menu menu=new Menu();
                            menu.setText(user);
                            menu.setVisible(true);}
                        else{
                            JOptionPane.showMessageDialog(null,"El Usuario ingresado no esta Activo.","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
                            txtusuario.setText("");
                            jpcontrasena.setText("");
                            txtusuario.requestFocus();}}
                    else{
                        JOptionPane.showMessageDialog(null,"Usuario y/o Contraseña Incorrectos.","Error",JOptionPane.ERROR_MESSAGE,error);
                        txtusuario.setText("");
                        jpcontrasena.setText("");
                        txtusuario.requestFocus();}}
                else{
                    JOptionPane.showMessageDialog(null,"El Usuario ingresado no existe.","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
                    txtusuario.setText("");
                    jpcontrasena.setText("");
                    txtusuario.requestFocus();}}
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
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
     * MÉTODO QUE VALIDA LETRAS
     * @param a que contiene un JTextField
     * @author Robinson Gallego Alzate
     * @version 1.0
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
     * @param Respuesta que contiene un String que sera Analizada
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
     * MÉTODO PRINCIPAL MAIN
     * @param args que contiene un String de arreglos
     * @author Robinson Gallego Alzate
     * @version 1.0
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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new InicioSesion().setVisible(true);}});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnrecordar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox cbidiomas;
    private javax.swing.JPasswordField jpcontrasena;
    private javax.swing.JPanel jpiniciosesion;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblidiomas;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblusuario;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
