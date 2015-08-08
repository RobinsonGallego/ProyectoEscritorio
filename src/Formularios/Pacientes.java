package Formularios;
//LIBRERÍAS IMPORTADAS
import Clases.ClasePacientes;
import Clases.ClasePerfiles;
import Clases.ClaseUsuarios;
import Clases.FotoClassPM;
import Clases.ObjetoPaciente;
import Conexion.Conectate;
import Tablas.TablaPacientes;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Pacientes extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    DateFormat df=DateFormat.getDateInstance();
    //DECLARO UNA VARIABLE PRIVADA QUE ME CARGUE SOLO LAS IMAGENES QUE QUIERO, EN ESTE CASO .JPG
    private final FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivo de Imagen","jpg");
    String Ruta;
    //CREAMOS UN OBJETO DE LA CLASE FOTOCLASSPM
    FotoClassPM foto=new FotoClassPM();
    //CONSTRUCTOR
    public Pacientes() {
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Pacientes Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        cbtipodocumento.requestFocus();
        //ASÍ SE INHABILITAN LOS JDATECHOOSER PARA QUE SOLO SE ESCOJA LA FECHA DESDE EL CALENDARIO
        jdcfechanacimiento.getDateEditor().setEnabled(false);
        jdcfechaingreso.getDateEditor().setEnabled(false);
        lblusuario.setVisible(false);
        lblmensajecextranjeria.setVisible(false);
        //VALIDACIONES LETRAS O NÚMEROS
        Letras(txtnombres);
        Letras(txtprimerapellido);
        Letras(txtsegundoapellido);
        Numeros(txttelefono);
        Numeros(txtmovil);
        Letras(txtprofesion);
        Numeros(txtvalorcopago);
        Numeros(txtnumerotarjeta);
        Numeros(txtnumerocheque);
        Letras(txtbanco);
        Iniciar();
    }
    /**
     * MÉTODO QUE CAPTURA EL USUARIO QUE INGRESO Y APLICA SU PERFIL
     * @param user que contiene un String para recibido del Menú
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void setText(String user){
        Perfil(user);
        lblusuario.setText(user);}
    /**
     * MÉTODO PERFILES
     * @param usuario que contiene un String para ser Buscado
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
                        if(perfil.equals("Administrador")||perfil.equals("Admisión")){
                            btnguardar.setEnabled(true);
                            btnconsultar.setEnabled(true);
                            btnmodificar.setEnabled(false);
                            btnlistar.setEnabled(true);
                            btnregresar.setEnabled(true);
                            btncargarfoto.setEnabled(true);}
                        else{
                            Inhabilitar();
                            btnguardar.setEnabled(false);
                            btnconsultar.setEnabled(true);
                            btnmodificar.setEnabled(false);
                            btnlistar.setEnabled(false);
                            btnregresar.setEnabled(true);
                            btncargarfoto.setEnabled(false);}}}
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jptfondo = new javax.swing.JTabbedPane();
        pdatospaciente = new javax.swing.JPanel();
        lbltipodocumento = new javax.swing.JLabel();
        lblnumerodocumento = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblprimerapellido = new javax.swing.JLabel();
        lblsegundoapellido = new javax.swing.JLabel();
        lblnumerotelefono = new javax.swing.JLabel();
        lblnumeromovil = new javax.swing.JLabel();
        lbldireccionresidencia = new javax.swing.JLabel();
        lblgenero = new javax.swing.JLabel();
        cbtipodocumento = new javax.swing.JComboBox();
        txtnumerodocumento = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtprimerapellido = new javax.swing.JTextField();
        txtsegundoapellido = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtmovil = new javax.swing.JTextField();
        pfotografia = new javax.swing.JPanel();
        txtrutafoto = new javax.swing.JTextField();
        btncargarfoto = new javax.swing.JButton();
        pimagenfoto = new javax.swing.JPanel();
        lblimagenfoto = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        cbgenero = new javax.swing.JComboBox();
        lblmensaje = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        lblfechanacimiento = new javax.swing.JLabel();
        jdcfechanacimiento = new com.toedter.calendar.JDateChooser();
        lbledad = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        lblestadocivil = new javax.swing.JLabel();
        cbestadocivil = new javax.swing.JComboBox();
        lblpais = new javax.swing.JLabel();
        lblciudad = new javax.swing.JLabel();
        lblprofesion = new javax.swing.JLabel();
        txtprofesion = new javax.swing.JTextField();
        cbpais = new javax.swing.JComboBox();
        cbciudades = new javax.swing.JComboBox();
        lblmensajecextranjeria = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        pinformacionpaciente = new javax.swing.JPanel();
        lbltiposangre = new javax.swing.JLabel();
        cbtiposangre = new javax.swing.JComboBox();
        lblfechaingreso = new javax.swing.JLabel();
        jdcfechaingreso = new com.toedter.calendar.JDateChooser();
        pseguromedico = new javax.swing.JPanel();
        lbleps = new javax.swing.JLabel();
        cbeps = new javax.swing.JComboBox();
        lblvalorcopago = new javax.swing.JLabel();
        txtvalorcopago = new javax.swing.JTextField();
        lblformapago = new javax.swing.JLabel();
        rbentidadaseguradora = new javax.swing.JRadioButton();
        rbtarjeta = new javax.swing.JRadioButton();
        rbefectivo = new javax.swing.JRadioButton();
        rbcheque = new javax.swing.JRadioButton();
        ptarjeta = new javax.swing.JPanel();
        lblnumerotarjeta = new javax.swing.JLabel();
        txtnumerotarjeta = new javax.swing.JTextField();
        lbltipotarjeta = new javax.swing.JLabel();
        cbtipotarjeta = new javax.swing.JComboBox();
        lblfranquicia = new javax.swing.JLabel();
        cbfranquicia = new javax.swing.JComboBox();
        pcheque = new javax.swing.JPanel();
        lblnumerocheque = new javax.swing.JLabel();
        txtnumerocheque = new javax.swing.JTextField();
        lblbanco = new javax.swing.JLabel();
        txtbanco = new javax.swing.JTextField();
        lblnumerohistoria = new javax.swing.JLabel();
        txtnumerohistoria = new javax.swing.JTextField();
        lblnumerohabitacion = new javax.swing.JLabel();
        txtnumerohabitacion = new javax.swing.JTextField();
        lblnumerocama = new javax.swing.JLabel();
        txtnumerocama = new javax.swing.JTextField();
        lblcontraindicaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tacontraindicaciones = new javax.swing.JTextArea();
        lblalimentacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taalimentacion = new javax.swing.JTextArea();
        lblmedicacion = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tamedicacion = new javax.swing.JTextArea();
        lblseguimiento = new javax.swing.JLabel();
        txtseguimiento = new javax.swing.JTextField();
        lblmensaje2 = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        cbestado = new javax.swing.JComboBox();
        btnguardar = new org.edisoncor.gui.button.ButtonTask();
        btnconsultar = new org.edisoncor.gui.button.ButtonTask();
        btnmodificar = new org.edisoncor.gui.button.ButtonTask();
        btnlistar = new org.edisoncor.gui.button.ButtonTask();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jptfondo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        pdatospaciente.setBackground(new java.awt.Color(255, 255, 255));
        pdatospaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltipodocumento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltipodocumento.setText("Tipo de Documento *");
        pdatospaciente.add(lbltipodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 25, -1, -1));

        lblnumerodocumento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumerodocumento.setText("Número de Documento *");
        pdatospaciente.add(lblnumerodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 68, -1, -1));

        lblnombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnombres.setText("Nombres *");
        pdatospaciente.add(lblnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 111, -1, -1));

        lblprimerapellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblprimerapellido.setText("Primer Apellido *");
        pdatospaciente.add(lblprimerapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 154, -1, -1));

        lblsegundoapellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsegundoapellido.setText("Segundo Apellido");
        pdatospaciente.add(lblsegundoapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 197, -1, -1));

        lblnumerotelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumerotelefono.setText("Número de Teléfono");
        pdatospaciente.add(lblnumerotelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        lblnumeromovil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumeromovil.setText("Número de Móvil");
        pdatospaciente.add(lblnumeromovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 283, -1, -1));

        lbldireccionresidencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldireccionresidencia.setText("Dirección Residencia");
        pdatospaciente.add(lbldireccionresidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 326, -1, -1));

        lblgenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblgenero.setText("Género *");
        pdatospaciente.add(lblgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 369, -1, -1));

        cbtipodocumento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbtipodocumento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","Registro", "Tarjeta de Identidad", "Cédula", "C. Extranjería", "Pasaporte" }));
        cbtipodocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipodocumentoActionPerformed(evt);
            }
        });
        pdatospaciente.add(cbtipodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 20, 160, 25));

        txtnumerodocumento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnumerodocumento.setEnabled(false);
        txtnumerodocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumerodocumentoKeyTyped(evt);
            }
        });
        pdatospaciente.add(txtnumerodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 63, 160, 25));

        txtnombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });
        pdatospaciente.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 106, 220, 25));

        txtprimerapellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtprimerapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprimerapellidoKeyTyped(evt);
            }
        });
        pdatospaciente.add(txtprimerapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 149, 160, 25));

        txtsegundoapellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtsegundoapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsegundoapellidoKeyTyped(evt);
            }
        });
        pdatospaciente.add(txtsegundoapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 192, 160, 25));

        txttelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        pdatospaciente.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 235, 160, 25));

        txtmovil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtmovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmovilKeyTyped(evt);
            }
        });
        pdatospaciente.add(txtmovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 278, 160, 25));

        pfotografia.setBackground(new java.awt.Color(255, 255, 255));
        pfotografia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtrutafoto.setEditable(false);
        txtrutafoto.setBackground(new java.awt.Color(255, 255, 255));
        txtrutafoto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btncargarfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar_opt.png"))); // NOI18N
        btncargarfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarfotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pfotografiaLayout = new javax.swing.GroupLayout(pfotografia);
        pfotografia.setLayout(pfotografiaLayout);
        pfotografiaLayout.setHorizontalGroup(
            pfotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfotografiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtrutafoto, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncargarfoto))
        );
        pfotografiaLayout.setVerticalGroup(
            pfotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfotografiaLayout.createSequentialGroup()
                .addGroup(pfotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtrutafoto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncargarfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pdatospaciente.add(pfotografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 20, -1, 50));

        pimagenfoto.setBackground(new java.awt.Color(255, 255, 255));
        pimagenfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblimagenfoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagenfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/foto_opt.png"))); // NOI18N

        javax.swing.GroupLayout pimagenfotoLayout = new javax.swing.GroupLayout(pimagenfoto);
        pimagenfoto.setLayout(pimagenfotoLayout);
        pimagenfotoLayout.setHorizontalGroup(
            pimagenfotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimagenfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );
        pimagenfotoLayout.setVerticalGroup(
            pimagenfotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimagenfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );

        pdatospaciente.add(pimagenfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 81, -1, -1));

        txtdireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });
        pdatospaciente.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 321, 220, 25));

        cbgenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbgenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"","Masculino", "Femenino", "Otro" }));
        cbgenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbgeneroKeyTyped(evt);
            }
        });
        pdatospaciente.add(cbgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 364, 160, 25));

        lblmensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmensaje.setForeground(new java.awt.Color(255, 0, 0));
        lblmensaje.setText("Los campos marcados con el signo (*) son obligatorios");
        pdatospaciente.add(lblmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 536, -1, -1));

        lblcorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcorreo.setText("Correo Electrónico");
        pdatospaciente.add(lblcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 412, -1, -1));

        txtcorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoKeyTyped(evt);
            }
        });
        pdatospaciente.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 407, 220, 25));

        lblfechanacimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblfechanacimiento.setText("Fecha de Nacimiento");
        pdatospaciente.add(lblfechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jdcfechanacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jdcfechanacimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jdcfechanacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdcfechanacimientoKeyTyped(evt);
            }
        });
        pdatospaciente.add(jdcfechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 450, 160, 25));

        lbledad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbledad.setText("Edad");
        pdatospaciente.add(lbledad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 498, -1, -1));

        txtedad.setEditable(false);
        txtedad.setBackground(new java.awt.Color(255, 255, 255));
        txtedad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pdatospaciente.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 493, 35, 25));

        lblestadocivil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblestadocivil.setText("Estado Cívil");
        pdatospaciente.add(lblestadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 541, -1, -1));

        cbestadocivil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbestadocivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "Soltero (a)", "Casado (a)", "Separado (a)", "Viudo (a)", "Unión Libre" }));
        cbestadocivil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbestadocivilKeyTyped(evt);
            }
        });
        pdatospaciente.add(cbestadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 536, 160, 25));

        lblpais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpais.setText("País de Nacimiento *");
        pdatospaciente.add(lblpais, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 412, -1, -1));

        lblciudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblciudad.setText("Ciudad de Nacimiento *");
        pdatospaciente.add(lblciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 455, -1, -1));

        lblprofesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblprofesion.setText("Profesión");
        pdatospaciente.add(lblprofesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 498, -1, -1));

        txtprofesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtprofesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprofesionKeyTyped(evt);
            }
        });
        pdatospaciente.add(txtprofesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 493, 230, 25));

        cbpais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpaisActionPerformed(evt);
            }
        });
        cbpais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbpaisKeyTyped(evt);
            }
        });
        pdatospaciente.add(cbpais, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 407, 230, 25));

        cbciudades.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbciudades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbciudadesKeyTyped(evt);
            }
        });
        pdatospaciente.add(cbciudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 450, 230, 25));

        lblmensajecextranjeria.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblmensajecextranjeria.setForeground(new java.awt.Color(255, 0, 0));
        lblmensajecextranjeria.setText("Letras-Números");
        pdatospaciente.add(lblmensajecextranjeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 68, -1, -1));

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblusuario.setEnabled(false);
        pdatospaciente.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 149, 90, 20));

        jptfondo.addTab("Datos Paciente", pdatospaciente);

        pinformacionpaciente.setBackground(new java.awt.Color(255, 255, 255));

        lbltiposangre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltiposangre.setText("Tipo de Sangre");

        cbtiposangre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbtiposangre.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "A+", "A-", "AB+", "AB-", "B+", "B-", "O+", "O-" }));
        cbtiposangre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbtiposangreKeyTyped(evt);
            }
        });

        lblfechaingreso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblfechaingreso.setText("Fecha de Ingreso *");

        jdcfechaingreso.setBackground(new java.awt.Color(255, 255, 255));
        jdcfechaingreso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jdcfechaingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdcfechaingresoKeyTyped(evt);
            }
        });

        pseguromedico.setBackground(new java.awt.Color(255, 255, 255));
        pseguromedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de Seguro Médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbleps.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbleps.setText("EPS o IPS *");

        cbeps.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbeps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbepsActionPerformed(evt);
            }
        });
        cbeps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbepsKeyTyped(evt);
            }
        });

        lblvalorcopago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblvalorcopago.setText("Valor Co-Pago");

        txtvalorcopago.setEditable(false);
        txtvalorcopago.setBackground(new java.awt.Color(255, 255, 255));
        txtvalorcopago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblformapago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblformapago.setText("Forma de Pago *");

        rbentidadaseguradora.setBackground(new java.awt.Color(255, 255, 255));
        rbentidadaseguradora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbentidadaseguradora.setText("Entidad Aseguradora");
        rbentidadaseguradora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbentidadaseguradoraActionPerformed(evt);
            }
        });
        rbentidadaseguradora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbentidadaseguradoraKeyTyped(evt);
            }
        });

        rbtarjeta.setBackground(new java.awt.Color(255, 255, 255));
        rbtarjeta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbtarjeta.setText("Tarjeta");
        rbtarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtarjetaActionPerformed(evt);
            }
        });
        rbtarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbtarjetaKeyTyped(evt);
            }
        });

        rbefectivo.setBackground(new java.awt.Color(255, 255, 255));
        rbefectivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbefectivo.setText("Efectivo");
        rbefectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbefectivoActionPerformed(evt);
            }
        });
        rbefectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbefectivoKeyTyped(evt);
            }
        });

        rbcheque.setBackground(new java.awt.Color(255, 255, 255));
        rbcheque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbcheque.setText("Cheque");
        rbcheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbchequeActionPerformed(evt);
            }
        });

        ptarjeta.setBackground(new java.awt.Color(255, 255, 255));
        ptarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tarjeta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        ptarjeta.setEnabled(false);

        lblnumerotarjeta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumerotarjeta.setText("Número de Tarjeta *");
        lblnumerotarjeta.setEnabled(false);

        txtnumerotarjeta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnumerotarjeta.setEnabled(false);
        txtnumerotarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumerotarjetaKeyTyped(evt);
            }
        });

        lbltipotarjeta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltipotarjeta.setText("Tipo de Tarjeta *");
        lbltipotarjeta.setEnabled(false);

        cbtipotarjeta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbtipotarjeta.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "Crédito", "Débito" }));
        cbtipotarjeta.setEnabled(false);
        cbtipotarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbtipotarjetaKeyTyped(evt);
            }
        });

        lblfranquicia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblfranquicia.setText("Franquicia *");
        lblfranquicia.setEnabled(false);

        cbfranquicia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbfranquicia.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "American Express", "Diners Club", "MasterCard", "Visa" }));
        cbfranquicia.setEnabled(false);
        cbfranquicia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbfranquiciaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout ptarjetaLayout = new javax.swing.GroupLayout(ptarjeta);
        ptarjeta.setLayout(ptarjetaLayout);
        ptarjetaLayout.setHorizontalGroup(
            ptarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ptarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnumerotarjeta)
                    .addComponent(lbltipotarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ptarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ptarjetaLayout.createSequentialGroup()
                        .addComponent(cbtipotarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ptarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfranquicia)
                            .addComponent(cbfranquicia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(ptarjetaLayout.createSequentialGroup()
                        .addComponent(txtnumerotarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ptarjetaLayout.setVerticalGroup(
            ptarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ptarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ptarjetaLayout.createSequentialGroup()
                        .addComponent(lblfranquicia)
                        .addGap(2, 2, 2)
                        .addComponent(cbfranquicia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ptarjetaLayout.createSequentialGroup()
                        .addGroup(ptarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnumerotarjeta)
                            .addComponent(txtnumerotarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ptarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltipotarjeta)
                            .addComponent(cbtipotarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pcheque.setBackground(new java.awt.Color(255, 255, 255));
        pcheque.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cheque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        pcheque.setEnabled(false);

        lblnumerocheque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumerocheque.setText("Número de Cheque *");
        lblnumerocheque.setEnabled(false);

        txtnumerocheque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnumerocheque.setEnabled(false);
        txtnumerocheque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumerochequeKeyTyped(evt);
            }
        });

        lblbanco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblbanco.setText("Banco *");
        lblbanco.setEnabled(false);

        txtbanco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbanco.setEnabled(false);
        txtbanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbancoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pchequeLayout = new javax.swing.GroupLayout(pcheque);
        pcheque.setLayout(pchequeLayout);
        pchequeLayout.setHorizontalGroup(
            pchequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pchequeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pchequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnumerocheque)
                    .addComponent(lblbanco))
                .addGap(18, 18, 18)
                .addGroup(pchequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnumerocheque)
                    .addComponent(txtbanco, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pchequeLayout.setVerticalGroup(
            pchequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pchequeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pchequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnumerocheque)
                    .addComponent(txtnumerocheque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pchequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbanco)
                    .addComponent(txtbanco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pseguromedicoLayout = new javax.swing.GroupLayout(pseguromedico);
        pseguromedico.setLayout(pseguromedicoLayout);
        pseguromedicoLayout.setHorizontalGroup(
            pseguromedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pseguromedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pseguromedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblvalorcopago)
                    .addComponent(lbleps)
                    .addComponent(lblformapago))
                .addGap(18, 18, 18)
                .addGroup(pseguromedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbentidadaseguradora)
                    .addComponent(txtvalorcopago, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbcheque)
                    .addComponent(rbefectivo)
                    .addComponent(rbtarjeta)
                    .addComponent(cbeps, 0, 271, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(pseguromedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pcheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pseguromedicoLayout.setVerticalGroup(
            pseguromedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pseguromedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pseguromedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pseguromedicoLayout.createSequentialGroup()
                        .addComponent(ptarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pcheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pseguromedicoLayout.createSequentialGroup()
                        .addGroup(pseguromedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbleps)
                            .addComponent(cbeps, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pseguromedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblvalorcopago)
                            .addComponent(txtvalorcopago, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pseguromedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblformapago)
                            .addComponent(rbentidadaseguradora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtarjeta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbefectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbcheque)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblnumerohistoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumerohistoria.setText("N° Historia Clínica");

        txtnumerohistoria.setEditable(false);
        txtnumerohistoria.setBackground(new java.awt.Color(255, 255, 255));
        txtnumerohistoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblnumerohabitacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumerohabitacion.setText("N° Habitación");

        txtnumerohabitacion.setEditable(false);
        txtnumerohabitacion.setBackground(new java.awt.Color(255, 255, 255));
        txtnumerohabitacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblnumerocama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnumerocama.setText("N° de Cama");

        txtnumerocama.setEditable(false);
        txtnumerocama.setBackground(new java.awt.Color(255, 255, 255));
        txtnumerocama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblcontraindicaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcontraindicaciones.setText("Contraindicaciones");

        tacontraindicaciones.setEditable(false);
        tacontraindicaciones.setColumns(20);
        tacontraindicaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tacontraindicaciones.setRows(5);
        jScrollPane1.setViewportView(tacontraindicaciones);

        lblalimentacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblalimentacion.setText("Alimentación");

        taalimentacion.setEditable(false);
        taalimentacion.setColumns(20);
        taalimentacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        taalimentacion.setRows(5);
        jScrollPane2.setViewportView(taalimentacion);

        lblmedicacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmedicacion.setText("Medicación");

        tamedicacion.setEditable(false);
        tamedicacion.setColumns(20);
        tamedicacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tamedicacion.setRows(5);
        jScrollPane3.setViewportView(tamedicacion);

        lblseguimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblseguimiento.setText("Seguimiento");

        txtseguimiento.setEditable(false);
        txtseguimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtseguimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblmensaje2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmensaje2.setForeground(new java.awt.Color(255, 51, 51));
        lblmensaje2.setText("Los campos marcados con el signo (*) son obligatorios");

        lblestado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblestado.setText("Estado *");

        cbestado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "Activo", "Inactivo" }));
        cbestado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbestadoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pinformacionpacienteLayout = new javax.swing.GroupLayout(pinformacionpaciente);
        pinformacionpaciente.setLayout(pinformacionpacienteLayout);
        pinformacionpacienteLayout.setHorizontalGroup(
            pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinformacionpacienteLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pinformacionpacienteLayout.createSequentialGroup()
                        .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnumerohistoria)
                            .addComponent(lblnumerohabitacion)
                            .addComponent(lblnumerocama)
                            .addComponent(lblseguimiento))
                        .addGap(18, 18, 18)
                        .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnumerohistoria, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtnumerohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumerocama, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtseguimiento))
                        .addGap(18, 18, 18)
                        .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcontraindicaciones)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblalimentacion)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmedicacion)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(pseguromedico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pinformacionpacienteLayout.createSequentialGroup()
                        .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfechaingreso)
                            .addComponent(lbltiposangre))
                        .addGap(28, 28, 28)
                        .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbtiposangre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pinformacionpacienteLayout.createSequentialGroup()
                                .addComponent(lblestado)
                                .addGap(18, 18, 18)
                                .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pinformacionpacienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblmensaje2)
                                .addGap(33, 33, 33))))))
        );
        pinformacionpacienteLayout.setVerticalGroup(
            pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinformacionpacienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltiposangre)
                    .addComponent(cbtiposangre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblestado)
                    .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblfechaingreso)
                        .addComponent(jdcfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblmensaje2))
                .addGap(18, 18, 18)
                .addComponent(pseguromedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pinformacionpacienteLayout.createSequentialGroup()
                        .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pinformacionpacienteLayout.createSequentialGroup()
                                .addComponent(txtnumerohistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtnumerohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtnumerocama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pinformacionpacienteLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblnumerohistoria)
                                .addGap(28, 28, 28)
                                .addComponent(lblnumerohabitacion)
                                .addGap(28, 28, 28)
                                .addComponent(lblnumerocama)))
                        .addGap(18, 18, 18)
                        .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblseguimiento)
                            .addComponent(txtseguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pinformacionpacienteLayout.createSequentialGroup()
                        .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcontraindicaciones)
                            .addComponent(lblalimentacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pinformacionpacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(pinformacionpacienteLayout.createSequentialGroup()
                        .addComponent(lblmedicacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );

        jptfondo.addTab("Información Paciente", pinformacionpaciente);

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar2_opt.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnguardar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnguardar.setDescription("Save");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png"))); // NOI18N
        btnconsultar.setText("Consultar");
        btnconsultar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnconsultar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnconsultar.setDescription("Consult");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnmodificar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificar.setDescription("Edit");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar.png"))); // NOI18N
        btnlistar.setText("Listar");
        btnlistar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnlistar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlistar.setDescription("List");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar2_opt.png"))); // NOI18N
        btnregresar.setText("Regresar");
        btnregresar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnregresar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregresar.setDescription("Return");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jptfondo)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jptfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * MÉTODO ALTERNO INICIAR
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void Iniciar(){
        //ACCIÓN PARA QUE MUESTRE LA EDAD CUANDO SE ESCOJA UNA FECHA DE NACIMIENTO
        jdcfechanacimiento.getDateEditor().addPropertyChangeListener(
                new PropertyChangeListener(){
                    @Override
                    public void propertyChange(PropertyChangeEvent evt){
                        if(jdcfechanacimiento.getDate()!=null){
                            String fecha=df.format(jdcfechanacimiento.getDate());
                            int e=Fecha(fecha);
                            String edad=Integer.toString(e);
                            txtedad.setText(edad);
                            cbestadocivil.requestFocus();}}});
        //LIMPIAMOS LOS COMBOBOX
        cbeps.removeAllItems();
        cbpais.removeAllItems();
        //PONEMOS UN ITEM POR DEFECTO
        cbeps.addItem("");
        cbpais.addItem("");
        //CREAMOS EL OBJETO CLASEPACIENTES
        ClasePacientes cpa=new ClasePacientes();
        ClasePacientes cpa2=new ClasePacientes();
        //LLAMAMOS MÉTODO PARA LLENAR COMBOBOX
        cpa.LlenarEPS(cbeps);
        cpa2.LlenarPais(cbpais);}
    /**
     * MÉTODO INICIAR CIUDADES
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void IniciarCiudades(){
        //LIMPIAMOS EL COMBOBOX
        cbciudades.removeAllItems();
        //PONEMOS UN ITEM POR DEFECTO
        cbciudades.addItem("");
        //CREAMOS LOS OBJETOS PERSONALMEDICO
        ClasePacientes cpa3=new ClasePacientes();
        //LLAMAMOS MÉTODO PARA LLENAR COMBOBOX
        cpa3.LlenarCiudad(cbciudades,cbpais.getSelectedIndex());}
    //ACCIÓN DEL RADIO BUTTON ENTIDAD ASEGURADORA
    private void rbentidadaseguradoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbentidadaseguradoraActionPerformed
        rbtarjeta.setSelected(false);
        rbcheque.setSelected(false);
        rbefectivo.setSelected(false);
        ptarjeta.setEnabled(false);
        lblnumerotarjeta.setEnabled(false);
        txtnumerotarjeta.setEnabled(false);
        lbltipotarjeta.setEnabled(false);
        cbtipotarjeta.setEnabled(false);
        lblfranquicia.setEnabled(false);
        cbfranquicia.setEnabled(false);
        pcheque.setEnabled(false);
        lblnumerocheque.setEnabled(false);
        txtnumerocheque.setEnabled(false);
        lblbanco.setEnabled(false);
        txtbanco.setEnabled(false);
        LimpiarTarjeta();
        LimpiarCheque();
    }//GEN-LAST:event_rbentidadaseguradoraActionPerformed
    //ACCIÓN DEL RADIO BUTTON TARJETA
    private void rbtarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtarjetaActionPerformed
        ptarjeta.setEnabled(true);
        lblnumerotarjeta.setEnabled(true);
        txtnumerotarjeta.setEnabled(true);
        txtnumerotarjeta.requestFocus();
        lbltipotarjeta.setEnabled(true);
        cbtipotarjeta.setEnabled(true);
        lblfranquicia.setEnabled(true);
        cbfranquicia.setEnabled(true);
        rbentidadaseguradora.setSelected(false);
        rbcheque.setSelected(false);
        rbefectivo.setSelected(false);
        pcheque.setEnabled(false);
        lblnumerocheque.setEnabled(false);
        txtnumerocheque.setEnabled(false);
        lblbanco.setEnabled(false);
        txtbanco.setEnabled(false);
        LimpiarCheque();
    }//GEN-LAST:event_rbtarjetaActionPerformed
    //ACCIÓN DEL RADIO BUTTON EFECTIVO
    private void rbefectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbefectivoActionPerformed
        rbtarjeta.setSelected(false);
        rbcheque.setSelected(false);
        rbentidadaseguradora.setSelected(false);
        ptarjeta.setEnabled(false);
        lblnumerotarjeta.setEnabled(false);
        txtnumerotarjeta.setEnabled(false);
        lbltipotarjeta.setEnabled(false);
        cbtipotarjeta.setEnabled(false);
        lblfranquicia.setEnabled(false);
        cbfranquicia.setEnabled(false);
        pcheque.setEnabled(false);
        lblnumerocheque.setEnabled(false);
        txtnumerocheque.setEnabled(false);
        lblbanco.setEnabled(false);
        txtbanco.setEnabled(false);
        LimpiarTarjeta();
        LimpiarCheque();
    }//GEN-LAST:event_rbefectivoActionPerformed
    //ACCIÓN DEL RADIO BUTTON CHEQUE
    private void rbchequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbchequeActionPerformed
        pcheque.setEnabled(true);
        lblnumerocheque.setEnabled(true);
        txtnumerocheque.setEnabled(true);
        txtnumerocheque.requestFocus();
        lblbanco.setEnabled(true);
        txtbanco.setEnabled(true);
        rbtarjeta.setSelected(false);
        rbefectivo.setSelected(false);
        rbentidadaseguradora.setSelected(false);
        ptarjeta.setEnabled(false);
        lblnumerotarjeta.setEnabled(false);
        txtnumerotarjeta.setEnabled(false);
        lbltipotarjeta.setEnabled(false);
        cbtipotarjeta.setEnabled(false);
        lblfranquicia.setEnabled(false);
        cbfranquicia.setEnabled(false);
        LimpiarTarjeta();
    }//GEN-LAST:event_rbchequeActionPerformed
    //LIMITACIONES Y TRANSFERENCIA DE FOCUS
    private void txtnumerodocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumerodocumentoKeyTyped
        if(txtnumerodocumento.getText().length()==14){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtnumerodocumento){
            if(Contador==10){
                txtnumerohistoria.setText(txtnumerodocumento.getText());
                txtnombres.requestFocus();}}
        //VALIDACIÓN ESPECIAL, CUANDO SE ESCOGE CÉDULA DE EXTRANJERÍA
        if(cbtipodocumento.getSelectedItem().equals("C. Extranjería")){
            String documento=String.valueOf(evt.getKeyChar());
            if(!(documento.matches("[a-zA-Z0-9]"))){
                evt.consume();}}
        else{
            String documento=String.valueOf(evt.getKeyChar());
            if(!(documento.matches("(\\d{1,14})"))){
                evt.consume();}}
    }//GEN-LAST:event_txtnumerodocumentoKeyTyped
    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        if(txtnombres.getText().length()==32){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtnombres){
            if(Contador==10){
                txtprimerapellido.requestFocus();}}
        //MÉTODO PARA PONER MAYÚSCULA INICIAL
        JTextField txtnombre=(JTextField)evt.getComponent();
        String texto=txtnombre.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtnombres.setText(texto);}
    }//GEN-LAST:event_txtnombresKeyTyped
    private void txtprimerapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimerapellidoKeyTyped
        if(txtprimerapellido.getText().length()==20){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtprimerapellido){
            if(Contador==10){
                txtsegundoapellido.requestFocus();}}
        JTextField txtprimera=(JTextField)evt.getComponent();
        String texto=txtprimera.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtprimerapellido.setText(texto);}
    }//GEN-LAST:event_txtprimerapellidoKeyTyped
    private void txtsegundoapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsegundoapellidoKeyTyped
        if(txtsegundoapellido.getText().length()==20){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtsegundoapellido){
            if(Contador==10){
                txttelefono.requestFocus();}}
        JTextField txtsegundoa=(JTextField)evt.getComponent();
        String texto=txtsegundoa.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtsegundoapellido.setText(texto);}
    }//GEN-LAST:event_txtsegundoapellidoKeyTyped
    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        if(txttelefono.getText().length()==7){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txttelefono){
            if(Contador==10){
                txtmovil.requestFocus();}}
    }//GEN-LAST:event_txttelefonoKeyTyped
    private void txtmovilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmovilKeyTyped
        if(txtmovil.getText().length()==10){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtmovil){
            if(Contador==10){
                txtdireccion.requestFocus();}}
    }//GEN-LAST:event_txtmovilKeyTyped
    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        if(txtdireccion.getText().length()==60){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtdireccion){
            if(Contador==10){
                cbgenero.requestFocus();}}
        JTextField txtdirec=(JTextField)evt.getComponent();
        String texto=txtdirec.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtdireccion.setText(texto);}
    }//GEN-LAST:event_txtdireccionKeyTyped
    private void cbgeneroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbgeneroKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbgenero){
            if(Contador==10){
                txtcorreo.requestFocus();}}
    }//GEN-LAST:event_cbgeneroKeyTyped
    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyTyped
        if(txtcorreo.getText().length()==70){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtcorreo){
            if(Contador==10){
                jdcfechanacimiento.requestFocus();}}
    }//GEN-LAST:event_txtcorreoKeyTyped
    private void jdcfechanacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdcfechanacimientoKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==jdcfechanacimiento){
            if(Contador==10){
                txtedad.requestFocus();}}
    }//GEN-LAST:event_jdcfechanacimientoKeyTyped
    private void cbestadocivilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbestadocivilKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbestadocivil){
            if(Contador==10){
                cbpais.requestFocus();}}
    }//GEN-LAST:event_cbestadocivilKeyTyped
    private void txtprofesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprofesionKeyTyped
        if(txtprofesion.getText().length()==40){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtprofesion){
            if(Contador==10){
                btncargarfoto.requestFocus();}}
        //MÉTODO PARA PONER MAYÚSCULA INICIAL
        JTextField txtnombre=(JTextField)evt.getComponent();
        String texto=txtnombre.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtprofesion.setText(texto);}
    }//GEN-LAST:event_txtprofesionKeyTyped
    private void cbtiposangreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbtiposangreKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbtiposangre){
            if(Contador==10){
                jdcfechaingreso.requestFocus();}}
    }//GEN-LAST:event_cbtiposangreKeyTyped
    private void jdcfechaingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdcfechaingresoKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==jdcfechaingreso){
            if(Contador==10){
                cbeps.requestFocus();}}
    }//GEN-LAST:event_jdcfechaingresoKeyTyped
    private void cbepsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbepsKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbeps){
            if(Contador==10){
                rbentidadaseguradora.requestFocus();}}
    }//GEN-LAST:event_cbepsKeyTyped
    private void rbentidadaseguradoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbentidadaseguradoraKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==rbentidadaseguradora){
            if(Contador==10){
                rbtarjeta.requestFocus();}}
    }//GEN-LAST:event_rbentidadaseguradoraKeyTyped
    private void rbtarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtarjetaKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==rbtarjeta){
            if(Contador==10){
                rbefectivo.requestFocus();}}
    }//GEN-LAST:event_rbtarjetaKeyTyped
    private void rbefectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbefectivoKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==rbefectivo){
            if(Contador==10){
                rbcheque.requestFocus();}}
    }//GEN-LAST:event_rbefectivoKeyTyped
    private void txtnumerotarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumerotarjetaKeyTyped
        if(txtnumerotarjeta.getText().length()==20){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtnumerotarjeta){
            if(Contador==10){
                cbtipotarjeta.requestFocus();}}
    }//GEN-LAST:event_txtnumerotarjetaKeyTyped
    private void cbtipotarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbtipotarjetaKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbtipotarjeta){
            if(Contador==10){
                cbfranquicia.requestFocus();}}
    }//GEN-LAST:event_cbtipotarjetaKeyTyped
    private void cbfranquiciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbfranquiciaKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbfranquicia){
            if(Contador==10){
                cbestado.requestFocus();}}
    }//GEN-LAST:event_cbfranquiciaKeyTyped
    private void txtnumerochequeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumerochequeKeyTyped
        if(txtnumerocheque.getText().length()==20){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtnumerocheque){
            if(Contador==10){
                txtbanco.requestFocus();}}
    }//GEN-LAST:event_txtnumerochequeKeyTyped
    private void txtbancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbancoKeyTyped
        if(txtbanco.getText().length()==30){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtbanco){
            if(Contador==10){
                cbestado.requestFocus();}}
    }//GEN-LAST:event_txtbancoKeyTyped
    //ACCIÓN DEL COMBOBOX TIPO DOCUMENTO
    private void cbtipodocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipodocumentoActionPerformed
        if(cbtipodocumento.getSelectedItem().equals("")){
            txtnumerodocumento.setText("");
            txtnumerodocumento.setEnabled(false);
            lblmensajecextranjeria.setVisible(false);}
        else if(cbtipodocumento.getSelectedItem().equals("C. Extranjería")){
            lblmensajecextranjeria.setVisible(true);
            txtnumerodocumento.setEnabled(true);
            txtnumerodocumento.setText("");
            txtnumerodocumento.requestFocus();}
        else{
            lblmensajecextranjeria.setVisible(false);
            txtnumerodocumento.setEnabled(true);
            txtnumerodocumento.setText("");
            txtnumerodocumento.requestFocus();}
    }//GEN-LAST:event_cbtipodocumentoActionPerformed
    //ACCIÓN DEL BOTÓN CARGAR FOTO
    private void btncargarfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarfotoActionPerformed
        CargarImagen();
    }//GEN-LAST:event_btncargarfotoActionPerformed
    //ACCIÓN DEL COMBOBOX EPS PARA MOSTRAR EL VALOR A PAGAR
    private void cbepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbepsActionPerformed
        if(cbeps.getSelectedItem()!=""){
            //CREAMOS EL OBJETO CLASEPACIENTES
            ClasePacientes cpa=new ClasePacientes();
            txtvalorcopago.setText(cpa.ValorCoPago(cbeps.getSelectedIndex()));}
        else{
            txtvalorcopago.setText("");}
    }//GEN-LAST:event_cbepsActionPerformed
    private void cbpaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbpaisKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbpais){
            if(Contador==10){
                cbciudades.requestFocus();}}
    }//GEN-LAST:event_cbpaisKeyTyped
    private void cbciudadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbciudadesKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbciudades){
            if(Contador==10){
                txtprofesion.requestFocus();}}
    }//GEN-LAST:event_cbciudadesKeyTyped
    //ACCIÓN CUANDO SELECCIONÓ UN PAÍS
    private void cbpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpaisActionPerformed
        cbciudades.removeAllItems();
        IniciarCiudades();
    }//GEN-LAST:event_cbpaisActionPerformed
    //ACCIÓN DEL BOTÓN GUARDAR
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        //VALIDAMOS LOS CAMPOS OBLIGATORIOS
        if(cbtipodocumento.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar un Tipo de Documento","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbtipodocumento.requestFocus();}
        else if(txtnumerodocumento.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Número de Documento del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtnumerodocumento.requestFocus();}
        else if(String.valueOf(txtnumerodocumento.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Número de Documento no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtnumerodocumento.requestFocus();
            txtnumerodocumento.setText("");}
        else if(cbtipodocumento.getSelectedItem().equals("C. Extranjería")){
            if(Formato(txtnumerodocumento.getText())==false){
                JOptionPane.showMessageDialog(null,"El Número de Documento Cédula de Extranjería esta mal\ningresada. Por favor siga el Formato que se especifica al lado.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumerodocumento.requestFocus();
                txtnumerodocumento.setText("");}
            else if(txtnombres.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir los Nombres del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnombres.requestFocus();}
            else if(String.valueOf(txtnombres.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"Nombres no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnombres.requestFocus();
                txtnombres.setText("");}
            else if(txtprimerapellido.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Primer Apellido del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtprimerapellido.requestFocus();}
            else if(String.valueOf(txtprimerapellido.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Primer Apellido no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtprimerapellido.requestFocus();
                txtprimerapellido.setText("");}
            else if(!"".equals(txtsegundoapellido.getText())){
                SegundoALleno();}
            else{
                SegundoAVacio();}}
        else if(txtnombres.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir los Nombres del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtnombres.requestFocus();}
        else if(String.valueOf(txtnombres.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"Nombres no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtnombres.requestFocus();
            txtnombres.setText("");}
        else if(txtprimerapellido.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Primer Apellido del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtprimerapellido.requestFocus();}
        else if(String.valueOf(txtprimerapellido.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Primer Apellido no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtprimerapellido.requestFocus();
                txtprimerapellido.setText("");}
        else if(!"".equals(txtsegundoapellido.getText())){
            SegundoALleno();}
        else{
            SegundoAVacio();}
    }//GEN-LAST:event_btnguardarActionPerformed
    //ACCIÓN DEL BOTÓN CONSULTAR
    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        //CREAMOS UN OBJETO DE LA CLASE USUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        ResultSet rs=cu.BuscarUsuario2(lblusuario.getText());
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
                        if(perfil.equals("Administrador")||perfil.equals("Admisión")){
                            ConsultarAdmin();}
                        else{
                            ConsultarOtro();}}}
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
    }//GEN-LAST:event_btnconsultarActionPerformed
    //ACCIÓN DEL BOTÓN REGRESAR
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        Menu menu=new Menu();
        menu.setText(lblusuario.getText());
        menu.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed
    //ACCIÓN DEL BOTÓN MODIFICAR
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        //ACTIVAMOS LOS CAMPOS
        Habilitar();
        jdcfechaingreso.setEnabled(false);
        txtnombres.requestFocus();
        //DESACTIVAMOS LOS BOTONES
        btnguardar.setEnabled(false);
        btnconsultar.setText("Limpiar");
        btnconsultar.setDescription("Clean");
        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));
        switch(btnmodificar.getText()){
            case "Modificar":
                btnmodificar.setText("Actualizar");
                btnmodificar.setDescription("Update");
                btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar2_opt.png")));
                break;
            case "Actualizar":
                if(txtnombres.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir los Nombres del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtnombres.requestFocus();}
                else if(String.valueOf(txtnombres.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"Nombres no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtnombres.requestFocus();
                    txtnombres.setText("");}
                else if(txtprimerapellido.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Primer Apellido del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtprimerapellido.requestFocus();}
                else if(String.valueOf(txtprimerapellido.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Primer Apellido no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtprimerapellido.requestFocus();
                    txtprimerapellido.setText("");}
                else if(!"".equals(txtsegundoapellido.getText())){
                    SegundoALleno2();}
                else{
                    SegundoAVacio2();}
                break;
            case "Buscar":
                if(txtnombres.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir los Nombres del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtnombres.requestFocus();}
                else if(String.valueOf(txtnombres.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"Nombres no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtnombres.requestFocus();
                    txtnombres.setText("");}
                else if(txtprimerapellido.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Primer Apellido del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtprimerapellido.requestFocus();}
                else if(String.valueOf(txtprimerapellido.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Primer Apellido no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtprimerapellido.requestFocus();
                    txtprimerapellido.setText("");}
                else{
                    //CAPTURO LOS DATOS A BUSCAR
                    String nombres=txtnombres.getText();
                    String primerApe=txtprimerapellido.getText();
                    String segundoApe=txtsegundoapellido.getText();
                    Consultar2(nombres,primerApe,segundoApe);
                    cbtipodocumento.requestFocus();
                    //CREAMOS UN OBJETO DE LA CLASE USUARIOS
                    ClaseUsuarios cu=new ClaseUsuarios();
                    ResultSet rs=cu.BuscarUsuario2(lblusuario.getText());
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
                                    if(perfil.equals("Administrador")||perfil.equals("Admisión")){
                                        btnmodificar.setEnabled(true);}
                                    else{
                                        btnmodificar.setEnabled(false);}}}
                            catch(SQLException e){
                                JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
                break;}
    }//GEN-LAST:event_btnmodificarActionPerformed
    private void cbestadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbestadoKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbestado){
            if(Contador==10){
                btnguardar.requestFocus();}}
    }//GEN-LAST:event_cbestadoKeyTyped
    //ACCIÓN DEL BOTÓN LISTAR
    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        this.dispose();
        TablaPacientes tp=new TablaPacientes();
        tp.setVisible(true);
    }//GEN-LAST:event_btnlistarActionPerformed
    /**
     * MÉTODO PARA GUARDAR LA INFORMACIÓN DE UN PACIENTE
     */
    public void Guardar(){
        //CREAMOS UN OBJETO DE CLASEPACIENTES
        ClasePacientes cpa=new ClasePacientes();
        int telefono=0,edad=0;
        long movil=0;
        String fechaNaci="";
        //CAPTURAMOS LOS DATOS
        String tipoDocumento=(String)cbtipodocumento.getSelectedItem();
        String identificacion=txtnumerodocumento.getText();
        ResultSet rs=cpa.BuscarPaciente(tipoDocumento,identificacion);
        try{
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"La Identificación ya existe en la Base de Datos","Error",JOptionPane.ERROR_MESSAGE,error);
                Limpiar();
                Iniciar();}
            else{
                String nombres=txtnombres.getText();
                String primerApellido=txtprimerapellido.getText();
                String segundoApellido=txtsegundoapellido.getText();
                ResultSet rs2=cpa.BuscarPacienteNombres(nombres,primerApellido,segundoApellido);
                try{
                    if(rs2.next()){
                        JOptionPane.showMessageDialog(null,"El Nombre, Primer Apellido y Segundo Apellido ya existe en la Base de Datos","Error",JOptionPane.ERROR_MESSAGE,error);
                        Limpiar();
                        Iniciar();}
                    else{
                        if(!"".equals(txttelefono.getText())){
                            telefono=Integer.parseInt(txttelefono.getText());}
                        if(!"".equals(txtmovil.getText())){
                            movil=Long.parseLong(txtmovil.getText());}
                        String direccion=txtdireccion.getText();
                        String genero=(String)cbgenero.getSelectedItem();
                        String correo=txtcorreo.getText();
                        if(jdcfechanacimiento.getDate()!=null){
                            fechaNaci=df.format(jdcfechanacimiento.getDate());}
                        if(!"".equals(txtedad.getText())){
                            edad=Integer.parseInt(txtedad.getText());}
                        String estadoCivil=(String)cbestadocivil.getSelectedItem();
                        int pais=cbpais.getSelectedIndex();
                        int ciudad=cbciudades.getSelectedIndex();
                        String profesion=txtprofesion.getText();
                        String tipoSangre=(String)cbtiposangre.getSelectedItem();
                        String fechaIngreso=df.format(jdcfechaingreso.getDate());
                        int eps=cbeps.getSelectedIndex();
                        String formaPago="";
                        if(rbentidadaseguradora.isSelected()==true){
                            formaPago=rbentidadaseguradora.getText();}
                        else{
                            if(rbtarjeta.isSelected()==true){
                                formaPago=rbtarjeta.getText();}
                            else{
                                if(rbefectivo.isSelected()==true){
                                    formaPago=rbefectivo.getText();}
                                else{
                                    if(rbcheque.isSelected()==true){
                                        formaPago=rbcheque.getText();}}}}
                        String numeroTarjeta=txtnumerotarjeta.getText();
                        String tipoTarjeta=(String)cbtipotarjeta.getSelectedItem();
                        String franquicia=(String)cbfranquicia.getSelectedItem();
                        String numeroCheque=txtnumerocheque.getText();
                        String banco=txtbanco.getText();
                        String rutafoto=txtrutafoto.getText();
                        String estado=(String)cbestado.getSelectedItem();
                        ObjetoPaciente pa=new ObjetoPaciente(tipoDocumento,identificacion,nombres,primerApellido,segundoApellido,telefono,movil,direccion,genero,correo,fechaNaci,edad,estadoCivil,pais,ciudad,profesion,tipoSangre,fechaIngreso,eps,formaPago,numeroTarjeta,tipoTarjeta,franquicia,numeroCheque,banco,rutafoto,estado);
                        if(edad<0){
                            JOptionPane.showMessageDialog(null,"Fecha de Nacimiento errada.","Error",JOptionPane.ERROR_MESSAGE,error);
                            jdcfechanacimiento.setDate(null);
                            jdcfechanacimiento.requestFocus();}
                        else{
                            Boolean respuesta=comparcionFechas(fechaIngreso);
                            if(respuesta!=true){
                                JOptionPane.showMessageDialog(null,"Fecha de Ingreso errada.\nLa fecha debe ser el día de Hoy","Error",JOptionPane.ERROR_MESSAGE,error);
                                jdcfechaingreso.setDate(null);}
                            else{
                                cpa.Guardar(pa);
                                JOptionPane.showMessageDialog(null,"Registro guardado con Exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
                                Limpiar();
                                Iniciar();}}}}
                catch(SQLException e){
                    System.out.println(e.getMessage());}}}
        catch(SQLException e){
            System.out.println(e.getMessage());}
    }
    /**
     * MÉTODO PARA CONSULTA DE ADMINISTRADOR
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void ConsultarAdmin(){
        switch (btnconsultar.getText()){
            case "Consultar":
                int busqueda=JOptionPane.showOptionDialog(null,"Elija un parametro de Busqueda","Selección de Busqueda",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta,new Object[]{"Documento","Nombres","Cancelar"},"Documento");
                if(busqueda==0){
                    Object[] tipoDocumento={"Registro","Tarjeta de Identidad","Cédula","C. Extranjería","Pasaporte"};
                    String seleccion=(String)JOptionPane.showInputDialog(null,"Seleccione el Tipo de Documento a Consultar","Selección a Consultar",JOptionPane.PLAIN_MESSAGE,pregunta,tipoDocumento,"Cédula");
                    if(seleccion==null){
                        cbtipodocumento.requestFocus();
                        btnmodificar.setEnabled(false);}
                    else if(seleccion.equals("C. Extranjería")){
                        String respuesta=((String)JOptionPane.showInputDialog(null,"Ingrese la Cédula de Extranjería que desea Consultar.\nPor favor, ingrese primero Letras y después Números.","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null));
                        if(respuesta==null){
                            cbtipodocumento.requestFocus();}
                        else if(Formato(respuesta)==false){
                            JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar. El Dato\ndebe tener el Formato (Letras-Números).","Error",JOptionPane.ERROR_MESSAGE,error);
                            cbtipodocumento.requestFocus();}
                        else{
                            Consultar(respuesta);}}
                    else{
                        String respuesta=((String)JOptionPane.showInputDialog(null,"Ingrese el Número de Documento que desea Consultar","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null));
                        if(respuesta==null){
                            cbtipodocumento.requestFocus();}
                        else if(!EsNumero(respuesta)){
                            JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar.\nEl Dato debe ser un Número de Documento.","Error",JOptionPane.ERROR_MESSAGE,error);
                            cbtipodocumento.requestFocus();}
                        else{
                            Consultar(respuesta);}}}
                else if(busqueda==1){
                    Inhabilitar2();
                    btnguardar.setEnabled(false);
                    btnlistar.setEnabled(false);
                    btnconsultar.setText("Limpiar");
                    btnconsultar.setDescription("Clean");
                    btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));
                    btnmodificar.setText("Buscar");
                    btnmodificar.setDescription("Seach");
                    //btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));
                    btnmodificar.setEnabled(true);}
                else{
                    cbtipodocumento.requestFocus();}
                break;
            case "Limpiar":
                Limpiar();
                Iniciar();
                cbtipodocumento.setEnabled(true);
                cbtipodocumento.requestFocus();
                Habilitar();
                btnconsultar.setText("Consultar");
                btnconsultar.setDescription("Consult");
                btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
                btnguardar.setEnabled(true);
                btnmodificar.setText("Modificar");
                btnmodificar.setDescription("Edit");
                btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png")));
                btnmodificar.setEnabled(false);
                break;}
    }
    /**
     * MÉTODO PARA CONSULTA DE OTRO PERFIL
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void ConsultarOtro(){
        switch (btnconsultar.getText()){
            case "Consultar":
                int busqueda=JOptionPane.showOptionDialog(null,"Elija un parametro de Busqueda","Selección de Busqueda",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta,new Object[]{"Documento","Nombres","Cancelar"},"Documento");
                if(busqueda==0){
                    Object[] tipoDocumento={"Registro","Tarjeta de Identidad","Cédula","C. Extranjería","Pasaporte"};
                    String seleccion=(String)JOptionPane.showInputDialog(null,"Seleccione el Tipo de Documento a Consultar","Selección a Consultar",JOptionPane.PLAIN_MESSAGE,pregunta,tipoDocumento,"Cédula");
                    if(seleccion==null){
                        btnconsultar.requestFocus();}
                    else if(seleccion.equals("C. Extranjería")){
                        String respuesta=((String)JOptionPane.showInputDialog(null,"Ingrese la Cédula de Extranjería que desea Consultar.\nPor favor, ingrese primero Letras y después Números.","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null));
                        if(respuesta==null){
                            btnconsultar.requestFocus();}
                        else if(Formato(respuesta)==false){
                            JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar. El Dato\ndebe tener el Formato (Letras-Números).","Error",JOptionPane.ERROR_MESSAGE,error);
                            btnconsultar.requestFocus();}
                        else{
                            Consultar(respuesta);
                            btnmodificar.setEnabled(false);}}
                    else{
                        String respuesta=((String)JOptionPane.showInputDialog(null,"Ingrese el Número de Documento que desea Consultar","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null));
                        if(respuesta==null){
                            btnconsultar.requestFocus();}
                        else if(!EsNumero(respuesta)){
                            JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar.\nEl Dato debe ser un Número de Documento.","Error",JOptionPane.ERROR_MESSAGE,error);
                            btnconsultar.requestFocus();}
                        else{
                            Consultar(respuesta);
                            btnmodificar.setEnabled(false);}}}
                else if(busqueda==1){
                    Inhabilitar2();
                    btnconsultar.setText("Limpiar");
                    btnconsultar.setDescription("Clean");
                    btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));
                    btnmodificar.setText("Buscar");
                    btnmodificar.setDescription("Seach");
                    //btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));
                    btnmodificar.setEnabled(true);}
                else{
                    btnconsultar.requestFocus();}
                break;
            case "Limpiar":
                Limpiar();
                Iniciar();
                btnconsultar.setText("Consultar");
                btnconsultar.setDescription("Consult");
                btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
                btnmodificar.setEnabled(false);
                btnlistar.setEnabled(false);
                break;}
    }
    /**
     * MÉTODO CONSULTAR
     * @param respuesta que contiene un String que sera Buscado
     */
    public void Consultar(String respuesta){
        //CREAMOS UN OBJETO DE CLASEPACIENTES
        ClasePacientes cpa=new ClasePacientes();
        ResultSet rs=cpa.BuscarIdentificacion(respuesta);
        try{
            if(rs.next()){
                //JUEGO DE BOTONES
                btnmodificar.setEnabled(true);
                btnguardar.setEnabled(false);
                Inhabilitar();
                //CAPTURAMOS LA INFORMACIÓN EN LAS CAJAS
                cbtipodocumento.setSelectedItem(rs.getString(1));
                txtnumerodocumento.setText(rs.getString(2));
                txtnumerodocumento.setEnabled(false);
                txtnombres.setText(rs.getString(3));
                txtprimerapellido.setText(rs.getString(4));
                txtsegundoapellido.setText(rs.getString(5));
                txttelefono.setText(rs.getString(6));
                txtmovil.setText(rs.getString(7));
                txtdireccion.setText(rs.getString(8));
                cbgenero.setSelectedItem(rs.getString(9));
                txtcorreo.setText(rs.getString(10));
                String fn=rs.getDate(11).toString();
                if(fn.equals("1900-01-01")){
                    jdcfechanacimiento.setDate(null);}
                else{
                    jdcfechanacimiento.setDate(rs.getDate(11));}
                cbestadocivil.setSelectedItem(rs.getString(13));
                cbpais.setSelectedIndex(rs.getInt(14));
                cbciudades.setSelectedIndex(rs.getInt(15));
                txtprofesion.setText(rs.getString(16));
                cbtiposangre.setSelectedItem(rs.getString(17));
                jdcfechaingreso.setDate(rs.getDate(18));
                cbeps.setSelectedIndex(rs.getInt(19));
                String fp=rs.getString(20);
                switch(fp){
                    case "Entidad Aseguradora":
                        rbentidadaseguradora.setSelected(true);
                        break;
                    case "Tarjeta":
                        rbtarjeta.setSelected(true);
                        txtnumerotarjeta.setText(rs.getString(21));
                        cbtipotarjeta.setSelectedItem(rs.getString(22));
                        cbfranquicia.setSelectedItem(23);
                        break;
                    case "Efectivo":
                        rbefectivo.setSelected(true);
                        break;
                    case "Cheque":
                        rbcheque.setSelected(true);
                        txtnumerocheque.setText(rs.getString(24));
                        txtbanco.setText(rs.getString(25));
                        break;}
                //CREAMOS UN OBJETO DE CONEXION
                Conectate con=new Conectate();
                String consulta="FotoPacientes '"+respuesta+"'";
                ResultSet r=con.Listar(consulta);
                String Respuesta="";
                try{
                    while(r.next()){
                        Respuesta=r.getString(1);}
                    if(Respuesta.equals("NO")){
                        lblimagenfoto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/foto_opt.png")));
                        JOptionPane.showMessageDialog(null,"El Documento buscado no tiene Foto","Advertencia",JOptionPane.INFORMATION_MESSAGE,informacion);}
                    else{
                        txtrutafoto.setText(rs.getString(27));
                        CargarFoto(respuesta);}}
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
                cbestado.setSelectedItem(rs.getString(28));
                btnconsultar.setText("Limpiar");
                btnconsultar.setDescription("Clean");
                btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));}
            else{
                Habilitar();
                Limpiar();
                JOptionPane.showMessageDialog(null,"El Documento buscado no existe.","Información",JOptionPane.INFORMATION_MESSAGE,informacion);}}
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
    }
    /**
     * MÉTODO CONSULTAR2
     * @param nombres que contiene un String que sera Buscado
     * @param primerApe que contiene un String que sera Buscado
     * @param segundoApe que contiene un String que sera Buscado
     */
    public void Consultar2(String nombres,String primerApe,String segundoApe){
        //CREAMOS UN OBJETO DE CLASEPACIENTES
        ClasePacientes cpa=new ClasePacientes();
        ResultSet rs=cpa.BuscarPacienteNombres(nombres,primerApe,segundoApe);
        try{
            if(rs.next()){
                //JUEGO DE BOTONES                
                btnmodificar.setText("Modificar");
                btnmodificar.setDescription("Edit");
                btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png")));
                btnguardar.setEnabled(false);
                Inhabilitar();
                //CAPTURAMOS LA INFORMACIÓN EN LAS CAJAS
                cbtipodocumento.setSelectedItem(rs.getString(1));
                txtnumerodocumento.setText(rs.getString(2));
                txtnumerodocumento.setEnabled(false);
                txtnombres.setText(rs.getString(3));
                txtprimerapellido.setText(rs.getString(4));
                txtsegundoapellido.setText(rs.getString(5));
                txttelefono.setText(rs.getString(6));
                txtmovil.setText(rs.getString(7));
                txtdireccion.setText(rs.getString(8));
                cbgenero.setSelectedItem(rs.getString(9));
                txtcorreo.setText(rs.getString(10));
                String fn=rs.getDate(11).toString();
                if(fn.equals("1900-01-01")){
                    jdcfechanacimiento.setDate(null);}
                else{
                    jdcfechanacimiento.setDate(rs.getDate(11));}
                cbestadocivil.setSelectedItem(rs.getString(13));
                cbpais.setSelectedIndex(rs.getInt(14));
                cbciudades.setSelectedIndex(rs.getInt(15));
                txtprofesion.setText(rs.getString(16));
                cbtiposangre.setSelectedItem(rs.getString(17));
                jdcfechaingreso.setDate(rs.getDate(18));
                cbeps.setSelectedIndex(rs.getInt(19));
                String fp=rs.getString(20);
                switch(fp){
                    case "Entidad Aseguradora":
                        rbentidadaseguradora.setSelected(true);
                        break;
                    case "Tarjeta":
                        rbtarjeta.setSelected(true);
                        txtnumerotarjeta.setText(rs.getString(21));
                        cbtipotarjeta.setSelectedItem(rs.getString(22));
                        cbfranquicia.setSelectedItem(23);
                        break;
                    case "Efectivo":
                        rbefectivo.setSelected(true);
                        break;
                    case "Cheque":
                        rbcheque.setSelected(true);
                        txtnumerocheque.setText(rs.getString(24));
                        txtbanco.setText(rs.getString(25));
                        break;}
                //CREAMOS UN OBJETO DE CONEXION
                Conectate con=new Conectate();
                String consulta="FotoPacientes '"+txtnumerodocumento.getText()+"'";
                ResultSet r=con.Listar(consulta);
                String Respuesta="";
                try{
                    while(r.next()){
                        Respuesta=r.getString(1);}
                    if(Respuesta.equals("NO")){
                        lblimagenfoto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/foto_opt.png")));
                        JOptionPane.showMessageDialog(null,"El Paciente buscado no tiene Foto","Advertencia",JOptionPane.INFORMATION_MESSAGE,informacion);}
                    else{
                        txtrutafoto.setText(rs.getString(27));
                        CargarFoto(txtnumerodocumento.getText());}}
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
                btnconsultar.setText("Limpiar");
                btnconsultar.setDescription("Clean");
                btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));}
            else{
                Inhabilitar2();
                JOptionPane.showMessageDialog(null,"El Paciente buscado no existe o no tiene registro de entrada.","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
                txtnombres.setText("");
                txtprimerapellido.setText("");
                txtsegundoapellido.setText("");}}
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
    }
    /**
     * MÉTODO PARA ACTUALIZAR
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void Actualizar(){
        //CREAMOS UN OBJETO DE CLASEPACIENTES
        ClasePacientes cpa=new ClasePacientes();
        int telefono=0,edad=0;
        long movil=0;
        //CAPTURAMOS LOS DATOS
        String tipoDocumento=(String)cbtipodocumento.getSelectedItem();
        String identificacion=txtnumerodocumento.getText();
        String nombres=txtnombres.getText();
        String primerApellido=txtprimerapellido.getText();
        String segundoApellido=txtsegundoapellido.getText();
        if(!"".equals(txttelefono.getText())){
            telefono=Integer.parseInt(txttelefono.getText());}
        if(!"".equals(txtmovil.getText())){
            movil=Long.parseLong(txtmovil.getText());}
        String direccion=txtdireccion.getText();
        String genero=(String)cbgenero.getSelectedItem();
        String correo=txtcorreo.getText();
        Date fn=jdcfechanacimiento.getDate();
        String fechaNaci="1900-01-01";
        if(fn!=null){
            fechaNaci=df.format(jdcfechanacimiento.getDate());}
        if(!"".equals(txtedad.getText())){
            edad=Integer.parseInt(txtedad.getText());}
        String estadoCivil=(String)cbestadocivil.getSelectedItem();
        int pais=cbpais.getSelectedIndex();
        int ciudad=cbciudades.getSelectedIndex();
        String profesion=txtprofesion.getText();
        String tipoSangre=(String)cbtiposangre.getSelectedItem();
        String fechaIngreso=df.format(jdcfechaingreso.getDate());
        int eps=cbeps.getSelectedIndex();
        String formaPago="";
        if(rbentidadaseguradora.isSelected()==true){
            formaPago=rbentidadaseguradora.getText();}
        else{
            if(rbtarjeta.isSelected()==true){
                formaPago=rbtarjeta.getText();}
            else{
                if(rbefectivo.isSelected()==true){
                    formaPago=rbefectivo.getText();}
                else{
                    if(rbcheque.isSelected()==true){
                        formaPago=rbcheque.getText();}}}}
        String numeroTarjeta=txtnumerotarjeta.getText();
        String tipoTarjeta=(String)cbtipotarjeta.getSelectedItem();
        String franquicia=(String)cbfranquicia.getSelectedItem();
        String numeroCheque=txtnumerocheque.getText();
        String banco=txtbanco.getText();
        String rutafoto=txtrutafoto.getText();
        String estado=(String)cbestado.getSelectedItem();
        ObjetoPaciente pa=new ObjetoPaciente(tipoDocumento,identificacion,nombres,primerApellido,segundoApellido,telefono,movil,direccion,genero,correo,fechaNaci,edad,estadoCivil,pais,ciudad,profesion,tipoSangre,fechaIngreso,eps,formaPago,numeroTarjeta,tipoTarjeta,franquicia,numeroCheque,banco,rutafoto,estado);
        if(edad<0){
            JOptionPane.showMessageDialog(null,"Fecha de Nacimiento errada.","Error",JOptionPane.ERROR_MESSAGE,error);
            jdcfechanacimiento.setDate(null);
            jdcfechanacimiento.requestFocus();}
        else{
            cpa.Actualizar(pa);
            JOptionPane.showMessageDialog(null,"Registro Actualizado con Exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
            Limpiar();
            Iniciar();
            cbtipodocumento.setEnabled(true);
            cbtipodocumento.requestFocus();
            btnconsultar.setText("Consultar");
            btnconsultar.setDescription("Consult");
            btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
            btnguardar.setEnabled(true);
            btnmodificar.setEnabled(false);
            btnmodificar.setText("Modificar");
            btnmodificar.setDescription("Edit");
            btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png")));
            btnmodificar.setEnabled(false);}
    }
    //COMPLEMENTO DE VALIDACIONES GUARDAR    
    public void SegundoALleno(){
        if(String.valueOf(txtsegundoapellido.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Segundo Apellido no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtsegundoapellido.requestFocus();
            txtsegundoapellido.setText("");}
        else if(!"".equals(txttelefono.getText())){
            TelefonoLleno();}
        else{
            TelefonoVacio();}}
    public void SegundoAVacio(){
        if(!"".equals(txttelefono.getText())){
            TelefonoLleno();}
        else{
            TelefonoVacio();}}
    public void TelefonoLleno(){
        if(String.valueOf(txttelefono.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Número de Teléfono no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txttelefono.requestFocus();
            txttelefono.setText("");}
        else if(!"".equals(txtmovil.getText())){
            MovilLleno();}
        else{
            MovilVacio();}}
    public void TelefonoVacio(){
        if(!"".equals(txtmovil.getText())){
            MovilLleno();}
        else{
            MovilVacio();}}
    public void MovilLleno(){
        if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Número del Móvil no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtmovil.requestFocus();
            txtmovil.setText("");}
        else if(!"".equals(txtdireccion.getText())){
            DireccionLleno();}
        else{
            DireccionVacio();}}
    public void MovilVacio(){
        if(!"".equals(txtdireccion.getText())){
            DireccionLleno();}
        else{
            DireccionVacio();}}
    public void DireccionLleno(){
        if(String.valueOf(txtdireccion.getText().charAt(0)).equals(" ")||EsNumero(String.valueOf(txtdireccion.getText().charAt(0)))==true){
            JOptionPane.showMessageDialog(null,"La Dirección Residencia no puede iniciar con espacio en blanco o con un Número","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtdireccion.requestFocus();
            txtdireccion.setText("");}
        else if(cbgenero.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el Género del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbgenero.requestFocus();}
        else if(!"".equals(txtcorreo.getText())){
            CorreoLleno();}
        else{
            CorreoVacio();}}
    public void DireccionVacio(){
        if(cbgenero.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el Género del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbgenero.requestFocus();}
        else if(!"".equals(txtcorreo.getText())){
            CorreoLleno();}
        else{
            CorreoVacio();}}
    public void CorreoLleno(){
        if(EsNumero(String.valueOf(txtcorreo.getText().charAt(0)))==true){
            JOptionPane.showMessageDialog(null,"El Correo esta mal ingresado","Validación",JOptionPane.ERROR_MESSAGE,error);
            txtcorreo.requestFocus();
            txtcorreo.setText("");}
        else if(esMail(txtcorreo.getText())==false){
            JOptionPane.showMessageDialog(null,"El Correo esta mal ingresado","Validación",JOptionPane.ERROR_MESSAGE,error);
            txtcorreo.requestFocus();}
        else if(cbpais.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el País de Nacimiento del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbpais.requestFocus();}
        else if(cbciudades.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la Ciudad de Nacimiento del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbciudades.requestFocus();}
        else if(!"".equals(txtprofesion.getText())){
            ProfesionLleno();}
        else{
            ProfesionVacio();}}
    public void CorreoVacio(){
        if(cbpais.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el País de Nacimiento del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbpais.requestFocus();}
        else if(cbciudades.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la Ciudad de Nacimiento del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbciudades.requestFocus();}
        else if(!"".equals(txtprofesion.getText())){
            ProfesionLleno();}
        else{
            ProfesionVacio();}}
    public void ProfesionLleno(){
        if(String.valueOf(txtprofesion.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"Profesión no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtprofesion.requestFocus();
            txtprofesion.setText("");}
        else if(jdcfechaingreso.getDate()==null){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la Fecha de Ingreso del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            jdcfechaingreso.requestFocus();}
        else if(cbeps.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la EPS o IPS del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbeps.requestFocus();}
        else if(rbentidadaseguradora.isSelected()==false&&rbtarjeta.isSelected()==false&&rbefectivo.isSelected()==false&&rbcheque.isSelected()==false){
            JOptionPane.showMessageDialog(null,"Debe seleccionar una Forma de Pago","Verificar",JOptionPane.WARNING_MESSAGE,warning);}
        else if(rbtarjeta.isSelected()==true){
            if(txtnumerotarjeta.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Número de Tarjeta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumerotarjeta.requestFocus();}
            else if(cbtipotarjeta.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Tipo de Tarjeta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbtipotarjeta.requestFocus();}
            else if(cbfranquicia.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar la Franquicia de la Tarjeta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbfranquicia.requestFocus();}
            else if(cbestado.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbestado.requestFocus();}
            else{
                Guardar();}}
        else if(rbcheque.isSelected()==true){
            if(txtnumerocheque.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Número de Cheque","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumerocheque.requestFocus();}
            else if(txtbanco.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Banco al que pertenece el Cheque","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtbanco.requestFocus();}
            else if(String.valueOf(txtbanco.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Banco no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtbanco.requestFocus();
                txtbanco.setText("");}
            else if(cbestado.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbestado.requestFocus();}
            else{
                Guardar();}}
        else if(cbestado.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbestado.requestFocus();}
        else{
            Guardar();}}
    public void ProfesionVacio(){
        if(jdcfechaingreso.getDate()==null){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la Fecha de Ingreso del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            jdcfechaingreso.requestFocus();}
        else if(cbeps.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la EPS o IPS del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbeps.requestFocus();}
        else if(rbentidadaseguradora.isSelected()==false&&rbtarjeta.isSelected()==false&&rbefectivo.isSelected()==false&&rbcheque.isSelected()==false){
            JOptionPane.showMessageDialog(null,"Debe seleccionar una Forma de Pago","Verificar",JOptionPane.WARNING_MESSAGE,warning);}
        else if(rbtarjeta.isSelected()==true){
            if(txtnumerotarjeta.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Número de Tarjeta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumerotarjeta.requestFocus();}
            else if(cbtipotarjeta.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Tipo de Tarjeta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbtipotarjeta.requestFocus();}
            else if(cbfranquicia.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar la Franquicia de la Tarjeta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbfranquicia.requestFocus();}
            else if(cbestado.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbestado.requestFocus();}
            else{
                Guardar();}}
        else if(rbcheque.isSelected()==true){
            if(txtnumerocheque.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Número de Cheque","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumerocheque.requestFocus();}
            else if(txtbanco.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Banco al que pertenece el Cheque","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtbanco.requestFocus();}
            else if(String.valueOf(txtbanco.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Banco no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtbanco.requestFocus();
                txtbanco.setText("");}
            else if(cbestado.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbestado.requestFocus();}
            else{
                Guardar();}}
        else if(cbestado.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbestado.requestFocus();}
        else{
            Guardar();}}
    //COMPLEMENTO DE VALIDACIONES MODIFICAR   
    public void SegundoALleno2(){
        if(String.valueOf(txtsegundoapellido.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Segundo Apellido no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtsegundoapellido.requestFocus();
            txtsegundoapellido.setText("");}
        else if(!"".equals(txttelefono.getText())){
            TelefonoLleno2();}
        else{
            TelefonoVacio2();}}
    public void SegundoAVacio2(){
        if(!"".equals(txttelefono.getText())){
            TelefonoLleno2();}
        else{
            TelefonoVacio2();}}
    public void TelefonoLleno2(){
        if(String.valueOf(txttelefono.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Número de Teléfono no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txttelefono.requestFocus();
            txttelefono.setText("");}
        else if(!"".equals(txtmovil.getText())){
            MovilLleno2();}
        else{
            MovilVacio2();}}
    public void TelefonoVacio2(){
        if(!"".equals(txtmovil.getText())){
            MovilLleno2();}
        else{
            MovilVacio2();}}
    public void MovilLleno2(){
        if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Número del Móvil no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtmovil.requestFocus();
            txtmovil.setText("");}
        else if(!"".equals(txtdireccion.getText())){
            DireccionLleno2();}
        else{
            DireccionVacio2();}}
    public void MovilVacio2(){
        if(!"".equals(txtdireccion.getText())){
            DireccionLleno2();}
        else{
            DireccionVacio2();}}
    public void DireccionLleno2(){
        if(String.valueOf(txtdireccion.getText().charAt(0)).equals(" ")||EsNumero(String.valueOf(txtdireccion.getText().charAt(0)))==true){
            JOptionPane.showMessageDialog(null,"La Dirección Residencia no puede iniciar con espacio en blanco o con un Número","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtdireccion.requestFocus();
            txtdireccion.setText("");}
        else if(cbgenero.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el Género del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbgenero.requestFocus();}
        else if(!"".equals(txtcorreo.getText())){
            CorreoLleno2();}
        else{
            CorreoVacio2();}}
    public void DireccionVacio2(){
        if(cbgenero.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el Género del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbgenero.requestFocus();}
        else if(!"".equals(txtcorreo.getText())){
            CorreoLleno2();}
        else{
            CorreoVacio2();}}
    public void CorreoLleno2(){
        if(EsNumero(String.valueOf(txtcorreo.getText().charAt(0)))==true){
            JOptionPane.showMessageDialog(null,"El Correo esta mal ingresado","Validación",JOptionPane.ERROR_MESSAGE,error);
            txtcorreo.requestFocus();
            txtcorreo.setText("");}
        else if(esMail(txtcorreo.getText())==false){
            JOptionPane.showMessageDialog(null,"El Correo esta mal ingresado","Validación",JOptionPane.ERROR_MESSAGE,error);
            txtcorreo.requestFocus();}
        else if(cbpais.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el País de Nacimiento del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbpais.requestFocus();}
        else if(cbciudades.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la Ciudad de Nacimiento del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbciudades.requestFocus();}
        else if(!"".equals(txtprofesion.getText())){
            ProfesionLleno2();}
        else{
            ProfesionVacio2();}}
    public void CorreoVacio2(){
        if(cbpais.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el País de Nacimiento del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbpais.requestFocus();}
        else if(cbciudades.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la Ciudad de Nacimiento del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbciudades.requestFocus();}
        else if(!"".equals(txtprofesion.getText())){
            ProfesionLleno2();}
        else{
            ProfesionVacio2();}}
    public void ProfesionLleno2(){
        if(String.valueOf(txtprofesion.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"Profesión no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtprofesion.requestFocus();
            txtprofesion.setText("");}
        else if(cbeps.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la EPS o IPS del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbeps.requestFocus();}
        else if(rbentidadaseguradora.isSelected()==false&&rbtarjeta.isSelected()==false&&rbefectivo.isSelected()==false&&rbcheque.isSelected()==false){
            JOptionPane.showMessageDialog(null,"Debe seleccionar una Forma de Pago","Verificar",JOptionPane.WARNING_MESSAGE,warning);}
        else if(rbtarjeta.isSelected()==true){
            if(txtnumerotarjeta.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Número de Tarjeta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumerotarjeta.requestFocus();}
            else if(cbtipotarjeta.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Tipo de Tarjeta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbtipotarjeta.requestFocus();}
            else if(cbfranquicia.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar la Franquicia de la Tarjeta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbfranquicia.requestFocus();}
            else if(cbestado.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbestado.requestFocus();}
            else{
                Actualizar();}}
        else if(rbcheque.isSelected()==true){
            if(txtnumerocheque.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Número de Cheque","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumerocheque.requestFocus();}
            else if(txtbanco.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Banco al que pertenece el Cheque","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtbanco.requestFocus();}
            else if(String.valueOf(txtbanco.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Banco no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtbanco.requestFocus();
                txtbanco.setText("");}
            else if(cbestado.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbestado.requestFocus();}
            else{
                Actualizar();}}
        else if(cbestado.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbestado.requestFocus();}
        else{
            Actualizar();}}
    public void ProfesionVacio2(){
        if(cbeps.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la EPS o IPS del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbeps.requestFocus();}
        else if(rbentidadaseguradora.isSelected()==false&&rbtarjeta.isSelected()==false&&rbefectivo.isSelected()==false&&rbcheque.isSelected()==false){
            JOptionPane.showMessageDialog(null,"Debe seleccionar una Forma de Pago","Verificar",JOptionPane.WARNING_MESSAGE,warning);}
        else if(rbtarjeta.isSelected()==true){
            if(txtnumerotarjeta.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Número de Tarjeta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumerotarjeta.requestFocus();}
            else if(cbtipotarjeta.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Tipo de Tarjeta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbtipotarjeta.requestFocus();}
            else if(cbfranquicia.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar la Franquicia de la Tarjeta","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbfranquicia.requestFocus();}
            else if(cbestado.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbestado.requestFocus();}
            else{
                Actualizar();}}
        else if(rbcheque.isSelected()==true){
            if(txtnumerocheque.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Número de Cheque","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtnumerocheque.requestFocus();}
            else if(txtbanco.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Banco al que pertenece el Cheque","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtbanco.requestFocus();}
            else if(String.valueOf(txtbanco.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Banco no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtbanco.requestFocus();
                txtbanco.setText("");}
            else if(cbestado.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbestado.requestFocus();}
            else{
                Actualizar();}}
        else if(cbestado.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el Estado del Paciente","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbestado.requestFocus();}
        else{
            Actualizar();}}
    /**
     * MÉTODO CARGAR IMAGEN
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public void CargarImagen(){
        //CREAMOS UN OBJETO DE FILECHOOSER
        JFileChooser dlg=new JFileChooser();
        //DEL OBJETO CREADO, VAMOS A LLAMAR AL MÉTODO setFileFilter, Y MANDAMOS NUESTRA VARIABLE CREADA
        dlg.setFileFilter(filter);
        //ABRIMOS LA VENTANA DE DIALOGO PARA ESCOGER LAS IMAGENES
        int opcion=dlg.showOpenDialog(this);
        //SI HACEMOS CLIC EN EL BOTÓN ABRIR
        if(opcion==JFileChooser.APPROVE_OPTION){
            //OBTENEMOS EN NOMBRE DEL ARCHIVO QUE HEMOS SELECCIONADO
            String file=dlg.getSelectedFile().getPath();
            //OBTENER LA DIRECCIÓN DONDE SE GUARDARA LA IMAGEN
            String file2=dlg.getSelectedFile().toString();
            lblimagenfoto.setIcon(new ImageIcon(file));
            //MODIFICAMOS LA IMAGEN
            ImageIcon icon=new ImageIcon(file);
            //EXTRAER LA IMAGEN DEL ICONO
            Image imagen=icon.getImage();
            //CAMBIAR TAMAÑO DE NUESTRA IMAGEN
            Image imagen2=imagen.getScaledInstance(315,304,java.awt.Image.SCALE_SMOOTH);
            //GENERAMOS EL ImageIcon CON LA NUEVA IMAGEN
            ImageIcon icon2=new ImageIcon(imagen2);
            //PINTAMOS LA IMAGEN EN EL LABEL
            lblimagenfoto.setIcon(icon2);
            //DIMENSIONAMOS EL LABEL
            lblimagenfoto.setSize(315,304);
            //OBTENEMOS LA RUTA EN EL TEXTFIELD
            txtrutafoto.setText(file);
            //LIMPIAMOS LA RUTA
            Ruta="";}
    }
    /**
     * MÉTODO PARA CARGAR FOTOS DEL PERSONAL MÉDICO
     * @param identificacion que contiene un Long para Buscarlo
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void CargarFoto(String identificacion){
        Image dtCat=foto.RecuperarFotoPaciente(identificacion);
        ImageIcon icon=new ImageIcon(dtCat);
        //SE EXTRAE LA IMAGEN DEL ICONO
        Image img=icon.getImage();
        //SE MODIFICA SU TAMAÑO
        Image newimg=img.getScaledInstance(315,304,java.awt.Image.SCALE_SMOOTH);
        //SE GENERA EL IMAGE ICON CON LA NUEVA IMAGEN
        ImageIcon newIcon=new ImageIcon(newimg);
        //SE COLOCA EL NUEVO ICONO MODIFICADO
        if(newIcon!=null){
            lblimagenfoto.setIcon(newIcon);
            lblimagenfoto.setSize(315,304);}
    }
    /**
     * MÉTODO PARA OBTENER LOS AÑOS SEGÚN FECHAS DE NACIMIENTO
     * @param FechaR que contiene un String para ser Validado
     * @return un int con la Edad, según la fecha de nacimiento
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    public int Fecha(String FechaR){
        Date Fecha=null;
        try{
           /*SE PUEDE CAMBIAR LA MÁSCARA POR EL FORMATO DE LA FECHA
           QUE SE QUIERE RECIBIR, POR EJEMPLO "yyyy-MM-dd"
           EN ESTE CASO ES DÍA, MES Y AÑO*/
           Fecha=new SimpleDateFormat("dd/MM/yyyy").parse(FechaR);}
        catch (Exception ex){
            System.out.println("Error:"+ex);}
        Calendar fecha=Calendar.getInstance();
        //SE CREA UN OBJETO CON LA FECHA ACTUAL
        Calendar fechaActual=Calendar.getInstance();
        //SE ASIGNA LA FECHA RECIBIDA AL CALENDAR FECHA
        fecha.setTime(Fecha);
        //SE RESTAN LA FECHA ACTUAL Y EL CALENDAR FECHA
        int year=fechaActual.get(Calendar.YEAR)-fecha.get(Calendar.YEAR);
        int mes=fechaActual.get(Calendar.MONTH)-fecha.get(Calendar.MONTH);
        int dia=fechaActual.get(Calendar.DATE)-fecha.get(Calendar.DATE);
        //SE AJUSTA EL AÑO DEPENDIENDO DEL MES Y EL DÍA
        if(mes<0||(mes==0&&dia<0)){
            year--;}
        //REGRESA LA CANTIDAD DE AÑOS EN BASE A LA FECHA RECIBIDA
        return year;
    }
    /**
     * MÉTODO PARA VALIDAR UN EMAIL
     * @param correo que contiene un String con un correo
     * @return un dato tipo Booleano informando si el correo es o no correcto
     */
    protected static boolean esMail(String correo){
        boolean correcto=false;
        Pattern patronEmail=Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcherMail=patronEmail.matcher(correo.toLowerCase());
        if(matcherMail.matches()){
            correcto=true;}
        return correcto;
    }
    /**
     * MÉTODO PARA HABILITAR LOS CAMPOS DE INFORMACIÓN
     */
    public void Habilitar(){
        txtnombres.setEnabled(true);
        txtprimerapellido.setEnabled(true);
        txtsegundoapellido.setEnabled(true);
        txttelefono.setEnabled(true);
        txtmovil.setEnabled(true);
        txtdireccion.setEnabled(true);
        cbgenero.setEnabled(true);
        txtcorreo.setEnabled(true);
        jdcfechanacimiento.setEnabled(true);
        //ASÍ SE INHABILITAN LOS JDATECHOOSER PARA QUE SOLO SE ESCOJA LA FECHA DESDE EL CALENDARIO
        jdcfechanacimiento.getDateEditor().setEnabled(false);
        txtedad.setEnabled(true);
        cbestadocivil.setEnabled(true);
        cbpais.setEnabled(true);
        cbciudades.setEnabled(true);
        txtprofesion.setEnabled(true);
        txtrutafoto.setEnabled(true);
        cbtiposangre.setEnabled(true);
        jdcfechaingreso.setEnabled(true);
        jdcfechaingreso.getDateEditor().setEnabled(false);
        cbeps.setEnabled(true);
        txtvalorcopago.setEnabled(true);
        rbentidadaseguradora.setEnabled(true);
        rbtarjeta.setEnabled(true);
        rbefectivo.setEnabled(true);
        rbcheque.setEnabled(true);
        /*txtnumerotarjeta.setEnabled(true);
        cbtipotarjeta.setEnabled(true);
        cbfranquicia.setEnabled(true);
        txtnumerocheque.setEnabled(true);
        txtbanco.setEnabled(true);*/
        cbestado.setEnabled(true);
    }
    /**
     * MÉTODO PARA INHABILITAR LOS CAMPOS DE INFORMACIÓN
     */
    public void Inhabilitar(){
        cbtipodocumento.setEnabled(false);
        txtnombres.setEnabled(false);
        txtprimerapellido.setEnabled(false);
        txtsegundoapellido.setEnabled(false);
        txttelefono.setEnabled(false);
        txtmovil.setEnabled(false);
        txtdireccion.setEnabled(false);
        cbgenero.setEnabled(false);
        txtcorreo.setEnabled(false);
        jdcfechanacimiento.setEnabled(false);
        txtedad.setEnabled(false);
        cbestadocivil.setEnabled(false);
        cbpais.setEnabled(false);
        cbciudades.setEnabled(false);
        txtprofesion.setEnabled(false);
        txtrutafoto.setEnabled(false);
        cbtiposangre.setEnabled(false);
        jdcfechaingreso.setEnabled(false);
        cbeps.setEnabled(false);
        txtvalorcopago.setEnabled(false);
        rbentidadaseguradora.setEnabled(false);
        rbtarjeta.setEnabled(false);
        rbefectivo.setEnabled(false);
        rbcheque.setEnabled(false);
        txtnumerotarjeta.setEnabled(false);
        cbtipotarjeta.setEnabled(false);
        cbfranquicia.setEnabled(false);
        txtnumerocheque.setEnabled(false);
        txtbanco.setEnabled(false);
        cbestado.setEnabled(false);
    }
    /**
     * MÉTODO PARA INHABILITAR LOS CAMPOS DE INFORMACIÓN
     */
    public void Inhabilitar2(){
        cbtipodocumento.setEnabled(false);
        txtnombres.setEnabled(true);
        txtnombres.requestFocus();
        txtprimerapellido.setEnabled(true);
        txtsegundoapellido.setEnabled(true);
        txttelefono.setEnabled(false);
        txtmovil.setEnabled(false);
        txtdireccion.setEnabled(false);
        cbgenero.setEnabled(false);
        txtcorreo.setEnabled(false);
        jdcfechanacimiento.setEnabled(false);
        txtedad.setEnabled(false);
        cbestadocivil.setEnabled(false);
        cbpais.setEnabled(false);
        cbciudades.setEnabled(false);
        txtprofesion.setEnabled(false);
        txtrutafoto.setEnabled(false);
        cbtiposangre.setEnabled(false);
        jdcfechaingreso.setEnabled(false);
        cbeps.setEnabled(false);
        txtvalorcopago.setEnabled(false);
        rbentidadaseguradora.setEnabled(false);
        rbtarjeta.setEnabled(false);
        rbefectivo.setEnabled(false);
        rbcheque.setEnabled(false);
        txtnumerotarjeta.setEnabled(false);
        cbtipotarjeta.setEnabled(false);
        cbfranquicia.setEnabled(false);
        txtnumerocheque.setEnabled(false);
        txtbanco.setEnabled(false);
        cbestado.setEnabled(false);
    }
    /**
     * MÉTODO QUE VALIDA SI RESPUESTA ES UN NÚMERO
     * @param Respuesta que contiene un String que sera Analizado
     * @return un dato tipo Booleano
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private static boolean EsNumero(String Respuesta){
        try{
            Integer.parseInt(Respuesta);
            return true;}
        catch(NumberFormatException e){
           return false;}
    }
    /**
     * MÉTODO QUE VALIDA LETRAS
     * @param a que contiene un JTextField
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void Letras(final JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent KE){
                char c=KE.getKeyChar();
                if(!Character.isLetter(c)&&c!=' '){//AQUÍ ESTOY COMPARANDO SI SON LETRAS O ESPACIO EN BLANCO
                    KE.consume();}}});//ANULA EVENTOS DEL TECLADO
    }
    /**
     * MÉTODO QUE VALIDA NÚMEROS
     * @param a que contiene un JTextField
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void Numeros(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent KE){
                char c=KE.getKeyChar();
                if(!Character.isDigit(c)){//AQUÍ ESTOY COMPARANDO SI SON NÚMEROS O ESPACIO EN BLANCO
                    KE.consume();}}});//ANULA EVENTOS DEL TECLADO 
    }
    /**
     * MÉTODO PARA DAR FORMATO ESPECIAL
     * @param texto que contiene un String que sera Validado
     * @return un dato tipo Booleano
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    protected static boolean Formato(String texto){
    	boolean valido=false;
    	Pattern patron=Pattern.compile("(\\D{1,3})(\\d{1,11})");
    	Matcher mTexto=patron.matcher(texto.toLowerCase());
    	if(mTexto.matches()){
            valido=true;}
        return valido;
    }
    /**
     * MÉTODO PARA OBTENER LA FECHA DEL SISTEMA
     * @return un String con la fecha del día Actual
     */
    public static String getFechaActual(){
        Date hoy=new Date();
        SimpleDateFormat formateador=new SimpleDateFormat("d/MM/yyyy");
        return formateador.format(hoy);
    }
    /**
     * MÉTODO PARA COMPARAR FECHAS
     */
    private boolean comparcionFechas(String fechaIngeso){
        String hoy=getFechaActual();
        return fechaIngeso.equals(hoy);
    }
    /**
     * MÉTODO PARA LIMPIAR LOS DATOS
     */
    public void Limpiar(){
        cbtipodocumento.setSelectedItem("");
        txtnombres.setText("");
        txtprimerapellido.setText("");
        txtsegundoapellido.setText("");
        txttelefono.setText("");
        txtmovil.setText("");
        txtdireccion.setText("");
        cbgenero.setSelectedItem("");
        txtcorreo.setText("");
        jdcfechanacimiento.setDate(null);
        txtedad.setText("");
        cbestadocivil.setSelectedItem("");
        cbpais.removeAllItems();
        txtprofesion.setText("");
        txtrutafoto.setText("");
        lblimagenfoto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/foto_opt.png")));
        cbtiposangre.setSelectedItem("");
        jdcfechaingreso.setDate(null);
        cbeps.removeAllItems();
        rbentidadaseguradora.setSelected(false);
        rbtarjeta.setSelected(false);
        rbcheque.setSelected(false);
        rbefectivo.setSelected(false);
        cbestado.setSelectedItem("");
        btnlistar.setEnabled(true);
    }
    /**
     * MÉTODO PARA LIMPIAR LOS DATOS DE TARJETA
     */
    private void LimpiarTarjeta(){
        txtnumerotarjeta.setText("");
        cbtipotarjeta.setSelectedItem("");
        cbfranquicia.setSelectedItem("");
    }
    /**
     * MÉTODO PARA LIMPIAR LOS DATOS DE CHEQUE
     */
    private void LimpiarCheque(){
        txtnumerocheque.setText("");
        txtbanco.setText("");
    }
    /**
     * MÉTODO PRINCIPAL MAIN
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
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Pacientes().setVisible(true);}});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncargarfoto;
    private org.edisoncor.gui.button.ButtonTask btnconsultar;
    private org.edisoncor.gui.button.ButtonTask btnguardar;
    private org.edisoncor.gui.button.ButtonTask btnlistar;
    private org.edisoncor.gui.button.ButtonTask btnmodificar;
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JComboBox cbciudades;
    private javax.swing.JComboBox cbeps;
    private javax.swing.JComboBox cbestado;
    private javax.swing.JComboBox cbestadocivil;
    private javax.swing.JComboBox cbfranquicia;
    private javax.swing.JComboBox cbgenero;
    private javax.swing.JComboBox cbpais;
    private javax.swing.JComboBox cbtipodocumento;
    private javax.swing.JComboBox cbtiposangre;
    private javax.swing.JComboBox cbtipotarjeta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser jdcfechaingreso;
    private com.toedter.calendar.JDateChooser jdcfechanacimiento;
    private javax.swing.JTabbedPane jptfondo;
    private javax.swing.JLabel lblalimentacion;
    private javax.swing.JLabel lblbanco;
    private javax.swing.JLabel lblciudad;
    private javax.swing.JLabel lblcontraindicaciones;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldireccionresidencia;
    private javax.swing.JLabel lbledad;
    private javax.swing.JLabel lbleps;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblestadocivil;
    private javax.swing.JLabel lblfechaingreso;
    private javax.swing.JLabel lblfechanacimiento;
    private javax.swing.JLabel lblformapago;
    private javax.swing.JLabel lblfranquicia;
    private javax.swing.JLabel lblgenero;
    private javax.swing.JLabel lblimagenfoto;
    private javax.swing.JLabel lblmedicacion;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblmensaje2;
    private javax.swing.JLabel lblmensajecextranjeria;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lblnumerocama;
    private javax.swing.JLabel lblnumerocheque;
    private javax.swing.JLabel lblnumerodocumento;
    private javax.swing.JLabel lblnumerohabitacion;
    private javax.swing.JLabel lblnumerohistoria;
    private javax.swing.JLabel lblnumeromovil;
    private javax.swing.JLabel lblnumerotarjeta;
    private javax.swing.JLabel lblnumerotelefono;
    private javax.swing.JLabel lblpais;
    private javax.swing.JLabel lblprimerapellido;
    private javax.swing.JLabel lblprofesion;
    private javax.swing.JLabel lblseguimiento;
    private javax.swing.JLabel lblsegundoapellido;
    private javax.swing.JLabel lbltipodocumento;
    private javax.swing.JLabel lbltiposangre;
    private javax.swing.JLabel lbltipotarjeta;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JLabel lblvalorcopago;
    private javax.swing.JPanel pcheque;
    private javax.swing.JPanel pdatospaciente;
    private javax.swing.JPanel pfotografia;
    private javax.swing.JPanel pimagenfoto;
    private javax.swing.JPanel pinformacionpaciente;
    private javax.swing.JPanel pseguromedico;
    private javax.swing.JPanel ptarjeta;
    private javax.swing.JRadioButton rbcheque;
    private javax.swing.JRadioButton rbefectivo;
    private javax.swing.JRadioButton rbentidadaseguradora;
    private javax.swing.JRadioButton rbtarjeta;
    private javax.swing.JTextArea taalimentacion;
    private javax.swing.JTextArea tacontraindicaciones;
    private javax.swing.JTextArea tamedicacion;
    private javax.swing.JTextField txtbanco;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtmovil;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtnumerocama;
    private javax.swing.JTextField txtnumerocheque;
    private javax.swing.JTextField txtnumerodocumento;
    private javax.swing.JTextField txtnumerohabitacion;
    private javax.swing.JTextField txtnumerohistoria;
    private javax.swing.JTextField txtnumerotarjeta;
    private javax.swing.JTextField txtprimerapellido;
    private javax.swing.JTextField txtprofesion;
    private javax.swing.JTextField txtrutafoto;
    private javax.swing.JTextField txtseguimiento;
    private javax.swing.JTextField txtsegundoapellido;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtvalorcopago;
    // End of variables declaration//GEN-END:variables
}
