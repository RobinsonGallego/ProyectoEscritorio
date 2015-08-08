package Formularios;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class HistoriaClinica extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    //CONSTRUCTOR
    public HistoriaClinica() {
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setExtendedState(MAXIMIZED_BOTH);//TAMAÑO MAXIMO DE LA VENTANA
        setTitle("Personal Médico Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        jtppestanas = new javax.swing.JTabbedPane();
        pinfopersonal = new javax.swing.JPanel();
        ppinfopaciente = new javax.swing.JPanel();
        lblnhc = new javax.swing.JLabel();
        lblnhcrecibida = new javax.swing.JLabel();
        lbltipodocu = new javax.swing.JLabel();
        lblnumdocu = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblprimerape = new javax.swing.JLabel();
        lblsegundoape = new javax.swing.JLabel();
        txttipodocu = new javax.swing.JTextField();
        txtnumdocu = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtprimerape = new javax.swing.JTextField();
        txtsegundoape = new javax.swing.JTextField();
        lblgenero = new javax.swing.JLabel();
        lblnumtelefono = new javax.swing.JLabel();
        lblnummovil = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lblfechanacimiento = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        lblestadocivil = new javax.swing.JLabel();
        lblpais = new javax.swing.JLabel();
        lblciudad = new javax.swing.JLabel();
        lblprofesion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));

        jtppestanas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        pinfopersonal.setBackground(new java.awt.Color(255, 255, 255));

        ppinfopaciente.setBackground(new java.awt.Color(255, 255, 255));
        ppinfopaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información del Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblnhc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblnhc.setText("N° de H.C");

        lblnhcrecibida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblnhcrecibida.setForeground(new java.awt.Color(255, 0, 0));

        lbltipodocu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltipodocu.setText("Tipo de Documento");

        lblnumdocu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumdocu.setText("N° de Documento");

        lblnombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnombres.setText("Nombres");

        lblprimerape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblprimerape.setText("Primer Apellido");

        lblsegundoape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsegundoape.setText("Segundo Apellido");

        txttipodocu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtnumdocu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtnombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtprimerape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtsegundoape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblgenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblgenero.setText("Género");

        lblnumtelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumtelefono.setText("N° Teléfono");

        lblnummovil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnummovil.setText("N° Móvil");

        lbldireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldireccion.setText("Dirección Residencia");

        lblfechanacimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblfechanacimiento.setText("Fecha de Nacimiento");

        lblcorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcorreo.setText("Correo");

        lblestadocivil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblestadocivil.setText("Estado Civil");

        lblpais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpais.setText("País Nacimiento");

        lblciudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblciudad.setText("Ciudad Nacimiento");

        lblprofesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblprofesion.setText("Profesión");

        javax.swing.GroupLayout ppinfopacienteLayout = new javax.swing.GroupLayout(ppinfopaciente);
        ppinfopaciente.setLayout(ppinfopacienteLayout);
        ppinfopacienteLayout.setHorizontalGroup(
            ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppinfopacienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblnhc)
                .addGap(18, 18, 18)
                .addComponent(lblnhcrecibida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(ppinfopacienteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblprofesion)
                    .addComponent(lblestadocivil)
                    .addComponent(lbldireccion)
                    .addComponent(lblgenero)
                    .addGroup(ppinfopacienteLayout.createSequentialGroup()
                        .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltipodocu)
                            .addComponent(lblnumdocu)
                            .addComponent(lblnombres)
                            .addComponent(lblprimerape)
                            .addComponent(lblsegundoape))
                        .addGap(18, 18, 18)
                        .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txttipodocu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(txtnumdocu, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(ppinfopacienteLayout.createSequentialGroup()
                                .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtsegundoape, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(txtprimerape, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(70, 70, 70)
                                .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnummovil)
                                    .addComponent(lblnumtelefono)
                                    .addComponent(lblfechanacimiento)
                                    .addComponent(lblcorreo)
                                    .addComponent(lblpais)
                                    .addComponent(lblciudad))))))
                .addContainerGap(499, Short.MAX_VALUE))
        );
        ppinfopacienteLayout.setVerticalGroup(
            ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppinfopacienteLayout.createSequentialGroup()
                .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnhc)
                    .addComponent(lblnhcrecibida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltipodocu)
                    .addComponent(txttipodocu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnumdocu)
                    .addComponent(txtnumdocu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombres)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnumtelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprimerape)
                    .addComponent(txtprimerape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnummovil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsegundoape)
                    .addComponent(txtsegundoape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfechanacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblgenero)
                    .addComponent(lblcorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldireccion)
                    .addComponent(lblpais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ppinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblestadocivil)
                    .addComponent(lblciudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblprofesion)
                .addGap(0, 262, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pinfopersonalLayout = new javax.swing.GroupLayout(pinfopersonal);
        pinfopersonal.setLayout(pinfopersonalLayout);
        pinfopersonalLayout.setHorizontalGroup(
            pinfopersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ppinfopaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pinfopersonalLayout.setVerticalGroup(
            pinfopersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ppinfopaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jtppestanas.addTab("Información Personal", pinfopersonal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        jtppestanas.addTab("tab2", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        jtppestanas.addTab("tab3", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        jtppestanas.addTab("tab4", jPanel3);

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtppestanas)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtppestanas, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(HistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new HistoriaClinica().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask buttonTask1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jtppestanas;
    private javax.swing.JLabel lblciudad;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblestadocivil;
    private javax.swing.JLabel lblfechanacimiento;
    private javax.swing.JLabel lblgenero;
    private javax.swing.JLabel lblnhc;
    private javax.swing.JLabel lblnhcrecibida;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lblnumdocu;
    private javax.swing.JLabel lblnummovil;
    private javax.swing.JLabel lblnumtelefono;
    private javax.swing.JLabel lblpais;
    private javax.swing.JLabel lblprimerape;
    private javax.swing.JLabel lblprofesion;
    private javax.swing.JLabel lblsegundoape;
    private javax.swing.JLabel lbltipodocu;
    private javax.swing.JPanel pfondo;
    private javax.swing.JPanel pinfopersonal;
    private javax.swing.JPanel ppinfopaciente;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtnumdocu;
    private javax.swing.JTextField txtprimerape;
    private javax.swing.JTextField txtsegundoape;
    private javax.swing.JTextField txttipodocu;
    // End of variables declaration//GEN-END:variables
}
