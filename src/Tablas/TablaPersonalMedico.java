package Tablas;
//LIBRERIAS
import Clases.ClasePersonalMedico;
import Formularios.PersonalMedico;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TablaPersonalMedico extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    //CONSTRUCTOR
    public TablaPersonalMedico(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Tabla Personal Médico");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        btnregresar.requestFocus();
        Letras(txtnombres);
        Letras(txtprimerape);
        Iniciar();
    }
    //MÉTODO INICIAR
    private void Iniciar(){
        //LIMPIAMOS LA TABLA
        Limpiar(tablapersonalmedico);
        //PONEMOS TODOS LOS DATOS POR DEFECTO
        DefaultTableModel modelo=(DefaultTableModel)tablapersonalmedico.getModel();
        //CREAMOS UN OBJETO DE LA CLASE PERSONALMEDICO
        ClasePersonalMedico cpm=new ClasePersonalMedico();
        //LLAMAMOS EL MÉTODO
        cpm.LlenarDatos(modelo);
        FormatoTabla();
    }
    //MÉTODO PARA DARLE TAMAÑO A CADA COLUMNA DE LA TABLA
    private void FormatoTabla(){
        //MODIFICAMOS LOS TÍTULOS DE LAS COLUMNAS
        JTableHeader th;
        th=tablapersonalmedico.getTableHeader();
        Font fuente=new Font("Tahoma",Font.BOLD,12);
        th.setFont(fuente);
        //PONEMOS TAMAÑO A CADA COLUMNA
        tablapersonalmedico.getColumnModel().getColumn(0).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(0).setMaxWidth(100);
        tablapersonalmedico.getColumnModel().getColumn(0).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(0).setHeaderValue("Identificación");
        tablapersonalmedico.getColumnModel().getColumn(1).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(1).setMaxWidth(150);
        tablapersonalmedico.getColumnModel().getColumn(1).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(1).setHeaderValue("Nombres");
        tablapersonalmedico.getColumnModel().getColumn(2).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(2).setMaxWidth(105);
        tablapersonalmedico.getColumnModel().getColumn(2).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(2).setHeaderValue("Primer Apellido");
        tablapersonalmedico.getColumnModel().getColumn(3).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(3).setMaxWidth(120);
        tablapersonalmedico.getColumnModel().getColumn(3).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(3).setHeaderValue("Segundo Apellido");
        tablapersonalmedico.getColumnModel().getColumn(4).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(4).setMaxWidth(115);
        tablapersonalmedico.getColumnModel().getColumn(4).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(4).setHeaderValue("Fecha Nacimiento");
        tablapersonalmedico.getColumnModel().getColumn(5).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(5).setMaxWidth(90);
        tablapersonalmedico.getColumnModel().getColumn(5).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(5).setHeaderValue("País");
        tablapersonalmedico.getColumnModel().getColumn(6).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(6).setMaxWidth(120);
        tablapersonalmedico.getColumnModel().getColumn(6).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(6).setHeaderValue("Ciudad");
        tablapersonalmedico.getColumnModel().getColumn(7).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(7).setMaxWidth(95);
        tablapersonalmedico.getColumnModel().getColumn(7).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(7).setHeaderValue("Móvil");
        tablapersonalmedico.getColumnModel().getColumn(8).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(8).setMaxWidth(210);
        tablapersonalmedico.getColumnModel().getColumn(8).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(8).setHeaderValue("Correo");
        tablapersonalmedico.getColumnModel().getColumn(9).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(9).setMaxWidth(125);
        tablapersonalmedico.getColumnModel().getColumn(9).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(9).setHeaderValue("Tarjeta Profesional");
        tablapersonalmedico.getColumnModel().getColumn(10).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(10).setMaxWidth(130);
        tablapersonalmedico.getColumnModel().getColumn(10).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(10).setHeaderValue("Experiencia Laboral");
    }
    //FORMATO ESTADO CIVIL O DIRECCIÓN
    private void Formato2(){
        //PONEMOS TAMAÑO A CADA COLUMNA
        tablapersonalmedico.getColumnModel().getColumn(0).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(0).setMaxWidth(100);
        tablapersonalmedico.getColumnModel().getColumn(0).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(1).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(1).setMaxWidth(150);
        tablapersonalmedico.getColumnModel().getColumn(1).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(2).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(2).setMaxWidth(105);
        tablapersonalmedico.getColumnModel().getColumn(2).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(3).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(3).setMaxWidth(120);
        tablapersonalmedico.getColumnModel().getColumn(3).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(4).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(4).setMaxWidth(115);
        tablapersonalmedico.getColumnModel().getColumn(4).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(5).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(5).setMaxWidth(90);
        tablapersonalmedico.getColumnModel().getColumn(5).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(6).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(6).setMaxWidth(100);
        tablapersonalmedico.getColumnModel().getColumn(6).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(7).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(7).setMaxWidth(95);
        tablapersonalmedico.getColumnModel().getColumn(7).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(7).setHeaderValue("Estado Civil");
        tablapersonalmedico.getColumnModel().getColumn(8).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(8).setMaxWidth(180);
        tablapersonalmedico.getColumnModel().getColumn(8).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(8).setHeaderValue("Dirección");
        tablapersonalmedico.getColumnModel().getColumn(9).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(9).setMaxWidth(95);
        tablapersonalmedico.getColumnModel().getColumn(9).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(9).setHeaderValue("Móvil");
        tablapersonalmedico.getColumnModel().getColumn(10).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(10).setMaxWidth(210);
        tablapersonalmedico.getColumnModel().getColumn(10).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(10).setHeaderValue("Correo");
    }
    //FORMATO INFORMACIÓN PROFESIONAL
    private void Formato3(){
        //PONEMOS TAMAÑO A CADA COLUMNA
        tablapersonalmedico.getColumnModel().getColumn(0).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(0).setMaxWidth(100);
        tablapersonalmedico.getColumnModel().getColumn(0).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(1).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(1).setMaxWidth(150);
        tablapersonalmedico.getColumnModel().getColumn(1).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(2).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(2).setMaxWidth(105);
        tablapersonalmedico.getColumnModel().getColumn(2).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(3).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(3).setMaxWidth(120);
        tablapersonalmedico.getColumnModel().getColumn(3).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(4).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(4).setMaxWidth(130);
        tablapersonalmedico.getColumnModel().getColumn(4).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(4).setHeaderValue("Tarjeta Profesional");
        tablapersonalmedico.getColumnModel().getColumn(5).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(5).setMaxWidth(150);
        tablapersonalmedico.getColumnModel().getColumn(5).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(5).setHeaderValue("Título");
        tablapersonalmedico.getColumnModel().getColumn(6).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(6).setMaxWidth(180);
        tablapersonalmedico.getColumnModel().getColumn(6).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(6).setHeaderValue("Institución");
        tablapersonalmedico.getColumnModel().getColumn(7).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(7).setMaxWidth(210);
        tablapersonalmedico.getColumnModel().getColumn(7).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(7).setHeaderValue("Otros Estudios");
        tablapersonalmedico.getColumnModel().getColumn(8).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(8).setMaxWidth(240);
        tablapersonalmedico.getColumnModel().getColumn(8).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(8).setHeaderValue("Idiomas");
        //OCULTAMOS LAS COLUMNAS QUE NO VAMOS A UTILIZAR
        tablapersonalmedico.getColumnModel().getColumn(9).setMaxWidth(0);
        tablapersonalmedico.getColumnModel().getColumn(9).setMinWidth(0);
        tablapersonalmedico.getTableHeader().getColumnModel().getColumn(9).setMaxWidth(0);
        tablapersonalmedico.getTableHeader().getColumnModel().getColumn(9).setMinWidth(0);
        tablapersonalmedico.getColumnModel().getColumn(10).setMaxWidth(0);
        tablapersonalmedico.getColumnModel().getColumn(10).setMinWidth(0);
        tablapersonalmedico.getTableHeader().getColumnModel().getColumn(10).setMaxWidth(0);
        tablapersonalmedico.getTableHeader().getColumnModel().getColumn(10).setMinWidth(0);
    }
    //FORMATO INFORMACIÓN LABORAL
    private void Formato4(){
        //PONEMOS TAMAÑO A CADA COLUMNA
        tablapersonalmedico.getColumnModel().getColumn(0).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(0).setMaxWidth(100);
        tablapersonalmedico.getColumnModel().getColumn(0).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(1).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(1).setMaxWidth(140);
        tablapersonalmedico.getColumnModel().getColumn(1).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(2).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(2).setMaxWidth(105);
        tablapersonalmedico.getColumnModel().getColumn(2).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(3).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(3).setMaxWidth(120);
        tablapersonalmedico.getColumnModel().getColumn(3).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(4).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(4).setMaxWidth(160);
        tablapersonalmedico.getColumnModel().getColumn(4).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(4).setHeaderValue("Correo");
        tablapersonalmedico.getColumnModel().getColumn(5).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(5).setMaxWidth(130);
        tablapersonalmedico.getColumnModel().getColumn(5).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(5).setHeaderValue("Experiencia Laboral");
        tablapersonalmedico.getColumnModel().getColumn(6).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(6).setMaxWidth(150);
        tablapersonalmedico.getColumnModel().getColumn(6).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(6).setHeaderValue("Última Empresa");
        tablapersonalmedico.getColumnModel().getColumn(7).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(7).setMaxWidth(110);
        tablapersonalmedico.getColumnModel().getColumn(7).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(7).setHeaderValue("Cargo");
        tablapersonalmedico.getColumnModel().getColumn(8).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(8).setMaxWidth(150);
        tablapersonalmedico.getColumnModel().getColumn(8).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(8).setHeaderValue("Motivo Salida");
        tablapersonalmedico.getColumnModel().getColumn(9).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(9).setMaxWidth(95);
        tablapersonalmedico.getColumnModel().getColumn(9).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(9).setHeaderValue("Último Salario");
        tablapersonalmedico.getColumnModel().getColumn(10).setWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(10).setMaxWidth(100);
        tablapersonalmedico.getColumnModel().getColumn(10).setMinWidth(25);
        tablapersonalmedico.getColumnModel().getColumn(10).setHeaderValue("Observaciones");
    }
    //MÉTODO PARA LIMPIAR LOS DATOS EN LA TABLA
    private void Limpiar(JTable tabla){
        //RECORREMOS TODAS LAS FILAS
        while(tabla.getRowCount()>0){
            //Y AQUÍ LAS REMOVEMOS
            ((DefaultTableModel)tabla.getModel()).removeRow(0);}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablapersonalmedico = new javax.swing.JTable();
        pbusqueda = new javax.swing.JPanel();
        lblimagen = new javax.swing.JLabel();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();
        rbbuscardoec = new javax.swing.JRadioButton();
        btnlimpiar = new org.edisoncor.gui.button.ButtonTask();
        rbbuscarinfopro = new javax.swing.JRadioButton();
        rbbuscarexplabo = new javax.swing.JRadioButton();
        rbbuscarnombres = new javax.swing.JRadioButton();
        txtnombres = new javax.swing.JTextField();
        rbbuscarprimerape = new javax.swing.JRadioButton();
        txtprimerape = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tablapersonalmedico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablapersonalmedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Nombres", "Primer Apellido", "Segundo Apellido", "Fecha Nacimiento", "País", "Ciudad", "Móvil", "Correo", "Tarjeta Profesional", "Experiencia Laboral"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablapersonalmedico.setEnabled(false);
        jScrollPane2.setViewportView(tablapersonalmedico);
        if (tablapersonalmedico.getColumnModel().getColumnCount() > 0) {
            tablapersonalmedico.getColumnModel().getColumn(0).setHeaderValue("Identificación");
            tablapersonalmedico.getColumnModel().getColumn(1).setHeaderValue("Nombres");
            tablapersonalmedico.getColumnModel().getColumn(2).setHeaderValue("Primer Apellido");
            tablapersonalmedico.getColumnModel().getColumn(3).setHeaderValue("Segundo Apellido");
            tablapersonalmedico.getColumnModel().getColumn(4).setHeaderValue("Fecha Nacimiento");
            tablapersonalmedico.getColumnModel().getColumn(5).setHeaderValue("País");
            tablapersonalmedico.getColumnModel().getColumn(6).setHeaderValue("Ciudad");
            tablapersonalmedico.getColumnModel().getColumn(7).setHeaderValue("Móvil");
            tablapersonalmedico.getColumnModel().getColumn(8).setHeaderValue("Correo");
            tablapersonalmedico.getColumnModel().getColumn(9).setHeaderValue("Tarjeta Profesional");
            tablapersonalmedico.getColumnModel().getColumn(10).setHeaderValue("Experiencia Laboral");
        }

        pbusqueda.setBackground(new java.awt.Color(255, 255, 255));
        pbusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta4_opt.png"))); // NOI18N

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar_opt.png"))); // NOI18N
        btnregresar.setText("Regresar");
        btnregresar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnregresar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregresar.setDescription("Return");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        rbbuscardoec.setBackground(new java.awt.Color(255, 255, 255));
        rbbuscardoec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbuscardoec.setText("Buscar Dirección o Estado Civil");
        rbbuscardoec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbuscardoecActionPerformed(evt);
            }
        });

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png"))); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.setCategoryFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnlimpiar.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlimpiar.setDescription("Clean");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        rbbuscarinfopro.setBackground(new java.awt.Color(255, 255, 255));
        rbbuscarinfopro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbuscarinfopro.setText("Buscar Información Profesional");
        rbbuscarinfopro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbuscarinfoproActionPerformed(evt);
            }
        });

        rbbuscarexplabo.setBackground(new java.awt.Color(255, 255, 255));
        rbbuscarexplabo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbuscarexplabo.setText("Buscar Experiencia Laboral y Observaciones");
        rbbuscarexplabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbuscarexplaboActionPerformed(evt);
            }
        });

        rbbuscarnombres.setBackground(new java.awt.Color(255, 255, 255));
        rbbuscarnombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbuscarnombres.setText("Buscar por Nombres");
        rbbuscarnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbuscarnombresActionPerformed(evt);
            }
        });

        txtnombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnombres.setEnabled(false);
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombresKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });

        rbbuscarprimerape.setBackground(new java.awt.Color(255, 255, 255));
        rbbuscarprimerape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbuscarprimerape.setText("Buscar por Primer Apellido");
        rbbuscarprimerape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbuscarprimerapeActionPerformed(evt);
            }
        });

        txtprimerape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtprimerape.setEnabled(false);
        txtprimerape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprimerapeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprimerapeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pbusquedaLayout = new javax.swing.GroupLayout(pbusqueda);
        pbusqueda.setLayout(pbusquedaLayout);
        pbusquedaLayout.setHorizontalGroup(
            pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbusquedaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblimagen)
                .addGap(18, 18, 18)
                .addGroup(pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pbusquedaLayout.createSequentialGroup()
                        .addGroup(pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pbusquedaLayout.createSequentialGroup()
                                .addComponent(rbbuscarnombres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pbusquedaLayout.createSequentialGroup()
                                .addComponent(rbbuscarprimerape)
                                .addGap(18, 18, 18)
                                .addComponent(txtprimerape, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbbuscarinfopro)
                            .addComponent(rbbuscarexplabo)))
                    .addComponent(rbbuscardoec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pbusquedaLayout.setVerticalGroup(
            pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbusquedaLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblimagen)
                    .addGroup(pbusquedaLayout.createSequentialGroup()
                        .addGroup(pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbbuscarnombres)
                            .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbbuscarinfopro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbbuscarprimerape)
                            .addComponent(txtprimerape, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbbuscarexplabo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 10, Short.MAX_VALUE)
                        .addComponent(rbbuscardoec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pbusquedaLayout.createSequentialGroup()
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(pbusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ACCIÓN DEL BOTÓN REGRESAR
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        PersonalMedico pm=new PersonalMedico();
        pm.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed
    //ACCIÓN DEL RADIOBUTTON ESTADO CIVIL O DIRECCIÓN
    private void rbbuscardoecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbuscardoecActionPerformed
        rbbuscardoec.setForeground(Color.RED);
        rbbuscarinfopro.setEnabled(false);
        rbbuscarexplabo.setEnabled(false);
        rbbuscarnombres.setEnabled(false);
        rbbuscarprimerape.setEnabled(false);
        String Respuesta=(String)JOptionPane.showInputDialog(null,"Ingrese la Identificación","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null);
        if(Respuesta==null){
            Iniciar();
            Activar();
            rbbuscardoec.setSelected(false);
            btnregresar.requestFocus();}
        else{
            if(!EsNumero(Respuesta)){
                rbbuscarinfopro.setEnabled(false);
                rbbuscarexplabo.setEnabled(false);
                rbbuscarnombres.setEnabled(false);
                rbbuscarprimerape.setEnabled(false);
                JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar.\nEl Dato debe ser un número de Identificación.","Error",JOptionPane.ERROR_MESSAGE,error);
                Iniciar();
                Activar();
                rbbuscardoec.setSelected(false);
                btnregresar.requestFocus();}
            else{
                rbbuscarinfopro.setEnabled(false);
                rbbuscarexplabo.setEnabled(false);
                rbbuscarnombres.setEnabled(false);
                rbbuscarprimerape.setEnabled(false);
                long identificacion=Long.parseLong(Respuesta);
                //CREAMOS UN OBJETO DE LA CLASE PERSONALMEDICO
                ClasePersonalMedico cpm=new ClasePersonalMedico();
                ResultSet rs=cpm.Buscar(identificacion);
                try{
                    if(rs.next()){
                        //LIMPIAMOS LA TABLA
                        Limpiar(tablapersonalmedico);
                        DefaultTableModel modelo=(DefaultTableModel)tablapersonalmedico.getModel();
                        rbbuscarinfopro.setEnabled(false);
                        rbbuscarexplabo.setEnabled(false);
                        rbbuscarnombres.setEnabled(false);
                        rbbuscarprimerape.setEnabled(false);
                        //LLAMAMOS EL MÉTODO
                        cpm.BusquedaDireEstCi(modelo,identificacion);
                        Formato2();}
                    else{
                        JOptionPane.showMessageDialog(null,"La Identificación buscada no existe","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
                        Limpiar();
                        Iniciar();
                        Activar();
                        btnregresar.requestFocus();}}
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
    }//GEN-LAST:event_rbbuscardoecActionPerformed
    //ACCIÓN DEL BOTÓN LIMPIAR
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
        Activar();
        Iniciar();
    }//GEN-LAST:event_btnlimpiarActionPerformed
    //ACCIÓN DEL RADIOBUTTON INFORMACIÓN PROFESIONAL
    private void rbbuscarinfoproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbuscarinfoproActionPerformed
        rbbuscarinfopro.setForeground(Color.RED);
        rbbuscardoec.setEnabled(false);
        rbbuscarexplabo.setEnabled(false);
        rbbuscarnombres.setEnabled(false);
        rbbuscarprimerape.setEnabled(false);
        String Respuesta=(String)JOptionPane.showInputDialog(null,"Ingrese la Identificación","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null);
        if(Respuesta==null){
            Iniciar();
            Activar();
            rbbuscarinfopro.setSelected(false);
            btnregresar.requestFocus();}
        else{
            if(!EsNumero(Respuesta)){
                rbbuscardoec.setEnabled(false);
                rbbuscarexplabo.setEnabled(false);
                rbbuscarnombres.setEnabled(false);
                rbbuscarprimerape.setEnabled(false);
                JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar.\nEl Dato debe ser un número de Identificación.","Error",JOptionPane.ERROR_MESSAGE,error);
                Iniciar();
                Activar();
                rbbuscarinfopro.setSelected(false);
                btnregresar.requestFocus();}
            else{
                rbbuscardoec.setEnabled(false);
                rbbuscarexplabo.setEnabled(false);
                rbbuscarnombres.setEnabled(false);
                rbbuscarprimerape.setEnabled(false);
                long identificacion=Long.parseLong(Respuesta);
                //CREAMOS UN OBJETO DE LA CLASE PERSONALMEDICO
                ClasePersonalMedico cpm=new ClasePersonalMedico();
                ResultSet rs=cpm.Buscar(identificacion);
                try{
                    if(rs.next()){
                        //LIMPIAMOS LA TABLA
                        Limpiar(tablapersonalmedico);
                        DefaultTableModel modelo=(DefaultTableModel)tablapersonalmedico.getModel();
                        rbbuscardoec.setEnabled(false);
                        rbbuscarexplabo.setEnabled(false);
                        rbbuscarnombres.setEnabled(false);
                        rbbuscarprimerape.setEnabled(false);
                        //LLAMAMOS EL MÉTODO
                        cpm.BusquedaInfoPer(modelo,identificacion);
                        Formato3();}
                    else{
                        JOptionPane.showMessageDialog(null,"La Identificación buscada no existe","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
                        Limpiar();
                        Iniciar();
                        Activar();
                        btnregresar.requestFocus();}}
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
    }//GEN-LAST:event_rbbuscarinfoproActionPerformed
    //ACCIÓN DEL RADIOBUTTON EXPERIENCIA LABORAL
    private void rbbuscarexplaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbuscarexplaboActionPerformed
        rbbuscarexplabo.setForeground(Color.RED);
        rbbuscardoec.setEnabled(false);
        rbbuscarinfopro.setEnabled(false);
        rbbuscarnombres.setEnabled(false);
        rbbuscarprimerape.setEnabled(false);
        String Respuesta=(String)JOptionPane.showInputDialog(null,"Ingrese la Identificación","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null);
        if(Respuesta==null){
            Iniciar();
            Activar();
            rbbuscarexplabo.setSelected(false);
            btnregresar.requestFocus();}
        else{
            if(!EsNumero(Respuesta)){
                rbbuscardoec.setEnabled(false);
                rbbuscarinfopro.setEnabled(false);
                rbbuscarnombres.setEnabled(false);
                rbbuscarprimerape.setEnabled(false);
                JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar.\nEl Dato debe ser un número de Identificación.","Error",JOptionPane.ERROR_MESSAGE,error);
                Iniciar();
                Activar();
                rbbuscarexplabo.setSelected(false);
                btnregresar.requestFocus();}
            else{
                rbbuscardoec.setEnabled(false);
                rbbuscarinfopro.setEnabled(false);
                rbbuscarnombres.setEnabled(false);
                rbbuscarprimerape.setEnabled(false);
                long identificacion=Long.parseLong(Respuesta);
                //CREAMOS UN OBJETO DE LA CLASE PERSONALMEDICO
                ClasePersonalMedico cpm=new ClasePersonalMedico();
                ResultSet rs=cpm.Buscar(identificacion);
                try{
                    if(rs.next()){
                        //LIMPIAMOS LA TABLA
                        Limpiar(tablapersonalmedico);
                        DefaultTableModel modelo=(DefaultTableModel)tablapersonalmedico.getModel();
                        rbbuscardoec.setEnabled(false);
                        rbbuscarinfopro.setEnabled(false);
                        rbbuscarnombres.setEnabled(false);
                        rbbuscarprimerape.setEnabled(false);
                        //LLAMAMOS EL MÉTODO
                        cpm.BusquedaExperienciaLaboral(modelo,identificacion);
                        Formato4();}
                    else{
                        JOptionPane.showMessageDialog(null,"La Identificación buscada no existe","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
                        Limpiar();
                        Iniciar();
                        Activar();
                        btnregresar.requestFocus();}}
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
    }//GEN-LAST:event_rbbuscarexplaboActionPerformed
    //ACCIÓN DEL RADIOBUTTON NOMBRES
    private void rbbuscarnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbuscarnombresActionPerformed
        rbbuscarnombres.setForeground(Color.RED);
        txtnombres.setEnabled(true);
        txtnombres.requestFocus();
        rbbuscardoec.setEnabled(false);
        rbbuscarinfopro.setEnabled(false);
        rbbuscarexplabo.setEnabled(false);
        rbbuscarprimerape.setEnabled(false);
        //LIMPIAMOS LA TABLA
        Limpiar(tablapersonalmedico);
    }//GEN-LAST:event_rbbuscarnombresActionPerformed
    //ACCIÓN DEL JTEXTFIELD NOMBRES
    private void txtnombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyPressed
        //CREAMOS UN OBJETO DE LA CLASE PERSONALMEDICO
        ClasePersonalMedico cpm=new ClasePersonalMedico();
        //LIMPIAMOS LA TABLA
        Limpiar(tablapersonalmedico);
        DefaultTableModel modelo=(DefaultTableModel)tablapersonalmedico.getModel();
        //LLAMAMOS EL MÉTODO
        cpm.BusquedaNombres(modelo,txtnombres.getText());
    }//GEN-LAST:event_txtnombresKeyPressed
    //MAYÚSCULA INICIAL NOMBRES
    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        //MÉTODO PARA PONER MAYÚSCULA INICIAL
        JTextField txtnombre=(JTextField)evt.getComponent();
        String texto=txtnombre.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtnombres.setText(texto);}
    }//GEN-LAST:event_txtnombresKeyTyped
    //ACCIÓN DEL RADIOBUTTON APELLIDOS
    private void rbbuscarprimerapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbuscarprimerapeActionPerformed
        rbbuscarprimerape.setForeground(Color.RED);
        txtprimerape.setEnabled(true);
        txtprimerape.requestFocus();
        rbbuscardoec.setEnabled(false);
        rbbuscarinfopro.setEnabled(false);
        rbbuscarexplabo.setEnabled(false);
        rbbuscarnombres.setEnabled(false);
        //LIMPIAMOS LA TABLA
        Limpiar(tablapersonalmedico);
    }//GEN-LAST:event_rbbuscarprimerapeActionPerformed
    //ACCIÓN DEL JTEXTFIELD PRIMER APELLIDO
    private void txtprimerapeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimerapeKeyPressed
        //CREAMOS UN OBJETO DE LA CLASE PERSONALMEDICO
        ClasePersonalMedico cpm=new ClasePersonalMedico();
        //LIMPIAMOS LA TABLA
        Limpiar(tablapersonalmedico);
        DefaultTableModel modelo=(DefaultTableModel)tablapersonalmedico.getModel();
        //LLAMAMOS EL MÉTODO
        cpm.BusquedaPrimerApe(modelo,txtprimerape.getText());
    }//GEN-LAST:event_txtprimerapeKeyPressed
    //MAYÚSCULA INICIAL APELLIDOS
    private void txtprimerapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimerapeKeyTyped
        //MÉTODO PARA PONER MAYÚSCULA INICIAL
        JTextField txtapellido=(JTextField)evt.getComponent();
        String texto=txtapellido.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtprimerape.setText(texto);}
    }//GEN-LAST:event_txtprimerapeKeyTyped
    //VALIDACIÓN SI RESPUESTA ES UN NÚMERO
    private static boolean EsNumero(String Respuesta){
        try{
            Integer.parseInt(Respuesta);
            return true;}
        catch (NumberFormatException e){
           return false;}
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
    //MÉTODO PARA ACTIVAR TODO
    private void Activar(){
        rbbuscardoec.setEnabled(true);
        rbbuscardoec.setForeground(Color.BLACK);
        rbbuscarinfopro.setEnabled(true);
        rbbuscarinfopro.setForeground(Color.BLACK);
        rbbuscarexplabo.setEnabled(true);
        rbbuscarexplabo.setForeground(Color.BLACK);
        rbbuscarnombres.setEnabled(true);
        rbbuscarnombres.setForeground(Color.BLACK);
        txtnombres.setEnabled(false);
        rbbuscarprimerape.setEnabled(true);
        rbbuscarprimerape.setForeground(Color.BLACK);
        txtprimerape.setEnabled(false);
    }
    //MÉTODO PARA LIMPIAR
    private void Limpiar(){
        rbbuscardoec.setSelected(false);
        rbbuscarinfopro.setSelected(false);
        rbbuscarexplabo.setSelected(false);
        rbbuscarnombres.setSelected(false);
        rbbuscarprimerape.setSelected(false);
        txtnombres.setText("");
        txtprimerape.setText("");
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
            java.util.logging.Logger.getLogger(TablaPersonalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaPersonalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaPersonalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaPersonalMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new TablaPersonalMedico().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnlimpiar;
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JPanel pbusqueda;
    private javax.swing.JRadioButton rbbuscardoec;
    private javax.swing.JRadioButton rbbuscarexplabo;
    private javax.swing.JRadioButton rbbuscarinfopro;
    private javax.swing.JRadioButton rbbuscarnombres;
    private javax.swing.JRadioButton rbbuscarprimerape;
    private javax.swing.JTable tablapersonalmedico;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtprimerape;
    // End of variables declaration//GEN-END:variables
}
