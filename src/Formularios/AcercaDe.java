package Formularios;
//LIBRERÍAS IMPORTADAS
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class AcercaDe extends javax.swing.JFrame{
    //CONSTRUCTOR
    public AcercaDe() {
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Acerca de Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        ImageIcon logo=new ImageIcon("src/Imagenes/informacion.png");//CREAMOS UN OBJETO IMAGEICON PARA LLAMAR LA IMAGEN
        Icon icono=new ImageIcon(logo.getImage().getScaledInstance(lblimagen.getWidth(),lblimagen.getHeight(),Image.SCALE_DEFAULT));//CONVERTIMOS LA IMAGEN EN ICONO CON LAS MEDIDAS DEL JLABEL
        lblimagen.setIcon(icono);//CAPTURAMOS LA IMAGEN EN EL JLABEL
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        pfondo2 = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        lblintegrante1 = new javax.swing.JLabel();
        lblintegrante2 = new javax.swing.JLabel();
        lbltitulocorreo = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        lbltitulopw = new javax.swing.JLabel();
        lblversion = new javax.swing.JLabel();
        lblcopyright = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));

        pfondo2.setBackground(new java.awt.Color(255, 255, 255));
        pfondo2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Importante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltitulo.setText("Integrantes:");

        lblintegrante1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblintegrante1.setText("Verónica Arcila Rámirez");

        lblintegrante2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblintegrante2.setText("Robinson Gallego Alzate");

        lbltitulocorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltitulocorreo.setText("Correo:");

        lblcorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcorreo.setForeground(new java.awt.Color(0, 0, 255));
        lblcorreo.setText("shyourhospital@gmail.com");

        lbltitulopw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltitulopw.setText("Página Web:");

        lblversion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblversion.setText("Versión 1.1 (Desarrollado en Netbeans 8.0.2)");

        lblcopyright.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcopyright.setText("© 2015 Your Hospital. Todos los derechos reservados.");

        btncerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncerrar.setText("Cerrar");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        btncerrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btncerrarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pfondo2Layout = new javax.swing.GroupLayout(pfondo2);
        pfondo2.setLayout(pfondo2Layout);
        pfondo2Layout.setHorizontalGroup(
            pfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondo2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitulo)
                    .addComponent(lblintegrante1)
                    .addComponent(lblintegrante2)
                    .addGroup(pfondo2Layout.createSequentialGroup()
                        .addComponent(lbltitulocorreo)
                        .addGap(6, 6, 6)
                        .addComponent(lblcorreo)))
                .addGap(15, 15, 15)
                .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pfondo2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbltitulopw))
            .addGroup(pfondo2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblversion))
            .addGroup(pfondo2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblcopyright))
            .addGroup(pfondo2Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(btncerrar))
        );
        pfondo2Layout.setVerticalGroup(
            pfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondo2Layout.createSequentialGroup()
                .addGroup(pfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondo2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbltitulo)
                        .addGap(11, 11, 11)
                        .addComponent(lblintegrante1)
                        .addGap(6, 6, 6)
                        .addComponent(lblintegrante2)
                        .addGap(11, 11, 11)
                        .addGroup(pfondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltitulocorreo)
                            .addComponent(lblcorreo)))
                    .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(lbltitulopw)
                .addGap(6, 6, 6)
                .addComponent(lblversion)
                .addGap(6, 6, 6)
                .addComponent(lblcopyright)
                .addGap(11, 11, 11)
                .addComponent(btncerrar))
        );

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pfondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pfondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
    //ACCIÓN DEL BOTÓN CERRAR CON CLIC
    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        this.hide();
    }//GEN-LAST:event_btncerrarActionPerformed
    //ACCIÓN DEL BOTÓN CERRAR CON TECLADO
    private void btncerrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncerrarKeyTyped
        this.dispose();
    }//GEN-LAST:event_btncerrarKeyTyped

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
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new AcercaDe().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JLabel lblcopyright;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblintegrante1;
    private javax.swing.JLabel lblintegrante2;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lbltitulocorreo;
    private javax.swing.JLabel lbltitulopw;
    private javax.swing.JLabel lblversion;
    private javax.swing.JPanel pfondo;
    private javax.swing.JPanel pfondo2;
    // End of variables declaration//GEN-END:variables
}
