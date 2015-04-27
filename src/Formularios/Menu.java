package Formularios;
//LIBRERÍAS
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame{
    public Menu(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Menú Principal");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXMonthView1 = new org.jdesktop.swingx.JXMonthView();
        pfondo = new javax.swing.JPanel();
        calendario = new org.jdesktop.swingx.JXMonthView();
        lblfondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mgestiones = new javax.swing.JMenu();
        smpacientes = new javax.swing.JMenuItem();
        smpersonal = new javax.swing.JMenuItem();
        smfarmaceutas = new javax.swing.JMenuItem();
        smtipomenu = new javax.swing.JMenuItem();
        smunidades = new javax.swing.JMenuItem();
        smhabitaciones = new javax.swing.JMenuItem();
        smconsultorios = new javax.swing.JMenuItem();
        smhorarios = new javax.swing.JMenuItem();
        smzona = new javax.swing.JMenuItem();
        mtransacciones = new javax.swing.JMenu();
        smentradasalida = new javax.swing.JMenuItem();
        smfacpacientes = new javax.swing.JMenuItem();
        smfacfarmacia = new javax.swing.JMenuItem();
        sminventario = new javax.swing.JMenuItem();
        smhistoria = new javax.swing.JMenuItem();
        smdiagnostico = new javax.swing.JMenuItem();
        smhospitalizacion = new javax.swing.JMenuItem();
        smseguimiento = new javax.swing.JMenuItem();
        smdietas = new javax.swing.JMenuItem();
        smasignacion = new javax.swing.JMenuItem();
        msalidas = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        mherramientas = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        mayuda = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        msalir = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));
        pfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calendario.setOpaque(false);
        pfondo.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 11, -1, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_opt.png"))); // NOI18N
        pfondo.add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 320));

        mgestiones.setForeground(new java.awt.Color(51, 153, 255));
        mgestiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion_opt.png"))); // NOI18N
        mgestiones.setMnemonic('g');
        mgestiones.setText("Gestiones");
        mgestiones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        smpacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        smpacientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smpacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente_opt.png"))); // NOI18N
        smpacientes.setText("Pacientes");
        mgestiones.add(smpacientes);

        smpersonal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        smpersonal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smpersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/doctor_opt.png"))); // NOI18N
        smpersonal.setText("Personal Médico");
        smpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smpersonalActionPerformed(evt);
            }
        });
        mgestiones.add(smpersonal);

        smfarmaceutas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        smfarmaceutas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smfarmaceutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/farmaceuta_opt.png"))); // NOI18N
        smfarmaceutas.setText("Farmaceutas");
        mgestiones.add(smfarmaceutas);

        smtipomenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        smtipomenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smtipomenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dietetica_opt.png"))); // NOI18N
        smtipomenu.setText("Tipo Menú");
        smtipomenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smtipomenuActionPerformed(evt);
            }
        });
        mgestiones.add(smtipomenu);

        smunidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        smunidades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smunidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unidades_opt.png"))); // NOI18N
        smunidades.setText("Unidades Funcionales");
        mgestiones.add(smunidades);

        smhabitaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        smhabitaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smhabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/habitaciones_opt.png"))); // NOI18N
        smhabitaciones.setText("Habitaciones");
        mgestiones.add(smhabitaciones);

        smconsultorios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        smconsultorios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smconsultorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultorio_opt.png"))); // NOI18N
        smconsultorios.setText("Consultorios");
        mgestiones.add(smconsultorios);

        smhorarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        smhorarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smhorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/horario_opt.png"))); // NOI18N
        smhorarios.setText("Horarios");
        mgestiones.add(smhorarios);

        smzona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        smzona.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smzona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrador_opt.png"))); // NOI18N
        smzona.setText("Zona de Reparto");
        mgestiones.add(smzona);

        jMenuBar1.add(mgestiones);

        mtransacciones.setForeground(new java.awt.Color(51, 153, 255));
        mtransacciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carpetas_opt.png"))); // NOI18N
        mtransacciones.setMnemonic('t');
        mtransacciones.setText("Transacciones");
        mtransacciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        smentradasalida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        smentradasalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smentradasalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrada_opt.png"))); // NOI18N
        smentradasalida.setText("Entrada y Salida de Pacientes");
        mtransacciones.add(smentradasalida);

        smfacpacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        smfacpacientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smfacpacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/factura_opt.png"))); // NOI18N
        smfacpacientes.setText("Facturación Pacientes");
        mtransacciones.add(smfacpacientes);

        smfacfarmacia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        smfacfarmacia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smfacfarmacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facmedi_opt.png"))); // NOI18N
        smfacfarmacia.setText("Facturación Farmacia");
        mtransacciones.add(smfacfarmacia);

        sminventario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        sminventario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sminventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario_opt.png"))); // NOI18N
        sminventario.setText("Movimientos Inventario");
        mtransacciones.add(sminventario);

        smhistoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        smhistoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smhistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historia clinica_opt.png"))); // NOI18N
        smhistoria.setText("Historia Clinica");
        mtransacciones.add(smhistoria);

        smdiagnostico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        smdiagnostico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smdiagnostico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diagnos_opt.png"))); // NOI18N
        smdiagnostico.setText("Diagnóstico Paciente");
        mtransacciones.add(smdiagnostico);

        smhospitalizacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        smhospitalizacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smhospitalizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hospitalizacion_opt.png"))); // NOI18N
        smhospitalizacion.setText("Hospitalización");
        mtransacciones.add(smhospitalizacion);

        smseguimiento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        smseguimiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smseguimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seguimiento_opt.png"))); // NOI18N
        smseguimiento.setText("Seguimiento Pacientes Hospitalizados");
        mtransacciones.add(smseguimiento);

        smdietas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        smdietas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smdietas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dietas_opt.png"))); // NOI18N
        smdietas.setText("Dietas y Preparación");
        mtransacciones.add(smdietas);

        smasignacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        smasignacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smasignacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario 3_opt.png"))); // NOI18N
        smasignacion.setText("Asignación Horarios");
        mtransacciones.add(smasignacion);

        jMenuBar1.add(mtransacciones);

        msalidas.setForeground(new java.awt.Color(51, 153, 255));
        msalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora_opt.png"))); // NOI18N
        msalidas.setMnemonic('s');
        msalidas.setText("Salidas");
        msalidas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta8_opt.png"))); // NOI18N
        jMenuItem12.setText("Consulta Horario Laboral");
        msalidas.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta2_opt.png"))); // NOI18N
        jMenuItem13.setText("Consulta Habitación Paciente");
        msalidas.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta_opt.png"))); // NOI18N
        jMenuItem14.setText("Consulta Dieta y Preparación");
        msalidas.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta7_opt.png"))); // NOI18N
        jMenuItem15.setText("Consulta Stock Medicamentos");
        msalidas.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta6_opt.png"))); // NOI18N
        jMenuItem16.setText("Consulta Contraindicaciones de Medicamentos");
        msalidas.add(jMenuItem16);
        msalidas.add(jSeparator1);

        jMenuItem17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informeeconomico_opt.png"))); // NOI18N
        jMenuItem17.setText("Informe Ingresos Económicos");
        msalidas.add(jMenuItem17);

        jMenuItem18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informepersonal_opt.png"))); // NOI18N
        jMenuItem18.setText("Informe Personal Médico");
        msalidas.add(jMenuItem18);

        jMenuBar1.add(msalidas);

        mherramientas.setForeground(new java.awt.Color(51, 153, 255));
        mherramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/herramientas_opt.png"))); // NOI18N
        mherramientas.setMnemonic('h');
        mherramientas.setText("Herramientas");
        mherramientas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jMenuItem19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backup2_opt.png"))); // NOI18N
        jMenuItem19.setText("Copia de Seguridad");
        mherramientas.add(jMenuItem19);

        jMenuItem20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario_opt.png"))); // NOI18N
        jMenuItem20.setText("Usuarios");
        mherramientas.add(jMenuItem20);

        jMenuItem21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfiles_opt.png"))); // NOI18N
        jMenuItem21.setText("Perfiles");
        mherramientas.add(jMenuItem21);

        jMenuBar1.add(mherramientas);

        mayuda.setForeground(new java.awt.Color(51, 153, 255));
        mayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda_opt.png"))); // NOI18N
        mayuda.setMnemonic('a');
        mayuda.setText("Ayuda");
        mayuda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jMenuItem22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manual3_opt.png"))); // NOI18N
        jMenuItem22.setText("Manual de Usuario");
        mayuda.add(jMenuItem22);

        jMenuItem23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/servicio2_opt.png"))); // NOI18N
        jMenuItem23.setText("Manual Técnico");
        mayuda.add(jMenuItem23);

        jMenuItem24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta5_opt.png"))); // NOI18N
        jMenuItem24.setText("Acerca de");
        mayuda.add(jMenuItem24);

        jMenuBar1.add(mayuda);

        msalir.setForeground(new java.awt.Color(51, 153, 255));
        msalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIR.PNG"))); // NOI18N
        msalir.setText("Salir");
        msalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jMenuItem25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIR.PNG"))); // NOI18N
        jMenuItem25.setText("Salida Segura");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        msalir.add(jMenuItem25);

        jMenuBar1.add(msalir);

        setJMenuBar(jMenuBar1);

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
    //ACCIÓN DEL SUBMENÚ PERSONAL
    private void smpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smpersonalActionPerformed
        this.dispose();
        PersonalMedico personalMedico=new PersonalMedico();
        personalMedico.setVisible(true);
    }//GEN-LAST:event_smpersonalActionPerformed
    //ACCIÓN DEL SUBMENÚ TIPO MENÚ
    private void smtipomenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smtipomenuActionPerformed
        this.dispose();
        TipoMenu tipoMenu=new TipoMenu();
        tipoMenu.setVisible(true);
    }//GEN-LAST:event_smtipomenuActionPerformed
    //ACCIÓN DEL SUBMENÚ SALIR
    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        this.dispose();
        InicioSesion inicio=new InicioSesion();
        inicio.setVisible(true);
    }//GEN-LAST:event_jMenuItem25ActionPerformed
    //MÉTODO MAIN
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Menu().setVisible(true);}});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXMonthView calendario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private org.jdesktop.swingx.JXMonthView jXMonthView1;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JMenu mayuda;
    private javax.swing.JMenu mgestiones;
    private javax.swing.JMenu mherramientas;
    private javax.swing.JMenu msalidas;
    private javax.swing.JMenu msalir;
    private javax.swing.JMenu mtransacciones;
    private javax.swing.JPanel pfondo;
    private javax.swing.JMenuItem smasignacion;
    private javax.swing.JMenuItem smconsultorios;
    private javax.swing.JMenuItem smdiagnostico;
    private javax.swing.JMenuItem smdietas;
    private javax.swing.JMenuItem smentradasalida;
    private javax.swing.JMenuItem smfacfarmacia;
    private javax.swing.JMenuItem smfacpacientes;
    private javax.swing.JMenuItem smfarmaceutas;
    private javax.swing.JMenuItem smhabitaciones;
    private javax.swing.JMenuItem smhistoria;
    private javax.swing.JMenuItem smhorarios;
    private javax.swing.JMenuItem smhospitalizacion;
    private javax.swing.JMenuItem sminventario;
    private javax.swing.JMenuItem smpacientes;
    private javax.swing.JMenuItem smpersonal;
    private javax.swing.JMenuItem smseguimiento;
    private javax.swing.JMenuItem smtipomenu;
    private javax.swing.JMenuItem smunidades;
    private javax.swing.JMenuItem smzona;
    // End of variables declaration//GEN-END:variables
}
