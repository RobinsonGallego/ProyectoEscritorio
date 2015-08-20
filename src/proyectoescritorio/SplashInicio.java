package proyectoescritorio;
/**
 * LIBRERÍAS IMPORTADAS
 * @author Robinson Gallego Alzate
 * @version 1.1
 */
import Formularios.InicioSesion;
import com.sun.awt.AWTUtilities;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class SplashInicio extends javax.swing.JFrame{
    private SplashInicio splashInicio=this;
    /**
     * CONSTRUCTOR SplashInicio
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public SplashInicio() {
        initComponents();
        AWTUtilities.setWindowOpacity(splashInicio,(float)1);
        setTitle("Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        startThread();}
    /**
     * MÉTODO PARA INICIAR EL SPLASH
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void startThread(){
        Thread thread=new Thread(new Runnable(){
            @Override
            public void run(){
                InicioSesion aplicationFrame=new InicioSesion(splashInicio);
                aplicationFrame.setLocationRelativeTo(null);
                aplicationFrame.setVisible(true);
                dispose();}});
        thread.start();}
    public JProgressBar getJProgressBar(){
        return jpbcargar;}
    public JLabel getJLabel(){
        return lblinformacion;}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        jpbcargar = new javax.swing.JProgressBar();
        lblinformacion = new javax.swing.JLabel();
        lblimgenfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));
        pfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpbcargar.setBackground(new java.awt.Color(255, 255, 255));
        jpbcargar.setForeground(new java.awt.Color(255, 153, 51));
        jpbcargar.setBorderPainted(false);
        pfondo.add(jpbcargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 690, 25));

        lblinformacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblinformacion.setText("Loading Information");
        pfondo.add(lblinformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 310, 20));

        lblimgenfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        pfondo.add(lblimgenfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

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
            java.util.logging.Logger.getLogger(SplashInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SplashInicio().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jpbcargar;
    private javax.swing.JLabel lblimgenfondo;
    private javax.swing.JLabel lblinformacion;
    private javax.swing.JPanel pfondo;
    // End of variables declaration//GEN-END:variables
}
