package Formularios;
//LIBRERÍAS IMPORTADAS
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class NuevaConsulta extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    public NuevaConsulta() {
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Nueva Consulta Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        tasintomas.requestFocus();
        Iniciar();}
    /**
     * MÉTODO ALTERNO INICIAR
     */
    private void Iniciar(){
        txtfechaconsulta.setText(getFechaActual());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        lblfechaconsulta = new javax.swing.JLabel();
        txtfechaconsulta = new javax.swing.JTextField();
        lblmedico = new javax.swing.JLabel();
        txtmedico = new javax.swing.JTextField();
        lblnhc = new javax.swing.JLabel();
        lblnumero = new javax.swing.JLabel();
        lblsintomas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tasintomas = new javax.swing.JTextArea();
        lblcaracteres = new javax.swing.JLabel();
        lblcontadorsintomas = new javax.swing.JLabel();
        lblpeso = new javax.swing.JLabel();
        lblestatura = new javax.swing.JLabel();
        lblpresion = new javax.swing.JLabel();
        rbnormal = new javax.swing.JRadioButton();
        rbbaja = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        lblkg = new javax.swing.JLabel();
        lblmts = new javax.swing.JLabel();
        ftxestatura = new javax.swing.JFormattedTextField();
        txtpeso = new javax.swing.JTextField();
        lblantecedentes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taantecedentes = new javax.swing.JTextArea();
        lbldiagnostico = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tadiagnostico = new javax.swing.JTextArea();
        lblobservaciones = new javax.swing.JLabel();
        lblobservaciones2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taobservaciones = new javax.swing.JTextArea();
        lblcaracteres2 = new javax.swing.JLabel();
        lblcontadorobservaciones = new javax.swing.JLabel();
        ptipoconsulta = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));

        lblfechaconsulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblfechaconsulta.setText("Fecha Consulta");

        txtfechaconsulta.setEditable(false);
        txtfechaconsulta.setBackground(new java.awt.Color(255, 255, 255));
        txtfechaconsulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblmedico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmedico.setText("Médico");

        txtmedico.setEditable(false);
        txtmedico.setBackground(new java.awt.Color(255, 255, 255));
        txtmedico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblnhc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblnhc.setText("N° de H.C");

        lblnumero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblsintomas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsintomas.setText("Sintomas *");

        tasintomas.setColumns(20);
        tasintomas.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        tasintomas.setRows(5);
        tasintomas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tasintomasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tasintomasKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tasintomas);

        lblcaracteres.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblcaracteres.setForeground(new java.awt.Color(255, 0, 0));
        lblcaracteres.setText("Caracteres");

        lblcontadorsintomas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblcontadorsintomas.setForeground(new java.awt.Color(255, 0, 0));

        lblpeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpeso.setText("Peso *");

        lblestatura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblestatura.setText("Estatura *");

        lblpresion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpresion.setText("Presión *");

        rbnormal.setBackground(new java.awt.Color(255, 255, 255));
        rbnormal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbnormal.setText("Normal");

        rbbaja.setBackground(new java.awt.Color(255, 255, 255));
        rbbaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbaja.setText("Baja");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Alta");

        lblkg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblkg.setForeground(new java.awt.Color(153, 153, 153));
        lblkg.setText("Kg");

        lblmts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmts.setForeground(new java.awt.Color(153, 153, 153));
        lblmts.setText("Mts");

        try {
            ftxestatura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxestatura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtpeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpesoKeyTyped(evt);
            }
        });

        lblantecedentes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblantecedentes.setText("Antecedentes Familiares *");

        taantecedentes.setColumns(20);
        taantecedentes.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        taantecedentes.setRows(5);
        taantecedentes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taantecedentesKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(taantecedentes);

        lbldiagnostico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldiagnostico.setText("Diagnóstico *");

        tadiagnostico.setColumns(20);
        tadiagnostico.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        tadiagnostico.setRows(5);
        tadiagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tadiagnosticoKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tadiagnostico);

        lblobservaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblobservaciones.setText("Observaciones");

        lblobservaciones2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblobservaciones2.setForeground(new java.awt.Color(102, 102, 102));
        lblobservaciones2.setText("(Alergías, Medicación, Cirugías)");

        taobservaciones.setColumns(20);
        taobservaciones.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        taobservaciones.setRows(5);
        taobservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taobservacionesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taobservacionesKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(taobservaciones);

        lblcaracteres2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblcaracteres2.setForeground(new java.awt.Color(255, 0, 0));
        lblcaracteres2.setText("Caracteres");

        lblcontadorobservaciones.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblcontadorobservaciones.setForeground(new java.awt.Color(255, 0, 0));

        ptipoconsulta.setBackground(new java.awt.Color(255, 255, 255));
        ptipoconsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Consulta *", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        javax.swing.GroupLayout ptipoconsultaLayout = new javax.swing.GroupLayout(ptipoconsulta);
        ptipoconsulta.setLayout(ptipoconsultaLayout);
        ptipoconsultaLayout.setHorizontalGroup(
            ptipoconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        ptipoconsultaLayout.setVerticalGroup(
            ptipoconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addComponent(lblcaracteres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcontadorsintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblsintomas)
                        .addGroup(pfondoLayout.createSequentialGroup()
                            .addComponent(lblfechaconsulta)
                            .addGap(18, 18, 18)
                            .addComponent(txtfechaconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(lblmedico)
                            .addGap(18, 18, 18)
                            .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pfondoLayout.createSequentialGroup()
                                    .addComponent(lblnhc)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfondoLayout.createSequentialGroup()
                            .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pfondoLayout.createSequentialGroup()
                                    .addComponent(lblpeso)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblkg)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblestatura)
                                    .addGap(18, 18, 18))
                                .addGroup(pfondoLayout.createSequentialGroup()
                                    .addComponent(lblantecedentes)
                                    .addGap(118, 118, 118)))
                            .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbldiagnostico)
                                .addGroup(pfondoLayout.createSequentialGroup()
                                    .addComponent(ftxestatura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblmts)
                                    .addGap(56, 56, 56)
                                    .addComponent(lblpresion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbnormal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbbaja)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton1))
                                .addComponent(jScrollPane3)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pfondoLayout.createSequentialGroup()
                            .addComponent(lblobservaciones)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblobservaciones2))
                        .addComponent(jScrollPane4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptipoconsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblcaracteres2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcontadorobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnhc)
                    .addComponent(lblnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfechaconsulta)
                            .addComponent(txtfechaconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmedico)
                            .addComponent(txtmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblsintomas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ptipoconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcaracteres)
                    .addComponent(lblcontadorsintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpeso)
                    .addComponent(lblestatura)
                    .addComponent(lblpresion)
                    .addComponent(rbnormal)
                    .addComponent(rbbaja)
                    .addComponent(jRadioButton1)
                    .addComponent(lblkg)
                    .addComponent(lblmts)
                    .addComponent(ftxestatura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblantecedentes)
                    .addComponent(lbldiagnostico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblobservaciones)
                    .addComponent(lblobservaciones2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcaracteres2)
                    .addComponent(lblcontadorobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
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
    //LIMITANTES Y TRANSFERENCIA DE FOCUS
    private void tasintomasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tasintomasKeyPressed
        if(tasintomas.getText().length()==400){
            evt.consume();}
        if(evt.getKeyCode()==KeyEvent.VK_TAB){
            txtpeso.requestFocus();}
    }//GEN-LAST:event_tasintomasKeyPressed
    //CONTEO DE CARACTERES
    private void tasintomasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tasintomasKeyTyped
        int conteo=tasintomas.getText().length();
        lblcontadorsintomas.setText(String.valueOf(conteo));
        if(conteo>399){
            evt.consume();}
    }//GEN-LAST:event_tasintomasKeyTyped
    private void txtpesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesoKeyTyped
        if(txtpeso.getText().length()==4){
            evt.consume();}
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtpeso){
            if(Contador==10){
                ftxestatura.requestFocus();}}
    }//GEN-LAST:event_txtpesoKeyTyped
    private void taantecedentesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taantecedentesKeyPressed
        if(taantecedentes.getText().length()==100){
            evt.consume();}
        if(evt.getKeyCode()==KeyEvent.VK_TAB){
            tadiagnostico.requestFocus();}
    }//GEN-LAST:event_taantecedentesKeyPressed
    private void tadiagnosticoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tadiagnosticoKeyPressed
        if(tadiagnostico.getText().length()==200){
            evt.consume();}
        if(evt.getKeyCode()==KeyEvent.VK_TAB){
            taobservaciones.requestFocus();}
    }//GEN-LAST:event_tadiagnosticoKeyPressed
    private void taobservacionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taobservacionesKeyPressed
        if(taobservaciones.getText().length()==400){
            evt.consume();}
        if(evt.getKeyCode()==KeyEvent.VK_TAB){
            taobservaciones.requestFocus();}
    }//GEN-LAST:event_taobservacionesKeyPressed
    private void taobservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taobservacionesKeyTyped
        int conteo=taobservaciones.getText().length();
        lblcontadorobservaciones.setText(String.valueOf(conteo));
        if(conteo>399){
            evt.consume();}
    }//GEN-LAST:event_taobservacionesKeyTyped
    /**
     * MÉTODO PARA OBTENER LA FECHA DEL SISTEMA
     * @return un String con la fecha del día Actual
     */
    private static String getFechaActual(){
        Date hoy=new Date();
        SimpleDateFormat formateador=new SimpleDateFormat("d/MM/yyyy");
        return formateador.format(hoy);}
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
            java.util.logging.Logger.getLogger(NuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new NuevaConsulta().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ftxestatura;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblantecedentes;
    private javax.swing.JLabel lblcaracteres;
    private javax.swing.JLabel lblcaracteres2;
    private javax.swing.JLabel lblcontadorobservaciones;
    private javax.swing.JLabel lblcontadorsintomas;
    private javax.swing.JLabel lbldiagnostico;
    private javax.swing.JLabel lblestatura;
    private javax.swing.JLabel lblfechaconsulta;
    private javax.swing.JLabel lblkg;
    private javax.swing.JLabel lblmedico;
    private javax.swing.JLabel lblmts;
    private javax.swing.JLabel lblnhc;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JLabel lblobservaciones;
    private javax.swing.JLabel lblobservaciones2;
    private javax.swing.JLabel lblpeso;
    private javax.swing.JLabel lblpresion;
    private javax.swing.JLabel lblsintomas;
    private javax.swing.JPanel pfondo;
    private javax.swing.JPanel ptipoconsulta;
    private javax.swing.JRadioButton rbbaja;
    private javax.swing.JRadioButton rbnormal;
    private javax.swing.JTextArea taantecedentes;
    private javax.swing.JTextArea tadiagnostico;
    private javax.swing.JTextArea taobservaciones;
    private javax.swing.JTextArea tasintomas;
    private javax.swing.JTextField txtfechaconsulta;
    private javax.swing.JTextField txtmedico;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
