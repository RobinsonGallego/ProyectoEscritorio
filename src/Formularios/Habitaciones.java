package Formularios;

import Clases.ClaseHabitaciones;
import Clases.ClasePerfiles;
import Clases.ClaseUsuarios;
import Tablas.TablaHabitaciones;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Habitaciones extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    public Habitaciones(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Habitaciones");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        lblusuario.setVisible(false);
        Numeros(txtnumhabitacion);
        Numeros(txtpiso);
        Numeros(txtnumcamas);
        Iniciar();
    }
    /**
     * MÉTODO QUE CAPTURA EL USUARIO QUE INGRESO Y APLICA SU PERFIL
     * @param user que contiene un String para recibido del Menú
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void setText(String user){
        Perfil(user);
        lblusuario.setText(user);}
    /**
     * MÉTODO PERFILES
     * @param usuario que contiene un String para ser Buscado
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void Perfil(String usuario){
        //CREAMOS UN OBJETO DE LA CLASE USUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        ResultSet rs=cu.BuscarUsuario2(usuario);
        try{
            if(rs.next()){                
                //TRANSFORMAMOS EL DATO DEL PERFIL
                int codigoPerfil=Integer.parseInt(rs.getString(8));
                //CREAMOS UN OBJETO DE LA CLASEPERFILES
                ClasePerfiles cp=new ClasePerfiles();
                ResultSet rs2=cp.Buscar(codigoPerfil);
                try{
                    if(rs2.next()){
                        String perfil=rs2.getString(2);
                        if(perfil.equals("Administrador")){
                            btnguardar.setEnabled(true);
                            btnconsultar.setEnabled(true);
                            btnlistar.setEnabled(true);
                            btnregresar.setEnabled(true);}
                        else{
                            Inhabilitar();
                            btnguardar.setEnabled(false);
                            btnconsultar.setEnabled(true);
                            btnmodificar.setEnabled(false);
                            btnlistar.setEnabled(false);
                            btnregresar.setEnabled(true);}}}
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
    }
    /**
     * MÉTODO ALTERNO INICIAR
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void Iniciar(){
        txtnumhabitacion.requestFocus();
        //LIMPIAMOS LOS COMBOBOX
        cbtiposervicio.removeAllItems();
        //PONEMOS UN ITEM POR DEFECTO
        cbtiposervicio.addItem("");
        //CREAMOS EL OBJETO CLASEHABITACIONES
        ClaseHabitaciones ch=new ClaseHabitaciones();
        //LLAMAMOS MÉTODO PARA LLENAR COMBOBOX
        ch.LlenarTipoServicio(cbtiposervicio);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        lblidhabitacion = new javax.swing.JLabel();
        lblnumhabitacion = new javax.swing.JLabel();
        lblpiso = new javax.swing.JLabel();
        lbltiposervicio = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        txtnumhabitacion = new javax.swing.JTextField();
        txtidhabitacion = new javax.swing.JTextField();
        txtpiso = new javax.swing.JTextField();
        cbtiposervicio = new javax.swing.JComboBox();
        cbestado = new javax.swing.JComboBox();
        lblmensaje = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblnumcamas = new javax.swing.JLabel();
        txtnumcamas = new javax.swing.JTextField();
        btnguardar = new org.edisoncor.gui.button.ButtonTask();
        btnconsultar = new org.edisoncor.gui.button.ButtonTask();
        btnmodificar = new org.edisoncor.gui.button.ButtonTask();
        btnlistar = new org.edisoncor.gui.button.ButtonTask();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));

        lblidhabitacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblidhabitacion.setText("ID de la Habitación");

        lblnumhabitacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumhabitacion.setText("Número de la Habitación *");

        lblpiso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpiso.setText("Piso *");

        lbltiposervicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltiposervicio.setText("Tipo de Servicio *");

        lblestado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblestado.setText("Estado *");

        txtnumhabitacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnumhabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumhabitacionKeyTyped(evt);
            }
        });

        txtidhabitacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtidhabitacion.setEnabled(false);

        txtpiso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpisoKeyTyped(evt);
            }
        });

        cbtiposervicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbtiposervicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbtiposervicioKeyTyped(evt);
            }
        });

        cbestado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "Disponible", "Ocupada" }));
        cbestado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbestadoKeyTyped(evt);
            }
        });

        lblmensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmensaje.setForeground(new java.awt.Color(255, 0, 0));
        lblmensaje.setText("Los campos marcados con el signo (*) son obligatorios");

        lblusuario.setEnabled(false);

        lblnumcamas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumcamas.setText("Número de Camas *");

        txtnumcamas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnumcamas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumcamasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnumcamas)
                    .addComponent(lblmensaje)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnumhabitacion)
                            .addComponent(lblidhabitacion)
                            .addComponent(lblpiso)
                            .addComponent(lbltiposervicio)
                            .addComponent(lblestado))
                        .addGap(18, 18, 18)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbtiposervicio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtidhabitacion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnumhabitacion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpiso, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pfondoLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtnumcamas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidhabitacion)
                    .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnumhabitacion)
                    .addComponent(txtnumhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpiso)
                    .addComponent(txtpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnumcamas)
                    .addComponent(txtnumcamas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltiposervicio)
                    .addComponent(cbtiposervicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblestado)
                    .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblmensaje)
                .addContainerGap())
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
        btnguardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnguardarKeyTyped(evt);
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
        btnconsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnconsultarKeyTyped(evt);
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
        btnmodificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnmodificarKeyTyped(evt);
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
        btnlistar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnlistarKeyTyped(evt);
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
        btnregresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnregresarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //LIMITANTES Y TRANFERENCIA DE FOCUS
    private void txtnumhabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumhabitacionKeyTyped
        if(txtnumhabitacion.getText().length()==3){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtnumhabitacion){
            if(Contador==10){
                txtpiso.requestFocus();}}
    }//GEN-LAST:event_txtnumhabitacionKeyTyped
    private void txtpisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpisoKeyTyped
        if(txtpiso.getText().length()==2){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtpiso){
            if(Contador==10){
                txtnumcamas.requestFocus();}}
    }//GEN-LAST:event_txtpisoKeyTyped
    private void cbtiposervicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbtiposervicioKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbtiposervicio){
            if(Contador==10){
                cbestado.requestFocus();}}
    }//GEN-LAST:event_cbtiposervicioKeyTyped
    private void cbestadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbestadoKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbestado){
            if(Contador==10){
                btnguardar.requestFocus();}}
    }//GEN-LAST:event_cbestadoKeyTyped
    //ACCIÓN DEL BOTÓN GUARDAR AL DAR CLIC
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Guardar();
    }//GEN-LAST:event_btnguardarActionPerformed
    //ACCIÓN SOBRE EL BOTÓN GUARDAR CON EL TECLADO
    private void btnguardarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnguardarKeyTyped
        Guardar();
    }//GEN-LAST:event_btnguardarKeyTyped
    //ACCIÓN DEL BOTÓN CONSULTAR AL DAR CLIC
    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        Consultar();
    }//GEN-LAST:event_btnconsultarActionPerformed
    //ACCIÓN SOBRE EL BOTÓN CONSULTAR CON EL TECLADO
    private void btnconsultarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnconsultarKeyTyped
        Consultar();
    }//GEN-LAST:event_btnconsultarKeyTyped
    //ACCIÓN DEL BOTÓN MODIFICAR AL DAR CLIC
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        Actualizar();
    }//GEN-LAST:event_btnmodificarActionPerformed
    //ACCIÓN SOBRE EL BOTÓN MODIFICAR CON EL TECLADO
    private void btnmodificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnmodificarKeyTyped
        Actualizar();
    }//GEN-LAST:event_btnmodificarKeyTyped
    //ACCIÓN DEL BOTÓN LISTAR AL DAR CLIC
    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        this.dispose();
        TablaHabitaciones th=new TablaHabitaciones();
        th.setVisible(true);
    }//GEN-LAST:event_btnlistarActionPerformed
    //ACCIÓN SOBRE EL BOTÓN LISTAR CON EL TECLADO
    private void btnlistarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnlistarKeyTyped
        this.dispose();
        TablaHabitaciones th=new TablaHabitaciones();
        th.setVisible(true);
    }//GEN-LAST:event_btnlistarKeyTyped
    //ACCIÓN DEL BOTÓN REGRESAR AL DAR CLIC
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        Menu m=new Menu();
        m.setText(lblusuario.getText());
        m.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed
    //ACCIÓN SOBRE EL BOTÓN REGRESAR CON EL TECLADO
    private void btnregresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnregresarKeyTyped
        this.dispose();
        Menu m=new Menu();
        m.setText(lblusuario.getText());
        m.setVisible(true);
    }//GEN-LAST:event_btnregresarKeyTyped
    private void txtnumcamasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumcamasKeyTyped
        if(txtnumcamas.getText().length()==2){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtnumcamas){
            if(Contador==10){
                cbtiposervicio.requestFocus();}}
    }//GEN-LAST:event_txtnumcamasKeyTyped
    /**
     * MÉTODO PARA GUARDAR EL REGISTRO DE UNA HABITACIÓN
     */
    private void Guardar(){
        //VALIDAMOS LOS CAMPOS OBLIGATORIOS
        if(txtnumhabitacion.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Número de la Habitación.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtnumhabitacion.requestFocus();}
        else if(String.valueOf(txtnumhabitacion.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Número de la Habitación no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtnumhabitacion.requestFocus();
            txtnumhabitacion.setText("");}
        else if(txtpiso.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Número del Piso.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtpiso.requestFocus();}
        else if(String.valueOf(txtpiso.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Número del Piso no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtpiso.requestFocus();
            txtpiso.setText("");}
        else if(txtnumcamas.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Número de Camas.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtnumcamas.requestFocus();}
        else if(String.valueOf(txtpiso.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Número de Camas no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtnumcamas.requestFocus();
            txtnumcamas.setText("");}
        else if(cbtiposervicio.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el Tipo de Servicio de la Habitación.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbtiposervicio.requestFocus();}
        else if(cbestado.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado de la Habitación","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbestado.requestFocus();}
        else{
            int numhabitacion=Integer.parseInt(txtnumhabitacion.getText());
            int piso=Integer.parseInt(txtpiso.getText());
            int numcamas=Integer.parseInt(txtnumcamas.getText());
            int tiposervicio=cbtiposervicio.getSelectedIndex();
            String estado=(String)cbestado.getSelectedItem();
            //CREAMOS UN OBJETO DE LA CLASEHABITACIONES
            ClaseHabitaciones ch=new ClaseHabitaciones();
            ch.Guardar(numhabitacion,piso,numcamas,tiposervicio,estado);
            JOptionPane.showMessageDialog(null,"Registro Guardado con Exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
            Limpiar();
            Iniciar();}}
    /**
     * MÉTODO PARA CONSULTAR UNA HABITACIÓN
     */
    private void Consultar(){
        //CREAMOS UN OBJETO DE LA CLASE USUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        ResultSet rs=cu.BuscarUsuario2(lblusuario.getText());
        try{
            if(rs.next()){                
                //TRANSFORMAMOS EL DATO DEL PERFIL
                int codigoPerfil=Integer.parseInt(rs.getString(8));
                //CREAMOS UN OBJETO DE LA CLASEPERFILES
                ClasePerfiles cp=new ClasePerfiles();
                ResultSet rs2=cp.Buscar(codigoPerfil);
                try{
                    if(rs2.next()){
                        String perfil=rs2.getString(2);
                        if(perfil.equals("Administrador")){
                            ConsultarAdmin();}
                        else{
                            ConsultarOtro();}}}
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
    }
    /**
     * MÉTODO PARA ACTUALIZAR LOS REGISTROS
     */
    private void Actualizar(){
        //ACTIVAMOS LOS CAMPOS
        txtnumhabitacion.setEnabled(true);
        txtnumhabitacion.requestFocus();
        txtnumcamas.setEnabled(true);
        cbtiposervicio.setEnabled(true);
        cbestado.setEnabled(true);
        btnconsultar.setText("Limpiar");
        btnconsultar.setDescription("Clean");
        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));
        if(btnmodificar.getText().equals("Modificar")){
            btnmodificar.setText("Actualizar");
            btnmodificar.setDescription("Update");
            btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar2_opt.png")));}
        else{
            //VALIDAMOS LOS CAMPOS OBLIGATORIOS
            if(txtnumhabitacion.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Número de la Habitación.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumhabitacion.requestFocus();}
            else if(String.valueOf(txtnumhabitacion.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Número de la Habitación no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumhabitacion.requestFocus();
                txtnumhabitacion.setText("");}
            else if(txtnumcamas.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Número de Camas.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumcamas.requestFocus();}
            else if(String.valueOf(txtpiso.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Número de Camas no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumcamas.requestFocus();
                txtnumcamas.setText("");}
            else if(cbtiposervicio.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Tipo de Servicio de la Habitación.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbtiposervicio.requestFocus();}
            else if(cbestado.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado de la Habitación","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbestado.requestFocus();}
            else{
                int idhabitacion=Integer.parseInt(txtidhabitacion.getText());
                int numhabitacion=Integer.parseInt(txtnumhabitacion.getText());
                int piso=Integer.parseInt(txtpiso.getText());
                int numcamas=Integer.parseInt(txtnumcamas.getText());
                int tiposervicio=cbtiposervicio.getSelectedIndex();
                String estado=(String)cbestado.getSelectedItem();
                //CREAMOS UN OBJETO DE LA CLASEHABITACIONES
                ClaseHabitaciones ch=new ClaseHabitaciones();
                ch.Actualizar(idhabitacion,numhabitacion,piso,numcamas,tiposervicio,estado);
                JOptionPane.showMessageDialog(null,"Registro Actualizado con Exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
                Limpiar();
                btnconsultar.setText("Consultar");
                btnconsultar.setDescription("Consult");
                btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
                btnguardar.setEnabled(true);
                btnlistar.setEnabled(true);
                btnmodificar.setText("Modificar");
                btnmodificar.setDescription("Edit");
                btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png")));
                btnmodificar.setEnabled(false);
                Habilitar();
                Iniciar();}}}
    /**
     * MÉTODO PARA CONSULTAR CON PERFIL ADMINISTRADOR
     */
    private void ConsultarAdmin(){
        switch(btnconsultar.getText()){
            case "Consultar":
                String respuesta=((String)JOptionPane.showInputDialog(null,"Ingrese ID de la Habitación que desea Consultar","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null));
                if(respuesta==null){
                    txtnumhabitacion.requestFocus();}
                else if(!EsNumero(respuesta)){
                    JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar.\nEl Dato debe ser un numérico.","Error",JOptionPane.ERROR_MESSAGE,error);
                    txtnumhabitacion.requestFocus();}
                else{
                    int ID=Integer.parseInt(respuesta);
                    //CREAMOS UN OBJETO DE LA CLASEHABITACIONES
                    ClaseHabitaciones ch=new ClaseHabitaciones();
                    ResultSet rs=ch.Buscar(ID);
                    try{
                        if(rs.next()){
                            //JUEGO DE BOTONES
                            btnguardar.setEnabled(false);
                            btnlistar.setEnabled(false);
                            btnmodificar.setEnabled(true);
                            //DESACTIVAMOS LOS CAMPOS DE ESCRITURA
                            Inhabilitar();
                            //CAPTURAMOS LA INFORMACIÓN EN LAS CAJAS
                            txtidhabitacion.setText(rs.getString(1));
                            txtnumhabitacion.setText(rs.getString(2));
                            txtpiso.setText(rs.getString(3));
                            txtnumcamas.setText(rs.getString(4));
                            cbtiposervicio.setSelectedIndex(rs.getInt(5));
                            cbestado.setSelectedItem(rs.getString(6));
                            btnconsultar.setText("Limpiar");
                            btnconsultar.setDescription("Clean");
                            btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));}
                        else{
                            Limpiar();
                            JOptionPane.showMessageDialog(null,"El ID de la Habitación buscada no existe.","Información",JOptionPane.INFORMATION_MESSAGE,informacion);}}
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
                break;
                case "Limpiar":
                    Limpiar();
                    Habilitar();
                    Iniciar();
                    btnconsultar.setText("Consultar");
                    btnconsultar.setDescription("Consult");
                    btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
                    //JUEGO DE BOTONES
                    btnguardar.setEnabled(true);
                    btnlistar.setEnabled(true);
                    btnmodificar.setEnabled(false);
                    break;}
    }
    /**
     * MÉTODO PARA CONSULTAR CON OTRO PERFIL
     */
    private void ConsultarOtro(){
        switch(btnconsultar.getText()){
            case "Consultar":
                String respuesta=((String)JOptionPane.showInputDialog(null,"Ingrese ID de la Habitación que desea Consultar","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null));
                if(respuesta==null){
                    btnconsultar.requestFocus();}
                else if(!EsNumero(respuesta)){
                    JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar.\nEl Dato debe ser un numérico.","Error",JOptionPane.ERROR_MESSAGE,error);
                    btnconsultar.requestFocus();}
                else{
                    int ID=Integer.parseInt(respuesta);
                    //CREAMOS UN OBJETO DE LA CLASEHABITACIONES
                    ClaseHabitaciones ch=new ClaseHabitaciones();
                    ResultSet rs=ch.Buscar(ID);
                    try{
                        if(rs.next()){
                            //CAPTURAMOS LA INFORMACIÓN EN LAS CAJAS
                            txtidhabitacion.setText(rs.getString(1));
                            txtnumhabitacion.setText(rs.getString(2));
                            txtpiso.setText(rs.getString(3));
                            txtnumcamas.setText(rs.getString(4));
                            cbtiposervicio.setSelectedIndex(rs.getInt(5));
                            cbestado.setSelectedItem(rs.getString(6));
                            btnconsultar.setText("Limpiar");
                            btnconsultar.setDescription("Clean");
                            btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));}
                        else{
                            Limpiar();
                            JOptionPane.showMessageDialog(null,"El ID de la Habitación buscada no existe.","Información",JOptionPane.INFORMATION_MESSAGE,informacion);}}
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
                break;
                case "Limpiar":
                    Limpiar();
                    Iniciar();
                    btnconsultar.setText("Consultar");
                    btnconsultar.setDescription("Consult");
                    btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
                    break;}
    }
    /**
     * MÉTODO PARA LIMPIAR LOS DATOS
     */
    private void Limpiar(){
        txtidhabitacion.setText("");
        txtnumhabitacion.setText("");
        txtpiso.setText("");
        txtnumcamas.setText("");
        cbtiposervicio.removeAllItems();
        cbestado.setSelectedItem("");}
    /**
     * MÉTODO PARA HABILITAR LAS CAJAS
     */
    private void Habilitar(){
        txtnumhabitacion.setEnabled(true);
        txtpiso.setEnabled(true);
        txtnumcamas.setEnabled(true);
        cbtiposervicio.setEnabled(true);
        cbestado.setEnabled(true);}
    /**
     * MÉTODO PARA INHABILITAR LAS CAJAS
     */
    private void Inhabilitar(){
        txtnumhabitacion.setEnabled(false);
        txtpiso.setEnabled(false);
        txtnumcamas.setEnabled(false);
        cbtiposervicio.setEnabled(false);
        cbestado.setEnabled(false);}
    /**
     * MÉTODO QUE VALIDA NÚMEROS
     * @param a que contiene un JTextField
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void Numeros(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent KE){
                char c=KE.getKeyChar();
                if(!Character.isDigit(c)){//AQUÍ ESTOY COMPARANDO SI SON NÚMEROS O ESPACIO EN BLANCO
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
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Habitaciones().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnconsultar;
    private org.edisoncor.gui.button.ButtonTask btnguardar;
    private org.edisoncor.gui.button.ButtonTask btnlistar;
    private org.edisoncor.gui.button.ButtonTask btnmodificar;
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JComboBox cbestado;
    private javax.swing.JComboBox cbtiposervicio;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblidhabitacion;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblnumcamas;
    private javax.swing.JLabel lblnumhabitacion;
    private javax.swing.JLabel lblpiso;
    private javax.swing.JLabel lbltiposervicio;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel pfondo;
    private javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtnumcamas;
    private javax.swing.JTextField txtnumhabitacion;
    private javax.swing.JTextField txtpiso;
    // End of variables declaration//GEN-END:variables
}
