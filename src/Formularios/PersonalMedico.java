package Formularios;
//LIBRERIAS
import Clases.ClasePersonalMedico;
import Clases.ClaseUsuarios;
import Clases.FotoClassPM;
import Clases.ValidarEMail;
import Conexion.Conectate;
import Tablas.TablaPersonalMedico;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PersonalMedico extends javax.swing.JFrame{
    //DECLARO UNA VARIABLE PRIVADA QUE ME CARGUE SOLO LAS IMAGENES QUE QUIERO, EN ESTE CASO .JPG
    private FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivo de Imagen","jpg");
    String Ruta;
    DateFormat df=DateFormat.getDateInstance();
    //CREAMOS UN OBJETO DE LA CLASE FOTOCLASSPM
    FotoClassPM foto=new FotoClassPM();
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    //CONSTRUCTOR
    public PersonalMedico(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Personal Médico Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        txtidentificacion.requestFocus();
        lblestado1.setVisible(false);
        lblestadoactual1.setVisible(false);
        lblestado2.setVisible(false);
        lblestadoactual2.setVisible(false);
        //ASÍ SE INHABILITAN LOS JDATECHOOSER PARA QUE SOLO SE ESCOJA LA FECHA DESDE EL CALENDARIO
        datefechanacimiento.getDateEditor().setEnabled(false);
        //VALIDACIONES LETRAS O NÚMEROS
        Numeros(txtidentificacion);
        Letras(txtnombres);
        Letras(txtprimerapellido);
        Letras(txtsegundoapellido);
        Numeros(txttelefono);
        Numeros(txtmovil);
        Letras(txttitulo);
        Letras(txtinstitucion);
        Letras(txtultimaempresa);
        Letras(txtcargo);
        Numeros(txtsalario);
        //VALIDACIÓN DEL CORREO
        txtcorreo.setInputVerifier(new ValidarEMail());
        Iniciar();}
    //MÉTODO INICIAR
    private void Iniciar(){
        //LIMPIAMOS LOS COMBOBOX
        cbpais.removeAllItems();
        //PONEMOS UN ITEM POR DEFECTO
        cbpais.addItem("");
        cbidiomas.addItem("");
        taidiomas.setText("");
        //CREAMOS LOS OBJETOS PERSONALMEDICO
        ClasePersonalMedico cpm=new ClasePersonalMedico();
        ClasePersonalMedico cpm3=new ClasePersonalMedico();
        //LLAMAMOS MÉTODO PARA LLENAR COMBOBOX
        cpm.LlenarPais(cbpais);
        cpm3.LlenarIdiomas(cbidiomas);}
    //MÉTODO INICIAR CIUDADES
    private void IniciarCiudades(){
        //LIMPIAMOS EL COMBOBOX
        cbciudad.removeAllItems();
        //PONEMOS UN ITEM POR DEFECTO
        cbciudad.addItem("");
        //CREAMOS LOS OBJETOS PERSONALMEDICO
        ClasePersonalMedico cpm2=new ClasePersonalMedico();
        //LLAMAMOS MÉTODO PARA LLENAR COMBOBOX
        cpm2.LlenarCiudad(cbciudad,cbpais.getSelectedIndex());}
    //MÉTODO CARGAR IMAGEN
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
            lblfoto.setIcon(new ImageIcon(file));
            //MODIFICAMOS LA IMAGEN
            ImageIcon icon=new ImageIcon(file);
            //EXTRAER LA IMAGEN DEL ICONO
            Image imagen=icon.getImage();
            //CAMBIAR TAMAÑO DE NUESTRA IMAGEN
            Image imagen2=imagen.getScaledInstance(276,346,java.awt.Image.SCALE_SMOOTH);
            //GENERAMOS EL ImageIcon CON LA NUEVA IMAGEN
            ImageIcon icon2=new ImageIcon(imagen2);
            //PINTAMOS LA IMAGEN EN EL LABEL
            lblfoto.setIcon(icon2);
            //DIMENSIONAMOS EL LABEL
            lblfoto.setSize(276,344);
            //OBTENEMOS LA RUTA EN EL TEXTFIELD
            txtruta.setText(file);
            //LIMPIAMOS LA RUTA
            Ruta="";}}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtppestanas = new javax.swing.JTabbedPane();
        ppersonales = new javax.swing.JPanel();
        lblidentificacion = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblprimerapellido = new javax.swing.JLabel();
        lblsegundoapellido = new javax.swing.JLabel();
        lblfechanacimiento = new javax.swing.JLabel();
        lblpais = new javax.swing.JLabel();
        lblciudad = new javax.swing.JLabel();
        lblestadocivil = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lblmovil = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        lblestado1 = new javax.swing.JLabel();
        lblestadoactual1 = new javax.swing.JLabel();
        lblmensaje = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtprimerapellido = new javax.swing.JTextField();
        txtsegundoapellido = new javax.swing.JTextField();
        cbpais = new javax.swing.JComboBox();
        cbciudad = new javax.swing.JComboBox();
        pfotografia = new javax.swing.JPanel();
        txtruta = new javax.swing.JTextField();
        btncargar = new javax.swing.JButton();
        cbestadocivil = new javax.swing.JComboBox();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtmovil = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        pimagen = new javax.swing.JPanel();
        lblfoto = new javax.swing.JLabel();
        datefechanacimiento = new com.toedter.calendar.JDateChooser();
        pdatosprofesionales = new javax.swing.JPanel();
        lbltarjeta = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblinstitucion = new javax.swing.JLabel();
        lblotrosestudios = new javax.swing.JLabel();
        lblidiomas = new javax.swing.JLabel();
        lblexperiencia = new javax.swing.JLabel();
        lblobservaciones = new javax.swing.JLabel();
        lblmensaje2 = new javax.swing.JLabel();
        lblcontador = new javax.swing.JLabel();
        lblcaracteres1 = new javax.swing.JLabel();
        lblconteo = new javax.swing.JLabel();
        lblcaracteres2 = new javax.swing.JLabel();
        lblrespuesta = new javax.swing.JLabel();
        lblestado2 = new javax.swing.JLabel();
        lblestadoactual2 = new javax.swing.JLabel();
        txttarjeta = new javax.swing.JTextField();
        txttitulo = new javax.swing.JTextField();
        txtinstitucion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taotrosestudios = new javax.swing.JTextArea();
        rbsi = new javax.swing.JRadioButton();
        rbno = new javax.swing.JRadioButton();
        plaboral = new javax.swing.JPanel();
        lblultimaempresa = new javax.swing.JLabel();
        lblcargo = new javax.swing.JLabel();
        lblmotivo = new javax.swing.JLabel();
        lblsalario = new javax.swing.JLabel();
        txtultimaempresa = new javax.swing.JTextField();
        cbmotivo = new javax.swing.JComboBox();
        txtcargo = new javax.swing.JTextField();
        txtsalario = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taobservaciones = new javax.swing.JTextArea();
        cbidiomas = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        taidiomas = new javax.swing.JTextArea();
        btnlimpiaridiomas = new javax.swing.JButton();
        btnguardar = new org.edisoncor.gui.button.ButtonTask();
        btnmodificar = new org.edisoncor.gui.button.ButtonTask();
        btneliminar = new org.edisoncor.gui.button.ButtonTask();
        btnlistar = new org.edisoncor.gui.button.ButtonTask();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();
        btnconsultar = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtppestanas.setBackground(new java.awt.Color(255, 255, 255));
        jtppestanas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        ppersonales.setBackground(new java.awt.Color(255, 255, 255));

        lblidentificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblidentificacion.setText("Identificación *");

        lblnombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnombres.setText("Nombres *");

        lblprimerapellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblprimerapellido.setText("Primer Apellido *");

        lblsegundoapellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsegundoapellido.setText("Segundo Apellido");

        lblfechanacimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblfechanacimiento.setText("Fecha de Nacimiento *");

        lblpais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpais.setText("País *");

        lblciudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblciudad.setText("Ciudad *");

        lblestadocivil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblestadocivil.setText("Estado Civil *");

        lbldireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldireccion.setText("Dirección");

        lbltelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltelefono.setText("Teléfono");

        lblmovil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmovil.setText("Móvil *");

        lblcorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcorreo.setText("Correo *");

        lblestado1.setBackground(new java.awt.Color(255, 255, 255));
        lblestado1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblestado1.setText("Estado");

        lblestadoactual1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblestadoactual1.setForeground(new java.awt.Color(255, 0, 0));

        lblmensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmensaje.setForeground(new java.awt.Color(255, 0, 0));
        lblmensaje.setText("Los campos marcados con el signo (*) son obligatorios");

        txtidentificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtidentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidentificacionKeyTyped(evt);
            }
        });

        txtnombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });

        txtprimerapellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtprimerapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprimerapellidoKeyTyped(evt);
            }
        });

        txtsegundoapellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtsegundoapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsegundoapellidoKeyTyped(evt);
            }
        });

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

        cbciudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbciudad.setEnabled(false);
        cbciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbciudadKeyTyped(evt);
            }
        });

        pfotografia.setBackground(new java.awt.Color(255, 255, 255));
        pfotografia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fotográfia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtruta.setEditable(false);
        txtruta.setBackground(new java.awt.Color(255, 255, 255));

        btncargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar_opt.png"))); // NOI18N
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });
        btncargar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btncargarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pfotografiaLayout = new javax.swing.GroupLayout(pfotografia);
        pfotografia.setLayout(pfotografiaLayout);
        pfotografiaLayout.setHorizontalGroup(
            pfotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfotografiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtruta, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncargar)
                .addGap(6, 6, 6))
        );
        pfotografiaLayout.setVerticalGroup(
            pfotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfotografiaLayout.createSequentialGroup()
                .addGroup(pfotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncargar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtruta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        cbestadocivil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbestadocivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"","Solteto (a)", "Casado (a)", "Separado (a)", "Viudo (a)", "Unión Libre" }));
        cbestadocivil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbestadocivilKeyTyped(evt);
            }
        });

        txtdireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        txttelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        txtmovil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtmovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmovilKeyTyped(evt);
            }
        });

        txtcorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoKeyTyped(evt);
            }
        });

        pimagen.setBackground(new java.awt.Color(255, 255, 255));
        pimagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/foto_opt.png"))); // NOI18N

        javax.swing.GroupLayout pimagenLayout = new javax.swing.GroupLayout(pimagen);
        pimagen.setLayout(pimagenLayout);
        pimagenLayout.setHorizontalGroup(
            pimagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );
        pimagenLayout.setVerticalGroup(
            pimagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        datefechanacimiento.setBackground(new java.awt.Color(255, 255, 255));
        datefechanacimiento.setDateFormatString("yyyy/MM/dd");
        datefechanacimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout ppersonalesLayout = new javax.swing.GroupLayout(ppersonales);
        ppersonales.setLayout(ppersonalesLayout);
        ppersonalesLayout.setHorizontalGroup(
            ppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppersonalesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(ppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ppersonalesLayout.createSequentialGroup()
                        .addGroup(ppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblidentificacion)
                            .addComponent(lblnombres)
                            .addComponent(lblprimerapellido)
                            .addComponent(lblsegundoapellido)
                            .addComponent(lblfechanacimiento)
                            .addComponent(lblpais)
                            .addComponent(lblciudad)
                            .addComponent(lblestadocivil)
                            .addComponent(lbldireccion)
                            .addComponent(lbltelefono))
                        .addGap(18, 18, 18)
                        .addGroup(ppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprimerapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsegundoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datefechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbpais, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(ppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfotografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ppersonalesLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(pimagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ppersonalesLayout.createSequentialGroup()
                        .addComponent(lblmovil)
                        .addGap(110, 110, 110)
                        .addComponent(txtmovil, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ppersonalesLayout.createSequentialGroup()
                        .addComponent(lblcorreo)
                        .addGap(101, 101, 101)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lblestado1)
                        .addGap(18, 18, 18)
                        .addComponent(lblestadoactual1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        ppersonalesLayout.setVerticalGroup(
            ppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppersonalesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ppersonalesLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblidentificacion)
                        .addGap(28, 28, 28)
                        .addComponent(lblnombres)
                        .addGap(28, 28, 28)
                        .addComponent(lblprimerapellido)
                        .addGap(28, 28, 28)
                        .addComponent(lblsegundoapellido)
                        .addGap(28, 28, 28)
                        .addComponent(lblfechanacimiento)
                        .addGap(28, 28, 28)
                        .addComponent(lblpais)
                        .addGap(30, 30, 30)
                        .addComponent(lblciudad)
                        .addGap(28, 28, 28)
                        .addComponent(lblestadocivil)
                        .addGap(27, 27, 27)
                        .addComponent(lbldireccion)
                        .addGap(29, 29, 29)
                        .addComponent(lbltelefono))
                    .addGroup(ppersonalesLayout.createSequentialGroup()
                        .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtprimerapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtsegundoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(datefechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbpais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cbciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ppersonalesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(pfotografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pimagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ppersonalesLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblmovil))
                    .addComponent(txtmovil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ppersonalesLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblmensaje)))
                .addGap(18, 18, 18)
                .addGroup(ppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ppersonalesLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblcorreo))
                    .addGroup(ppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblestado1))
                    .addComponent(lblestadoactual1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jtppestanas.addTab("Datos Personales", ppersonales);

        pdatosprofesionales.setBackground(new java.awt.Color(255, 255, 255));

        lbltarjeta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltarjeta.setText("Tarjeta Profesional *");

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltitulo.setText("Título *");

        lblinstitucion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblinstitucion.setText("Institución *");

        lblotrosestudios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblotrosestudios.setText("Otros Estudios");

        lblidiomas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblidiomas.setText("Idiomas *");

        lblexperiencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblexperiencia.setText("Experiencia Laboral *");

        lblobservaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblobservaciones.setText("Observaciones");

        lblmensaje2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmensaje2.setForeground(new java.awt.Color(255, 0, 0));
        lblmensaje2.setText("Los campos marcados con el signo (*) son obligatorios");

        lblcontador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblcontador.setForeground(new java.awt.Color(255, 0, 0));

        lblcaracteres1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblcaracteres1.setForeground(new java.awt.Color(255, 0, 0));
        lblcaracteres1.setText("Caracteres");

        lblconteo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblconteo.setForeground(new java.awt.Color(255, 0, 0));

        lblcaracteres2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblcaracteres2.setForeground(new java.awt.Color(255, 0, 0));
        lblcaracteres2.setText("Caracteres");

        lblrespuesta.setBackground(new java.awt.Color(255, 255, 255));
        lblrespuesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblrespuesta.setEnabled(false);

        lblestado2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblestado2.setText("Estado");

        lblestadoactual2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblestadoactual2.setForeground(new java.awt.Color(255, 51, 0));

        txttarjeta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txttarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttarjetaKeyTyped(evt);
            }
        });

        txttitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txttitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttituloKeyTyped(evt);
            }
        });

        txtinstitucion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtinstitucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtinstitucionKeyTyped(evt);
            }
        });

        taotrosestudios.setColumns(20);
        taotrosestudios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        taotrosestudios.setRows(5);
        taotrosestudios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taotrosestudiosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taotrosestudiosKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(taotrosestudios);

        rbsi.setBackground(new java.awt.Color(255, 255, 255));
        rbsi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbsi.setText("SI");
        rbsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsiActionPerformed(evt);
            }
        });
        rbsi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbsiKeyTyped(evt);
            }
        });

        rbno.setBackground(new java.awt.Color(255, 255, 255));
        rbno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbno.setText("NO");
        rbno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnoActionPerformed(evt);
            }
        });
        rbno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbnoKeyTyped(evt);
            }
        });

        plaboral.setBackground(new java.awt.Color(255, 255, 255));
        plaboral.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información Laboral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        plaboral.setEnabled(false);
        plaboral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblultimaempresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblultimaempresa.setText("Última Empresa *");
        lblultimaempresa.setEnabled(false);
        plaboral.add(lblultimaempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 32, -1, -1));

        lblcargo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcargo.setText("Cargo *");
        lblcargo.setEnabled(false);
        plaboral.add(lblcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 75, -1, -1));

        lblmotivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmotivo.setText("Motivo de Salida *");
        lblmotivo.setEnabled(false);
        plaboral.add(lblmotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 118, -1, -1));

        lblsalario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsalario.setText("Último Salario");
        lblsalario.setEnabled(false);
        plaboral.add(lblsalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 161, -1, -1));

        txtultimaempresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtultimaempresa.setEnabled(false);
        txtultimaempresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtultimaempresaKeyTyped(evt);
            }
        });
        plaboral.add(txtultimaempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 27, 229, 25));

        cbmotivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbmotivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"","Despido","Renuncia","Recorte de Personal","Mutuo Acuerdo","Vencimiento de Contrato"}));
        cbmotivo.setEnabled(false);
        cbmotivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbmotivoKeyTyped(evt);
            }
        });
        plaboral.add(cbmotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 113, 200, 25));

        txtcargo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcargo.setEnabled(false);
        txtcargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcargoKeyTyped(evt);
            }
        });
        plaboral.add(txtcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 70, 229, 25));

        txtsalario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtsalario.setEnabled(false);
        txtsalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsalarioKeyTyped(evt);
            }
        });
        plaboral.add(txtsalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 156, 140, 25));

        taobservaciones.setColumns(20);
        taobservaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        taobservaciones.setRows(5);
        taobservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taobservacionesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taobservacionesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(taobservaciones);

        cbidiomas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbidiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbidiomasActionPerformed(evt);
            }
        });

        taidiomas.setEditable(false);
        taidiomas.setColumns(20);
        taidiomas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        taidiomas.setRows(5);
        jScrollPane3.setViewportView(taidiomas);

        btnlimpiaridiomas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnlimpiaridiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiaridiomasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pdatosprofesionalesLayout = new javax.swing.GroupLayout(pdatosprofesionales);
        pdatosprofesionales.setLayout(pdatosprofesionalesLayout);
        pdatosprofesionalesLayout.setHorizontalGroup(
            pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbltarjeta)
                .addGap(18, 18, 18)
                .addComponent(txttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(lblexperiencia)
                .addGap(18, 18, 18)
                .addComponent(rbsi)
                .addGap(18, 18, 18)
                .addComponent(rbno)
                .addGap(17, 17, 17)
                .addComponent(lblrespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitulo)
                    .addComponent(lblinstitucion)
                    .addComponent(lblotrosestudios))
                .addGap(55, 55, 55)
                .addGroup(pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtinstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(plaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(lblcaracteres1)
                .addGap(8, 8, 8)
                .addComponent(lblcontador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblidiomas)
                .addGap(88, 88, 88)
                .addGroup(pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbidiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblobservaciones))
                    .addComponent(btnlimpiaridiomas))
                .addGap(13, 13, 13)
                .addGroup(pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(lblcaracteres2)
                        .addGap(8, 8, 8)
                        .addComponent(lblconteo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblmensaje2)
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addComponent(lblestado2)
                        .addGap(18, 18, 18)
                        .addComponent(lblestadoactual2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pdatosprofesionalesLayout.setVerticalGroup(
            pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                .addGroup(pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbltarjeta))
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblexperiencia))
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(rbsi))
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(rbno))
                    .addComponent(lblrespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbltitulo)
                        .addGap(28, 28, 28)
                        .addComponent(lblinstitucion)
                        .addGap(23, 23, 23)
                        .addComponent(lblotrosestudios))
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtinstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(plaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcaracteres1)
                    .addComponent(lblcontador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblidiomas))
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(cbidiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addComponent(lblobservaciones)
                        .addGap(21, 21, 21)
                        .addComponent(btnlimpiaridiomas))
                    .addGroup(pdatosprofesionalesLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcaracteres2)
                            .addComponent(lblconteo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(lblmensaje2)
                        .addGap(18, 18, 18)
                        .addGroup(pdatosprofesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblestadoactual2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblestado2)))))
        );

        jtppestanas.addTab("Datos Profesionales", pdatosprofesionales);

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

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnmodificar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificar.setDescription("Edit");
        btnmodificar.setEnabled(false);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar1a_opt.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btneliminar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btneliminar.setDescription("Remove");
        btneliminar.setEnabled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtppestanas)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtppestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ACCIÓN SOBRE EL BOTÓN CARGAR CON MOUSE
    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarActionPerformed
        CargarImagen();
        txtidentificacion.requestFocus();
    }//GEN-LAST:event_btncargarActionPerformed
    //ACCIÓN SOBRE EL BOTÓN CARGAR CON EL TECLADO
    private void btncargarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncargarKeyTyped
        CargarImagen();
        txtidentificacion.requestFocus();
    }//GEN-LAST:event_btncargarKeyTyped
    //ACCIÓN QUE REALIZA EL RADIOBUTTON SI
    private void rbsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsiActionPerformed
        rbno.setSelected(false);
        plaboral.setEnabled(true);
        lblultimaempresa.setEnabled(true);
        lblcargo.setEnabled(true);
        lblmotivo.setEnabled(true);
        lblsalario.setEnabled(true);
        txtultimaempresa.setEnabled(true);
        txtcargo.setEnabled(true);
        cbmotivo.setEnabled(true);
        txtsalario.setEnabled(true);
        txtultimaempresa.requestFocus();
    }//GEN-LAST:event_rbsiActionPerformed
    //ACCIÓN QUE REALIZA EL RADIOBUTTON NO
    private void rbnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnoActionPerformed
        rbsi.setSelected(false);
        plaboral.setEnabled(false);
        lblultimaempresa.setEnabled(false);
        lblcargo.setEnabled(false);
        lblmotivo.setEnabled(false);
        lblsalario.setEnabled(false);
        txtultimaempresa.setEnabled(false);
        txtcargo.setEnabled(false);
        cbmotivo.setEnabled(false);
        txtsalario.setEnabled(false);
        LimpiarLabores();
        taobservaciones.requestFocus();
    }//GEN-LAST:event_rbnoActionPerformed
    //ACCIÓN DEL BOTÓN REGRESAR
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        Menu menu=new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed
    //LIMITACIONES Y TRANSFERENCIA DE FOCUS
    private void txtidentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidentificacionKeyTyped
        if(txtidentificacion.getText().length()==11){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtidentificacion){
            if(Contador==10){
                txtnombres.requestFocus();}}
    }//GEN-LAST:event_txtidentificacionKeyTyped

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        if(txtnombres.getText().length()==40){
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
                cbpais.requestFocus();}}
        JTextField txtsegundoa=(JTextField)evt.getComponent();
        String texto=txtsegundoa.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtsegundoapellido.setText(texto);}
    }//GEN-LAST:event_txtsegundoapellidoKeyTyped

    private void cbpaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbpaisKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbpais){
            if(Contador==10){
                cbciudad.setEnabled(true);
                cbciudad.requestFocus();}}
    }//GEN-LAST:event_cbpaisKeyTyped

    private void cbciudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbciudadKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbciudad){
            if(Contador==10){
                cbestadocivil.requestFocus();}}
    }//GEN-LAST:event_cbciudadKeyTyped

    private void cbestadocivilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbestadocivilKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbestadocivil){
            if(Contador==10){
                txtdireccion.requestFocus();}}
    }//GEN-LAST:event_cbestadocivilKeyTyped

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        if(txtdireccion.getText().length()==60){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtdireccion){
            if(Contador==10){
                txttelefono.requestFocus();}}
        JTextField txtdirec=(JTextField)evt.getComponent();
        String texto=txtdirec.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtdireccion.setText(texto);}
    }//GEN-LAST:event_txtdireccionKeyTyped

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
                txtcorreo.requestFocus();}}
    }//GEN-LAST:event_txtmovilKeyTyped

    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyTyped
        if(txtcorreo.getText().length()==70){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtcorreo){
            if(Contador==10){
                btncargar.requestFocus();}}
    }//GEN-LAST:event_txtcorreoKeyTyped

    private void txttarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttarjetaKeyTyped
        txttarjeta.requestFocus();
        if(txttarjeta.getText().length()==14){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txttarjeta){
            if(Contador==10){
                txttitulo.requestFocus();}}
    }//GEN-LAST:event_txttarjetaKeyTyped

    private void txttituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttituloKeyTyped
        if(txttitulo.getText().length()==50){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txttitulo){
            if(Contador==10){
                txtinstitucion.requestFocus();}}
        JTextField txttitu=(JTextField)evt.getComponent();
        String texto=txttitu.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txttitulo.setText(texto);}
    }//GEN-LAST:event_txttituloKeyTyped

    private void txtinstitucionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinstitucionKeyTyped
        if(txtinstitucion.getText().length()==50){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtinstitucion){
            if(Contador==10){
                taotrosestudios.requestFocus();}}
        JTextField txtinsti=(JTextField)evt.getComponent();
        String texto=txtinsti.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtinstitucion.setText(texto);}
    }//GEN-LAST:event_txtinstitucionKeyTyped

    private void taotrosestudiosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taotrosestudiosKeyPressed
        if(taotrosestudios.getText().length()==200){
            evt.consume();}
        if(evt.getKeyCode()==KeyEvent.VK_TAB){
            cbidiomas.requestFocus();}
        JTextArea txtotros=(JTextArea)evt.getComponent();
        String texto=txtotros.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            taotrosestudios.setText(texto);}
    }//GEN-LAST:event_taotrosestudiosKeyPressed

    private void rbsiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbsiKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==rbsi){
            if(Contador==10){
                rbno.requestFocus();}}
    }//GEN-LAST:event_rbsiKeyTyped

    private void rbnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbnoKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==rbno){
            if(Contador==10){
                taobservaciones.requestFocus();}}
    }//GEN-LAST:event_rbnoKeyTyped

    private void taobservacionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taobservacionesKeyPressed
        if(taobservaciones.getText().length()==250){
            evt.consume();}
        if(evt.getKeyCode()==KeyEvent.VK_TAB){
            btnguardar.requestFocus();}
        JTextArea txtobser=(JTextArea)evt.getComponent();
        String texto=txtobser.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            taobservaciones.setText(texto);}
    }//GEN-LAST:event_taobservacionesKeyPressed

    private void txtultimaempresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtultimaempresaKeyTyped
        if(txtultimaempresa.getText().length()==30){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtultimaempresa){
            if(Contador==10){
                txtcargo.requestFocus();}}
        JTextField txtulti=(JTextField)evt.getComponent();
        String texto=txtulti.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtultimaempresa.setText(texto);}
    }//GEN-LAST:event_txtultimaempresaKeyTyped

    private void txtcargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargoKeyTyped
        if(txtcargo.getText().length()==25){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtcargo){
            if(Contador==10){
                cbmotivo.requestFocus();}}
        JTextField txtcar=(JTextField)evt.getComponent();
        String texto=txtcar.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtcargo.setText(texto);}
    }//GEN-LAST:event_txtcargoKeyTyped

    private void cbmotivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbmotivoKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbmotivo){
            if(Contador==10){
                txtsalario.requestFocus();}}
    }//GEN-LAST:event_cbmotivoKeyTyped

    private void txtsalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsalarioKeyTyped
        if(txtsalario.getText().length()==9){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtsalario){
            if(Contador==10){
                taobservaciones.requestFocus();}}
    }//GEN-LAST:event_txtsalarioKeyTyped

    private void taotrosestudiosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taotrosestudiosKeyTyped
        int conteo=taotrosestudios.getText().length();
        lblcontador.setText(String.valueOf(conteo));
        if(conteo>199){
            evt.consume();}
    }//GEN-LAST:event_taotrosestudiosKeyTyped

    private void taobservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taobservacionesKeyTyped
        int conteo=taobservaciones.getText().length();
        lblconteo.setText(String.valueOf(conteo));
        if(conteo>249){
            evt.consume();}
    }//GEN-LAST:event_taobservacionesKeyTyped
    //ACCIÓN DEL BOTÓN GUARDAR
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        //VALIDAMOS LOS CAMPOS OBLIGATORIOS
        if(txtidentificacion.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir la Identificación","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtidentificacion.requestFocus();}
        else if(String.valueOf(txtidentificacion.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"La Identificación no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtidentificacion.requestFocus();
            txtidentificacion.setText("");}
        else if(txtnombres.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir Nombres","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtnombres.requestFocus();}
        else if(String.valueOf(txtnombres.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"Los Nombres no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtnombres.requestFocus();
            txtnombres.setText("");}
        else if(txtprimerapellido.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Primer Apellido","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtprimerapellido.requestFocus();}
        else if(String.valueOf(txtprimerapellido.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Primer Apellido no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtprimerapellido.requestFocus();
            txtprimerapellido.setText("");}
        else if(!"".equals(txtsegundoapellido.getText())){
            if(String.valueOf(txtsegundoapellido.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Segundo Apellido no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtsegundoapellido.requestFocus();
                txtsegundoapellido.setText("");}
            else if(datefechanacimiento.getDate()==null){
                JOptionPane.showMessageDialog(null,"Debe seleccionar la Fecha de Nacimiento","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                datefechanacimiento.requestFocus();}
            else if(cbpais.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar un País","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbpais.requestFocus();}
            else if(cbciudad.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar una Ciudad","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbciudad.requestFocus();}
            else if(cbestadocivil.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar un Estado Civil","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbestadocivil.requestFocus();}
            else if(!"".equals(txtdireccion.getText())){
                if(String.valueOf(txtdireccion.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"Dirección no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtdireccion.requestFocus();
                    txtdireccion.setText("");}
                else if(!"".equals(txttelefono.getText())){
                    if(String.valueOf(txttelefono.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"Teléfono no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txttelefono.requestFocus();
                        txttelefono.setText("");}
                    else if(txtmovil.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtmovil.requestFocus();}
                    else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtmovil.requestFocus();
                        txtmovil.setText("");}
                    else if(txtcorreo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtcorreo.requestFocus();}
                    else if(txttarjeta.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txttarjeta.requestFocus();}
                    else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txttarjeta.requestFocus();
                        txttarjeta.setText("");}
                    else if(txttitulo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txttitulo.requestFocus();}
                    else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txttitulo.requestFocus();
                        txttitulo.setText("");}
                    else if(txtinstitucion.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtinstitucion.requestFocus();}
                    else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtinstitucion.requestFocus();
                        txtinstitucion.setText("");}
                    else if(taidiomas.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        cbidiomas.requestFocus();}
                    else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        rbsi.requestFocus();}
                    else if(rbsi.isSelected()==true){
                        if(txtultimaempresa.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                            txtultimaempresa.requestFocus();}
                        else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                            txtultimaempresa.requestFocus();
                            txtultimaempresa.setText("");}
                        else if(txtcargo.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                            txtcargo.requestFocus();}
                        else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                            txtcargo.requestFocus();
                            txtcargo.setText("");}
                        else if(cbmotivo.getSelectedItem().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                            cbmotivo.requestFocus();}
                        else{
                            int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                            if(Respuesta==JOptionPane.YES_OPTION){
                                Guardar();}}}
                    else{
                        int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                        if(Respuesta==JOptionPane.YES_OPTION){
                            Guardar();}}}
                else if(txtmovil.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtmovil.requestFocus();}
                else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtmovil.requestFocus();
                    txtmovil.setText("");}
                else if(txtcorreo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtcorreo.requestFocus();}
                else if(txttarjeta.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar",JOptionPane.WARNING_MESSAGE);
                    txttarjeta.requestFocus();}
                else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttarjeta.requestFocus();
                    txttarjeta.setText("");}
                else if(txttitulo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txttitulo.requestFocus();}
                else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txttitulo.requestFocus();
                    txttitulo.setText("");}
                else if(txtinstitucion.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtinstitucion.requestFocus();}
                else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtinstitucion.requestFocus();
                    txtinstitucion.setText("");}
                else if(taidiomas.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    cbidiomas.requestFocus();}
                else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    rbsi.requestFocus();}
                else if(rbsi.isSelected()==true){
                    if(txtultimaempresa.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtultimaempresa.requestFocus();}
                    else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtultimaempresa.requestFocus();
                        txtultimaempresa.setText("");}
                    else if(txtcargo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtcargo.requestFocus();}
                    else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtcargo.requestFocus();
                        txtcargo.setText("");}
                    else if(cbmotivo.getSelectedItem().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        cbmotivo.requestFocus();}
                    else{
                        int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                        if(Respuesta==JOptionPane.YES_OPTION){
                            Guardar();}}}
                else{
                    int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                    if(Respuesta==JOptionPane.YES_OPTION){
                        Guardar();}}}
            else if(!"".equals(txttelefono.getText())){
                if(String.valueOf(txttelefono.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"Teléfono no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txttelefono.requestFocus();
                    txttelefono.setText("");}
                else if(txtmovil.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtmovil.requestFocus();}
                else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtmovil.requestFocus();
                    txtmovil.setText("");}
                else if(txtcorreo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtcorreo.requestFocus();}
                else if(txttarjeta.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txttarjeta.requestFocus();}
                else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txttarjeta.requestFocus();
                    txttarjeta.setText("");}
                else if(txttitulo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txttitulo.requestFocus();}
                else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txttitulo.requestFocus();
                    txttitulo.setText("");}
                else if(txtinstitucion.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtinstitucion.requestFocus();}
                else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtinstitucion.requestFocus();
                    txtinstitucion.setText("");}
                else if(taidiomas.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    cbidiomas.requestFocus();}
                else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    rbsi.requestFocus();}
                else if(rbsi.isSelected()==true){
                    if(txtultimaempresa.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtultimaempresa.requestFocus();}
                    else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtultimaempresa.requestFocus();
                        txtultimaempresa.setText("");}
                    else if(txtcargo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtcargo.requestFocus();}
                    else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        txtcargo.requestFocus();
                        txtcargo.setText("");}
                    else if(cbmotivo.getSelectedItem().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                        cbmotivo.requestFocus();}
                    else{
                        int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                        if(Respuesta==JOptionPane.YES_OPTION){
                            Guardar();}}}
                else{
                    int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                    if(Respuesta==JOptionPane.YES_OPTION){
                        Guardar();}}}
            else if(txtmovil.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtmovil.requestFocus();}
            else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtmovil.requestFocus();
                txtmovil.setText("");}
            else if(txtcorreo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtcorreo.requestFocus();}
            else if(txttarjeta.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txttarjeta.requestFocus();}
            else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttarjeta.requestFocus();
                txttarjeta.setText("");}
            else if(txttitulo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txttitulo.requestFocus();}
            else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txttitulo.requestFocus();
                txttitulo.setText("");}
            else if(txtinstitucion.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtinstitucion.requestFocus();}
            else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtinstitucion.requestFocus();
                txtinstitucion.setText("");}
            else if(taidiomas.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                cbidiomas.requestFocus();}
            else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                rbsi.requestFocus();}
            else if(rbsi.isSelected()==true){
                if(txtultimaempresa.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtultimaempresa.requestFocus();}
                else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtultimaempresa.requestFocus();
                    txtultimaempresa.setText("");}
                else if(txtcargo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtcargo.requestFocus();}
                else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    txtcargo.requestFocus();
                    txtcargo.setText("");}
                else if(cbmotivo.getSelectedItem().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                    cbmotivo.requestFocus();}
                else{
                    int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                    if(Respuesta==JOptionPane.YES_OPTION){
                        Guardar();}}}
            else{
                int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                if(Respuesta==JOptionPane.YES_OPTION){
                    Guardar();}}}
        else if(datefechanacimiento.getDate()==null){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la Fecha de Nacimiento","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            datefechanacimiento.requestFocus();}
        else if(cbpais.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar un País","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            cbpais.requestFocus();}
        else if(cbciudad.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar una Ciudad","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            cbciudad.requestFocus();}
        else if(cbestadocivil.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar un Estado Civil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            cbestadocivil.requestFocus();}
        else if(!"".equals(txtdireccion.getText())){
            if(String.valueOf(txtdireccion.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"Dirección no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtdireccion.requestFocus();
                txtdireccion.setText("");}
            else if(!"".equals(txttelefono.getText())){
                if(String.valueOf(txttelefono.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"Teléfono no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttelefono.requestFocus();
                    txttelefono.setText("");}
                else if(txtmovil.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtmovil.requestFocus();}
                else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtmovil.requestFocus();
                    txtmovil.setText("");}
                else if(txtcorreo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcorreo.requestFocus();}
                else if(String.valueOf(txtcorreo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Correo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcorreo.requestFocus();
                    txtcorreo.setText("");}
                else if(txttarjeta.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttarjeta.requestFocus();}
                else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttarjeta.requestFocus();
                    txttarjeta.setText("");}
                else if(txttitulo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttitulo.requestFocus();}
                else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttitulo.requestFocus();
                    txttitulo.setText("");}
                else if(txtinstitucion.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtinstitucion.requestFocus();}
                else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtinstitucion.requestFocus();
                    txtinstitucion.setText("");}
                else if(taidiomas.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    cbidiomas.requestFocus();}
                else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    rbsi.requestFocus();}
                else if(rbsi.isSelected()==true){
                    if(txtultimaempresa.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtultimaempresa.requestFocus();}
                    else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtultimaempresa.requestFocus();
                        txtultimaempresa.setText("");}
                    else if(txtcargo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtcargo.requestFocus();}
                    else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtcargo.requestFocus();
                        txtcargo.setText("");}
                    else if(cbmotivo.getSelectedItem().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        cbmotivo.requestFocus();}
                    else{
                        int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                        if(Respuesta==JOptionPane.YES_OPTION){
                            Guardar();}}}
                else{
                    int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                    if(Respuesta==JOptionPane.YES_OPTION){
                        Guardar();}}}
            else if(txtmovil.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtmovil.requestFocus();}
            else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtmovil.requestFocus();
                txtmovil.setText("");}
            else if(txtcorreo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtcorreo.requestFocus();}
            else if(String.valueOf(txtcorreo.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Correo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtcorreo.requestFocus();
                txtcorreo.setText("");}
            else if(txttarjeta.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttarjeta.requestFocus();}
            else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttarjeta.requestFocus();
                txttarjeta.setText("");}
            else if(txttitulo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttitulo.requestFocus();}
            else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttitulo.requestFocus();
                txttitulo.setText("");}
            else if(txtinstitucion.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtinstitucion.requestFocus();}
            else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtinstitucion.requestFocus();
                txtinstitucion.setText("");}
            else if(taidiomas.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                cbidiomas.requestFocus();}
            else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                rbsi.requestFocus();}
            else if(rbsi.isSelected()==true){
                if(txtultimaempresa.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtultimaempresa.requestFocus();}
                else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtultimaempresa.requestFocus();
                    txtultimaempresa.setText("");}
                else if(txtcargo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcargo.requestFocus();}
                else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcargo.requestFocus();
                    txtcargo.setText("");}
                else if(cbmotivo.getSelectedItem().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    cbmotivo.requestFocus();}
                else{
                    int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                    if(Respuesta==JOptionPane.YES_OPTION){
                        Guardar();}}}
            else{
                int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                if(Respuesta==JOptionPane.YES_OPTION){
                    Guardar();}}}       
        else if(!"".equals(txttelefono.getText())){
            if(String.valueOf(txttelefono.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"Teléfono no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttelefono.requestFocus();
                txttelefono.setText("");}
            else if(txtmovil.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtmovil.requestFocus();}
            else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtmovil.requestFocus();
                txtmovil.setText("");}
            else if(txtcorreo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtcorreo.requestFocus();}
            else if(String.valueOf(txtcorreo.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Correo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtcorreo.requestFocus();
                txtcorreo.setText("");}
            else if(txttarjeta.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttarjeta.requestFocus();}
            else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttarjeta.requestFocus();
                txttarjeta.setText("");}
            else if(txttitulo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttitulo.requestFocus();}
            else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttitulo.requestFocus();
                txttitulo.setText("");}
            else if(txtinstitucion.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtinstitucion.requestFocus();}
            else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtinstitucion.requestFocus();
                txtinstitucion.setText("");}
            else if(taidiomas.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                cbidiomas.requestFocus();}
            else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                rbsi.requestFocus();}
            else if(rbsi.isSelected()==true){
                if(txtultimaempresa.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtultimaempresa.requestFocus();}
                else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtultimaempresa.requestFocus();
                    txtultimaempresa.setText("");}
                else if(txtcargo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcargo.requestFocus();}
                else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcargo.requestFocus();
                    txtcargo.setText("");}
                else if(cbmotivo.getSelectedItem().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    cbmotivo.requestFocus();}
                else{
                    int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                    if(Respuesta==JOptionPane.YES_OPTION){
                        Guardar();}}}
            else{
                int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                if(Respuesta==JOptionPane.YES_OPTION){
                    Guardar();}}}
        else if(txtmovil.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            txtmovil.requestFocus();}
        else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            txtmovil.requestFocus();
            txtmovil.setText("");}
        else if(txtcorreo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            txtcorreo.requestFocus();}
        else if(String.valueOf(txtcorreo.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Correo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            txtcorreo.requestFocus();
            txtcorreo.setText("");}
        else if(txttarjeta.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            txttarjeta.requestFocus();}
        else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            txttarjeta.requestFocus();
            txttarjeta.setText("");}
        else if(txttitulo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            txttitulo.requestFocus();}
        else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            txttitulo.requestFocus();
            txttitulo.setText("");}
        else if(txtinstitucion.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            txtinstitucion.requestFocus();}
        else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            txtinstitucion.requestFocus();
            txtinstitucion.setText("");}
        else if(taidiomas.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            cbidiomas.requestFocus();}
        else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar", JOptionPane.WARNING_MESSAGE,warning);
            rbsi.requestFocus();}
        else if(rbsi.isSelected()==true){
            if(txtultimaempresa.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtultimaempresa.requestFocus();}
            else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtultimaempresa.requestFocus();
                txtultimaempresa.setText("");}
            else if(txtcargo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtcargo.requestFocus();}
            else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtcargo.requestFocus();
                txtcargo.setText("");}
            else if(cbmotivo.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                cbmotivo.requestFocus();}
            else{
                int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                if(Respuesta==JOptionPane.YES_OPTION){
                    Guardar();}}}
        else{
            int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
            if(Respuesta==JOptionPane.YES_OPTION){
                Guardar();}}
    }//GEN-LAST:event_btnguardarActionPerformed
    //ACCIÓN REALIZADA AL ESCOGER UN PAÍS
    private void cbpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpaisActionPerformed
        if(cbpais.getSelectedItem()!=""){
            cbciudad.setEnabled(true);
            IniciarCiudades();}
        else{
            cbciudad.removeAllItems();
            cbciudad.setEnabled(false);}
    }//GEN-LAST:event_cbpaisActionPerformed
    //ACCIÓN DEL BOTÓN CONSULTAR
    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        if(btnconsultar.getText().equals("Consultar")){
            String respuesta=((String)JOptionPane.showInputDialog(null,"Ingrese la Identificación que desea Modificar","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null));
            if(respuesta==null){
                txtidentificacion.requestFocus();}
            else if(!EsNumero(respuesta)){
                JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar.\nEl Dato debe ser un número de Identificación.","Error",JOptionPane.ERROR_MESSAGE,error);
                txtidentificacion.requestFocus();}
            else{
                long identificacion=Long.parseLong(respuesta);
                //CREAMOS UN OBJETO DE LA CLASE PERSONALMEDICO
                ClasePersonalMedico cpm=new ClasePersonalMedico();
                ResultSet rs=cpm.Buscar(identificacion);
                //CREAMOS UN OBJETO DE LA CLASE USUARIOS
                ClaseUsuarios cu=new ClaseUsuarios();
                ResultSet rsu=cu.BuscarUsuario(identificacion);
                try{
                    if(rs.next()){
                        //ACTIVAMOS LOS BOTONES QUE ESTÁN INACTIVOS
                        btnmodificar.setEnabled(true);
                        btneliminar.setEnabled(true);
                        btnguardar.setEnabled(false);
                        //DESACTIVAMOS LOS CAMPOS DE ESCRITURA
                        Inhabilitar();
                        //CAPTURAMOS LA INFORMACIÓN EN LAS CAJAS
                        txtidentificacion.setText(rs.getString(1));
                        txtnombres.setText(rs.getString(2));
                        txtprimerapellido.setText(rs.getString(3));
                        txtsegundoapellido.setText(rs.getString(4));
                        datefechanacimiento.setDate(rs.getDate(5));
                        cbpais.setSelectedItem(rs.getString(6));
                        cbciudad.setSelectedItem(rs.getString(7));
                        cbciudad.setEnabled(false);
                        cbestadocivil.setSelectedItem(rs.getString(8));
                        txtdireccion.setText(rs.getString(9));
                        txttelefono.setText(rs.getString(10));
                        txtmovil.setText(rs.getString(11));
                        txtcorreo.setText(rs.getString(12));
                        txttarjeta.setText(rs.getString(13));
                        txttitulo.setText(rs.getString(14));
                        txtinstitucion.setText(rs.getString(15));
                        taotrosestudios.setText(rs.getString(16));
                        taidiomas.setText(rs.getString(17));
                        lblrespuesta.setText(rs.getString(18));
                        lblrespuesta.setVisible(false);
                        if(lblrespuesta.getText().equals("SI")){
                            rbsi.setSelected(true);}
                        else{
                            rbno.setSelected(true);}
                        txtultimaempresa.setText(rs.getString(19));
                        txtcargo.setText(rs.getString(20));
                        cbmotivo.setSelectedItem(rs.getString(21));
                        txtsalario.setText(rs.getString(22));
                        taobservaciones.setText(rs.getString(23));
                        //CREAMOS UN OBJETO DE CONEXION
                        Conectate con=new Conectate();
                        String consulta="FotoExiste '"+identificacion+"'";
                        ResultSet r=con.Listar(consulta);
                        String Respuesta="";
                        try{
                            while(r.next()){
                                Respuesta=r.getString(1);}
                            if(Respuesta.equals("NO")){
                                lblfoto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/foto_opt.png")));
                                JOptionPane.showMessageDialog(null,"La Identificación buscada no tiene Foto","Advertencia",JOptionPane.INFORMATION_MESSAGE,informacion);}
                            else{
                                CargarFoto(identificacion);}}
                        catch (SQLException e){
                            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
                        lblestado1.setVisible(true);
                        lblestadoactual1.setVisible(true);
                        //lblestadoactual1.setText(rsu.getString(7));
                        lblestado2.setVisible(true);
                        lblestadoactual2.setVisible(true);
                        //lblestadoactual2.setText(rsu.getString(7));
                        btnconsultar.setText("Limpiar");
                        btnconsultar.setDescription("Clean");
                        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));}
                    else{
                        Habilitar();
                        Limpiar();
                        JOptionPane.showMessageDialog(null,"La Identificación buscada no existe","Información",JOptionPane.INFORMATION_MESSAGE,informacion);}}
                catch (SQLException e){
                    JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
        else if(btnconsultar.getText().equals("Limpiar")){
            Limpiar();
            Iniciar();
            Inhabilitar2();
            txtidentificacion.setEnabled(true);
            Habilitar();
            btnconsultar.setText("Consultar");
            btnconsultar.setDescription("Consult");
            btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
            btnguardar.setEnabled(true);
            btnmodificar.setEnabled(false);
            btnmodificar.setText("Modificar");
            btnmodificar.setDescription("Edit");
            btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png")));
            btneliminar.setEnabled(false);
            btnmodificar.setEnabled(false);}
    }//GEN-LAST:event_btnconsultarActionPerformed
    //ACCIÓN DEL COMBOBOX IDIOMAS
    private void cbidiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbidiomasActionPerformed
        taidiomas.setText(taidiomas.getText().replace("","")+cbidiomas.getSelectedItem()+" \n");
    }//GEN-LAST:event_cbidiomasActionPerformed
    //ACCIÓN DEL BOTÓN MODIFICAR
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        //ACTIVAMOS LOS CAMPOS
        Habilitar();
        //DESACTIVAMOS LOS BOTONES
        btnguardar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnconsultar.setText("Limpiar");
        btnconsultar.setDescription("Clean");
        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));
        if(btnmodificar.getText().equals("Modificar")){
            cbciudad.setEnabled(true);
            if(rbsi.isSelected()){
                Habilitar2();}
            btnmodificar.setText("Actualizar");
            btnmodificar.setDescription("Update");
            btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar2_opt.png")));}
        else{
            if(txtnombres.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir Nombres","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtnombres.requestFocus();}
            else if(String.valueOf(txtnombres.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"Los Nombres no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtnombres.requestFocus();
                txtnombres.setText("");}
            else if(txtprimerapellido.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Primer Apellido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtprimerapellido.requestFocus();}
            else if(String.valueOf(txtprimerapellido.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Primer Apellido no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtprimerapellido.requestFocus();
                txtprimerapellido.setText("");}
            else if(!"".equals(txtsegundoapellido.getText())){
                if(String.valueOf(txtsegundoapellido.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Segundo Apellido no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtsegundoapellido.requestFocus();
                    txtsegundoapellido.setText("");}
                else if(datefechanacimiento.getDate()==null){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar la Fecha de Nacimiento","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    datefechanacimiento.requestFocus();}
                else if(cbpais.getSelectedItem().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar un País","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    cbpais.requestFocus();}
                else if(cbciudad.getSelectedItem().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar una Ciudad","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    cbciudad.requestFocus();}
                else if(cbestadocivil.getSelectedItem().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar un Estado Civil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    cbestadocivil.requestFocus();}
                else if(!"".equals(txtdireccion.getText())){
                    if(String.valueOf(txtdireccion.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"Dirección no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtdireccion.requestFocus();
                        txtdireccion.setText("");}
                    else if(!"".equals(txttelefono.getText())){
                        if(String.valueOf(txttelefono.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"Teléfono no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txttelefono.requestFocus();
                            txttelefono.setText("");}
                        else if(txtmovil.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtmovil.requestFocus();}
                        else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtmovil.requestFocus();
                            txtmovil.setText("");}
                        else if(txtcorreo.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtcorreo.requestFocus();}
                        else if(txttarjeta.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txttarjeta.requestFocus();}
                        else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txttarjeta.requestFocus();
                            txttarjeta.setText("");}
                        else if(txttitulo.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txttitulo.requestFocus();}
                        else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txttitulo.requestFocus();
                            txttitulo.setText("");}
                        else if(txtinstitucion.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtinstitucion.requestFocus();}
                        else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtinstitucion.requestFocus();
                            txtinstitucion.setText("");}
                        else if(taidiomas.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            cbidiomas.requestFocus();}
                        else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            rbsi.requestFocus();}
                        else if(rbsi.isSelected()==true){
                            if(txtultimaempresa.getText().equals("")){
                                JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                                txtultimaempresa.requestFocus();}
                            else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                                JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                                txtultimaempresa.requestFocus();
                                txtultimaempresa.setText("");}
                            else if(txtcargo.getText().equals("")){
                                JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                                txtcargo.requestFocus();}
                            else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                                JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                                txtcargo.requestFocus();
                                txtcargo.setText("");}
                            else if(cbmotivo.getSelectedItem().equals("")){
                                JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                                cbmotivo.requestFocus();}
                            else{
                                Actualizar();}}
                        else{
                            Actualizar();}}
                    else if(txtmovil.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtmovil.requestFocus();}
                    else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtmovil.requestFocus();
                        txtmovil.setText("");}
                    else if(txtcorreo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtcorreo.requestFocus();}
                    else if(txttarjeta.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttarjeta.requestFocus();}
                    else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttarjeta.requestFocus();
                        txttarjeta.setText("");}
                    else if(txttitulo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttitulo.requestFocus();}
                    else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttitulo.requestFocus();
                        txttitulo.setText("");}
                    else if(txtinstitucion.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtinstitucion.requestFocus();}
                    else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtinstitucion.requestFocus();
                        txtinstitucion.setText("");}
                    else if(taidiomas.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        cbidiomas.requestFocus();}
                    else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        rbsi.requestFocus();}
                    else if(rbsi.isSelected()==true){
                        if(txtultimaempresa.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtultimaempresa.requestFocus();}
                        else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtultimaempresa.requestFocus();
                            txtultimaempresa.setText("");}
                        else if(txtcargo.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtcargo.requestFocus();}
                        else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtcargo.requestFocus();
                            txtcargo.setText("");}
                        else if(cbmotivo.getSelectedItem().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            cbmotivo.requestFocus();}
                        else{
                            Actualizar();}}
                    else{
                        Actualizar();}}
                else if(!"".equals(txttelefono.getText())){
                    if(String.valueOf(txttelefono.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"Teléfono no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttelefono.requestFocus();
                        txttelefono.setText("");}
                    else if(txtmovil.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtmovil.requestFocus();}
                    else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtmovil.requestFocus();
                        txtmovil.setText("");}
                    else if(txtcorreo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtcorreo.requestFocus();}
                    else if(txttarjeta.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttarjeta.requestFocus();}
                    else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttarjeta.requestFocus();
                        txttarjeta.setText("");}
                    else if(txttitulo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttitulo.requestFocus();}
                    else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttitulo.requestFocus();
                        txttitulo.setText("");}
                    else if(txtinstitucion.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtinstitucion.requestFocus();}
                    else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtinstitucion.requestFocus();
                        txtinstitucion.setText("");}
                    else if(taidiomas.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        cbidiomas.requestFocus();}
                    else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        rbsi.requestFocus();}
                    else if(rbsi.isSelected()==true){
                        if(txtultimaempresa.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtultimaempresa.requestFocus();}
                        else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtultimaempresa.requestFocus();
                            txtultimaempresa.setText("");}
                        else if(txtcargo.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtcargo.requestFocus();}
                        else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtcargo.requestFocus();
                            txtcargo.setText("");}
                        else if(cbmotivo.getSelectedItem().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            cbmotivo.requestFocus();}
                        else{
                            Actualizar();}}
                    else{
                        Actualizar();}}                
                else if(txtmovil.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtmovil.requestFocus();}
                else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE);
                    txtmovil.requestFocus();
                    txtmovil.setText("");}
                else if(txtcorreo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcorreo.requestFocus();}
                else if(txttarjeta.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttarjeta.requestFocus();}
                else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttarjeta.requestFocus();
                    txttarjeta.setText("");}
                else if(txttitulo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttitulo.requestFocus();}
                else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttitulo.requestFocus();
                    txttitulo.setText("");}
                else if(txtinstitucion.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtinstitucion.requestFocus();}
                else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtinstitucion.requestFocus();
                    txtinstitucion.setText("");}
                else if(taidiomas.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    cbidiomas.requestFocus();}
                else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    rbsi.requestFocus();}
                else if(rbsi.isSelected()==true){
                    if(txtultimaempresa.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtultimaempresa.requestFocus();}
                    else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtultimaempresa.requestFocus();
                        txtultimaempresa.setText("");}
                    else if(txtcargo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtcargo.requestFocus();}
                    else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtcargo.requestFocus();
                        txtcargo.setText("");}
                    else if(cbmotivo.getSelectedItem().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        cbmotivo.requestFocus();}
                    else{
                        Actualizar();}}
                else{
                    Actualizar();}}
            else if(datefechanacimiento.getDate()==null){
                JOptionPane.showMessageDialog(null,"Debe seleccionar la Fecha de Nacimiento","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                datefechanacimiento.requestFocus();}
            else if(cbpais.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar un País","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                cbpais.requestFocus();}
            else if(cbciudad.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar una Ciudad","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                cbciudad.requestFocus();}
            else if(cbestadocivil.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar un Estado Civil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                cbestadocivil.requestFocus();}
            else if(!"".equals(txtdireccion.getText())){
                if(String.valueOf(txtdireccion.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"Dirección no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtdireccion.requestFocus();
                    txtdireccion.setText("");}
                else if(!"".equals(txttelefono.getText())){
                    if(String.valueOf(txttelefono.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"Teléfono no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttelefono.requestFocus();
                        txttelefono.setText("");}
                    else if(txtmovil.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtmovil.requestFocus();}
                    else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtmovil.requestFocus();
                        txtmovil.setText("");}
                    else if(txtcorreo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtcorreo.requestFocus();}
                    else if(String.valueOf(txtcorreo.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Correo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtcorreo.requestFocus();
                        txtcorreo.setText("");}
                    else if(txttarjeta.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttarjeta.requestFocus();}
                    else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttarjeta.requestFocus();
                        txttarjeta.setText("");}
                    else if(txttitulo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttitulo.requestFocus();}
                    else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txttitulo.requestFocus();
                        txttitulo.setText("");}
                    else if(txtinstitucion.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtinstitucion.requestFocus();}
                    else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtinstitucion.requestFocus();
                        txtinstitucion.setText("");}
                    else if(taidiomas.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        cbidiomas.requestFocus();}
                    else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        rbsi.requestFocus();}
                    else if(rbsi.isSelected()==true){
                        if(txtultimaempresa.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtultimaempresa.requestFocus();}
                        else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtultimaempresa.requestFocus();
                            txtultimaempresa.setText("");}
                        else if(txtcargo.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtcargo.requestFocus();}
                        else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                            JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            txtcargo.requestFocus();
                            txtcargo.setText("");}
                        else if(cbmotivo.getSelectedItem().equals("")){
                            JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                            cbmotivo.requestFocus();}
                        else{
                            Actualizar();}}
                    else{
                        Actualizar();}}
                else if(txtmovil.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtmovil.requestFocus();}
                else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtmovil.requestFocus();
                    txtmovil.setText("");}
                else if(txtcorreo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcorreo.requestFocus();}
                else if(String.valueOf(txtcorreo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Correo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcorreo.requestFocus();
                    txtcorreo.setText("");}
                else if(txttarjeta.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttarjeta.requestFocus();}
                else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttarjeta.requestFocus();
                    txttarjeta.setText("");}
                else if(txttitulo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttitulo.requestFocus();}
                else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttitulo.requestFocus();
                    txttitulo.setText("");}
                else if(txtinstitucion.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtinstitucion.requestFocus();}
                else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtinstitucion.requestFocus();
                    txtinstitucion.setText("");}
                else if(taidiomas.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    cbidiomas.requestFocus();}
                else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    rbsi.requestFocus();}
                else if(rbsi.isSelected()==true){
                    if(txtultimaempresa.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtultimaempresa.requestFocus();}
                    else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtultimaempresa.requestFocus();
                        txtultimaempresa.setText("");}
                    else if(txtcargo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtcargo.requestFocus();}
                    else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtcargo.requestFocus();
                        txtcargo.setText("");}
                    else if(cbmotivo.getSelectedItem().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        cbmotivo.requestFocus();}
                    else{
                        Actualizar();}}
                else{
                    Actualizar();}}       
            else if(!"".equals(txttelefono.getText())){
                if(String.valueOf(txttelefono.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"Teléfono no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttelefono.requestFocus();
                    txttelefono.setText("");}
                else if(txtmovil.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtmovil.requestFocus();}
                else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtmovil.requestFocus();
                    txtmovil.setText("");}
                else if(txtcorreo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcorreo.requestFocus();}
                else if(String.valueOf(txtcorreo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Correo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcorreo.requestFocus();
                    txtcorreo.setText("");}
                else if(txttarjeta.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttarjeta.requestFocus();}
                else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttarjeta.requestFocus();
                    txttarjeta.setText("");}
                else if(txttitulo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttitulo.requestFocus();}
                else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txttitulo.requestFocus();
                    txttitulo.setText("");}
                else if(txtinstitucion.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtinstitucion.requestFocus();}
                else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtinstitucion.requestFocus();
                    txtinstitucion.setText("");}
                else if(taidiomas.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    cbidiomas.requestFocus();}
                else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    rbsi.requestFocus();}
                else if(rbsi.isSelected()==true){
                    if(txtultimaempresa.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtultimaempresa.requestFocus();}
                    else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtultimaempresa.requestFocus();
                        txtultimaempresa.setText("");}
                    else if(txtcargo.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtcargo.requestFocus();}
                    else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                        JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        txtcargo.requestFocus();
                        txtcargo.setText("");}
                    else if(cbmotivo.getSelectedItem().equals("")){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                        cbmotivo.requestFocus();}
                    else{
                        Actualizar();}}
                else{
                    Actualizar();}}
            else if(txtmovil.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Móvil","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtmovil.requestFocus();}
            else if(String.valueOf(txtmovil.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Móvil no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtmovil.requestFocus();
                txtmovil.setText("");}
            else if(txtcorreo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Correo","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtcorreo.requestFocus();}
            else if(String.valueOf(txtcorreo.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Correo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtcorreo.requestFocus();
                txtcorreo.setText("");}
            else if(txttarjeta.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir la Tarjeta Profesional","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttarjeta.requestFocus();}
            else if(String.valueOf(txttarjeta.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"La Tarjeta Profesional no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttarjeta.requestFocus();
                txttarjeta.setText("");}
            else if(txttitulo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir el Título obtenido","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttitulo.requestFocus();}
            else if(String.valueOf(txttitulo.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"El Título no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txttitulo.requestFocus();
                txttitulo.setText("");}
            else if(txtinstitucion.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe escribir la Institución","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtinstitucion.requestFocus();}
            else if(String.valueOf(txtinstitucion.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"La Institución no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                txtinstitucion.requestFocus();
                txtinstitucion.setText("");}
            else if(taidiomas.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un Idioma","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                cbidiomas.requestFocus();}
            else if(rbsi.isSelected()==false&&rbno.isSelected()==false){
                JOptionPane.showMessageDialog(null,"Debe seleccionar la Experiencia Laboral","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                rbsi.requestFocus();}
            else if(rbsi.isSelected()==true){
                if(txtultimaempresa.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar la Última Empresa en donde Laboró","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtultimaempresa.requestFocus();}
                else if(String.valueOf(txtultimaempresa.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"Última Empresa no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtultimaempresa.requestFocus();
                    txtultimaempresa.setText("");}
                else if(txtcargo.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar el Cargo que desempeñaba","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcargo.requestFocus();}
                else if(String.valueOf(txtcargo.getText().charAt(0)).equals(" ")){
                    JOptionPane.showMessageDialog(null,"El Cargo no puede iniciar con espacio en blanco","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    txtcargo.requestFocus();
                    txtcargo.setText("");}
                else if(cbmotivo.getSelectedItem().equals("")){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar el Motivo de Salida","Verificar", JOptionPane.WARNING_MESSAGE,warning);
                    cbmotivo.requestFocus();}
                else{
                    Actualizar();}}
            else{
                Actualizar();}}
    }//GEN-LAST:event_btnmodificarActionPerformed
    //ACCIÓN DEL BOTÓN ELIMINAR
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        //CREAMOS UN OBJETO DE LA CLASE PERSONALMÉDICO
        ClasePersonalMedico cpm=new ClasePersonalMedico();
        int Respuesta=JOptionPane.showConfirmDialog(null,"Seguro desea Eliminar la Infomación?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
        if(Respuesta==JOptionPane.YES_OPTION){
            cpm.Eliminar(Long.parseLong(txtidentificacion.getText()));
            Limpiar();
            LimpiarLabores();
            Iniciar();
            JOptionPane.showMessageDialog(null,"Los datos se Eliminaron con exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
            Habilitar();
            txtidentificacion.setEnabled(true);
            btnguardar.setEnabled(true);
            btnconsultar.setText("Consultar");
            btnconsultar.setDescription("Consult");
            btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
            btnmodificar.setEnabled(false);
            btneliminar.setEnabled(false);}
        else{
            Limpiar();
            LimpiarLabores();
            Iniciar();
            Habilitar();
            txtidentificacion.setEnabled(true);
            btnguardar.setEnabled(true);
            btnconsultar.setText("Consultar");
            btnconsultar.setDescription("Consult");
            btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
            btnmodificar.setEnabled(false);
            btneliminar.setEnabled(false);}
    }//GEN-LAST:event_btneliminarActionPerformed
    //ACCIÓN DEL BOTÓN LISTAR
    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        this.dispose();
        TablaPersonalMedico tpm=new TablaPersonalMedico();
        tpm.setVisible(true);
    }//GEN-LAST:event_btnlistarActionPerformed
    //ACCIÓN DEL BOTÓN LIMPIAR IDIOMAS
    private void btnlimpiaridiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiaridiomasActionPerformed
        cbidiomas.setSelectedItem("");
        taidiomas.setText("");
    }//GEN-LAST:event_btnlimpiaridiomasActionPerformed
    //MÉTODO GUARDAR
    public void Guardar(){
        //CREAMOS UN OBJETO DE LA CLASE PERSONAL MÉDICO
        ClasePersonalMedico cpm=new ClasePersonalMedico();
        int telefono=0,salario=0;
        //CAPTURAMOS LOS DATOS
        long identificacion=Long.parseLong(txtidentificacion.getText());
        ResultSet rs=cpm.Buscar(identificacion);
        try{
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"La Identificación ya existe en la Base de Datos","Error",JOptionPane.ERROR_MESSAGE,error);
                Limpiar();
                Iniciar();
                LimpiarLabores();
                Inhabilitar2();}
            else{
                String nombres=txtnombres.getText();
                String primerApellido=txtprimerapellido.getText();
                String segundoApellido=txtsegundoapellido.getText();
                ResultSet rs2=cpm.Buscar2(nombres,primerApellido,segundoApellido);
                try{
                    if(rs2.next()){
                        JOptionPane.showMessageDialog(null,"El Nombre, Primer Apellido y Segundo Apellido ya existe en la Base de Datos","Error",JOptionPane.ERROR_MESSAGE,error);
                        Limpiar();
                        Iniciar();
                        LimpiarLabores();
                        Inhabilitar2();}
                    else{
                        String fechaNacimiento=df.format(datefechanacimiento.getDate());
                        String pais=cbpais.getSelectedItem().toString();
                        String ciudad=cbciudad.getSelectedItem().toString();
                        String estadoCivil=cbestadocivil.getSelectedItem().toString();
                        String direccion=txtdireccion.getText();
                        if(!"".equals(txttelefono.getText())){
                            telefono=Integer.parseInt(txttelefono.getText());}
                        long movil=Long.parseLong(txtmovil.getText());
                        String correo=txtcorreo.getText();
                        String foto=txtruta.getText();
                        String tarjeta=txttarjeta.getText();
                        String titulo=txttitulo.getText();
                        String institucion=txtinstitucion.getText();
                        String otrosEstudios=taotrosestudios.getText();
                        String idiomas=taidiomas.getText();
                        String experiencialaboral="NO";
                        if(rbsi.isSelected()==true){
                            experiencialaboral=rbsi.getText();}
                        String ultimaEmpresa=txtultimaempresa.getText();
                        String cargo=txtcargo.getText();
                        String motivo=cbmotivo.getSelectedItem().toString();
                        if(!"".equals(txtsalario.getText())){
                            salario=Integer.parseInt(txtsalario.getText());}
                        String observaciones=taobservaciones.getText();
                        //VALIDAMOS LA FECHA DE NACIMIENTO
                        int anos=this.Fecha(fechaNacimiento);
                        if(anos<0){
                            JOptionPane.showMessageDialog(null,"Fecha de Nacimiento errada.","Error",JOptionPane.ERROR_MESSAGE,error);
                            datefechanacimiento.requestFocus();}
                        else if(anos<18){
                            JOptionPane.showMessageDialog(null,"Debe registrar mayores de Edad","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
                            datefechanacimiento.requestFocus();}
                        else{
                            cpm.Guardar(identificacion,nombres,primerApellido,segundoApellido,fechaNacimiento,pais,ciudad,estadoCivil,direccion,telefono,movil,correo,tarjeta,titulo,institucion,otrosEstudios,idiomas,experiencialaboral,ultimaEmpresa,cargo,motivo,salario,observaciones,foto);
                            JOptionPane.showMessageDialog(null,"Registro guardado con Exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
                            Limpiar();
                            Iniciar();
                            LimpiarLabores();
                            Inhabilitar2();}}}
                catch (SQLException e){
                    System.out.println(e.getMessage());}}}
        catch (SQLException e){
            System.out.println(e.getMessage());}
    }
    //MÉTODO PARA ACTUALIZAR
    public void Actualizar(){
        //CREAMOS UN OBJETO DE LA CLASE PERSONALMÉDICO
        ClasePersonalMedico cpm=new ClasePersonalMedico();
        int telefono=0,salario=0;
        //CAPTURAMOS LOS DATOS
        long identificacion=Long.parseLong(txtidentificacion.getText());
        String nombres=txtnombres.getText();
        String primerApellido=txtprimerapellido.getText();
        String segundoApellido=txtsegundoapellido.getText();
        String fechaNacimiento=df.format(datefechanacimiento.getDate());
        String pais=cbpais.getSelectedItem().toString();
        String ciudad=cbciudad.getSelectedItem().toString();
        String estadoCivil=cbestadocivil.getSelectedItem().toString();
        String direccion=txtdireccion.getText();
        if(!"".equals(txttelefono.getText())){
            telefono=Integer.parseInt(txttelefono.getText());}
        long movil=Long.parseLong(txtmovil.getText());
        String correo=txtcorreo.getText();
        String foto=txtruta.getText();
        String tarjeta=txttarjeta.getText();
        String titulo=txttitulo.getText();
        String institucion=txtinstitucion.getText();
        String otrosEstudios=taotrosestudios.getText();
        String idiomas=taidiomas.getText();
        String experiencialaboral="NO";
        if(rbsi.isSelected()==true){
            experiencialaboral=rbsi.getText();}
        String ultimaEmpresa=txtultimaempresa.getText();
        String cargo=txtcargo.getText();
        String motivo=cbmotivo.getSelectedItem().toString();
        if(!"".equals(txtsalario.getText())){
            salario=Integer.parseInt(txtsalario.getText());}
        String observaciones=taobservaciones.getText();
        cpm.Actualizar(identificacion,nombres,primerApellido,segundoApellido,fechaNacimiento,pais,ciudad,estadoCivil,direccion,telefono,movil,correo,tarjeta,titulo,institucion,otrosEstudios,idiomas,experiencialaboral,ultimaEmpresa,cargo,motivo,salario,observaciones,foto);
        Limpiar();
        Iniciar();
        Inhabilitar2();
        txtidentificacion.setEnabled(true);
        JOptionPane.showMessageDialog(null,"Registro Actualizado con Exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
        btnconsultar.setText("Consultar");
        btnconsultar.setDescription("Consult");
        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
        btnguardar.setEnabled(true);
        btnmodificar.setEnabled(false);
        btnmodificar.setText("Modificar");
        btnmodificar.setDescription("Edit");
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png")));
        btneliminar.setEnabled(false);
        btnmodificar.setEnabled(false);
    }
    //MÉTODO PARA CARGAR FOTOS DEL PERSONAL MÉDICO
    public void CargarFoto(long identificacion){
        Image dtCat=foto.RecuperarFoto(identificacion);
        ImageIcon icon=new ImageIcon(dtCat);
        //SE EXTRAE LA IMAGEN DEL ICONO
        Image img=icon.getImage();
        //SE MODIFICA SU TAMAÑO
        Image newimg=img.getScaledInstance(276,346,java.awt.Image.SCALE_SMOOTH);
        //SE GENERA EL IMAGE ICON CON LA NUEVA IMAGEN
        ImageIcon newIcon=new ImageIcon(newimg);
        //SE COLOCA EL NUEVO ICONO MODIFICADO
        if(newIcon!=null){
            lblfoto.setIcon(newIcon);
            lblfoto.setSize(276,344);}
    }
    //MÉTODO PARA VALIDAR FECHAS DE NACIMIENTO
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
    //VALIDACIÓN SI RESPUESTA ES UN NÚMERO
    private static boolean EsNumero(String Respuesta){
        try{
            Integer.parseInt(Respuesta);
            return true;}
        catch (NumberFormatException e){
           return false;}
    }
    //MÉTODO PARA INHABILITAR CAMPOS PRINCIPALES
    public void Inhabilitar(){
        txtidentificacion.setEnabled(false);
        txtnombres.setEnabled(false);
        txtprimerapellido.setEnabled(false);
        txtsegundoapellido.setEnabled(false);
        datefechanacimiento.setEnabled(false);
        cbpais.setEnabled(false);
        cbciudad.setEnabled(false);
        cbestadocivil.setEnabled(false);
        txtdireccion.setEnabled(false);
        txttelefono.setEnabled(false);
        txtmovil.setEnabled(false);
        txtcorreo.setEnabled(false);
        txtruta.setEnabled(false);
        txttarjeta.setEnabled(false);
        txttitulo.setEnabled(false);
        txtinstitucion.setEnabled(false);
        taotrosestudios.setEnabled(false);
        cbidiomas.setEnabled(false);
        taidiomas.setEnabled(false);
        btnlimpiaridiomas.setEnabled(false);
        rbsi.setEnabled(false);
        rbno.setEnabled(false);
        Inhabilitar2();
        taobservaciones.setEnabled(false);
    }
    //MÉTODO PARA INHABILITAR CAMPOS SECUNDARIOS
    public void Inhabilitar2(){
        plaboral.setEnabled(false);
        lblultimaempresa.setEnabled(false);
        lblcargo.setEnabled(false);
        lblmotivo.setEnabled(false);
        lblsalario.setEnabled(false);
        txtultimaempresa.setEnabled(false);
        txtcargo.setEnabled(false);
        cbmotivo.setEnabled(false);
        txtsalario.setEnabled(false);
    }
    //MÉTODO PARA HABILITAR LOS CAMPOS
    public void Habilitar(){
        txtnombres.setEnabled(true);
        txtprimerapellido.setEnabled(true);
        txtsegundoapellido.setEnabled(true);
        datefechanacimiento.setEnabled(true);
        //ASÍ SE INHABILITAN LOS JDATECHOOSER PARA QUE SOLO SE ESCOJA LA FECHA DESDE EL CALENDARIO
        datefechanacimiento.getDateEditor().setEnabled(false);
        cbpais.setEnabled(true);
        cbestadocivil.setEnabled(true);
        txtdireccion.setEnabled(true);
        txttelefono.setEnabled(true);
        txtmovil.setEnabled(true);
        txtcorreo.setEnabled(true);
        txtruta.setEnabled(true);
        txttarjeta.setEnabled(true);
        txttitulo.setEnabled(true);
        txtinstitucion.setEnabled(true);
        taotrosestudios.setEnabled(true);
        cbidiomas.setEnabled(true);
        taidiomas.setEnabled(true);
        btnlimpiaridiomas.setEnabled(true);
        rbsi.setEnabled(true);
        rbno.setEnabled(true);
        taobservaciones.setEnabled(true);
    }
    //MÉTODO PARA HABILITAR CAMPOS SECUNDARIOS
    public void Habilitar2(){
        plaboral.setEnabled(true);
        lblultimaempresa.setEnabled(true);
        lblcargo.setEnabled(true);
        lblmotivo.setEnabled(true);
        lblsalario.setEnabled(true);
        txtultimaempresa.setEnabled(true);
        txtcargo.setEnabled(true);
        cbmotivo.setEnabled(true);
        txtsalario.setEnabled(true);
    }
    //MÉTODO PARA LIMPIAR LOS DATOS
    public void Limpiar(){
        txtidentificacion.setText("");
        txtnombres.setText("");
        txtprimerapellido.setText("");
        txtsegundoapellido.setText("");
        datefechanacimiento.setDate(null);
        cbpais.removeAllItems();
        cbciudad.removeAllItems();
        cbestadocivil.setSelectedItem("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtmovil.setText("");
        txtcorreo.setText("");
        txtruta.setText("");
        lblfoto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/foto_opt.png")));
        txttarjeta.setText("");
        txttitulo.setText("");
        txtinstitucion.setText("");
        taotrosestudios.setText("");
        lblcontador.setText("");
        cbidiomas.removeAllItems();
        taidiomas.setText("");
        rbsi.setSelected(false);
        rbno.setSelected(false);
        taobservaciones.setText("");
        lblconteo.setText("");
        LimpiarLabores();
        lblestado1.setVisible(false);
        lblestadoactual1.setVisible(false);
        lblestado2.setVisible(false);
        lblestadoactual2.setVisible(false);
    }
    //MÉTODO PARA LIMPIAR LOS DATOS LABORES
    public void LimpiarLabores(){
        txtultimaempresa.setText("");
        txtcargo.setText("");
        cbmotivo.setSelectedItem("");
        txtsalario.setText("");
    }
    //MÉTODO QUE VALIDA LETRAS
    private void Letras(final JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent KE){
                char c=KE.getKeyChar();
                if(Character.isDigit(c))//AQUÍ ESTOY COMPARANDO SI ES UN NÚMERO
                {
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();//ANULA EVENTOS DEL TECLADO
                }}});
    }
    //MÉTODO QUE VALIDA NÚMEROS
    private void Numeros(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent KE){
                char c=KE.getKeyChar();
                if(Character.isLetter(c))//AQUÍ ESTOY COMPARANDO SI ES UNA LETRA
                {
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();//ANULA EVENTOS DEL TECLADO
                }}});
    }
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
            java.util.logging.Logger.getLogger(PersonalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new PersonalMedico().setVisible(true);}
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncargar;
    private org.edisoncor.gui.button.ButtonTask btnconsultar;
    private org.edisoncor.gui.button.ButtonTask btneliminar;
    private org.edisoncor.gui.button.ButtonTask btnguardar;
    private javax.swing.JButton btnlimpiaridiomas;
    private org.edisoncor.gui.button.ButtonTask btnlistar;
    private org.edisoncor.gui.button.ButtonTask btnmodificar;
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JComboBox cbciudad;
    private javax.swing.JComboBox cbestadocivil;
    private javax.swing.JComboBox cbidiomas;
    private javax.swing.JComboBox cbmotivo;
    private javax.swing.JComboBox cbpais;
    private com.toedter.calendar.JDateChooser datefechanacimiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jtppestanas;
    private javax.swing.JLabel lblcaracteres1;
    private javax.swing.JLabel lblcaracteres2;
    private javax.swing.JLabel lblcargo;
    private javax.swing.JLabel lblciudad;
    private javax.swing.JLabel lblcontador;
    private javax.swing.JLabel lblconteo;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblestado1;
    private javax.swing.JLabel lblestado2;
    private javax.swing.JLabel lblestadoactual1;
    private javax.swing.JLabel lblestadoactual2;
    private javax.swing.JLabel lblestadocivil;
    private javax.swing.JLabel lblexperiencia;
    private javax.swing.JLabel lblfechanacimiento;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel lblidentificacion;
    private javax.swing.JLabel lblidiomas;
    private javax.swing.JLabel lblinstitucion;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblmensaje2;
    private javax.swing.JLabel lblmotivo;
    private javax.swing.JLabel lblmovil;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lblobservaciones;
    private javax.swing.JLabel lblotrosestudios;
    private javax.swing.JLabel lblpais;
    private javax.swing.JLabel lblprimerapellido;
    private javax.swing.JLabel lblrespuesta;
    private javax.swing.JLabel lblsalario;
    private javax.swing.JLabel lblsegundoapellido;
    private javax.swing.JLabel lbltarjeta;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblultimaempresa;
    private javax.swing.JPanel pdatosprofesionales;
    private javax.swing.JPanel pfotografia;
    private javax.swing.JPanel pimagen;
    private javax.swing.JPanel plaboral;
    private javax.swing.JPanel ppersonales;
    private javax.swing.JRadioButton rbno;
    private javax.swing.JRadioButton rbsi;
    private javax.swing.JTextArea taidiomas;
    private javax.swing.JTextArea taobservaciones;
    private javax.swing.JTextArea taotrosestudios;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtinstitucion;
    private javax.swing.JTextField txtmovil;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtprimerapellido;
    private javax.swing.JTextField txtruta;
    private javax.swing.JTextField txtsalario;
    private javax.swing.JTextField txtsegundoapellido;
    private javax.swing.JTextField txttarjeta;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttitulo;
    private javax.swing.JTextField txtultimaempresa;
    // End of variables declaration//GEN-END:variables
}
