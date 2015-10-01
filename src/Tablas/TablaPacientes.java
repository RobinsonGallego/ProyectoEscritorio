package Tablas;

import Clases.ClasePacientes;
import Formularios.Pacientes;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TablaPacientes extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    //CONSTRUCTOR
    public TablaPacientes(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setExtendedState(MAXIMIZED_BOTH);//TAMAÑO MAXIMO DE LA VENTANA
        setTitle("Tabla Pacientes");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        lblusuario.setVisible(false);
        Iniciar();}
    /**
     * MÉTODO ALTERNO INICIAR
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void Iniciar(){
        //LIMPIAMOS LA TABLA
        LimpiarTabla(tablapacientes);
        //PONEMOS TODOS LOS DATOS POR DEFECTO
        DefaultTableModel modelo=(DefaultTableModel)tablapacientes.getModel();
        //CREAMOS UN OBJETO DE LA CLASEPACIENTES
        ClasePacientes cpa=new ClasePacientes();
        //LLAMAMOS EL MÉTODO
        cpa.LlenarDatos(modelo);
        FormatoTabla();
        Letras(txtnombres);
        Letras(txtprimerape);}
    /**
     * MÉTODO QUE CAPTURA EL USUARIO QUE INGRESO Y APLICA SU PERFIL
     * @param user que contiene un String para recibido del Menú
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void setText(String user){
        lblusuario.setText(user);}
    /**
     * MÉTODO PARA DARLE TAMAÑO A CADA COLUMNA DE LA TABLA
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void FormatoTabla(){
        //MODIFICAMOS LOS TÍTULOS DE LAS COLUMNAS
        JTableHeader th;
        th=tablapacientes.getTableHeader();
        Font fuente=new Font("Tahoma",Font.BOLD,12);
        th.setFont(fuente);
        //PONEMOS TAMAÑO A CADA COLUMNA
        tablapacientes.getColumnModel().getColumn(0).setWidth(25);
        tablapacientes.getColumnModel().getColumn(0).setMaxWidth(115);
        tablapacientes.getColumnModel().getColumn(0).setMinWidth(25);
        tablapacientes.getColumnModel().getColumn(0).setHeaderValue("Tipo Documento");
        tablapacientes.getColumnModel().getColumn(1).setWidth(25);
        tablapacientes.getColumnModel().getColumn(1).setMaxWidth(110);
        tablapacientes.getColumnModel().getColumn(1).setMinWidth(25);
        tablapacientes.getColumnModel().getColumn(1).setHeaderValue("N° Documento");
        tablapacientes.getColumnModel().getColumn(2).setWidth(25);
        tablapacientes.getColumnModel().getColumn(2).setMaxWidth(150);
        tablapacientes.getColumnModel().getColumn(2).setMinWidth(25);
        tablapacientes.getColumnModel().getColumn(2).setHeaderValue("Nombres");
        tablapacientes.getColumnModel().getColumn(3).setWidth(25);
        tablapacientes.getColumnModel().getColumn(3).setMaxWidth(105);
        tablapacientes.getColumnModel().getColumn(3).setMinWidth(25);
        tablapacientes.getColumnModel().getColumn(3).setHeaderValue("Primer Apellido");
        tablapacientes.getColumnModel().getColumn(4).setWidth(25);
        tablapacientes.getColumnModel().getColumn(4).setMaxWidth(120);
        tablapacientes.getColumnModel().getColumn(4).setMinWidth(25);
        tablapacientes.getColumnModel().getColumn(4).setHeaderValue("Segundo Apellido");
        tablapacientes.getColumnModel().getColumn(5).setWidth(25);
        tablapacientes.getColumnModel().getColumn(5).setMaxWidth(40);
        tablapacientes.getColumnModel().getColumn(5).setMinWidth(25);
        tablapacientes.getColumnModel().getColumn(5).setHeaderValue("Edad");
        tablapacientes.getColumnModel().getColumn(6).setWidth(25);
        tablapacientes.getColumnModel().getColumn(6).setMaxWidth(85);
        tablapacientes.getColumnModel().getColumn(6).setMinWidth(25);
        tablapacientes.getColumnModel().getColumn(6).setHeaderValue("Tipo Sangre");
        tablapacientes.getColumnModel().getColumn(7).setWidth(25);
        tablapacientes.getColumnModel().getColumn(7).setMaxWidth(95);
        tablapacientes.getColumnModel().getColumn(7).setMinWidth(25);
        tablapacientes.getColumnModel().getColumn(7).setHeaderValue("Fecha Ingreso");
        tablapacientes.getColumnModel().getColumn(8).setWidth(25);
        tablapacientes.getColumnModel().getColumn(8).setMaxWidth(340);
        tablapacientes.getColumnModel().getColumn(8).setMinWidth(25);
        tablapacientes.getColumnModel().getColumn(8).setHeaderValue("EPS");
        tablapacientes.getColumnModel().getColumn(9).setWidth(25);
        tablapacientes.getColumnModel().getColumn(9).setMaxWidth(140);
        tablapacientes.getColumnModel().getColumn(9).setMinWidth(25);
        tablapacientes.getColumnModel().getColumn(9).setHeaderValue("Forma Pago");
        tablapacientes.getColumnModel().getColumn(10).setWidth(25);
        tablapacientes.getColumnModel().getColumn(10).setMaxWidth(70);
        tablapacientes.getColumnModel().getColumn(10).setMinWidth(25);
        tablapacientes.getColumnModel().getColumn(10).setHeaderValue("Estado");}
    /**
     * MÉTODO PARA LIMPIAR LOS DATOS EN LA TABLA
     * @param tabla que contiene un JTable para ser Limpiado
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void LimpiarTabla(JTable tabla){
        //RECORREMOS TODAS LAS FILAS
        while(tabla.getRowCount()>0){
            //Y AQUÍ LAS REMOVEMOS
            ((DefaultTableModel)tabla.getModel()).removeRow(0);}}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        lblimagen = new javax.swing.JLabel();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();
        btnlimpiar = new org.edisoncor.gui.button.ButtonTask();
        rbbuscarpondocumento = new javax.swing.JRadioButton();
        rbbuscarpornombres = new javax.swing.JRadioButton();
        txtnombres = new javax.swing.JTextField();
        rbbuscarporprimerape = new javax.swing.JRadioButton();
        txtprimerape = new javax.swing.JTextField();
        rbbuscarporestado = new javax.swing.JRadioButton();
        cbactivo = new javax.swing.JCheckBox();
        cbinactivo = new javax.swing.JCheckBox();
        lblusuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapacientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));
        pfondo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta4_opt.png"))); // NOI18N

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar_opt.png"))); // NOI18N
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

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png"))); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnlimpiar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlimpiar.setDescription("Clean");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        btnlimpiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnlimpiarKeyTyped(evt);
            }
        });

        rbbuscarpondocumento.setBackground(new java.awt.Color(255, 255, 255));
        rbbuscarpondocumento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbuscarpondocumento.setText("Buscar por Documento");
        rbbuscarpondocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbuscarpondocumentoActionPerformed(evt);
            }
        });

        rbbuscarpornombres.setBackground(new java.awt.Color(255, 255, 255));
        rbbuscarpornombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbuscarpornombres.setText("Buscar por Nombres");
        rbbuscarpornombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbuscarpornombresActionPerformed(evt);
            }
        });

        txtnombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnombres.setEnabled(false);
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombresKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });

        rbbuscarporprimerape.setBackground(new java.awt.Color(255, 255, 255));
        rbbuscarporprimerape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbuscarporprimerape.setText("Buscar por Primer Apellido");
        rbbuscarporprimerape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbuscarporprimerapeActionPerformed(evt);
            }
        });

        txtprimerape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtprimerape.setEnabled(false);
        txtprimerape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprimerapeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprimerapeKeyTyped(evt);
            }
        });

        rbbuscarporestado.setBackground(new java.awt.Color(255, 255, 255));
        rbbuscarporestado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbuscarporestado.setText("Buscar por Estado");
        rbbuscarporestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbuscarporestadoActionPerformed(evt);
            }
        });

        cbactivo.setBackground(new java.awt.Color(255, 255, 255));
        cbactivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbactivo.setText("Activo");
        cbactivo.setEnabled(false);
        cbactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbactivoActionPerformed(evt);
            }
        });

        cbinactivo.setBackground(new java.awt.Color(255, 255, 255));
        cbinactivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbinactivo.setText("Inactivo");
        cbinactivo.setEnabled(false);
        cbinactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbinactivoActionPerformed(evt);
            }
        });

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblimagen)
                .addGap(18, 18, 18)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbbuscarpornombres)
                    .addComponent(rbbuscarporprimerape)
                    .addComponent(rbbuscarpondocumento))
                .addGap(6, 6, 6)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtnombres, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(txtprimerape))
                    .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rbbuscarporestado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbactivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbinactivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 564, Short.MAX_VALUE)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblimagen))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbbuscarporestado)
                                .addComponent(cbactivo)
                                .addComponent(cbinactivo))
                            .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbbuscarpondocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbbuscarpornombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbbuscarporprimerape, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprimerape, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        tablapacientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablapacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Documento", "N° Documento", "Nombres", "Primer Apellido", "Segundo Apellido", "Edad", "Tipo de Sangre", "Fecha Ingreso", "EPS", "Forma Pago", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablapacientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ACCIÓN DEL RADIOBUTTON BUSQUEDA POR DOCUMENTO
    private void rbbuscarpondocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbuscarpondocumentoActionPerformed
        rbbuscarpornombres.setSelected(false);
        txtnombres.setText("");
        txtnombres.setEnabled(false);
        rbbuscarporprimerape.setSelected(false);
        txtprimerape.setText("");
        txtprimerape.setEnabled(false);
        rbbuscarporestado.setSelected(false);
        cbactivo.setEnabled(false);
        cbactivo.setSelected(false);
        cbinactivo.setEnabled(false);
        cbinactivo.setSelected(false);
        String Respuesta=(String)JOptionPane.showInputDialog(null,"Ingrese el Documento","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null);
        if(Respuesta==null){
            Iniciar();
            rbbuscarpondocumento.setSelected(false);
            btnregresar.requestFocus();}
        else{
            //CREAMOS UN OBJETO DE LA CLASEPACIENTES
            ClasePacientes cpa=new ClasePacientes();
            ResultSet rs=cpa.BuscarIdentificacion(Respuesta);
            try{
                if(rs.next()){
                    //LIMPIAMOS LA TABLA
                    LimpiarTabla(tablapacientes);
                    DefaultTableModel modelo=(DefaultTableModel)tablapacientes.getModel();
                    //LLAMAMOS EL MÉTODO
                    cpa.BusquedaIdentificacion(modelo,Respuesta);}
                else{
                    JOptionPane.showMessageDialog(null,"El Documento buscado no existe","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
                    Iniciar();
                    Limpiar();
                    btnregresar.requestFocus();}}
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
    }//GEN-LAST:event_rbbuscarpondocumentoActionPerformed
    //ACCIÓN DEL RADIOBUTTON BUSQUEDA POR NOMBRES
    private void rbbuscarpornombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbuscarpornombresActionPerformed
        rbbuscarpondocumento.setSelected(false);
        txtnombres.setEnabled(true);
        txtnombres.requestFocus();
        rbbuscarporprimerape.setSelected(false);
        txtprimerape.setText("");
        txtprimerape.setEnabled(false);
        rbbuscarporestado.setSelected(false);
        cbactivo.setEnabled(false);
        cbactivo.setSelected(false);
        cbinactivo.setEnabled(false);
        cbinactivo.setSelected(false);
    }//GEN-LAST:event_rbbuscarpornombresActionPerformed
    //ACCIÓN DEL RADIOBUTTON BUSQUEDA POR PRIMER APELLIDO
    private void rbbuscarporprimerapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbuscarporprimerapeActionPerformed
        rbbuscarpondocumento.setSelected(false);
        rbbuscarpornombres.setSelected(false);
        txtnombres.setText("");
        txtnombres.setEnabled(false);
        txtprimerape.setEnabled(true);
        txtprimerape.requestFocus();
        rbbuscarporestado.setSelected(false);
        cbactivo.setEnabled(false);
        cbactivo.setSelected(false);
        cbinactivo.setEnabled(false);
        cbinactivo.setSelected(false);
    }//GEN-LAST:event_rbbuscarporprimerapeActionPerformed
    //ACCIÓN DEL RADIOBUTTON BUSQUEDA POR ESTADO
    private void rbbuscarporestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbuscarporestadoActionPerformed
        rbbuscarpondocumento.setSelected(false);
        rbbuscarpornombres.setSelected(false);
        txtnombres.setText("");
        txtnombres.setEnabled(false);
        rbbuscarporprimerape.setSelected(false);
        txtprimerape.setText("");
        txtprimerape.setEnabled(false);
        cbactivo.setEnabled(true);
        cbinactivo.setEnabled(true);
        cbactivo.setSelected(false);
        cbinactivo.setSelected(false);
        LimpiarTabla(tablapacientes);
    }//GEN-LAST:event_rbbuscarporestadoActionPerformed
    //ACCIÓN DEL CHECKBOX ACTIVO
    private void cbactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbactivoActionPerformed
        rbbuscarporestado.setSelected(false);
        cbinactivo.setEnabled(false);
        cbinactivo.setSelected(false);
        //CREAMOS UN OBJETO DE LA CLASEPACIENTES
        ClasePacientes cpa=new ClasePacientes();
        //LIMPIAMOS LA TABLA
        LimpiarTabla(tablapacientes);
        DefaultTableModel modelo=(DefaultTableModel)tablapacientes.getModel();
        //LLAMAMOS EL MÉTODO
        cpa.BusquedaEstado(modelo,cbactivo.getText());
    }//GEN-LAST:event_cbactivoActionPerformed
    //ACCIÓN DEL CHECKBOX INACTIVO
    private void cbinactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbinactivoActionPerformed
        rbbuscarporestado.setSelected(false);
        cbactivo.setEnabled(false);
        cbactivo.setSelected(false);
        //CREAMOS UN OBJETO DE LA CLASEPACIENTES
        ClasePacientes cpa=new ClasePacientes();
        //LIMPIAMOS LA TABLA
        LimpiarTabla(tablapacientes);
        DefaultTableModel modelo=(DefaultTableModel)tablapacientes.getModel();
        //LLAMAMOS EL MÉTODO
        cpa.BusquedaEstado(modelo,cbinactivo.getText());
    }//GEN-LAST:event_cbinactivoActionPerformed
    //ACCIÓN DEL BOTÓN REGRESAR CON CLIC
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        Pacientes p=new Pacientes();
        p.setText(lblusuario.getText());
        p.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed
    //ACCIÓN DEL BOTÓN LIMPIAR CON CLIC
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
        Iniciar();
    }//GEN-LAST:event_btnlimpiarActionPerformed
    //ACCIÓN DEL JTEXTFIELD NOMBRES
    private void txtnombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyPressed
        //CREAMOS UN OBJETO DE LA CLASEPACIENTES
        ClasePacientes cpa=new ClasePacientes();
        //LIMPIAMOS LA TABLA
        LimpiarTabla(tablapacientes);
        DefaultTableModel modelo=(DefaultTableModel)tablapacientes.getModel();
        //LLAMAMOS EL MÉTODO
        cpa.BusquedaNombres(modelo,txtnombres.getText());
    }//GEN-LAST:event_txtnombresKeyPressed
    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        if(txtnombres.getText().length()==32){
            evt.consume();}
        //MÉTODO PARA PONER MAYÚSCULA INICIAL
        JTextField txtnombre=(JTextField)evt.getComponent();
        String texto=txtnombre.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtnombres.setText(texto);}
    }//GEN-LAST:event_txtnombresKeyTyped
    //ACCIÓN DEL JTEXTFIELD PRIMER APELLIDO
    private void txtprimerapeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimerapeKeyPressed
        //CREAMOS UN OBJETO DE LA CLASEPACIENTES
        ClasePacientes cpa=new ClasePacientes();
        //LIMPIAMOS LA TABLA
        LimpiarTabla(tablapacientes);
        DefaultTableModel modelo=(DefaultTableModel)tablapacientes.getModel();
        //LLAMAMOS EL MÉTODO
        cpa.BusquedaPrimerApe(modelo,txtprimerape.getText());
    }//GEN-LAST:event_txtprimerapeKeyPressed
    private void txtprimerapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimerapeKeyTyped
        if(txtprimerape.getText().length()==20){
            evt.consume();}
        JTextField txtprimera=(JTextField)evt.getComponent();
        String texto=txtprimera.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtprimerape.setText(texto);}
    }//GEN-LAST:event_txtprimerapeKeyTyped
    //ACCIÓN DEL BOTÓN LIMPIAR CON TECCLADO
    private void btnlimpiarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnlimpiarKeyTyped
        Limpiar();
        Iniciar();
    }//GEN-LAST:event_btnlimpiarKeyTyped
    //ACCIÓN DEL BOTÓN REGRESAR CON TECLADO
    private void btnregresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnregresarKeyTyped
        this.dispose();
        Pacientes p=new Pacientes();
        p.setText(lblusuario.getText());
        p.setVisible(true);
    }//GEN-LAST:event_btnregresarKeyTyped
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
                if(!Character.isLetter(c)&&c!=' '){//AQUÍ ESTOY COMPARANDO SI SON LETRAS O ESPACIO EN BLANCO
                    KE.consume();}}});//ANULA EVENTOS DEL TECLADO
    }
    /**
     * MÉTODO LIMPIAR
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void Limpiar(){
        rbbuscarpondocumento.setSelected(false);
        rbbuscarpornombres.setSelected(false);
        txtnombres.setText("");
        txtnombres.setEnabled(false);
        rbbuscarporprimerape.setSelected(false);
        txtprimerape.setText("");
        txtprimerape.setEnabled(false);
        rbbuscarporestado.setSelected(false);
        cbactivo.setEnabled(false);
        cbactivo.setSelected(false);
        cbinactivo.setEnabled(false);
        cbinactivo.setSelected(false);
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
            java.util.logging.Logger.getLogger(TablaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new TablaPacientes().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnlimpiar;
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JCheckBox cbactivo;
    private javax.swing.JCheckBox cbinactivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel pfondo;
    private javax.swing.JRadioButton rbbuscarpondocumento;
    private javax.swing.JRadioButton rbbuscarporestado;
    private javax.swing.JRadioButton rbbuscarpornombres;
    private javax.swing.JRadioButton rbbuscarporprimerape;
    private javax.swing.JTable tablapacientes;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtprimerape;
    // End of variables declaration//GEN-END:variables
}
