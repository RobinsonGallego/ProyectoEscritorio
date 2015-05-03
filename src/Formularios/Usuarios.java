package Formularios;
//LIBRERÍAS
import Clases.ClaseUsuarios;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Usuarios extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    //CONSTRUCTOR
    public Usuarios(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Usuarios Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        lblid.setVisible(false);
        cbidentificacion.requestFocus();
        //VALIDACIONES LETRAS
        Letras(txtusuario);
        Iniciar();}
    //MÉTODO INICIAR
    private void Iniciar(){
        //LIMPIAMOS COMBOBOX
        cbidentificacion.removeAllItems();
        //PONEMOS UN ITEM POR DEFECTO
        cbidentificacion.addItem("");
        //CREAMOS OBJETO CLASEUSUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        //LLAMAMOS MÉTODO PARA LLENAR COMBOBOX
        cu.LlenarIdentificaciones(cbidentificacion);}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpfondo = new javax.swing.JPanel();
        lblidentificacion = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        lblpreguntasecreta = new javax.swing.JLabel();
        lblcontrasena = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        lblperfil = new javax.swing.JLabel();
        lblmensaje = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        cbidentificacion = new javax.swing.JComboBox();
        txtnombrecompleto = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        cbpreguntasecreta = new javax.swing.JComboBox();
        txtcontrasena = new javax.swing.JTextField();
        cbestado = new javax.swing.JComboBox();
        cbperfil = new javax.swing.JComboBox();
        btnguardar = new org.edisoncor.gui.button.ButtonTask();
        btnconsultar = new org.edisoncor.gui.button.ButtonTask();
        btnmodificar = new org.edisoncor.gui.button.ButtonTask();
        btnlistar = new org.edisoncor.gui.button.ButtonTask();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpfondo.setBackground(new java.awt.Color(255, 255, 255));
        jpfondo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblidentificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblidentificacion.setText("Identificación *");

        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnombre.setText("Nombre Completo");

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblusuario.setText("Usuario *");

        lblcorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcorreo.setText("Correo *");

        lblpreguntasecreta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpreguntasecreta.setText("Pregunta Secreta *");

        lblcontrasena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcontrasena.setText("Contraseña *");

        lblestado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblestado.setText("Estado *");

        lblperfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblperfil.setText("Perfil *");

        lblmensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmensaje.setForeground(new java.awt.Color(255, 0, 0));
        lblmensaje.setText("Los campos marcados con el signo (*) son obligatorios");

        cbidentificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbidentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbidentificacionActionPerformed(evt);
            }
        });
        cbidentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbidentificacionKeyTyped(evt);
            }
        });

        txtnombrecompleto.setEditable(false);
        txtnombrecompleto.setBackground(new java.awt.Color(255, 255, 255));
        txtnombrecompleto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnombrecompleto.setForeground(new java.awt.Color(255, 0, 0));
        txtnombrecompleto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnombrecompleto.setBorder(null);

        txtusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });

        txtcorreo.setEditable(false);
        txtcorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtcorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcorreo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtcorreo.setEnabled(false);

        cbpreguntasecreta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbpreguntasecreta.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "¿Cuál es segundo Apellido de su mamá?", "¿Cuál es su color favorito?", "¿Cuál es nombre de su Abuela?", "¿Quién le enseño las vocales?", "¿Cuántos hijos tiene?", "¿Cuál es su pelicula favorita?", "¿Cuál es el color de sus ojos?" }));

        txtcontrasena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcontrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontrasenaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontrasenaKeyTyped(evt);
            }
        });

        cbestado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"","Activo","Inactivo"}));
        cbestado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbestadoKeyTyped(evt);
            }
        });

        cbperfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbperfilKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpfondoLayout = new javax.swing.GroupLayout(jpfondo);
        jpfondo.setLayout(jpfondoLayout);
        jpfondoLayout.setHorizontalGroup(
            jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpfondoLayout.createSequentialGroup()
                        .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpreguntasecreta)
                            .addComponent(lblidentificacion)
                            .addComponent(lblcorreo)
                            .addComponent(lblusuario)
                            .addComponent(lblcontrasena)
                            .addComponent(lblnombre))
                        .addGap(18, 18, 18)
                        .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbpreguntasecreta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpfondoLayout.createSequentialGroup()
                                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbperfil, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                                        .addComponent(txtcontrasena, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpfondoLayout.createSequentialGroup()
                                        .addComponent(cbidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtnombrecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 16, Short.MAX_VALUE))))
                    .addComponent(lblestado)
                    .addComponent(lblperfil)
                    .addGroup(jpfondoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpfondoLayout.setVerticalGroup(
            jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblidentificacion)
                        .addComponent(cbidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombrecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre))
                .addGap(18, 18, 18)
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusuario)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcorreo)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpreguntasecreta)
                    .addComponent(cbpreguntasecreta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontrasena)
                    .addComponent(txtcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblestado)
                    .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblperfil)
                    .addComponent(cbperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblmensaje))
        );

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar2_opt.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnguardar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnguardar.setDescription("Save");

        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png"))); // NOI18N
        btnconsultar.setText("Consultar");
        btnconsultar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnconsultar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnconsultar.setDescription("Consult");

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnmodificar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificar.setDescription("Edit");

        btnlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar.png"))); // NOI18N
        btnlistar.setText("Listar");
        btnlistar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnlistar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlistar.setDescription("List");

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar2_opt.png"))); // NOI18N
        btnregresar.setText("Regresar");
        btnregresar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnregresar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregresar.setDescription("Return");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ACCIÓN DEL COMBOBOX IDENTIFICACIONES
    private void cbidentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbidentificacionActionPerformed
        lblid.setText((String)cbidentificacion.getSelectedItem());
        if(!"".equals(lblid.getText())){
            long identificacion=Long.parseLong(lblid.getText());  
            //CREAMOS OBJETO CLASEUSUARIOS
            ClaseUsuarios cu=new ClaseUsuarios();
            //LLAMAMOS MÉTODO PARA LLENAR COMBOBOX
            ResultSet rs=cu.Buscar(identificacion);
            try{
                if(rs.next()){
                    txtnombrecompleto.setText(rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
                    txtcorreo.setText(rs.getString(12));}}
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
        else{
            txtnombrecompleto.setText("");
            txtcorreo.setText("");}
    }//GEN-LAST:event_cbidentificacionActionPerformed
    //LIMITACIONES Y TRANSFERENCIA DE FOCUS
    private void cbidentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbidentificacionKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbidentificacion){
            if(Contador==10){
                txtusuario.requestFocus();}}
    }//GEN-LAST:event_cbidentificacionKeyTyped

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        if(txtusuario.getText().length()==10){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtusuario){
            if(Contador==10){
                cbpreguntasecreta.requestFocus();}}
    }//GEN-LAST:event_txtusuarioKeyTyped
    //CONVERTIR MAYÚSCULAS A MINÚSCULAS
    private void txtusuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyReleased
        Minusculas(txtusuario);
    }//GEN-LAST:event_txtusuarioKeyReleased

    private void txtcontrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontrasenaKeyTyped
        if(txtcontrasena.getText().length()==15){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtcontrasena){
            if(Contador==10){
                cbestado.requestFocus();}}
    }//GEN-LAST:event_txtcontrasenaKeyTyped

    private void cbestadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbestadoKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbestado){
            if(Contador==10){
                cbperfil.requestFocus();}}
    }//GEN-LAST:event_cbestadoKeyTyped

    private void cbperfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbperfilKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbperfil){
            if(Contador==10){
                btnguardar.requestFocus();}}
    }//GEN-LAST:event_cbperfilKeyTyped
    //CONVERTIR MAYÚSCULAS A MINÚSCULAS
    private void txtcontrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontrasenaKeyReleased
        Minusculas(txtcontrasena);
    }//GEN-LAST:event_txtcontrasenaKeyReleased
    //MÉTODO QUE VALIDA LETRAS
    private void Letras(final JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent KE){
                char c=KE.getKeyChar();
                if(Character.isDigit(c)){//AQUÍ ESTOY COMPARANDO SI ES UN NÚMERO
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();}}});//ANULA EVENTOS DEL TECLADO
    }
    //MÉTODO PARA CONVERTIR MAYÚSCULAS A MINÚSCULAS
    private void Minusculas(javax.swing.JTextField txt){
        String texto=(txt.getText().toLowerCase());
        txt.setText(texto);
    }
    //MÉTODO MAIN
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Usuarios().setVisible(true);}});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnconsultar;
    private org.edisoncor.gui.button.ButtonTask btnguardar;
    private org.edisoncor.gui.button.ButtonTask btnlistar;
    private org.edisoncor.gui.button.ButtonTask btnmodificar;
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JComboBox cbestado;
    private javax.swing.JComboBox cbidentificacion;
    private javax.swing.JComboBox cbperfil;
    private javax.swing.JComboBox cbpreguntasecreta;
    private javax.swing.JPanel jpfondo;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblidentificacion;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblperfil;
    private javax.swing.JLabel lblpreguntasecreta;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTextField txtcontrasena;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombrecompleto;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
