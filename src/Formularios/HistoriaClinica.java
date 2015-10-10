package Formularios;

import Clases.ClasePacientes;
import Clases.FotoClassPM;
import Conexion.Conectate;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class HistoriaClinica extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    //CREAMOS UN OBJETO DE LA CLASE FOTOCLASSPM
    FotoClassPM foto=new FotoClassPM();
    //CONSTRUCTOR
    public HistoriaClinica(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Historia Clinica Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        ImageIcon logo=new ImageIcon("src/Imagenes/logo.png");//CREAMOS UN OBJETO IMAGEICON PARA LLAMAR LA IMAGEN
        Icon icono=new ImageIcon(logo.getImage().getScaledInstance(lbllogo.getWidth(),lbllogo.getHeight(),Image.SCALE_DEFAULT));//CONVERTIMOS LA IMAGEN EN ICONO CON LAS MEDIDAS DEL JLABEL
        lbllogo.setIcon(icono);//CAPTURAMOS LA IMAGEN EN EL JLABEL
        Iniciar();}
    /**
     * MÉTODO MOSTRAR INFORMACIÓN
     * @param rs
     * @throws java.sql.SQLException
     */
    public void InfoPaciente(ResultSet rs) throws SQLException{
        txttipodocu.setText(rs.getString(1));
        txtnumdocu.setText(rs.getString(2));
        txtnombres.setText(rs.getString(3));
        txtprimerape.setText(rs.getString(4));
        txtsegundoape.setText(rs.getString(5));
        String telefono=rs.getString(6);
        if(telefono.equals("0")){
            txttelefono.setText("");}
        else{
            txttelefono.setText(telefono);}
        String movil=rs.getString(7);
        if(movil.equals("0")){
            txtmovil.setText("");}
        else{
            txtmovil.setText(movil);}
        txtdireccion.setText(rs.getString(8));
        txtgenero.setText(rs.getString(9));
        txtcorreo.setText(rs.getString(10));
        String fechanaci=rs.getString(11);
        if(fechanaci.equals("1900-01-01")){
            txtfechanacimiento.setText("");
            lblmensajito.setVisible(false);}
        else{
            txtfechanacimiento.setText(fechanaci);}
        String edad=rs.getString(12);
        if(!"0".equals(edad)){
            lbledad.setText(edad);}
        txtestadocivil.setText(rs.getString(13));
        UIManager.put("ComboBox.disabledForeground",Color.HSBtoRGB(109,109,109));//PONEMOS COLOR A LOS COMBOBOX INHABILITADOS
        cbpais.setSelectedIndex(rs.getInt(14));
        cbciudad.setSelectedIndex(rs.getInt(15));
        txtprofesion.setText(rs.getString(16));
        txttiposangre.setText(rs.getString(17));
        int eps=rs.getInt(19);
        ClasePacientes cpa=new ClasePacientes();
        ResultSet rs2=cpa.BuscasEPS(eps);
        try{
            if(rs2.next()){
                txteps.setText(rs2.getString(1));}}
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
        txtvalorcopago.setText(cpa.ValorCoPago(eps));
        txtformapago.setText(rs.getString(20));
        //CREAMOS UN OBJETO DE CONEXION
        Conectate con=new Conectate();
        String consulta="FotoPacientes '"+txtnumdocu.getText()+"'";
        ResultSet r=con.Listar(consulta);
        String Respuesta="";
        try{
            while(r.next()){
                Respuesta=r.getString(1);}
            if(Respuesta.equals("NO")){
                lblfoto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/foto_opt.png")));
                JOptionPane.showMessageDialog(null,"El Paciente aún no tiene Foto","Advertencia",JOptionPane.INFORMATION_MESSAGE,informacion);}
            else{
                CargarFoto(txtnumdocu.getText());}}
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}
    /**
     * MÉTODO ALTERNO INICIAR
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void Iniciar(){
        //LIMPIAMOS COMBOBOX
        cbpais.removeAllItems();
        //PONEMOS UN ITEM POR DEFECTO
        cbpais.addItem("");
        //CREAMOS EL OBJETO CLASEPACIENTES
        ClasePacientes cpa=new ClasePacientes();
        //LLAMAMOS MÉTODO PARA LLENAR COMBOBOX
        cpa.LlenarPais(cbpais);}
    /**
     * MÉTODO INICIAR CIUDADES
     * @author Robinson Gallego Alzate
     * @version 1.0
     */
    private void IniciarCiudades(){
        //LIMPIAMOS EL COMBOBOX
        cbciudad.removeAllItems();
        //PONEMOS UN ITEM POR DEFECTO
        cbciudad.addItem("");
        //CREAMOS LOS OBJETOS PERSONALMEDICO
        ClasePacientes cpa2=new ClasePacientes();
        //LLAMAMOS MÉTODO PARA LLENAR COMBOBOX
        cpa2.LlenarCiudad(cbciudad,cbpais.getSelectedIndex());}
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
        Image newimg=img.getScaledInstance(176,206,java.awt.Image.SCALE_SMOOTH);
        //SE GENERA EL IMAGE ICON CON LA NUEVA IMAGEN
        ImageIcon newIcon=new ImageIcon(newimg);
        //SE COLOCA EL NUEVO ICONO MODIFICADO
        if(newIcon!=null){
            lblfoto.setIcon(newIcon);
            lblfoto.setSize(176,206);}}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        jtppestanas = new javax.swing.JTabbedPane();
        pinfopersonal = new javax.swing.JPanel();
        pinfopaciente = new javax.swing.JPanel();
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
        txtdireccion = new javax.swing.JTextField();
        txtestadocivil = new javax.swing.JTextField();
        txtprofesion = new javax.swing.JTextField();
        txtfechanacimiento = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtmovil = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        lbltiposangre = new javax.swing.JLabel();
        txttiposangre = new javax.swing.JTextField();
        pfoto = new javax.swing.JPanel();
        lblfoto = new javax.swing.JLabel();
        lbledad = new javax.swing.JLabel();
        lblmensajito = new javax.swing.JLabel();
        pinformacionadicional = new javax.swing.JPanel();
        lbleps = new javax.swing.JLabel();
        lblvalorcopago = new javax.swing.JLabel();
        lblformapago = new javax.swing.JLabel();
        txtformapago = new javax.swing.JTextField();
        txtvalorcopago = new javax.swing.JTextField();
        txteps = new javax.swing.JTextField();
        txtprimerape = new javax.swing.JTextField();
        txtsegundoape = new javax.swing.JTextField();
        txtgenero = new javax.swing.JTextField();
        lbllogo = new javax.swing.JLabel();
        cbpais = new javax.swing.JComboBox();
        cbciudad = new javax.swing.JComboBox();
        phistorial = new javax.swing.JPanel();
        btnnuevac = new org.edisoncor.gui.button.ButtonTask();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));

        jtppestanas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        pinfopersonal.setBackground(new java.awt.Color(255, 255, 255));

        pinfopaciente.setBackground(new java.awt.Color(255, 255, 255));
        pinfopaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información del Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

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

        txttipodocu.setEditable(false);
        txttipodocu.setBackground(new java.awt.Color(255, 255, 255));
        txttipodocu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtnumdocu.setEditable(false);
        txtnumdocu.setBackground(new java.awt.Color(255, 255, 255));
        txtnumdocu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtnombres.setEditable(false);
        txtnombres.setBackground(new java.awt.Color(255, 255, 255));
        txtnombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

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

        txtdireccion.setEditable(false);
        txtdireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtdireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtestadocivil.setEditable(false);
        txtestadocivil.setBackground(new java.awt.Color(255, 255, 255));
        txtestadocivil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtprofesion.setEditable(false);
        txtprofesion.setBackground(new java.awt.Color(255, 255, 255));
        txtprofesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtfechanacimiento.setEditable(false);
        txtfechanacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtfechanacimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txttelefono.setEditable(false);
        txttelefono.setBackground(new java.awt.Color(255, 255, 255));
        txttelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtmovil.setEditable(false);
        txtmovil.setBackground(new java.awt.Color(255, 255, 255));
        txtmovil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtcorreo.setEditable(false);
        txtcorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtcorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lbltiposangre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltiposangre.setText("Tipo de Sangre");

        txttiposangre.setEditable(false);
        txttiposangre.setBackground(new java.awt.Color(255, 255, 255));
        txttiposangre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        pfoto.setBackground(new java.awt.Color(255, 255, 255));
        pfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblfoto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pfotoLayout = new javax.swing.GroupLayout(pfoto);
        pfoto.setLayout(pfotoLayout);
        pfotoLayout.setHorizontalGroup(
            pfotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        pfotoLayout.setVerticalGroup(
            pfotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        lbledad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbledad.setForeground(new java.awt.Color(102, 102, 102));
        lbledad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblmensajito.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmensajito.setForeground(new java.awt.Color(102, 102, 102));
        lblmensajito.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblmensajito.setText("Años de Edad");

        pinformacionadicional.setBackground(new java.awt.Color(255, 255, 255));
        pinformacionadicional.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información Adicional", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lbleps.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbleps.setText("EPS o IPS");

        lblvalorcopago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblvalorcopago.setText("Valor Co-Pago");

        lblformapago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblformapago.setText("Forma de Pago");

        txtformapago.setEditable(false);
        txtformapago.setBackground(new java.awt.Color(255, 255, 255));
        txtformapago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtvalorcopago.setEditable(false);
        txtvalorcopago.setBackground(new java.awt.Color(255, 255, 255));
        txtvalorcopago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txteps.setEditable(false);
        txteps.setBackground(new java.awt.Color(255, 255, 255));
        txteps.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout pinformacionadicionalLayout = new javax.swing.GroupLayout(pinformacionadicional);
        pinformacionadicional.setLayout(pinformacionadicionalLayout);
        pinformacionadicionalLayout.setHorizontalGroup(
            pinformacionadicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinformacionadicionalLayout.createSequentialGroup()
                .addGroup(pinformacionadicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pinformacionadicionalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblformapago))
                    .addGroup(pinformacionadicionalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pinformacionadicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbleps)
                            .addComponent(lblvalorcopago))))
                .addGap(18, 18, 18)
                .addGroup(pinformacionadicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txteps, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvalorcopago, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtformapago, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pinformacionadicionalLayout.setVerticalGroup(
            pinformacionadicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinformacionadicionalLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pinformacionadicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbleps)
                    .addComponent(txteps, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pinformacionadicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblvalorcopago)
                    .addComponent(txtvalorcopago, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pinformacionadicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblformapago)
                    .addComponent(txtformapago, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtprimerape.setEditable(false);
        txtprimerape.setBackground(new java.awt.Color(255, 255, 255));
        txtprimerape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtsegundoape.setEditable(false);
        txtsegundoape.setBackground(new java.awt.Color(255, 255, 255));
        txtsegundoape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtgenero.setEditable(false);
        txtgenero.setBackground(new java.awt.Color(255, 255, 255));
        txtgenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cbpais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbpais.setEnabled(false);
        cbpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpaisActionPerformed(evt);
            }
        });

        cbciudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbciudad.setEnabled(false);

        javax.swing.GroupLayout pinfopacienteLayout = new javax.swing.GroupLayout(pinfopaciente);
        pinfopaciente.setLayout(pinfopacienteLayout);
        pinfopacienteLayout.setHorizontalGroup(
            pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinfopacienteLayout.createSequentialGroup()
                .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pinfopacienteLayout.createSequentialGroup()
                        .addGap(855, 855, 855)
                        .addComponent(lblnhc)
                        .addGap(6, 6, 6)
                        .addComponent(lblnhcrecibida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pinfopacienteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbltipodocu)
                        .addGap(21, 21, 21)
                        .addComponent(txttipodocu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pinfopacienteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(pinformacionadicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pinfopacienteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pinfopacienteLayout.createSequentialGroup()
                                .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnumdocu)
                                    .addComponent(lblnombres)
                                    .addComponent(lblprimerape)
                                    .addComponent(lblsegundoape)
                                    .addComponent(lblestadocivil)
                                    .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbldireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblgenero)))
                                .addGap(18, 18, 18)
                                .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnumdocu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtprimerape, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsegundoape, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(122, 122, 122)
                                .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnumtelefono)
                                    .addComponent(lblnummovil)
                                    .addComponent(lblfechanacimiento)
                                    .addComponent(lblpais)
                                    .addComponent(lblciudad)
                                    .addComponent(lblcorreo)))
                            .addGroup(pinfopacienteLayout.createSequentialGroup()
                                .addComponent(lblprofesion)
                                .addGap(83, 83, 83)
                                .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(lbltiposangre)))
                        .addGap(18, 18, 18)
                        .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmovil, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pinfopacienteLayout.createSequentialGroup()
                                .addComponent(txtfechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(lbledad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(lblmensajito))
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbpais, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttiposangre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(pfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        pinfopacienteLayout.setVerticalGroup(
            pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinfopacienteLayout.createSequentialGroup()
                .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnhc)
                    .addComponent(lblnhcrecibida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pinfopacienteLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbltipodocu))
                    .addComponent(txttipodocu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pinfopacienteLayout.createSequentialGroup()
                        .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pinfopacienteLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblnumdocu)
                                .addGap(16, 16, 16)
                                .addComponent(lblnombres)
                                .addGap(16, 16, 16)
                                .addComponent(lblprimerape)
                                .addGap(16, 16, 16)
                                .addComponent(lblsegundoape))
                            .addGroup(pinfopacienteLayout.createSequentialGroup()
                                .addComponent(txtnumdocu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtprimerape, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtsegundoape, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblgenero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbldireccion))
                                .addGap(6, 6, 6)
                                .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblestadocivil)))
                            .addGroup(pinfopacienteLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(lblnumtelefono)
                                .addGap(16, 16, 16)
                                .addComponent(lblnummovil)
                                .addGap(16, 16, 16)
                                .addComponent(lblfechanacimiento))
                            .addComponent(pfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblprofesion)))
                    .addGroup(pinfopacienteLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtmovil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pinfopacienteLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbledad, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblmensajito))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcorreo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbpais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblciudad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttiposangre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltiposangre))))
                .addGap(12, 12, 12)
                .addGroup(pinfopacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pinfopacienteLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(pinformacionadicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbllogo.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout pinfopersonalLayout = new javax.swing.GroupLayout(pinfopersonal);
        pinfopersonal.setLayout(pinfopersonalLayout);
        pinfopersonalLayout.setHorizontalGroup(
            pinfopersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pinfopaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pinfopersonalLayout.setVerticalGroup(
            pinfopersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pinfopaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jtppestanas.addTab("Información Personal", pinfopersonal);

        javax.swing.GroupLayout phistorialLayout = new javax.swing.GroupLayout(phistorial);
        phistorial.setLayout(phistorialLayout);
        phistorialLayout.setHorizontalGroup(
            phistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1142, Short.MAX_VALUE)
        );
        phistorialLayout.setVerticalGroup(
            phistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jtppestanas.addTab("Historial de Consultas", phistorial);

        btnnuevac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo_opt.png"))); // NOI18N
        btnnuevac.setText("Nueva Consulta");
        btnnuevac.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnnuevac.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnuevac.setDescription("New Query");
        btnnuevac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevacActionPerformed(evt);
            }
        });
        btnnuevac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnnuevacKeyTyped(evt);
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
        btnregresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnregresarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtppestanas)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnuevac, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnnuevac, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtppestanas))
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
    //ACCIÓN DEL COMBOBOX PAIS
    private void cbpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpaisActionPerformed
        cbciudad.removeAllItems();
        IniciarCiudades();
    }//GEN-LAST:event_cbpaisActionPerformed
    //ACCIÓN DEL BOTÓN REGRESAR CON CLIC
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        Menu menu=new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed
    //ACCIÓN DEL BOTÓN REGRESAR CON TECLADO
    private void btnregresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnregresarKeyTyped
        this.dispose();
        Menu menu=new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnregresarKeyTyped
    //ACCIÓN DEL BOTÓN NUEVA CONSULTA CON CLIC
    private void btnnuevacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevacActionPerformed
        this.dispose();
        NuevaConsulta nc=new NuevaConsulta();
        nc.setVisible(true);
    }//GEN-LAST:event_btnnuevacActionPerformed
    //ACCIÓN DEL BOTÓN NUEVA CONSULTA CON TECLADO
    private void btnnuevacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnnuevacKeyTyped
        this.dispose();
        NuevaConsulta nc=new NuevaConsulta();
        nc.setVisible(true);
    }//GEN-LAST:event_btnnuevacKeyTyped
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
    private org.edisoncor.gui.button.ButtonTask btnnuevac;
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JComboBox cbciudad;
    private javax.swing.JComboBox cbpais;
    private javax.swing.JTabbedPane jtppestanas;
    private javax.swing.JLabel lblciudad;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lbledad;
    private javax.swing.JLabel lbleps;
    private javax.swing.JLabel lblestadocivil;
    private javax.swing.JLabel lblfechanacimiento;
    private javax.swing.JLabel lblformapago;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel lblgenero;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblmensajito;
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
    private javax.swing.JLabel lbltiposangre;
    private javax.swing.JLabel lblvalorcopago;
    private javax.swing.JPanel pfondo;
    private javax.swing.JPanel pfoto;
    private javax.swing.JPanel phistorial;
    private javax.swing.JPanel pinfopaciente;
    private javax.swing.JPanel pinfopersonal;
    private javax.swing.JPanel pinformacionadicional;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txteps;
    private javax.swing.JTextField txtestadocivil;
    private javax.swing.JTextField txtfechanacimiento;
    private javax.swing.JTextField txtformapago;
    private javax.swing.JTextField txtgenero;
    private javax.swing.JTextField txtmovil;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtnumdocu;
    private javax.swing.JTextField txtprimerape;
    private javax.swing.JTextField txtprofesion;
    private javax.swing.JTextField txtsegundoape;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttipodocu;
    private javax.swing.JTextField txttiposangre;
    private javax.swing.JTextField txtvalorcopago;
    // End of variables declaration//GEN-END:variables
}
