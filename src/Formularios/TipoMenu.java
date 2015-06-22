package Formularios;
/**
 * LIBRERIAS IMPORTADAS
 * @author Robinson Gallego Alzate
 * @version 1.0
 */
import Clases.ClaseTipoMenu;
import Tablas.TablaTipoMenu;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TipoMenu extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    /**
     * CONSTRUCTOR TipoMenu
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public TipoMenu(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Personal Médico Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        //ESTE OBJETO NOS PERMITIRA COMUNICARNOS CON LA BASE DE DATOS
        cbtipomenu.requestFocus();
        Iniciar();
    }
    /**
     * MÉTODO ALTERNATIVO INICIAR
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void Iniciar(){
        //LIMPIAMOS LOS COMBOBOX
        cbcomponentes.removeAllItems();
        cbpacientesespaciales.removeAllItems();
        //PONEMOS UN ITEM POR DEFECTO
        cbcomponentes.addItem("Seleccione");
        cbpacientesespaciales.addItem("Seleccione");
        //CREAMOS UN OBJETO TIPOMENU
        ClaseTipoMenu ctm=new ClaseTipoMenu();
        ClaseTipoMenu ctm2=new ClaseTipoMenu();
        tacomponentes.setText("");
        tapacientesespaciales.setText("");
        ctm.LlenarComponente(cbcomponentes);
        ctm2.LlenarPacientesEspaciales(cbpacientesespaciales);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ptipomenu = new javax.swing.JPanel();
        lblcodigo = new javax.swing.JLabel();
        lbltipomenu = new javax.swing.JLabel();
        lblcomponentes = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        cbtipomenu = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tacomponentes = new javax.swing.JTextArea();
        cbcomponentes = new javax.swing.JComboBox();
        lblcontraindicaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tacontraindicaciones = new javax.swing.JTextArea();
        lblpacientesespeciales = new javax.swing.JLabel();
        cbpacientesespaciales = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tapacientesespaciales = new javax.swing.JTextArea();
        lblmensaje = new javax.swing.JLabel();
        lblconteo = new javax.swing.JLabel();
        lblcaracteres = new javax.swing.JLabel();
        btnlimpiarcomponentes = new javax.swing.JButton();
        btnlimpiarpe = new javax.swing.JButton();
        btnguardar = new org.edisoncor.gui.button.ButtonTask();
        btnconsultar = new org.edisoncor.gui.button.ButtonTask();
        btneliminar = new org.edisoncor.gui.button.ButtonTask();
        btnlistar = new org.edisoncor.gui.button.ButtonTask();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();
        btnmodificar = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ptipomenu.setBackground(new java.awt.Color(255, 255, 255));
        ptipomenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Tipo Menú", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblcodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcodigo.setText("Código");

        lbltipomenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltipomenu.setText("Tipo Menú *");

        lblcomponentes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcomponentes.setText("Componentes *");

        txtcodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtcodigo.setEnabled(false);

        cbtipomenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbtipomenu.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"","Desayuno", "Media Mañana", "Almuerzo", "Algo", "Cena", "Merienda" }));
        cbtipomenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbtipomenuKeyTyped(evt);
            }
        });

        tacomponentes.setEditable(false);
        tacomponentes.setColumns(20);
        tacomponentes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tacomponentes.setRows(5);
        jScrollPane1.setViewportView(tacomponentes);

        cbcomponentes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbcomponentes.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""}));
        cbcomponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcomponentesActionPerformed(evt);
            }
        });
        cbcomponentes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbcomponentesKeyTyped(evt);
            }
        });

        lblcontraindicaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcontraindicaciones.setText("Contraindicaciones *");

        tacontraindicaciones.setColumns(20);
        tacontraindicaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tacontraindicaciones.setRows(5);
        tacontraindicaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tacontraindicacionesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tacontraindicacionesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(tacontraindicaciones);

        lblpacientesespeciales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpacientesespeciales.setText("Pacientes Especiales");

        cbpacientesespaciales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbpacientesespaciales.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""}));
        cbpacientesespaciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpacientesespacialesActionPerformed(evt);
            }
        });
        cbpacientesespaciales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbpacientesespacialesKeyTyped(evt);
            }
        });

        tapacientesespaciales.setEditable(false);
        tapacientesespaciales.setColumns(20);
        tapacientesespaciales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tapacientesespaciales.setRows(5);
        jScrollPane3.setViewportView(tapacientesespaciales);

        lblmensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmensaje.setForeground(new java.awt.Color(255, 0, 0));
        lblmensaje.setText("Los campos marcados con el signo (*) son obligatorios");

        lblconteo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblconteo.setForeground(new java.awt.Color(255, 51, 0));

        lblcaracteres.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblcaracteres.setForeground(new java.awt.Color(255, 51, 0));
        lblcaracteres.setText("Caracteres");

        btnlimpiarcomponentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnlimpiarcomponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarcomponentesActionPerformed(evt);
            }
        });

        btnlimpiarpe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnlimpiarpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarpeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ptipomenuLayout = new javax.swing.GroupLayout(ptipomenu);
        ptipomenu.setLayout(ptipomenuLayout);
        ptipomenuLayout.setHorizontalGroup(
            ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptipomenuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ptipomenuLayout.createSequentialGroup()
                        .addComponent(lblmensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlimpiarpe))
                    .addGroup(ptipomenuLayout.createSequentialGroup()
                        .addGroup(ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ptipomenuLayout.createSequentialGroup()
                                .addComponent(lbltipomenu)
                                .addGap(39, 39, 39)
                                .addComponent(cbtipomenu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ptipomenuLayout.createSequentialGroup()
                                .addComponent(lblcomponentes)
                                .addGap(18, 18, 18)
                                .addComponent(cbcomponentes, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ptipomenuLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnlimpiarcomponentes))
                            .addGroup(ptipomenuLayout.createSequentialGroup()
                                .addComponent(lblcodigo)
                                .addGap(72, 72, 72)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ptipomenuLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblpacientesespeciales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbpacientesespaciales, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ptipomenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ptipomenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ptipomenuLayout.createSequentialGroup()
                                        .addGap(187, 187, 187)
                                        .addComponent(lblcaracteres)
                                        .addGap(6, 6, 6)
                                        .addComponent(lblconteo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblcontraindicaciones)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ptipomenuLayout.setVerticalGroup(
            ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ptipomenuLayout.createSequentialGroup()
                .addGroup(ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ptipomenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblmensaje))
                    .addGroup(ptipomenuLayout.createSequentialGroup()
                        .addGroup(ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ptipomenuLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblcontraindicaciones)
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcaracteres)
                                    .addComponent(lblconteo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbpacientesespaciales, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblpacientesespeciales))
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ptipomenuLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ptipomenuLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(lblcodigo))
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ptipomenuLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(lbltipomenu))
                                    .addComponent(cbtipomenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ptipomenuLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(lblcomponentes))
                                    .addComponent(cbcomponentes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ptipomenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ptipomenuLayout.createSequentialGroup()
                                        .addComponent(btnlimpiarcomponentes)
                                        .addGap(176, 176, 176))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlimpiarpe)))
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

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar1a_opt.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btneliminar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btneliminar.setDescription("Remove");
        btneliminar.setEnabled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ptipomenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ptipomenu, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ACCIÓN DEL COMBOBOX COMPONENTES
    private void cbcomponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcomponentesActionPerformed
        tacomponentes.setText(tacomponentes.getText().replace("","")+cbcomponentes.getSelectedItem()+" \n");
    }//GEN-LAST:event_cbcomponentesActionPerformed
    //ACCIÓN DEL COMBOBOX PACIENTES ESPECIALES
    private void cbpacientesespacialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpacientesespacialesActionPerformed
        tapacientesespaciales.setText(tapacientesespaciales.getText().replace("","")+cbpacientesespaciales.getSelectedItem()+" \n");
    }//GEN-LAST:event_cbpacientesespacialesActionPerformed
    //ACCIÓN DEL BOTÓN REGRESAR
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        Menu menu=new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed
    //LIMITACIONES Y TRANSFERENCIA DE FOCUS
    private void cbtipomenuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbtipomenuKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbtipomenu){
            if(Contador==10){
                cbcomponentes.requestFocus();}}
    }//GEN-LAST:event_cbtipomenuKeyTyped

    private void cbcomponentesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbcomponentesKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbcomponentes){
            if(Contador==10){
                tacontraindicaciones.requestFocus();}}
    }//GEN-LAST:event_cbcomponentesKeyTyped

    private void tacontraindicacionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tacontraindicacionesKeyPressed
        if(tacontraindicaciones.getText().length()==300){
            evt.consume();}
        if(evt.getKeyCode()==KeyEvent.VK_TAB){
            cbpacientesespaciales.requestFocus();}
    }//GEN-LAST:event_tacontraindicacionesKeyPressed

    private void cbpacientesespacialesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbpacientesespacialesKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbpacientesespaciales){
            if(Contador==10){
                btnguardar.requestFocus();}}
    }//GEN-LAST:event_cbpacientesespacialesKeyTyped

    private void tacontraindicacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tacontraindicacionesKeyTyped
        int conteo=tacontraindicaciones.getText().length();
        lblconteo.setText(String.valueOf(conteo));
        if(conteo>299){
            evt.consume();}
    }//GEN-LAST:event_tacontraindicacionesKeyTyped
    //ACCIÓN DEL BOTÓN GUARDAR
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if(cbtipomenu.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el Tipo de Menú","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbtipomenu.requestFocus();}
        else if(tacomponentes.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar los Componentes del Menú","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbcomponentes.requestFocus();}
        else if(tacontraindicaciones.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe indicar las Contraindicaciones","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            tacontraindicaciones.requestFocus();}
        else{
            try{
                int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                if(Respuesta==JOptionPane.YES_OPTION){
                    //CREAMOS UN OBJETO DE LA CLASE TIPO MENÚ
                    ClaseTipoMenu ctm=new ClaseTipoMenu();
                    //CAPTURAMOS LOS DATOS
                    String tipoMenu=cbtipomenu.getSelectedItem().toString();
                    String componentes=tacomponentes.getText();
                    String contraindicaciones=tacontraindicaciones.getText();
                    String pacientesEspeciales=tapacientesespaciales.getText();
                    ctm.Guardar(tipoMenu,componentes,contraindicaciones,pacientesEspeciales);
                    Limpiar();
                    JOptionPane.showMessageDialog(null,"Registro guardado con Exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
                    Iniciar();}}
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error al grabar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
    }//GEN-LAST:event_btnguardarActionPerformed
    //ACCIÓN DEL BOTÓN CONSULTAR
    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        if(btnconsultar.getText().equals("Consultar")){
            int codigo=Integer.parseInt((String)JOptionPane.showInputDialog(null,"Ingrese el código que desea Modificar","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null));
            //CREAMOS UN OBJETO DE LA CLASE TIPO MENÚ
            ClaseTipoMenu ctm=new ClaseTipoMenu();
            ResultSet rs=ctm.Buscar(codigo);
            try{
                if(rs.next()){
                    //ACTIVAMOS LOS BOTONES QUE ESTÁN INACTIVOS
                    btnmodificar.setEnabled(true);
                    btneliminar.setEnabled(true);
                    btnguardar.setEnabled(false);
                    //DESACTIVAMOS LOS CAMPOS DE ESCRITURA
                    Inhabilitar();
                    //CAPTURAMOS LA INFORMACIÓN EN LAS CAJAS
                    txtcodigo.setText(rs.getString(1));
                    cbtipomenu.setSelectedItem(rs.getString(2));
                    tacomponentes.setText(rs.getString(3));
                    tacontraindicaciones.setText(rs.getString(4));
                    tapacientesespaciales.setText(rs.getString(5));
                    btnconsultar.setText("Limpiar");
                    btnconsultar.setDescription("Clean");
                    btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));}
                else{
                    Habilitar();
                    Limpiar();
                    JOptionPane.showMessageDialog(null,"El dato buscado no existe","Información",JOptionPane.INFORMATION_MESSAGE,informacion);}}
            catch (SQLException e){
                JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
        else if(btnconsultar.getText().equals("Limpiar")){
            Limpiar();
            Iniciar();
            Habilitar();
            btnconsultar.setText("Consultar");
            btnconsultar.setDescription("Consult");
            btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
            btnguardar.setEnabled(true);
            btnmodificar.setEnabled(false);
            btnmodificar.setText("Modificar");
            btnmodificar.setDescription("Edit");
            btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png")));}
    }//GEN-LAST:event_btnconsultarActionPerformed
    //ACCIÓN DEL BOTÓN MODIFICAR
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        //ACTIVAMOS LOS CAMPOS
        Habilitar();
        //DESACTIVAMOS Y ACTIVAMOS LOS BOTONES
        btnguardar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnconsultar.setText("Limpiar");
        btnconsultar.setDescription("Clean");
        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));
        if(btnmodificar.getText().equals("Modificar")){
            btnmodificar.setText("Actualizar");
            btnmodificar.setDescription("Update");
            btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar2_opt.png")));}
        else{
            if(cbtipomenu.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Tipo de Menú","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbtipomenu.requestFocus();}
            else if(tacomponentes.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar los Componentes del Menú","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbcomponentes.requestFocus();}
            else if(tacontraindicaciones.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe indicar las Contraindicaciones","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                tacontraindicaciones.requestFocus();}
            else{
                //CREAMOS UN OBJETO DE LA CLASE TIPO MENÚ
                ClaseTipoMenu ctm=new ClaseTipoMenu();
                //CAPTURAMOS LOS DATOS
                int codigo=Integer.parseInt(txtcodigo.getText());
                String tipoMenu=cbtipomenu.getSelectedItem().toString();
                String componentes=tacomponentes.getText();
                String contraindicaciones=tacontraindicaciones.getText();
                String pacientesEspeciales=tapacientesespaciales.getText();
                ctm.Actualizar(codigo,tipoMenu,componentes,contraindicaciones,pacientesEspeciales);
                Limpiar();
                Iniciar();
                JOptionPane.showMessageDialog(null,"Registro Actualizado con Exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
                btnconsultar.setText("Consultar");
                btnconsultar.setDescription("Consult");
                btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
                btnguardar.setEnabled(true);
                btnmodificar.setEnabled(false);
                btnmodificar.setText("Modificar");
                btnmodificar.setDescription("Edit");
                btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png")));
                btneliminar.setEnabled(false);
                btnmodificar.setEnabled(false);}}
    }//GEN-LAST:event_btnmodificarActionPerformed
    //ACCIÓN DEL BOTÓN ELIMINAR
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        //CREAMOS UN OBJETO DE LA CLASE TIPO MENÚ
        ClaseTipoMenu ctm=new ClaseTipoMenu();
        int Respuesta=JOptionPane.showConfirmDialog(null,"Seguro desea Eliminar la Infomación?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
        if(Respuesta==JOptionPane.YES_OPTION){
            ctm.Eliminar(Integer.parseInt(txtcodigo.getText()));
            Limpiar();
            Iniciar();
            JOptionPane.showMessageDialog(null,"Los datos se Eliminaron con exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
            Habilitar();
            btnguardar.setEnabled(true);
            btnconsultar.setText("Consultar");
            btnconsultar.setDescription("Consult");
            btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
            btnmodificar.setEnabled(false);
            btneliminar.setEnabled(false);}
        else{
            Limpiar();
            Iniciar();
            Habilitar();
            btnguardar.setEnabled(true);
            btnconsultar.setText("Consultar");
            btnconsultar.setDescription("Consult");
            btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
            btnmodificar.setEnabled(false);
            btneliminar.setEnabled(false);}
    }//GEN-LAST:event_btneliminarActionPerformed
    //ACCIÓN DEL BOTÓN LISTAR
    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        this.dispose();
        TablaTipoMenu ttm=new TablaTipoMenu();
        ttm.setVisible(true);
    }//GEN-LAST:event_btnlistarActionPerformed
    //ACCIÓN DEL BOTÓN LIMPIAR COMPONENTES
    private void btnlimpiarcomponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarcomponentesActionPerformed
        cbcomponentes.setSelectedItem("");
        tacomponentes.setText("");
    }//GEN-LAST:event_btnlimpiarcomponentesActionPerformed
    //ACCIÓN DEL BOTÓN LIMPIAR P.E
    private void btnlimpiarpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarpeActionPerformed
        cbpacientesespaciales.setSelectedItem("");
        tapacientesespaciales.setText("");
    }//GEN-LAST:event_btnlimpiarpeActionPerformed
    /**
     * MÉTODO PARA LIMPIAR DATOS
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void Limpiar(){
        txtcodigo.setText("");
        cbtipomenu.setSelectedItem("");
        tacomponentes.setText("");
        tacontraindicaciones.setText("");
        tapacientesespaciales.setText("");
        cbtipomenu.requestFocus();
    }
    /**
     * MÉTODO PARA HABILITAR CAMPOS
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void Habilitar(){
        cbtipomenu.setEnabled(true);
        cbcomponentes.setEnabled(true);
        tacomponentes.setEnabled(true);
        tacontraindicaciones.setEnabled(true);
        cbpacientesespaciales.setEnabled(true);
        tapacientesespaciales.setEnabled(true);
        btnlimpiarcomponentes.setEnabled(true);
        btnlimpiarpe.setEnabled(true);
    }
    /**
     * MÉTODO PARA INHABILITAR CAMPOS
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void Inhabilitar(){
        cbtipomenu.setEnabled(false);
        cbcomponentes.setEnabled(false);
        tacomponentes.setEnabled(false);
        tacontraindicaciones.setEnabled(false);
        cbpacientesespaciales.setEnabled(false);
        tapacientesespaciales.setEnabled(false);
        btnlimpiarcomponentes.setEnabled(false);
        btnlimpiarpe.setEnabled(false);
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
            java.util.logging.Logger.getLogger(TipoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new TipoMenu().setVisible(true);}});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnconsultar;
    private org.edisoncor.gui.button.ButtonTask btneliminar;
    private org.edisoncor.gui.button.ButtonTask btnguardar;
    private javax.swing.JButton btnlimpiarcomponentes;
    private javax.swing.JButton btnlimpiarpe;
    private org.edisoncor.gui.button.ButtonTask btnlistar;
    private org.edisoncor.gui.button.ButtonTask btnmodificar;
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JComboBox cbcomponentes;
    private javax.swing.JComboBox cbpacientesespaciales;
    private javax.swing.JComboBox cbtipomenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblcaracteres;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblcomponentes;
    private javax.swing.JLabel lblconteo;
    private javax.swing.JLabel lblcontraindicaciones;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblpacientesespeciales;
    private javax.swing.JLabel lbltipomenu;
    private javax.swing.JPanel ptipomenu;
    private javax.swing.JTextArea tacomponentes;
    private javax.swing.JTextArea tacontraindicaciones;
    private javax.swing.JTextArea tapacientesespaciales;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}
