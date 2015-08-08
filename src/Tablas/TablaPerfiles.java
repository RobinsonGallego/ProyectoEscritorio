package Tablas;

import Clases.ClasePacientes;
import Clases.ClasePerfiles;
import Formularios.Perfiles;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TablaPerfiles extends javax.swing.JFrame{
    public TablaPerfiles(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Tabla Perfiles");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        btnregresar.requestFocus();
        Iniciar();
    }
    /**
     * MÉTODO ALTERNO INICIAR
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void Iniciar(){
        //LIMPIAMOS LA TABLA
        LimpiarTabla(tablaperfiles);
        //PONEMOS TODOS LOS DATOS POR DEFECTO
        DefaultTableModel modelo=(DefaultTableModel)tablaperfiles.getModel();
        //CREAMOS UN OBJETO DE LA CLASEPERFILES
        ClasePerfiles cpf=new ClasePerfiles();
        //LLAMAMOS EL MÉTODO
        cpf.LlenarDatos(modelo);
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
        th=tablaperfiles.getTableHeader();
        Font fuente=new Font("Tahoma",Font.BOLD,12);
        th.setFont(fuente);
        //PONEMOS TAMAÑO A CADA COLUMNA
        tablaperfiles.getColumnModel().getColumn(0).setWidth(25);
        tablaperfiles.getColumnModel().getColumn(0).setMaxWidth(100);
        tablaperfiles.getColumnModel().getColumn(0).setMinWidth(25);
        tablaperfiles.getColumnModel().getColumn(0).setHeaderValue("Código Perfil");
        tablaperfiles.getColumnModel().getColumn(1).setWidth(25);
        tablaperfiles.getColumnModel().getColumn(1).setMaxWidth(280);
        tablaperfiles.getColumnModel().getColumn(1).setMinWidth(25);
        tablaperfiles.getColumnModel().getColumn(1).setHeaderValue("Descripción Perfil");
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
        btnregresar = new org.edisoncor.gui.button.ButtonTask();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaperfiles = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfondoLayout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );

        tablaperfiles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaperfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código Perfil", "Descripción Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaperfiles);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ACCIÓN DEL BOTÓN REGRESAR
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        Perfiles p=new Perfiles();
        p.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed
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
            java.util.logging.Logger.getLogger(TablaPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaPerfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new TablaPerfiles().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pfondo;
    private javax.swing.JTable tablaperfiles;
    // End of variables declaration//GEN-END:variables
}
