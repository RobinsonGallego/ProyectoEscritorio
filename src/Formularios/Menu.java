package Formularios;
/**
 * LIBRERÍAS IMPORTADAS
 * @author Robinson Gallego Alzate
 * @version 1.0
 */
import Clases.ClasePacientes;
import Clases.ClasePerfiles;
import Clases.ClasePersonalMedico;
import Clases.ClaseUsuarios;
import Clases.GenerarReportes;
import java.awt.Desktop;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    /**
     * CONSTRUCTOR Menu
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public Menu(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Menú Principal");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        lblusuario.setVisible(false);}
    /**
     * MÉTODO QUE CAPTURA EL USUARIO QUE INGRESO Y APLICA SU PERFIL 
     * @param user que contiene un String recibido del Inicio de Sessión
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void setText(String user){
        Perfil(user);
        lblusuario.setText(user);}
    /**
     * MÉTODO PARA VALIDAR PERFILES
     * @param usuario que contiene un String para Buscarlo
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void Perfil(String usuario){
        //CREAMOS UN OBJETO DE LA CLASE USUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        ResultSet rs=cu.BuscarUsuario2(usuario);
        try{
            if(rs.next()){                
                //TRANSFORMAMOS EL DATO DEL PERFIL
                int codigoPerfil=Integer.parseInt(rs.getString(8));
                //CREAMOS UN OBJETO DE LA CLASEPERFILES
                ClasePerfiles cp=new ClasePerfiles();
                ResultSet rs2=cp.Buscar(codigoPerfil);
                try{
                    if(rs2.next()){
                        String perfil=rs2.getString(2);
                        switch(perfil){
                            case "Administrador":
                                mgestiones.setEnabled(true);
                                mtransacciones.setEnabled(true);
                                msalidas.setEnabled(true);
                                mherramientas.setEnabled(true);
                                mayuda.setEnabled(true);
                                msalir.setEnabled(true);
                            break;
                            case "Personal médico":
                                //GESTIONES
                                mgestiones.setEnabled(true);
                                smpersonal.setEnabled(false);
                                smfarmaceutas.setEnabled(false);
                                smtipomenu.setEnabled(false);
                                smunidades.setEnabled(false);
                                smhabitaciones.setEnabled(false);
                                smconsultorios.setEnabled(false);
                                smhorarios.setEnabled(false);
                                smzona.setEnabled(false);
                                //TRANSACCIONES
                                mtransacciones.setEnabled(true);
                                smentradasalida.setEnabled(false);
                                smfacpacientes.setEnabled(false);
                                smfacfarmacia.setEnabled(false);
                                sminventario.setEnabled(false);
                                smasignacion.setEnabled(false);
                                //SALIDAS
                                msalidas.setEnabled(true);
                                smconsustockmedicamentos.setEnabled(false);
                                sminformeingresos.setEnabled(false);
                                sminfogastosgenerales.setEnabled(false);
                                sminformapersonalmedico.setEnabled(false);
                                smhojasdevida.setEnabled(false);
                                //HERRAMIENTAS
                                mherramientas.setEnabled(false);
                                //AYUDA
                                mayuda.setEnabled(true);
                                smmanualtecnico.setEnabled(false);
                                //SALIR
                                msalir.setEnabled(true);
                            break;
                            case "Dietética y cocina":
                                //GESTIONES
                                mgestiones.setEnabled(true);
                                smpersonal.setEnabled(false);
                                smfarmaceutas.setEnabled(false);
                                smunidades.setEnabled(false);
                                smhabitaciones.setEnabled(false);
                                smconsultorios.setEnabled(false);
                                smhorarios.setEnabled(false);
                                smzona.setEnabled(false);
                                //TRANSACCIONES
                                mtransacciones.setEnabled(true);
                                smentradasalida.setEnabled(false);
                                smfacpacientes.setEnabled(false);
                                smfacfarmacia.setEnabled(false);
                                sminventario.setEnabled(false);
                                smdiagnostico.setEnabled(false);
                                smhospitalizacion.setEnabled(false);
                                smseguimiento.setEnabled(false);
                                smasignacion.setEnabled(false);
                                //SALIDAS
                                msalidas.setEnabled(true);
                                smconsustockmedicamentos.setEnabled(false);
                                smconsucontraindicaciones.setEnabled(false);
                                sminformeingresos.setEnabled(false);
                                sminfogastosgenerales.setEnabled(false);
                                sminformapersonalmedico.setEnabled(false);
                                smhojasdevida.setEnabled(false);
                                //HERRAMIENTAS
                                mherramientas.setEnabled(false);
                                //AYUDA
                                mayuda.setEnabled(true);
                                smmanualtecnico.setEnabled(false);
                                //SALIR
                                msalir.setEnabled(true);
                            break;
                            case "Admisión":
                                //GESTIONES
                                mgestiones.setEnabled(true);
                                smpersonal.setEnabled(false);
                                smfarmaceutas.setEnabled(false);
                                smtipomenu.setEnabled(false);
                                smunidades.setEnabled(false);
                                smhabitaciones.setEnabled(false);
                                smconsultorios.setEnabled(false);
                                smhorarios.setEnabled(false);
                                smzona.setEnabled(false);
                                //TRANSACCIONES
                                mtransacciones.setEnabled(true);
                                smfacfarmacia.setEnabled(false);
                                sminventario.setEnabled(false);
                                smdiagnostico.setEnabled(false);
                                smhospitalizacion.setEnabled(false);
                                smseguimiento.setEnabled(false);
                                smasignacion.setEnabled(false);
                                //SALIDAS
                                msalidas.setEnabled(true);
                                smconsudietaypreparacion.setEnabled(false);
                                smconsustockmedicamentos.setEnabled(false);
                                smconsucontraindicaciones.setEnabled(false);
                                sminformeingresos.setEnabled(false);
                                sminfogastosgenerales.setEnabled(false);
                                sminformapersonalmedico.setEnabled(false);
                                smhojasdevida.setEnabled(false);
                                //HERRAMIENTAS
                                mherramientas.setEnabled(false);
                                //AYUDA
                                mayuda.setEnabled(true);
                                smmanualtecnico.setEnabled(false);
                                //SALIR
                                msalir.setEnabled(true);
                            break;}}}
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        calendario = new org.jdesktop.swingx.JXMonthView();
        lblfondo = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        mbprincipal = new javax.swing.JMenuBar();
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
        smconsuhorariolaboral = new javax.swing.JMenuItem();
        smconsuhabitacionpaciente = new javax.swing.JMenuItem();
        smconsudietaypreparacion = new javax.swing.JMenuItem();
        smconsustockmedicamentos = new javax.swing.JMenuItem();
        smconsucontraindicaciones = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        sminformeingresos = new javax.swing.JMenuItem();
        sminfogastosgenerales = new javax.swing.JMenuItem();
        sminformapersonalmedico = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        smhojasdevida = new javax.swing.JMenuItem();
        mherramientas = new javax.swing.JMenu();
        smcopiadeseguridad = new javax.swing.JMenuItem();
        smusuarios = new javax.swing.JMenuItem();
        smperfiles = new javax.swing.JMenuItem();
        mayuda = new javax.swing.JMenu();
        smmanualusuario = new javax.swing.JMenuItem();
        smmanualtecnico = new javax.swing.JMenuItem();
        smacercade = new javax.swing.JMenuItem();
        msalir = new javax.swing.JMenu();
        smsalidasegura = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));

        calendario.setOpaque(false);

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_opt.png"))); // NOI18N

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addComponent(lblfondo)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addComponent(lblfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mgestiones.setForeground(new java.awt.Color(51, 153, 255));
        mgestiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion_opt.png"))); // NOI18N
        mgestiones.setMnemonic('g');
        mgestiones.setText("Gestiones");
        mgestiones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        smpacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        smpacientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smpacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente_opt.png"))); // NOI18N
        smpacientes.setText("Pacientes");
        smpacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smpacientesActionPerformed(evt);
            }
        });
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
        smhabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smhabitacionesActionPerformed(evt);
            }
        });
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

        mbprincipal.add(mgestiones);

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
        smhistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smhistoriaActionPerformed(evt);
            }
        });
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

        mbprincipal.add(mtransacciones);

        msalidas.setForeground(new java.awt.Color(51, 153, 255));
        msalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora_opt.png"))); // NOI18N
        msalidas.setMnemonic('s');
        msalidas.setText("Salidas");
        msalidas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        smconsuhorariolaboral.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smconsuhorariolaboral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta8_opt.png"))); // NOI18N
        smconsuhorariolaboral.setText("Consulta Horario Laboral");
        msalidas.add(smconsuhorariolaboral);

        smconsuhabitacionpaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smconsuhabitacionpaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta2_opt.png"))); // NOI18N
        smconsuhabitacionpaciente.setText("Consulta Habitación Paciente");
        msalidas.add(smconsuhabitacionpaciente);

        smconsudietaypreparacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smconsudietaypreparacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta_opt.png"))); // NOI18N
        smconsudietaypreparacion.setText("Consulta Dieta y Preparación");
        msalidas.add(smconsudietaypreparacion);

        smconsustockmedicamentos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smconsustockmedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta7_opt.png"))); // NOI18N
        smconsustockmedicamentos.setText("Consulta Stock Medicamentos");
        msalidas.add(smconsustockmedicamentos);

        smconsucontraindicaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smconsucontraindicaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta6_opt.png"))); // NOI18N
        smconsucontraindicaciones.setText("Consulta Contraindicaciones de Medicamentos");
        msalidas.add(smconsucontraindicaciones);
        msalidas.add(jSeparator1);

        sminformeingresos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sminformeingresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informeeconomico_opt.png"))); // NOI18N
        sminformeingresos.setText("Informe Ingresos Económicos");
        msalidas.add(sminformeingresos);

        sminfogastosgenerales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sminfogastosgenerales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gastos_opt.png"))); // NOI18N
        sminfogastosgenerales.setText("Informe Gastos Generales");
        msalidas.add(sminfogastosgenerales);

        sminformapersonalmedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sminformapersonalmedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informepersonal_opt.png"))); // NOI18N
        sminformapersonalmedico.setText("Informe Personal Médico");
        sminformapersonalmedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sminformapersonalmedicoActionPerformed(evt);
            }
        });
        msalidas.add(sminformapersonalmedico);
        msalidas.add(jSeparator2);

        smhojasdevida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smhojasdevida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/curriculum_opt.png"))); // NOI18N
        smhojasdevida.setText("Hojas de Vida");
        smhojasdevida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smhojasdevidaActionPerformed(evt);
            }
        });
        msalidas.add(smhojasdevida);

        mbprincipal.add(msalidas);

        mherramientas.setForeground(new java.awt.Color(51, 153, 255));
        mherramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/herramientas_opt.png"))); // NOI18N
        mherramientas.setMnemonic('h');
        mherramientas.setText("Herramientas");
        mherramientas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        smcopiadeseguridad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        smcopiadeseguridad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smcopiadeseguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backup2_opt.png"))); // NOI18N
        smcopiadeseguridad.setText("Copia de Seguridad");
        mherramientas.add(smcopiadeseguridad);

        smusuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        smusuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario_opt.png"))); // NOI18N
        smusuarios.setText("Usuarios");
        smusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smusuariosActionPerformed(evt);
            }
        });
        mherramientas.add(smusuarios);

        smperfiles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        smperfiles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smperfiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfiles_opt.png"))); // NOI18N
        smperfiles.setText("Perfiles");
        smperfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smperfilesActionPerformed(evt);
            }
        });
        mherramientas.add(smperfiles);

        mbprincipal.add(mherramientas);

        mayuda.setForeground(new java.awt.Color(51, 153, 255));
        mayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda_opt.png"))); // NOI18N
        mayuda.setMnemonic('a');
        mayuda.setText("Ayuda");
        mayuda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        smmanualusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smmanualusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manual3_opt.png"))); // NOI18N
        smmanualusuario.setText("Manual de Usuario");
        smmanualusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smmanualusuarioActionPerformed(evt);
            }
        });
        mayuda.add(smmanualusuario);

        smmanualtecnico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smmanualtecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/servicio2_opt.png"))); // NOI18N
        smmanualtecnico.setText("Manual Técnico");
        mayuda.add(smmanualtecnico);

        smacercade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smacercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta5_opt.png"))); // NOI18N
        smacercade.setText("Acerca de");
        smacercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smacercadeActionPerformed(evt);
            }
        });
        mayuda.add(smacercade);

        mbprincipal.add(mayuda);

        msalir.setForeground(new java.awt.Color(51, 153, 255));
        msalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIR.PNG"))); // NOI18N
        msalir.setText("Salir");
        msalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        smsalidasegura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        smsalidasegura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIR.PNG"))); // NOI18N
        smsalidasegura.setText("Salida Segura");
        smsalidasegura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smsalidaseguraActionPerformed(evt);
            }
        });
        msalir.add(smsalidasegura);

        mbprincipal.add(msalir);

        setJMenuBar(mbprincipal);

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
    //ACCIÓN DEL SUBMENÚ PERSONAL MÉDICO
    private void smpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smpersonalActionPerformed
        this.dispose();
        PersonalMedico personalMedico=new PersonalMedico();
        personalMedico.setText(lblusuario.getText());
        personalMedico.setVisible(true);
    }//GEN-LAST:event_smpersonalActionPerformed
    //ACCIÓN DEL SUB-MENÚ TIPO MENÚ
    private void smtipomenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smtipomenuActionPerformed
        this.dispose();
        TipoMenu tipoMenu=new TipoMenu();
        tipoMenu.setText(lblusuario.getText());
        tipoMenu.setVisible(true);
    }//GEN-LAST:event_smtipomenuActionPerformed
    //ACCIÓN DEL SUB-MENÚ SALIR
    private void smsalidaseguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smsalidaseguraActionPerformed
        this.dispose();
        InicioSesion inicio=new InicioSesion();
        inicio.setVisible(true);
    }//GEN-LAST:event_smsalidaseguraActionPerformed
    //ACCIÓN DEL SUB-MENÚ USUARIOS
    private void smusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smusuariosActionPerformed
        this.dispose();
        Usuarios usuarios=new Usuarios();
        usuarios.setVisible(true);
    }//GEN-LAST:event_smusuariosActionPerformed
    //ACCIÓN DEL SUB-MENÚ INFORME PERSONAL MÉDICO
    private void sminformapersonalmedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sminformapersonalmedicoActionPerformed
        GenerarReportes reporte=new GenerarReportes();
        reporte.ReportePM();
    }//GEN-LAST:event_sminformapersonalmedicoActionPerformed
    //ACCIÓN DEL SUB-MENÚ HOJAS DE VIDA
    private void smhojasdevidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smhojasdevidaActionPerformed
        String respuesta=(String)JOptionPane.showInputDialog(null,"Ingrese la Identificación","Consultar Hoja de Vida",JOptionPane.QUESTION_MESSAGE,pregunta,null,null);
        if(respuesta==null){}
        else{
            if(!EsNumero(respuesta)){
                JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar.\nEl Dato debe ser un número de Identificación.","Error",JOptionPane.ERROR_MESSAGE,error);}
            else{
                long identificacion=Long.parseLong(respuesta);
                //CREAMOS UN OBJETO DE LA CLASE PERSONAL MÉDICO
                ClasePersonalMedico cpm=new ClasePersonalMedico();
                //HACEMOS LA BUSQUEDA DE LA IDENTIFICACIÓN
                ResultSet rs=cpm.Buscar(identificacion);
                try{
                    if(rs.next()){
                        GenerarReportes reporte=new GenerarReportes();
                        reporte.ReporteHV(identificacion);}
                    else{
                        JOptionPane.showMessageDialog(null,"La Identificación buscada no existe","Información",JOptionPane.INFORMATION_MESSAGE,informacion);}}
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
    }//GEN-LAST:event_smhojasdevidaActionPerformed
    //ACCIÓN DEL SUB-MENÚ PERFILES
    private void smperfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smperfilesActionPerformed
        this.dispose();
        Perfiles perfiles=new Perfiles();
        perfiles.setVisible(true);
    }//GEN-LAST:event_smperfilesActionPerformed
    //ACCIÓN DEL SUB-MENÚ PACIENTES
    private void smpacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smpacientesActionPerformed
        this.dispose();
        Pacientes pacientes=new Pacientes();
        pacientes.setText(lblusuario.getText());
        pacientes.setVisible(true);
    }//GEN-LAST:event_smpacientesActionPerformed
    //ACCIÓN DEL SUB-MENÚ HABITACIONES
    private void smhabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smhabitacionesActionPerformed
        this.dispose();
        Habitaciones h=new Habitaciones();
        h.setText(lblusuario.getText());
        h.setVisible(true);
    }//GEN-LAST:event_smhabitacionesActionPerformed
    //ACCIÓN DEL SUB-MENÚ MANUAL DE USUARIO
    private void smmanualusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smmanualusuarioActionPerformed
        int respuesta=JOptionPane.showConfirmDialog(null,"¿Desea abrir el Manual de Usuario?","Manual de Usuario",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
        if(respuesta==0){
            try{
                File rutaPDF=new File(getClass().getResource("/Documentos/ManualdeusuarioPPI.pdf").getFile());
                Desktop.getDesktop().open(rutaPDF);}
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error en Documento PDF: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
    }//GEN-LAST:event_smmanualusuarioActionPerformed
    //ACCIÓN DEL SUB-MENÚ HISTORIA CLINICA
    private void smhistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smhistoriaActionPerformed
        String respuesta=((String)JOptionPane.showInputDialog(null,"Ingrese el Número de Documento para Historia Clinica.","Consultar Historia Clinica",JOptionPane.QUESTION_MESSAGE,pregunta,null,null));
        if(respuesta==null){
            mtransacciones.requestFocus();}
        else{
            ClasePacientes cpa=new ClasePacientes();
            ResultSet rs=cpa.BuscarIdentificacion(respuesta);
            try{
                if(rs.next()){
                    HistoriaClinica hc=new HistoriaClinica();
                    hc.InfoPaciente(rs);
                    hc.setText(lblusuario.getText());
                    hc.setVisible(true);
                    this.dispose();}
                else{
                    JOptionPane.showMessageDialog(null,"El Documento buscado no existe.","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
                    mtransacciones.requestFocus();}}
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
    }//GEN-LAST:event_smhistoriaActionPerformed
    //ACCIÓN DEL BOTÓN ACERCA DE... CON CLIC
    private void smacercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smacercadeActionPerformed
        AcercaDe ad=new AcercaDe();
        ad.setVisible(true);
    }//GEN-LAST:event_smacercadeActionPerformed
    /**
     * MÉTODO QUE VALIDA SI RESPUESTA ES UN NÚMERO
     * @param Respuesta que contiene un String que sera Analizada
     * @return un dato tipo Booleano
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private static boolean EsNumero(String Respuesta){
        try{
            Integer.parseInt(Respuesta);
            return true;}
        catch(NumberFormatException e){
           return false;}}
    /**
     * MÉTODO PRINCIPAL MAIN
     * @param args que contiene un String de arreglos
     * @author Robinson Gallego Alzate
     * @version 1.0
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
                new Menu().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXMonthView calendario;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JMenu mayuda;
    private javax.swing.JMenuBar mbprincipal;
    private javax.swing.JMenu mgestiones;
    private javax.swing.JMenu mherramientas;
    private javax.swing.JMenu msalidas;
    private javax.swing.JMenu msalir;
    private javax.swing.JMenu mtransacciones;
    private javax.swing.JPanel pfondo;
    private javax.swing.JMenuItem smacercade;
    private javax.swing.JMenuItem smasignacion;
    private javax.swing.JMenuItem smconsucontraindicaciones;
    private javax.swing.JMenuItem smconsudietaypreparacion;
    private javax.swing.JMenuItem smconsuhabitacionpaciente;
    private javax.swing.JMenuItem smconsuhorariolaboral;
    private javax.swing.JMenuItem smconsultorios;
    private javax.swing.JMenuItem smconsustockmedicamentos;
    private javax.swing.JMenuItem smcopiadeseguridad;
    private javax.swing.JMenuItem smdiagnostico;
    private javax.swing.JMenuItem smdietas;
    private javax.swing.JMenuItem smentradasalida;
    private javax.swing.JMenuItem smfacfarmacia;
    private javax.swing.JMenuItem smfacpacientes;
    private javax.swing.JMenuItem smfarmaceutas;
    private javax.swing.JMenuItem smhabitaciones;
    private javax.swing.JMenuItem smhistoria;
    private javax.swing.JMenuItem smhojasdevida;
    private javax.swing.JMenuItem smhorarios;
    private javax.swing.JMenuItem smhospitalizacion;
    private javax.swing.JMenuItem sminfogastosgenerales;
    private javax.swing.JMenuItem sminformapersonalmedico;
    private javax.swing.JMenuItem sminformeingresos;
    private javax.swing.JMenuItem sminventario;
    private javax.swing.JMenuItem smmanualtecnico;
    private javax.swing.JMenuItem smmanualusuario;
    private javax.swing.JMenuItem smpacientes;
    private javax.swing.JMenuItem smperfiles;
    private javax.swing.JMenuItem smpersonal;
    private javax.swing.JMenuItem smsalidasegura;
    private javax.swing.JMenuItem smseguimiento;
    private javax.swing.JMenuItem smtipomenu;
    private javax.swing.JMenuItem smunidades;
    private javax.swing.JMenuItem smusuarios;
    private javax.swing.JMenuItem smzona;
    // End of variables declaration//GEN-END:variables
}
