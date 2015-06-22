package Formularios;
/**
 * LIBRERÍAS IMPORTADAS
 * @author Robinson Gallego Alzate
 * @version 1.1
 */
import Clases.ClasePerfiles;
import Clases.ClasePersonalMedico;
import Clases.ClaseUsuarios;
import Clases.Encriptar_Desencriptar;
import Tablas.TablaUsuarios;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
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
    /**
     * CONSTRUCTOR Usuarios
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public Usuarios(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Usuarios Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        txtnombrecompleto.setBorder(BorderFactory.createLineBorder(Color.white));
        lblid.setVisible(false);
        lblmenscontrasena.setVisible(false);
        cbidentificacion.requestFocus();
        //VALIDACIONES LETRAS
        Letras(txtusuario);
        Iniciar();
    }
    /**
     * MÉTODO ALTERNATIVO INICIAR
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void Iniciar(){
        //LIMPIAMOS COMBOBOX
        cbidentificacion.removeAllItems();
        cbperfil.removeAllItems();
        //PONEMOS UN ITEM POR DEFECTO
        cbidentificacion.addItem("");
        cbperfil.addItem("");
        //CREAMOS OBJETO CLASEUSUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        ClaseUsuarios cu2=new ClaseUsuarios();
        //LLAMAMOS MÉTODO PARA LLENAR COMBOBOX
        cu.LlenarIdentificaciones(cbidentificacion);
        cu2.LlenarPerfiles(cbperfil);}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pusuario = new javax.swing.JPanel();
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
        lblmenscontrasena = new javax.swing.JLabel();
        btnguardar = new org.edisoncor.gui.button.ButtonTask();
        btnconsultar = new org.edisoncor.gui.button.ButtonTask();
        btnmodificar = new org.edisoncor.gui.button.ButtonTask();
        btnlistar = new org.edisoncor.gui.button.ButtonTask();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pusuario.setBackground(new java.awt.Color(255, 255, 255));
        pusuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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

        lblmenscontrasena.setBackground(new java.awt.Color(255, 255, 255));
        lblmenscontrasena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmenscontrasena.setForeground(new java.awt.Color(255, 0, 0));
        lblmenscontrasena.setText("Contraseña Encriptada");

        javax.swing.GroupLayout pusuarioLayout = new javax.swing.GroupLayout(pusuario);
        pusuario.setLayout(pusuarioLayout);
        pusuarioLayout.setHorizontalGroup(
            pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pusuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pusuarioLayout.createSequentialGroup()
                        .addGroup(pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpreguntasecreta)
                            .addComponent(lblidentificacion)
                            .addComponent(lblcorreo)
                            .addComponent(lblusuario)
                            .addComponent(lblcontrasena)
                            .addComponent(lblnombre))
                        .addGap(18, 18, 18)
                        .addGroup(pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pusuarioLayout.createSequentialGroup()
                                .addComponent(txtcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblmenscontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pusuarioLayout.createSequentialGroup()
                                .addComponent(cbidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtnombrecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbpreguntasecreta, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblestado)
                    .addComponent(lblperfil)
                    .addGroup(pusuarioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pusuarioLayout.setVerticalGroup(
            pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pusuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblidentificacion)
                        .addComponent(cbidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombrecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre))
                .addGap(18, 18, 18)
                .addGroup(pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusuario)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcorreo)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpreguntasecreta)
                    .addComponent(cbpreguntasecreta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontrasena)
                    .addComponent(txtcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmenscontrasena))
                .addGap(18, 18, 18)
                .addGroup(pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblestado)
                    .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png"))); // NOI18N
        btnconsultar.setText("Consultar");
        btnconsultar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnconsultar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnconsultar.setDescription("Consult");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnmodificar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificar.setDescription("Edit");
        btnmodificar.setEnabled(false);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar.png"))); // NOI18N
        btnlistar.setText("Listar");
        btnlistar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnlistar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlistar.setDescription("List");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar2_opt.png"))); // NOI18N
        btnregresar.setText("Regresar");
        btnregresar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnregresar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregresar.setDescription("Return");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            //CREAMOS OBJETO CLASEPERSONALMEDICO
            ClasePersonalMedico cp=new ClasePersonalMedico();
            //BUSCAMOS LA IDENTIFICACIÓN
            ResultSet rs=cp.Buscar(identificacion);
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
    //ACCIÓN DEL BOTÓN GUARDAR
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if(cbidentificacion.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la Identificación del Usuario","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbidentificacion.requestFocus();}
        else if(txtusuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Usuario","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtusuario.requestFocus();}
        else if(String.valueOf(txtusuario.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Usuario no debe iniciar con Espacio en Blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtusuario.requestFocus();
            txtusuario.setText("");}
        else if(cbpreguntasecreta.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la Pregunta Secreta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbpreguntasecreta.requestFocus();}
        else if(txtcontrasena.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir la Contraseña","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtcontrasena.requestFocus();}
        else if(String.valueOf(txtcontrasena.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"La Contraseña no debe iniciar con Espacio en Blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtcontrasena.requestFocus();
            txtcontrasena.setText("");}
        else if(cbestado.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Usuario","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbestado.requestFocus();}
        else if(cbperfil.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar un Perfil para el Usuario","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbperfil.requestFocus();}
        else{
            Guardar();}
    }//GEN-LAST:event_btnguardarActionPerformed
    //ACCIÓN DEL BOTÓN CONSULTAR
    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        switch(btnconsultar.getText()){
            case "Consultar":
                String respuesta=((String)JOptionPane.showInputDialog(null,"Ingrese la Identificación que desea Consultar","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null));
                if(respuesta==null){
                    cbidentificacion.requestFocus();}
                else if(!EsNumero(respuesta)){
                    JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar.\nEl Dato debe ser un número de Identificación.","Error",JOptionPane.ERROR_MESSAGE,error);
                    cbidentificacion.requestFocus();}
                else{
                    long identificacion=Long.parseLong(respuesta);
                    //CREAMOS UN OBJETO DE LA CLASEUSUARIOS
                    ClaseUsuarios cu=new ClaseUsuarios();
                    //HACEMOS UNA BUSQUEDA PARA VER QUE ESTA IDENTIFICACIÓN NO TENGA USUARIO ASIGNADO
                    ResultSet rs=cu.BuscarUsuario(identificacion);
                    //VALIDAMOS
                    try{
                        if(rs.next()){
                            //ACTIVAMOS LOS BOTONES QUE ESTÁN INACTIVOS
                            btnmodificar.setEnabled(true);
                            btnguardar.setEnabled(false);
                            //DESACTIVAMOS LOS CAMPOS DE ESCRITURA
                            Inhabilitar();
                            //CAPTURAMOS LA INFORMACIÓN EN LAS CAJAS
                            cbidentificacion.setSelectedItem(rs.getString(2));
                            txtusuario.setText(rs.getString(3));
                            txtcorreo.setText(rs.getString(4));
                            cbpreguntasecreta.setSelectedItem(rs.getString(5));
                            //ENCRIPTAMOS LA CONTRASEÑA
                            String contra=rs.getString(6);
                            Encriptar_Desencriptar ed=new Encriptar_Desencriptar();
                            txtcontrasena.setText(ed.Encriptar(contra));
                            lblmenscontrasena.setVisible(true);
                            cbestado.setSelectedItem(rs.getString(7));
                            //TRANSFORMAMOS EL DATO DEL PERFIL
                            int codigoPerfil=Integer.parseInt(rs.getString(8));
                            //CREAMOS UN OBJETO DE LA CLASEPERFILES
                            ClasePerfiles cp=new ClasePerfiles();
                            ResultSet rs2=cp.Buscar(codigoPerfil);
                            try{
                                if(rs2.next()){
                                    cbperfil.setSelectedItem(rs2.getString(2));}}
                            catch(SQLException e){
                                JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
                            btnconsultar.setText("Limpiar");
                            btnconsultar.setDescription("Clean");
                            btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));}
                        else{
                            Habilitar();
                            Limpiar();
                            JOptionPane.showMessageDialog(null,"La Identificación buscada no tiene Usuario asignado","Información",JOptionPane.INFORMATION_MESSAGE,informacion);}}
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
                break;
            case "Limpiar":
                Limpiar();
                Habilitar();
                btnconsultar.setText("Consultar");
                btnconsultar.setDescription("Consult");
                btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
                btnguardar.setEnabled(true);
                btnmodificar.setEnabled(false);
                btnmodificar.setText("Modificar");
                btnmodificar.setDescription("Edit");
                btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png")));
                btnmodificar.setEnabled(false);
                break;}
    }//GEN-LAST:event_btnconsultarActionPerformed
    //ACCIÓN DEL BOTÓN MODIFICAR
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        //HABILITAMOS EL CAMPO QUE SE MODIFICARA
        cbestado.setEnabled(true);
        cbestado.requestFocus();
        lblmenscontrasena.setVisible(false);
        //DESACTIVAMOS LOS BOTONES
        btnguardar.setEnabled(false);
        btnconsultar.setText("Limpiar");
        btnconsultar.setDescription("Clean");
        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));
        if(btnmodificar.getText().equals("Modificar")){
            btnmodificar.setText("Actualizar");
            btnmodificar.setDescription("Update");
            btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar2_opt.png")));}
        else{
            if(cbestado.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Usuario","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbestado.requestFocus();}
            else{
                Actualizar();}}
    }//GEN-LAST:event_btnmodificarActionPerformed
    //ACCIÓN DEL BOTÓN REGRESAR
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        Menu menu=new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed
    //ACCIÓN DEL BOTÓN LISTAR
    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        this.dispose();
        TablaUsuarios tu=new TablaUsuarios();
        tu.setVisible(true);
    }//GEN-LAST:event_btnlistarActionPerformed
    /**
     * MÉTODO PARA GUARDAR USUARIO
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void Guardar(){
        //CREAMOS UN OBJETO DE LA CLASEUSUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        //CAPTURAMOS LOS DATOS
        long identificacion=Long.parseLong((String)cbidentificacion.getSelectedItem());
        //HACEMOS UNA BUSQUEDA PARA VER QUE ESTA IDENTIFICACIÓN NO TENGA USUARIO ASIGNADO
        ResultSet rs=cu.BuscarUsuario(identificacion);
        //VALIDAMOS
        try{
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"La Identificación ya tiene Usuario asignado.","Error",JOptionPane.ERROR_MESSAGE,error);
                Limpiar();}
            else{
                String usuario=txtusuario.getText();
                String correo=txtcorreo.getText();
                String preguntasecre=(String)cbpreguntasecreta.getSelectedItem();
                String contrasena=txtcontrasena.getText();
                String estado=(String)cbestado.getSelectedItem();
                String perfil=(String)cbperfil.getSelectedItem();
                cu.Guardar(identificacion,usuario,correo,preguntasecre,contrasena,estado,perfil);
                JOptionPane.showMessageDialog(null,"Registro guardado con Exito.","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
                Limpiar();}}
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
    }
    /**
     * MÉTODO PARA ACTUALIZAR USUARIO
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void Actualizar(){
        //CREAMOS UN OBJETO DE LA CLASEUSUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        //CAPTURAMOS LOS DATOS
        long identificacion=Long.parseLong((String)cbidentificacion.getSelectedItem());
        String usuario=txtusuario.getText();
        String correo=txtcorreo.getText();
        String preguntasecre=(String)cbpreguntasecreta.getSelectedItem();
        //DESENCRIPTAMOS LA CONTRASEÑA
        Encriptar_Desencriptar ed=new Encriptar_Desencriptar();
        String contrasena=(ed.Desencriptar(txtcontrasena.getText()));
        String estado=(String)cbestado.getSelectedItem();
        String perfil=(String)cbperfil.getSelectedItem();
        cu.Actualizar(identificacion,usuario,correo,preguntasecre,contrasena,estado,perfil);
        Limpiar();
        JOptionPane.showMessageDialog(null,"Registro Actualizado con Exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
        btnconsultar.setText("Consultar");
        btnconsultar.setDescription("Consult");
        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
        btnguardar.setEnabled(true);
        btnmodificar.setEnabled(false);
        btnmodificar.setText("Modificar");
        btnmodificar.setDescription("Edit");
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png")));
        btnmodificar.setEnabled(false);
        Habilitar();
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
     * @param Respuesta que contiene un String que sera evaluado
     * @return un dato tipo Booleano
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private static boolean EsNumero(String Respuesta){
        try{
            Integer.parseInt(Respuesta);
            return true;}
        catch(NumberFormatException e){
           return false;}
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
     * MÉTODO LIMPIAR
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void Limpiar(){
        cbidentificacion.setSelectedItem("");
        txtusuario.setText("");
        cbpreguntasecreta.setSelectedItem("");
        txtcontrasena.setText("");
        lblmenscontrasena.setVisible(false);
        cbestado.setSelectedItem("");
        cbperfil.setSelectedItem("");
        cbidentificacion.requestFocus();
    }
    /**
     * MÉTODO INHABILITAR
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void Inhabilitar(){
        cbidentificacion.setEnabled(false);
        txtnombrecompleto.setEnabled(false);
        txtusuario.setEnabled(false);
        txtcorreo.setEnabled(false);
        txtcorreo.setDisabledTextColor(new Color(145,145,145));
        cbpreguntasecreta.setEnabled(false);
        txtcontrasena.setEnabled(false);
        cbestado.setEnabled(false);
        cbperfil.setEnabled(false);
    }
    /**
     * MÉTODO HABILITAR
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void Habilitar(){
        cbidentificacion.setEnabled(true);
        cbidentificacion.requestFocus();
        txtnombrecompleto.setEnabled(true);
        txtusuario.setEnabled(true);
        txtcorreo.setEnabled(true);
        cbpreguntasecreta.setEnabled(true);
        txtcontrasena.setEnabled(true);
        cbestado.setEnabled(true);
        cbperfil.setEnabled(true);
    }
    /**
     * MÉTODO PRINCIPAL MAIN
     * @param args que contiene un String de arreglos
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
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
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblidentificacion;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblmenscontrasena;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblperfil;
    private javax.swing.JLabel lblpreguntasecreta;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel pusuario;
    private javax.swing.JTextField txtcontrasena;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombrecompleto;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
