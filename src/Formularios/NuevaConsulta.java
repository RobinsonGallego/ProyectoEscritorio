package Formularios;
//LIBRERÍAS
import Clases.ClaseNuevaCita;
import Clases.ClasePacientes;
import Clases.ClasePersonalMedico;
import Clases.ClaseUsuarios;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NuevaConsulta extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    DateFormat df=DateFormat.getDateTimeInstance();
    //CONSTRUCTOR
    public NuevaConsulta(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Nueva Consulta Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        cbtipocita.requestFocus();
        lbltipo.setVisible(false);
        lblusuario.setVisible(false);
        lblidentificacion.setVisible(false);
        lblmedico.setVisible(false);
        txtmedico.setVisible(false);
        Iniciar();}
    /**
     * MÉTODO QUE CAPTURA EL USUARIO QUE INGRESO Y APLICA SU PERFIL 
     * @param user que contiene un String recibido del Inicio de Sessión
     * @param identificacion
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void setText(String user,String identificacion){
        //Perfil(user);
        lblusuario.setText(user);
        lblidentificacion.setText(identificacion);
        lblhistoria.setText(identificacion);}
    /**
     * MÉTODO ALTERNO INICIAR
     */
    private void Iniciar(){
        txtfechahora.setText(getFechaActual());
        //LIMPIAMOS COMBOBOX
        cbtipocita.removeAllItems();
        //PONEMOS UN ITEM POR DEFECTO
        cbtipocita.addItem("");
        //CREAMOS EL OBJETO CLASENUEVACITA
        ClaseNuevaCita cnc=new ClaseNuevaCita();
        //LLAMAMOS MÉTODO PARA LLENAR COMBOBOX
        cnc.LlenarTipoCita(cbtipocita);
        rbnormal.setSelected(true);}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfondo = new javax.swing.JPanel();
        lblnumero = new javax.swing.JLabel();
        lblhistoria = new javax.swing.JLabel();
        lblfechahora = new javax.swing.JLabel();
        txtfechahora = new javax.swing.JTextField();
        lblmedico = new javax.swing.JLabel();
        txtmedico = new javax.swing.JTextField();
        lbltipoconsulta = new javax.swing.JLabel();
        cbtipocita = new javax.swing.JComboBox();
        lblsintomas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tasintomas = new javax.swing.JTextArea();
        lblcaracteres = new javax.swing.JLabel();
        lblcontadorsintomas = new javax.swing.JLabel();
        lblpeso = new javax.swing.JLabel();
        txtpeso = new javax.swing.JTextField();
        lblkg = new javax.swing.JLabel();
        lblestatura = new javax.swing.JLabel();
        ftxestatura = new javax.swing.JFormattedTextField();
        lblmts = new javax.swing.JLabel();
        lblpresion = new javax.swing.JLabel();
        rbnormal = new javax.swing.JRadioButton();
        rbbaja = new javax.swing.JRadioButton();
        rbalta = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taantecedentes = new javax.swing.JTextArea();
        lbldiagnostico = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tadiagnostico = new javax.swing.JTextArea();
        lblobservaciones = new javax.swing.JLabel();
        lblmas = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taobservaciones = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        tamedicacion = new javax.swing.JTextArea();
        lblcaracteres2 = new javax.swing.JLabel();
        lblcontadorobservaciones = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        taprocedimientos = new javax.swing.JTextArea();
        lblprovedimientos = new javax.swing.JLabel();
        lbltipo = new javax.swing.JLabel();
        lblantecedentes = new javax.swing.JLabel();
        lblmedicacion = new javax.swing.JLabel();
        btnguardar = new org.edisoncor.gui.button.ButtonTask();
        lblusuario = new javax.swing.JLabel();
        lblidentificacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pfondo.setBackground(new java.awt.Color(255, 255, 255));

        lblnumero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblnumero.setText("N° de H.C");

        lblhistoria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblhistoria.setForeground(new java.awt.Color(255, 0, 0));

        lblfechahora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblfechahora.setText("Fecha y Hora de Consulta");

        txtfechahora.setEditable(false);
        txtfechahora.setBackground(new java.awt.Color(255, 255, 255));
        txtfechahora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtfechahora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblmedico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmedico.setText("Médico");

        txtmedico.setEditable(false);
        txtmedico.setBackground(new java.awt.Color(255, 255, 255));
        txtmedico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lbltipoconsulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltipoconsulta.setText("Tipo Cita *");

        cbtipocita.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbtipocita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipocitaActionPerformed(evt);
            }
        });
        cbtipocita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbtipocitaKeyTyped(evt);
            }
        });

        lblsintomas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsintomas.setText("Sintomas *");

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

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

        lblcaracteres.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcaracteres.setForeground(new java.awt.Color(255, 0, 0));
        lblcaracteres.setText("Caracteres");

        lblcontadorsintomas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontadorsintomas.setForeground(new java.awt.Color(255, 0, 0));

        lblpeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpeso.setText("Peso *");

        txtpeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpesoKeyTyped(evt);
            }
        });

        lblkg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblkg.setForeground(new java.awt.Color(153, 153, 153));
        lblkg.setText("Kg");

        lblestatura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblestatura.setText("Estatura *");

        try {
            ftxestatura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxestatura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ftxestatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftxestaturaKeyTyped(evt);
            }
        });

        lblmts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmts.setForeground(new java.awt.Color(153, 153, 153));
        lblmts.setText("Mts");

        lblpresion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpresion.setText("Presión *");

        rbnormal.setBackground(new java.awt.Color(255, 255, 255));
        rbnormal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbnormal.setText("Normal");
        rbnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnormalActionPerformed(evt);
            }
        });

        rbbaja.setBackground(new java.awt.Color(255, 255, 255));
        rbbaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbaja.setText("Baja");
        rbbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbajaActionPerformed(evt);
            }
        });

        rbalta.setBackground(new java.awt.Color(255, 255, 255));
        rbalta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbalta.setText("Alta");
        rbalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbaltaActionPerformed(evt);
            }
        });

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

        lblmas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmas.setForeground(new java.awt.Color(102, 102, 102));
        lblmas.setText("(Alergías, Medicación, Cirugías)");

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

        tamedicacion.setColumns(20);
        tamedicacion.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        tamedicacion.setRows(5);
        tamedicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tamedicacionKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(tamedicacion);

        lblcaracteres2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcaracteres2.setForeground(new java.awt.Color(255, 0, 0));
        lblcaracteres2.setText("Caracteres");

        lblcontadorobservaciones.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontadorobservaciones.setForeground(new java.awt.Color(255, 0, 0));

        taprocedimientos.setColumns(20);
        taprocedimientos.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        taprocedimientos.setRows(5);
        taprocedimientos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taprocedimientosKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(taprocedimientos);

        lblprovedimientos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblprovedimientos.setText("Procedimientos Médicos");

        lbltipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblantecedentes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblantecedentes.setText("Antecedentes Familiares *");

        lblmedicacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmedicacion.setText("Medicación Recetada");

        javax.swing.GroupLayout pfondoLayout = new javax.swing.GroupLayout(pfondo);
        pfondo.setLayout(pfondoLayout);
        pfondoLayout.setHorizontalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(lblnumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblhistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pfondoLayout.createSequentialGroup()
                                        .addComponent(lblcaracteres2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblcontadorobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6))
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbldiagnostico))
                                .addGap(18, 18, 18)
                                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pfondoLayout.createSequentialGroup()
                                        .addComponent(lblmedicacion)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane5)))
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblsintomas)
                                    .addGroup(pfondoLayout.createSequentialGroup()
                                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pfondoLayout.createSequentialGroup()
                                                .addComponent(lbltipoconsulta)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbtipocita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(pfondoLayout.createSequentialGroup()
                                                .addComponent(lblfechahora)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtfechahora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(34, 34, 34)
                                        .addComponent(lblmedico)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbltipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtmedico)))
                                    .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pfondoLayout.createSequentialGroup()
                                            .addComponent(lblcaracteres)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblcontadorsintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pfondoLayout.createSequentialGroup()
                                                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pfondoLayout.createSequentialGroup()
                                                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(pfondoLayout.createSequentialGroup()
                                                                .addComponent(lblpeso)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblkg)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(lblestatura)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(ftxestatura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblmts))
                                                            .addComponent(lblantecedentes))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lblpresion)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(rbnormal)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(rbbaja)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(rbalta))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pfondoLayout.createSequentialGroup()
                                                        .addComponent(lblobservaciones)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblmas)
                                                        .addGap(30, 30, 30)
                                                        .addComponent(lblprovedimientos)))
                                                .addGap(77, 77, 77)))))
                                .addGap(30, 30, 30)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pfondoLayout.setVerticalGroup(
            pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfondoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblhistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnumero))
                .addGap(18, 18, 18)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfechahora)
                    .addComponent(txtfechahora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmedico)
                    .addComponent(txtmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltipoconsulta)
                    .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbtipocita, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltipo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblsintomas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcontadorsintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcaracteres))
                .addGap(17, 17, 17)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpeso)
                            .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblkg)
                            .addComponent(lblestatura)
                            .addComponent(ftxestatura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmts)
                            .addComponent(lblpresion)
                            .addComponent(rbnormal)
                            .addComponent(rbbaja)
                            .addComponent(rbalta))
                        .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pfondoLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lblantecedentes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblmedicacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pfondoLayout.createSequentialGroup()
                        .addComponent(lbldiagnostico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblobservaciones)
                    .addComponent(lblmas)
                    .addComponent(lblprovedimientos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcaracteres2)
                    .addComponent(lblcontadorobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

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

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblidentificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblidentificacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //LIMITANTES Y TRANSFERENCIA DE FOCUS
    private void cbtipocitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbtipocitaKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==cbtipocita){
            if(Contador==10){
                tasintomas.requestFocus();}}
    }//GEN-LAST:event_cbtipocitaKeyTyped
    private void tasintomasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tasintomasKeyPressed
        if(tasintomas.getText().length()==400){
            evt.consume();}
        if(evt.getKeyCode()==KeyEvent.VK_TAB){
            txtpeso.requestFocus();}
    }//GEN-LAST:event_tasintomasKeyPressed
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
    private void ftxestaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxestaturaKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==ftxestatura){
            if(Contador==10){
                taantecedentes.requestFocus();}}
    }//GEN-LAST:event_ftxestaturaKeyTyped
    private void rbnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnormalActionPerformed
        rbbaja.setSelected(false);
        rbalta.setSelected(false);
    }//GEN-LAST:event_rbnormalActionPerformed
    private void rbbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbajaActionPerformed
        rbnormal.setSelected(false);
        rbalta.setSelected(false);
    }//GEN-LAST:event_rbbajaActionPerformed
    private void rbaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbaltaActionPerformed
        rbnormal.setSelected(false);
        rbbaja.setSelected(false);
    }//GEN-LAST:event_rbaltaActionPerformed
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
            tamedicacion.requestFocus();}
    }//GEN-LAST:event_tadiagnosticoKeyPressed
    private void taobservacionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taobservacionesKeyPressed
        if(taobservaciones.getText().length()==300){
            evt.consume();}
        if(evt.getKeyCode()==KeyEvent.VK_TAB){
            taprocedimientos.requestFocus();}
    }//GEN-LAST:event_taobservacionesKeyPressed
    private void taobservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taobservacionesKeyTyped
        int conteo=taobservaciones.getText().length();
        lblcontadorobservaciones.setText(String.valueOf(conteo));
        if(conteo>299){
            evt.consume();}
    }//GEN-LAST:event_taobservacionesKeyTyped
    private void tamedicacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tamedicacionKeyPressed
        if(tamedicacion.getText().length()==150){
            evt.consume();}
        if(evt.getKeyCode()==KeyEvent.VK_TAB){
            taobservaciones.requestFocus();}
    }//GEN-LAST:event_tamedicacionKeyPressed
    private void taprocedimientosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taprocedimientosKeyPressed
        if(taprocedimientos.getText().length()==200){
            evt.consume();}
        if(evt.getKeyCode()==KeyEvent.VK_TAB){
            btnguardar.requestFocus();}
    }//GEN-LAST:event_taprocedimientosKeyPressed
   //ACCIÓN DEL COMBOBOX TIPO CONSULTA
    private void cbtipocitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipocitaActionPerformed
        lbltipo.setText((String)cbtipocita.getSelectedItem());
        if(!"".equals(lbltipo.getText())){
            lblmedico.setVisible(true);
            txtmedico.setVisible(true);
            NombreMedico();}
        else{
            lblmedico.setVisible(false);
            txtmedico.setVisible(false);}
    }//GEN-LAST:event_cbtipocitaActionPerformed
    //ACCIÓN DEL BOTÓN GUARDAR CON CLIC
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Guardar();
    }//GEN-LAST:event_btnguardarActionPerformed
    /**
     * MÉTODO PARA GUARDAR UNA CONSULTA
     */
    private void Guardar(){
        //VALIDAMOS LOS CAMPOS OBLIGATORIOS
        if(cbtipocita.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar un Tipo de Cita.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            cbtipocita.requestFocus();}
        else if(tasintomas.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir los Sintomas del Paciente.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            tasintomas.requestFocus();}
        else if(txtpeso.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Peso del Paciente.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtpeso.requestFocus();}
        else if(ftxestatura.getText().equals(" .  ")){
            JOptionPane.showMessageDialog(null,"Debe escribir la Estatura del Paciente.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            ftxestatura.requestFocus();}
        else if(taantecedentes.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir los Antecedentes Familiares del Paciente.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            taantecedentes.requestFocus();}
        else if(tadiagnostico.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe escribir el Diagnóstico asignado por el Médico.","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            tadiagnostico.requestFocus();}
        else{
            //CAPTURAMOS LOS DATOS
            //String fechahora=df.format((Date)ParseFecha(txtfechahora.getText()));
            String fechahora=txtfechahora.getText();
            String medico=txtmedico.getText();
            int tipoCita=cbtipocita.getSelectedIndex();
            String sintomas=tasintomas.getText();
            String peso=txtpeso.getText();
            String estatura=ftxestatura.getText();
            String presion="";
            if(rbnormal.isSelected()==true){
                presion=rbnormal.getText();}
            else if(rbbaja.isSelected()==true){
                presion=rbbaja.getText();}
            else if(rbalta.isSelected()==true){
                presion=rbalta.getText();}
            String antecedentes=taantecedentes.getText();
            String diagnostico=tadiagnostico.getText();
            String medicacion=tamedicacion.getText();
            String observaciones=taobservaciones.getText();
            String procedimientos=taprocedimientos.getText();
            //CREAMOS UN OBJETO DE CLASENUEVACITA
            ClaseNuevaCita cnc=new ClaseNuevaCita();
            cnc.Guardar(fechahora,lblidentificacion.getText(),medico,tipoCita,sintomas,peso,estatura,presion,antecedentes,diagnostico,medicacion,observaciones,procedimientos);
            JOptionPane.showMessageDialog(null,"Consulta guardada con Exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
            Limpiar();
            //CREAMOS UN OBJETO DE LA CLASEPACIENTES
            ClasePacientes cpa=new ClasePacientes();
            ResultSet rs=cpa.BuscarIdentificacion(lblidentificacion.getText());
            try{
                if(rs.next()){
                    HistoriaClinica hc=new HistoriaClinica();
                    hc.InfoPaciente(rs);
                    hc.setVisible(true);
                    this.dispose();}}
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
    /**
     * MÉTODO PARA OBTENER LA FECHA Y LA HORA DEL SISTEMA
     * @return un String con la fecha del día Actual
     */
    private static String getFechaActual(){
        Date hoy=new Date();
        SimpleDateFormat formateador=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        return formateador.format(hoy);}
    /**
     * MÉTODO QUE PERMITE CONVERTIR UN STRING EN FECHA(Date)
     */
    private static Date ParseFecha(String fecha){
        SimpleDateFormat formato=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date fechac=null;
            try{
                fechac=formato.parse(fecha);}
            catch(ParseException ex){
                Logger.getLogger(NuevaConsulta.class.getName()).log(Level.SEVERE, null, ex);}
            return fechac;}
    /**
     * MÉTODO PARA PONER EL NOMBRE DEL MÉDICO QUE REALIZA LA CONSULTA
     */
    private void NombreMedico(){
        //CREAMOS UN OBJETO DE CLASE USUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        ResultSet rs=cu.BuscarUsuario2(lblusuario.getText());
        long ide=0;
        String nombreMedico="";
        try{
            if(rs.next()){
                ide=Long.parseLong(rs.getString(2));}}
        catch(SQLException e){
            System.out.println(e.getMessage());}
        ClasePersonalMedico cpm=new ClasePersonalMedico();
        ResultSet rs2=cpm.Buscar(ide);
        try{
            if(rs2.next()){
            nombreMedico=rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getString(4);}}
        catch(SQLException e){
            System.out.println(e.getMessage());}
        txtmedico.setText(nombreMedico);}
    /**
     * 
     */
    private void Limpiar(){
        cbtipocita.setSelectedItem("");
        tasintomas.setText("");
        txtpeso.setText("");
        ftxestatura.setText("");
        taantecedentes.setText("");
        tadiagnostico.setText("");
        tamedicacion.setText("");
        taobservaciones.setText("");
        taprocedimientos.setText("");
        lblcontadorsintomas.setText("");
        lblcontadorobservaciones.setText("");}
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
    private org.edisoncor.gui.button.ButtonTask btnguardar;
    private javax.swing.JComboBox cbtipocita;
    private javax.swing.JFormattedTextField ftxestatura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblantecedentes;
    private javax.swing.JLabel lblcaracteres;
    private javax.swing.JLabel lblcaracteres2;
    private javax.swing.JLabel lblcontadorobservaciones;
    private javax.swing.JLabel lblcontadorsintomas;
    private javax.swing.JLabel lbldiagnostico;
    private javax.swing.JLabel lblestatura;
    private javax.swing.JLabel lblfechahora;
    private javax.swing.JLabel lblhistoria;
    private javax.swing.JLabel lblidentificacion;
    private javax.swing.JLabel lblkg;
    private javax.swing.JLabel lblmas;
    private javax.swing.JLabel lblmedicacion;
    private javax.swing.JLabel lblmedico;
    private javax.swing.JLabel lblmts;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JLabel lblobservaciones;
    private javax.swing.JLabel lblpeso;
    private javax.swing.JLabel lblpresion;
    private javax.swing.JLabel lblprovedimientos;
    private javax.swing.JLabel lblsintomas;
    private javax.swing.JLabel lbltipo;
    private javax.swing.JLabel lbltipoconsulta;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel pfondo;
    private javax.swing.JRadioButton rbalta;
    private javax.swing.JRadioButton rbbaja;
    private javax.swing.JRadioButton rbnormal;
    private javax.swing.JTextArea taantecedentes;
    private javax.swing.JTextArea tadiagnostico;
    private javax.swing.JTextArea tamedicacion;
    private javax.swing.JTextArea taobservaciones;
    private javax.swing.JTextArea taprocedimientos;
    private javax.swing.JTextArea tasintomas;
    private javax.swing.JTextField txtfechahora;
    private javax.swing.JTextField txtmedico;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
