package Tablas;

import Clases.ClaseHabitaciones;
import Formularios.Habitaciones;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TablaHabitaciones extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    //CONSTRUCTOR
    public TablaHabitaciones(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEAMOS EL TAMAÑO DE LA VENTANA
        setTitle("Tabla Habitaciones");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        Iniciar();
    }
    /**
     * MÉTODO ALTERNO INICIAR
     */
    private void Iniciar(){
        //LIMPIAMOS LA TABLA
        LimpiarTabla(tablahabitaciones);
        //PONEMOS TODOS LOS DATOS POR DEFECTO
        DefaultTableModel modelo=(DefaultTableModel)tablahabitaciones.getModel();
        //CREAMOS UN OBJETO DE LA CLASEHABITACIONES
        ClaseHabitaciones ch=new ClaseHabitaciones();
        //LLAMAMOS EL MÉTODO
        ch.LlenarDatos(modelo);
        FormatoTabla();
    }
    /**
     * MÉTODO PARA DARLE TAMAÑO A CADA COLUMNA DE LA TABLA
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void FormatoTabla(){
        //MODIFICAMOS LOS TÍTULOS DE LAS COLUMNAS
        JTableHeader th;
        th=tablahabitaciones.getTableHeader();
        Font fuente=new Font("Tahoma",Font.BOLD,12);
        th.setFont(fuente);
        //PONEMOS TAMAÑO A CADA COLUMNA
        tablahabitaciones.getColumnModel().getColumn(0).setWidth(25);
        tablahabitaciones.getColumnModel().getColumn(0).setMaxWidth(105);
        tablahabitaciones.getColumnModel().getColumn(0).setMinWidth(25);
        tablahabitaciones.getColumnModel().getColumn(0).setHeaderValue("ID Habitación");
        tablahabitaciones.getColumnModel().getColumn(1).setWidth(25);
        tablahabitaciones.getColumnModel().getColumn(1).setMaxWidth(105);
        tablahabitaciones.getColumnModel().getColumn(1).setMinWidth(25);
        tablahabitaciones.getColumnModel().getColumn(1).setHeaderValue("N° Habitación");
        tablahabitaciones.getColumnModel().getColumn(2).setWidth(25);
        tablahabitaciones.getColumnModel().getColumn(2).setMaxWidth(40);
        tablahabitaciones.getColumnModel().getColumn(2).setMinWidth(25);
        tablahabitaciones.getColumnModel().getColumn(2).setHeaderValue("Piso");        
        tablahabitaciones.getColumnModel().getColumn(3).setWidth(25);
        tablahabitaciones.getColumnModel().getColumn(3).setMaxWidth(70);
        tablahabitaciones.getColumnModel().getColumn(3).setMinWidth(25);
        tablahabitaciones.getColumnModel().getColumn(3).setHeaderValue("N° Camas");        
        tablahabitaciones.getColumnModel().getColumn(4).setWidth(25);
        tablahabitaciones.getColumnModel().getColumn(4).setMaxWidth(240);
        tablahabitaciones.getColumnModel().getColumn(4).setMinWidth(25);
        tablahabitaciones.getColumnModel().getColumn(4).setHeaderValue("Tipo Servicio");
        tablahabitaciones.getColumnModel().getColumn(5).setWidth(25);
        tablahabitaciones.getColumnModel().getColumn(5).setMaxWidth(140);
        tablahabitaciones.getColumnModel().getColumn(5).setMinWidth(25);
        tablahabitaciones.getColumnModel().getColumn(5).setHeaderValue("Estado");
    }
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
            ((DefaultTableModel)tabla.getModel()).removeRow(0);}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        lblimagen = new javax.swing.JLabel();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();
        btnlimpiar = new org.edisoncor.gui.button.ButtonTask();
        rbbuscarestado = new javax.swing.JRadioButton();
        cbdisponible = new javax.swing.JCheckBox();
        cbocupada = new javax.swing.JCheckBox();
        rbbuscartiposervicio = new javax.swing.JRadioButton();
        cbtiposervicio = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablahabitaciones = new javax.swing.JTable();

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

        rbbuscarestado.setBackground(new java.awt.Color(255, 255, 255));
        rbbuscarestado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbuscarestado.setText("Buscar por Estado");
        rbbuscarestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbuscarestadoActionPerformed(evt);
            }
        });

        cbdisponible.setBackground(new java.awt.Color(255, 255, 255));
        cbdisponible.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbdisponible.setText("Disponible");
        cbdisponible.setEnabled(false);
        cbdisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdisponibleActionPerformed(evt);
            }
        });

        cbocupada.setBackground(new java.awt.Color(255, 255, 255));
        cbocupada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbocupada.setText("Ocupada");
        cbocupada.setEnabled(false);
        cbocupada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocupadaActionPerformed(evt);
            }
        });

        rbbuscartiposervicio.setBackground(new java.awt.Color(255, 255, 255));
        rbbuscartiposervicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbuscartiposervicio.setText("Buscar Tipo Servicio");
        rbbuscartiposervicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbuscartiposervicioActionPerformed(evt);
            }
        });

        cbtiposervicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbtiposervicio.setEnabled(false);
        cbtiposervicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtiposervicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblimagen)
                .addGap(4, 4, 4)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addComponent(rbbuscartiposervicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbtiposervicio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addComponent(rbbuscarestado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(cbdisponible)
                        .addGap(1, 1, 1)
                        .addComponent(cbocupada)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbbuscarestado)
                    .addComponent(cbdisponible)
                    .addComponent(cbocupada))
                .addGap(18, 18, 18)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbbuscartiposervicio)
                    .addComponent(cbtiposervicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pfondoLayout.createSequentialGroup()
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tablahabitaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablahabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Habitación", "N° Habitación", "Piso", "N° Camas", "Tipo Servicio", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablahabitaciones);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ACCIÓN DEL RADIOBUTTON BUSCAR ESTADO
    private void rbbuscarestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbuscarestadoActionPerformed
        rbbuscartiposervicio.setSelected(false);
        cbtiposervicio.setSelectedItem("");
        cbtiposervicio.setEnabled(false);
        cbdisponible.setEnabled(true);
        cbocupada.setEnabled(true);
        cbdisponible.setSelected(false);
        cbocupada.setSelected(false);
        LimpiarTabla(tablahabitaciones);
    }//GEN-LAST:event_rbbuscarestadoActionPerformed
    //ACCIÓN DEL RADIOBUTTON BUSCAR TIPO SERVICIO
    private void rbbuscartiposervicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbuscartiposervicioActionPerformed
        rbbuscarestado.setSelected(false);
        cbdisponible.setEnabled(false);
        cbocupada.setEnabled(false);
        cbdisponible.setSelected(false);
        cbocupada.setSelected(false);
        cbtiposervicio.setEnabled(true);
        cbtiposervicio.requestFocus();
        LimpiarTabla(tablahabitaciones);
        //LIMPIAMOS LOS COMBOBOX
        cbtiposervicio.removeAllItems();
        //PONEMOS UN ITEM POR DEFECTO
        cbtiposervicio.addItem("");
        //CREAMOS EL OBJETO CLASEHABITACIONES
        ClaseHabitaciones ch=new ClaseHabitaciones();
        //LLAMAMOS MÉTODO PARA LLENAR COMBOBOX
        ch.LlenarTipoServicio(cbtiposervicio);
    }//GEN-LAST:event_rbbuscartiposervicioActionPerformed
    //ACCIÓN DEL CHECKBOX DISPONIBLE
    private void cbdisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdisponibleActionPerformed
        rbbuscarestado.setSelected(false);
        cbocupada.setEnabled(false);
        cbocupada.setSelected(false);
        //CREAMOS EL OBJETO CLASEHABITACIONES
        ClaseHabitaciones ch=new ClaseHabitaciones();
        DefaultTableModel modelo=(DefaultTableModel)tablahabitaciones.getModel();
        //LLAMAMOS EL MÉTODO
        ch.BusquedaEstado(modelo,cbdisponible.getText());
    }//GEN-LAST:event_cbdisponibleActionPerformed
    //ACCIÓN DEL CHECKBOX OCUPADA
    private void cbocupadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocupadaActionPerformed
        rbbuscarestado.setSelected(false);
        cbdisponible.setEnabled(false);
        cbdisponible.setSelected(false);
        //CREAMOS EL OBJETO CLASEHABITACIONES
        ClaseHabitaciones ch=new ClaseHabitaciones();
        DefaultTableModel modelo=(DefaultTableModel)tablahabitaciones.getModel();
        //LLAMAMOS EL MÉTODO
        ch.BusquedaEstado(modelo,cbocupada.getText());
    }//GEN-LAST:event_cbocupadaActionPerformed
    //ACCIÓN DEL COMBOBOX TIPO SERVICIO
    private void cbtiposervicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtiposervicioActionPerformed
        if(cbtiposervicio.getSelectedItem().equals("")){
            LimpiarTabla(tablahabitaciones);}
        else{
            int seleccion=cbtiposervicio.getSelectedIndex();
            TipoServicio(seleccion);}
    }//GEN-LAST:event_cbtiposervicioActionPerformed
    //ACCIÓN DEL BOTÓN REGRESAR CON CLIC
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        Habitaciones h=new Habitaciones();
        h.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed
    //ACCIÓN DEL BOTÓN REGRESAR CON TECLADO
    private void btnregresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnregresarKeyTyped
        this.dispose();
        Habitaciones h=new Habitaciones();
        h.setVisible(true);
    }//GEN-LAST:event_btnregresarKeyTyped
    //ACCIÓN DEL BOTÓN LIMPIAR CON CLIC
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
        Iniciar();
    }//GEN-LAST:event_btnlimpiarActionPerformed
    //ACCIÓN DEL BOTÓN LIMPIAR CON TECLADO
    private void btnlimpiarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnlimpiarKeyTyped
        Limpiar();
        Iniciar();
    }//GEN-LAST:event_btnlimpiarKeyTyped
    /**
     * MÉTODO LIMPIAR
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void Limpiar(){
        rbbuscartiposervicio.setSelected(false);
        rbbuscarestado.setSelected(false);
        cbtiposervicio.setSelectedItem("");
        cbtiposervicio.setEnabled(false);
        cbdisponible.setEnabled(false);
        cbocupada.setEnabled(false);
        cbdisponible.setSelected(false);
        cbocupada.setSelected(false);
    }
    /**
     * MÉTODO PARA BUSCAR POR TIPO SERVICIO
     * SE LIMPIA LA TABLA CADA QUE HAY UNA SELECCIÓN EN EL JCOMBOBOX
     */
    private void TipoServicio(int seleccion){
        LimpiarTabla(tablahabitaciones);
        //CREAMOS EL OBJETO CLASEHABITACIONES
        ClaseHabitaciones ch=new ClaseHabitaciones();
        DefaultTableModel modelo=(DefaultTableModel)tablahabitaciones.getModel();
        //LLAMAMOS EL MÉTODO
        ch.BusquedaTipoServicio(modelo,seleccion);}
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
            java.util.logging.Logger.getLogger(TablaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new TablaHabitaciones().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnlimpiar;
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JCheckBox cbdisponible;
    private javax.swing.JCheckBox cbocupada;
    private javax.swing.JComboBox cbtiposervicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JPanel pfondo;
    private javax.swing.JRadioButton rbbuscarestado;
    private javax.swing.JRadioButton rbbuscartiposervicio;
    private javax.swing.JTable tablahabitaciones;
    // End of variables declaration//GEN-END:variables
}
