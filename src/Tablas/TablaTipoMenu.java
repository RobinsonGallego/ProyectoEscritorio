package Tablas;

import Clases.ClaseTipoMenu;
import Formularios.TipoMenu;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TablaTipoMenu extends javax.swing.JFrame{

    public TablaTipoMenu(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Tabla Tipo Menú");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        btnregresar.requestFocus();
        Iniciar();
    }
    //MÉTODO PARA LLENAR LA TABLA CON LOS DATOS DE LA BASE DE DATOS
    private void Iniciar()
    {
        //LIMPIAMOS LA TABLA
        Limpiar(tablatipomenu);
        //PONEMOS TODOS LOS DATOS POR DEFECTO
        DefaultTableModel modelo=(DefaultTableModel)tablatipomenu.getModel();
        //CREAMOS UN OBJETO DE LA CLASE TIPO MENÚ
        ClaseTipoMenu ctm=new ClaseTipoMenu();
        //LLAMAMOS EL MÉTODO
        ctm.LlenarDatos(modelo);
        FormatoTabla();
        Letras(txtbusquedatm);
        Letras(txtbusquedape);
    }
    //MÉTODO PARA DARLE TAMAÑO A CADA COLUMNA DE LA TABLA
    private void FormatoTabla()
    {
        //PONEMOS TAMAÑO A CADA COLUMNA
        tablatipomenu.getColumnModel().getColumn(0).setWidth(25);
        tablatipomenu.getColumnModel().getColumn(0).setMaxWidth(55);
        tablatipomenu.getColumnModel().getColumn(0).setMinWidth(25);
        tablatipomenu.getColumnModel().getColumn(1).setWidth(25);
        tablatipomenu.getColumnModel().getColumn(1).setMaxWidth(100);
        tablatipomenu.getColumnModel().getColumn(1).setMinWidth(25);
        tablatipomenu.getColumnModel().getColumn(2).setWidth(25);
        tablatipomenu.getColumnModel().getColumn(2).setMaxWidth(265);
        tablatipomenu.getColumnModel().getColumn(2).setMinWidth(25);
        tablatipomenu.getColumnModel().getColumn(3).setWidth(25);
        tablatipomenu.getColumnModel().getColumn(3).setMaxWidth(255);
        tablatipomenu.getColumnModel().getColumn(3).setMinWidth(25);
        tablatipomenu.getColumnModel().getColumn(4).setWidth(25);
        tablatipomenu.getColumnModel().getColumn(4).setMaxWidth(140);
        tablatipomenu.getColumnModel().getColumn(4).setMinWidth(25);
        //MODIFICAMOS LOS TÍTULOS DE LAS COLUMNAS
        JTableHeader th;
        th=tablatipomenu.getTableHeader();
        Font fuente=new Font("Tahoma",Font.BOLD,12);
        th.setFont(fuente);
    }
    //MÉTODO PARA LIMPIAR LOS DATOS EN LA TABLA
    private void Limpiar(JTable tabla)
    {
        //RECORREMOS TODAS LAS FILAS
        while(tabla.getRowCount()>0)
        {
            //Y AQUÍ LAS REMOVEMOS
            ((DefaultTableModel)tabla.getModel()).removeRow(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablatipomenu = new javax.swing.JTable();
        pbusqueda = new javax.swing.JPanel();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();
        txtbusquedatm = new javax.swing.JTextField();
        txtbusquedape = new javax.swing.JTextField();
        rbbusquedatm = new javax.swing.JRadioButton();
        rbbusquedape = new javax.swing.JRadioButton();
        lblimagen = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablatipomenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablatipomenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo Menú", "Componentes", "Contraindicaciones", "Pacientes Especiales"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablatipomenu.setEnabled(false);
        tablatipomenu.setGridColor(new java.awt.Color(204, 204, 204));
        tablatipomenu.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jScrollPane1.setViewportView(tablatipomenu);

        pbusqueda.setBackground(new java.awt.Color(255, 255, 255));
        pbusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 204, 204)), "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

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

        txtbusquedatm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbusquedatm.setEnabled(false);
        txtbusquedatm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbusquedatmKeyPressed(evt);
            }
        });

        txtbusquedape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbusquedape.setEnabled(false);
        txtbusquedape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbusquedapeKeyPressed(evt);
            }
        });

        rbbusquedatm.setBackground(new java.awt.Color(255, 255, 255));
        rbbusquedatm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbusquedatm.setText("Busqueda por Tipo Menú");
        rbbusquedatm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbusquedatmActionPerformed(evt);
            }
        });

        rbbusquedape.setBackground(new java.awt.Color(255, 255, 255));
        rbbusquedape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbusquedape.setText("Busqueda Paciente Especial");
        rbbusquedape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbusquedapeActionPerformed(evt);
            }
        });

        lblimagen.setBackground(new java.awt.Color(255, 255, 255));
        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta4_opt.png"))); // NOI18N

        javax.swing.GroupLayout pbusquedaLayout = new javax.swing.GroupLayout(pbusqueda);
        pbusqueda.setLayout(pbusquedaLayout);
        pbusquedaLayout.setHorizontalGroup(
            pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbbusquedape)
                    .addComponent(rbbusquedatm))
                .addGap(18, 18, 18)
                .addGroup(pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbusquedatm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbusquedape, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pbusquedaLayout.setVerticalGroup(
            pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pbusquedaLayout.createSequentialGroup()
                        .addGroup(pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbusquedatm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbbusquedatm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbusquedape, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbbusquedape)))
                    .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ACCIÓN DEL BOTÓN REGRESAR
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        TipoMenu tipoMenu=new TipoMenu();
        tipoMenu.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed

    private void rbbusquedatmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbusquedatmActionPerformed
        Iniciar();
        rbbusquedape.setSelected(false);
        txtbusquedatm.setEnabled(true);
        txtbusquedatm.requestFocus();
        txtbusquedape.setEnabled(false);
        txtbusquedape.setText("");
    }//GEN-LAST:event_rbbusquedatmActionPerformed

    private void rbbusquedapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbusquedapeActionPerformed
        Iniciar();
        rbbusquedatm.setSelected(false);
        txtbusquedape.setEnabled(true);
        txtbusquedape.requestFocus();
        txtbusquedatm.setEnabled(false);
        txtbusquedatm.setText("");
    }//GEN-LAST:event_rbbusquedapeActionPerformed

    private void txtbusquedatmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedatmKeyPressed
        //CREAMOS UN OBJETO DE LA CLASE TIPO MENÚ
        ClaseTipoMenu ctm=new ClaseTipoMenu();
        //LIMPIAMOS LA TABLA
        Limpiar(tablatipomenu);
        DefaultTableModel modelo=(DefaultTableModel)tablatipomenu.getModel();
        //LLAMAMOS EL MÉTODO
        ctm.BusquedaTipoMenu(modelo,txtbusquedatm.getText());
    }//GEN-LAST:event_txtbusquedatmKeyPressed

    private void txtbusquedapeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedapeKeyPressed
        //CREAMOS UN OBJETO DE LA CLASE TIPO MENÚ
        ClaseTipoMenu ctm=new ClaseTipoMenu();
        //LIMPIAMOS LA TABLA
        Limpiar(tablatipomenu);
        DefaultTableModel modelo=(DefaultTableModel)tablatipomenu.getModel();
        //LLAMAMOS EL MÉTODO
        ctm.BusquedaPacienteE(modelo,txtbusquedape.getText());
    }//GEN-LAST:event_txtbusquedapeKeyPressed
    //MÉTODO QUE VALIDA LETRAS
    private void Letras(final JTextField a)
    {
        a.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent KE)
            {
                char c=KE.getKeyChar();
                if(Character.isDigit(c))//AQUÍ ESTOY COMPARANDO SI ES UN NÚMERO
                {
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();//ANULA EVENTOS DEL TECLADO
                }
            }
        });
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TablaTipoMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JPanel pbusqueda;
    private javax.swing.JRadioButton rbbusquedape;
    private javax.swing.JRadioButton rbbusquedatm;
    private javax.swing.JTable tablatipomenu;
    private javax.swing.JTextField txtbusquedape;
    private javax.swing.JTextField txtbusquedatm;
    // End of variables declaration//GEN-END:variables
}
