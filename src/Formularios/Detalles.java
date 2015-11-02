package Formularios;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Detalles extends javax.swing.JDialog{
    public Detalles(java.awt.Frame parent,boolean modal){
        super(parent,modal);
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Detalles Consulta");//TÍTULO DE LA VENTANA
    }
    /**
     * 
     * @param rs
     * @throws java.sql.SQLException
     */
    public void MasDetalles(ResultSet rs)throws SQLException{
        taantecedentes.setText(rs.getString(9));
        tadiagnostico.setText(rs.getString(10));
        tamedicacion.setText(rs.getString(11));
        taobservaciones.setText(rs.getString(12));
        taprocedimientos.setText(rs.getString(13));}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        lblantecedentes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taantecedentes = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tadiagnostico = new javax.swing.JTextArea();
        lbldiagnostico = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tamedicacion = new javax.swing.JTextArea();
        lblmedicacion = new javax.swing.JLabel();
        lblobservaciones = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taobservaciones = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        taprocedimientos = new javax.swing.JTextArea();
        lblprocedimientos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));

        lblantecedentes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblantecedentes.setText("Antecedentes Familiares");

        taantecedentes.setEditable(false);
        taantecedentes.setColumns(20);
        taantecedentes.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        taantecedentes.setRows(5);
        jScrollPane1.setViewportView(taantecedentes);

        tadiagnostico.setEditable(false);
        tadiagnostico.setColumns(20);
        tadiagnostico.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        tadiagnostico.setRows(5);
        jScrollPane3.setViewportView(tadiagnostico);

        lbldiagnostico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldiagnostico.setText("Diagnóstico");

        tamedicacion.setEditable(false);
        tamedicacion.setColumns(20);
        tamedicacion.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        tamedicacion.setRows(5);
        jScrollPane2.setViewportView(tamedicacion);

        lblmedicacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmedicacion.setText("Medicación Recetada");

        lblobservaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblobservaciones.setText("Observaciones");

        taobservaciones.setEditable(false);
        taobservaciones.setColumns(20);
        taobservaciones.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        taobservaciones.setRows(5);
        jScrollPane4.setViewportView(taobservaciones);

        taprocedimientos.setEditable(false);
        taprocedimientos.setColumns(20);
        taprocedimientos.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        taprocedimientos.setRows(5);
        jScrollPane5.setViewportView(taprocedimientos);

        lblprocedimientos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblprocedimientos.setText("Procedimientos Médicos");

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblantecedentes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldiagnostico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmedicacion)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblobservaciones))
                        .addGap(18, 18, 18)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addComponent(lblprocedimientos)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane5))))
                .addContainerGap())
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbldiagnostico)
                        .addComponent(lblmedicacion))
                    .addComponent(lblantecedentes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addComponent(lblprocedimientos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addComponent(lblobservaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(Detalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                Detalles dialog = new Detalles(new javax.swing.JFrame(),true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter(){
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e){
                        System.exit(0);}});
                dialog.setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblantecedentes;
    private javax.swing.JLabel lbldiagnostico;
    private javax.swing.JLabel lblmedicacion;
    private javax.swing.JLabel lblobservaciones;
    private javax.swing.JLabel lblprocedimientos;
    private javax.swing.JPanel pfondo;
    private javax.swing.JTextArea taantecedentes;
    private javax.swing.JTextArea tadiagnostico;
    private javax.swing.JTextArea tamedicacion;
    private javax.swing.JTextArea taobservaciones;
    private javax.swing.JTextArea taprocedimientos;
    // End of variables declaration//GEN-END:variables
}
