package Tablas;
/**
 * LIBRERÍAS IMPORTADAS
 * @author Robinson Gallego Alzate
 * @version 1.1
 */
import Clases.ClasePerfiles;
import Clases.ClaseUsuarios;
import Formularios.Usuarios;
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

public class TablaUsuarios extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    /**
     * CONSTRUCTOR TablaUsuarios
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public TablaUsuarios(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Tabla Usuarios");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        btnregresar.requestFocus();
        Iniciar();
    }
    /**
     * MÉTODO ALTERNO INICIAR
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void Iniciar(){
        //LIMPIAMOS LA TABLA
        LimpiarTabla(tablausuarios);
        //PONEMOS TODOS LOS DATOS POR DEFECTO
        DefaultTableModel modelo=(DefaultTableModel)tablausuarios.getModel();
        //CREAMOS UN OBJETO DE CLASEUSUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        //LLAMAMOS EL MÉTODO
        cu.LlenarDatos(modelo);
        FormatoTabla();
        Letras(txtusuario);
        Letras(txtperfil);
    }
    /**
     * MÉTODO PARA DARLE TAMAÑO A CADA COLUMNA DE LA TABLA
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void FormatoTabla(){
        //PONEMOS TAMAÑO A CADA COLUMNA
        tablausuarios.getColumnModel().getColumn(0).setWidth(25);
        tablausuarios.getColumnModel().getColumn(0).setMaxWidth(100);
        tablausuarios.getColumnModel().getColumn(0).setMinWidth(25);
        tablausuarios.getColumnModel().getColumn(1).setWidth(25);
        tablausuarios.getColumnModel().getColumn(1).setMaxWidth(80);
        tablausuarios.getColumnModel().getColumn(1).setMinWidth(25);
        tablausuarios.getColumnModel().getColumn(2).setWidth(25);
        tablausuarios.getColumnModel().getColumn(2).setMaxWidth(205);
        tablausuarios.getColumnModel().getColumn(2).setMinWidth(25);
        tablausuarios.getColumnModel().getColumn(3).setWidth(25);
        tablausuarios.getColumnModel().getColumn(3).setMaxWidth(260);
        tablausuarios.getColumnModel().getColumn(3).setMinWidth(25);
        tablausuarios.getColumnModel().getColumn(4).setWidth(25);
        tablausuarios.getColumnModel().getColumn(4).setMaxWidth(100);
        tablausuarios.getColumnModel().getColumn(4).setMinWidth(25);
        tablausuarios.getColumnModel().getColumn(5).setWidth(25);
        tablausuarios.getColumnModel().getColumn(5).setMaxWidth(60);
        tablausuarios.getColumnModel().getColumn(5).setMinWidth(25);
        tablausuarios.getColumnModel().getColumn(6).setWidth(25);
        tablausuarios.getColumnModel().getColumn(6).setMaxWidth(110);
        tablausuarios.getColumnModel().getColumn(6).setMinWidth(25);
        //MODIFICAMOS LOS TÍTULOS DE LAS COLUMNAS
        JTableHeader th;
        th=tablausuarios.getTableHeader();
        Font fuente=new Font("Tahoma",Font.BOLD,12);
        th.setFont(fuente);
    }
    /**
     * MÉTODO PARA LIMPIAR LOS DATOS EN LA TABLA
     * @param tabla que contiene un JTable que se Limpiara
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void LimpiarTabla(JTable tabla){
        //RECORREMOS TODAS LAS FILAS
        while(tabla.getRowCount()>0){
            //Y AQUÍ LAS REMOVEMOS
            ((DefaultTableModel)tabla.getModel()).removeRow(0);}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppreguntas = new javax.swing.JPanel();
        lblimagen = new javax.swing.JLabel();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();
        rbbusquedaiden = new javax.swing.JRadioButton();
        rbbusquedausu = new javax.swing.JRadioButton();
        rbbusquedaperfil = new javax.swing.JRadioButton();
        rbbusquedaesta = new javax.swing.JRadioButton();
        txtusuario = new javax.swing.JTextField();
        txtperfil = new javax.swing.JTextField();
        cbactivo = new javax.swing.JCheckBox();
        cbinactivo = new javax.swing.JCheckBox();
        btnlimpiar = new org.edisoncor.gui.button.ButtonTask();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ppreguntas.setBackground(new java.awt.Color(255, 255, 255));
        ppreguntas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta4_opt.png"))); // NOI18N
        ppreguntas.add(lblimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 11, -1, 127));

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
        ppreguntas.add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 11, 160, 50));

        rbbusquedaiden.setBackground(new java.awt.Color(255, 255, 255));
        rbbusquedaiden.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbusquedaiden.setText("Busqueda por Identificación");
        rbbusquedaiden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbusquedaidenActionPerformed(evt);
            }
        });
        ppreguntas.add(rbbusquedaiden, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 12, -1, -1));

        rbbusquedausu.setBackground(new java.awt.Color(255, 255, 255));
        rbbusquedausu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbusquedausu.setText("Busqueda por Usuario");
        rbbusquedausu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbusquedausuActionPerformed(evt);
            }
        });
        ppreguntas.add(rbbusquedausu, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 43, -1, -1));

        rbbusquedaperfil.setBackground(new java.awt.Color(255, 255, 255));
        rbbusquedaperfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbusquedaperfil.setText("Busqueda por Perfil");
        rbbusquedaperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbusquedaperfilActionPerformed(evt);
            }
        });
        ppreguntas.add(rbbusquedaperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 75, -1, -1));

        rbbusquedaesta.setBackground(new java.awt.Color(255, 255, 255));
        rbbusquedaesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbbusquedaesta.setText("Busqueda por Estado");
        rbbusquedaesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbbusquedaestaActionPerformed(evt);
            }
        });
        ppreguntas.add(rbbusquedaesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 106, -1, -1));

        txtusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtusuario.setEnabled(false);
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusuarioKeyReleased(evt);
            }
        });
        ppreguntas.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 42, 142, 25));

        txtperfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtperfil.setEnabled(false);
        txtperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtperfilKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtperfilKeyTyped(evt);
            }
        });
        ppreguntas.add(txtperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 74, 142, 25));

        cbactivo.setBackground(new java.awt.Color(255, 255, 255));
        cbactivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbactivo.setText("Activo");
        cbactivo.setEnabled(false);
        cbactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbactivoActionPerformed(evt);
            }
        });
        ppreguntas.add(cbactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 106, -1, 25));

        cbinactivo.setBackground(new java.awt.Color(255, 255, 255));
        cbinactivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbinactivo.setText("Inactivo");
        cbinactivo.setEnabled(false);
        cbinactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbinactivoActionPerformed(evt);
            }
        });
        ppreguntas.add(cbinactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 106, -1, 25));

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
        ppreguntas.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 160, 50));

        tablausuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablausuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Usuario", "Correo", "Pregunta Secreta", "Contraseña", "Estado", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablausuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ppreguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ppreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ACCIÓN DEL BOTÓN REGRESAR
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        Usuarios u=new Usuarios();
        u.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed
    //ACCIÓN DEL RADIOBUTTON BUSQUEDA POR IDENTIFICACIÓN
    private void rbbusquedaidenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbusquedaidenActionPerformed
        rbbusquedausu.setSelected(false);
        rbbusquedaperfil.setSelected(false);
        rbbusquedaesta.setSelected(false);
        txtusuario.setEnabled(false);
        txtusuario.setText("");
        txtperfil.setEnabled(false);
        txtperfil.setText("");
        cbactivo.setEnabled(false);
        cbactivo.setSelected(false);
        cbinactivo.setEnabled(false);
        cbinactivo.setSelected(false);
        String Respuesta=(String)JOptionPane.showInputDialog(null,"Ingrese la Identificación","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null);
        if(Respuesta==null){
            Iniciar();
            rbbusquedaiden.setSelected(false);
            btnregresar.requestFocus();}
        else{
            if(!EsNumero(Respuesta)){
                JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar.\nEl Dato debe ser un número de Identificación.","Error",JOptionPane.ERROR_MESSAGE,error);
                Iniciar();
                rbbusquedaiden.setSelected(false);
                btnregresar.requestFocus();}
            else{
                long identificacion=Long.parseLong(Respuesta);
                //CREAMOS UN OBJETO DE LA CLASE USUARIOS
                ClaseUsuarios cu=new ClaseUsuarios();
                ResultSet rs=cu.BuscarUsuario(identificacion);
                try{
                    if(rs.next()){
                        //LIMPIAMOS LA TABLA
                        LimpiarTabla(tablausuarios);
                        DefaultTableModel modelo=(DefaultTableModel)tablausuarios.getModel();
                        //LLAMAMOS EL MÉTODO
                        cu.BusquedaIdentificacion(modelo,identificacion);}
                    else{
                        JOptionPane.showMessageDialog(null,"La Identificación buscada no existe","Información",JOptionPane.INFORMATION_MESSAGE,informacion);
                        Iniciar();
                        Limpiar();
                        btnregresar.requestFocus();}}
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
    }//GEN-LAST:event_rbbusquedaidenActionPerformed
    //ACCIÓN DEL RADIOBUTTON BUSQUEDA POR USUARIO
    private void rbbusquedausuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbusquedausuActionPerformed
        rbbusquedaiden.setSelected(false);
        rbbusquedaperfil.setSelected(false);
        rbbusquedaesta.setSelected(false);
        txtusuario.setEnabled(true);
        txtusuario.requestFocus();
        txtperfil.setEnabled(false);
        txtperfil.setText("");
        cbactivo.setEnabled(false);
        cbactivo.setSelected(false);
        cbinactivo.setEnabled(false);
        cbinactivo.setSelected(false);
    }//GEN-LAST:event_rbbusquedausuActionPerformed
    //ACCIÓN DEL RADIOBUTTON BUSQUEDA POR PERFIL
    private void rbbusquedaperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbusquedaperfilActionPerformed
        rbbusquedaiden.setSelected(false);
        rbbusquedausu.setSelected(false);
        rbbusquedaesta.setSelected(false);
        txtperfil.setEnabled(true);
        txtperfil.requestFocus();
        txtusuario.setEnabled(false);
        txtusuario.setText("");
        cbactivo.setEnabled(false);
        cbactivo.setSelected(false);
        cbinactivo.setEnabled(false);
        cbinactivo.setSelected(false);
    }//GEN-LAST:event_rbbusquedaperfilActionPerformed
    //ACCIÓN DEL RADIOBUTTON BUSQUEDA POR ESTADO
    private void rbbusquedaestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbbusquedaestaActionPerformed
        rbbusquedaiden.setSelected(false);
        rbbusquedausu.setSelected(false);
        rbbusquedaperfil.setSelected(false);
        cbactivo.setEnabled(true);
        cbinactivo.setEnabled(true);
        txtusuario.setEnabled(false);
        txtusuario.setText("");
        txtperfil.setEnabled(false);
        txtperfil.setText("");
        cbactivo.setSelected(false);
        cbinactivo.setSelected(false);
        LimpiarTabla(tablausuarios);
    }//GEN-LAST:event_rbbusquedaestaActionPerformed
    //ACCIÓN DEL CHECKBOX ACTIVO
    private void cbactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbactivoActionPerformed
        rbbusquedaesta.setSelected(false);
        cbinactivo.setEnabled(false);
        cbinactivo.setSelected(false);
        //CREAMOS UN OBJETO DE LA CLASE USUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        //LIMPIAMOS LA TABLA
        LimpiarTabla(tablausuarios);
        DefaultTableModel modelo=(DefaultTableModel)tablausuarios.getModel();
        //LLAMAMOS EL MÉTODO
        cu.BusquedaEstado(modelo,cbactivo.getText());
    }//GEN-LAST:event_cbactivoActionPerformed
    //ACCIÓN DEL CHECKBOX INACTIVO
    private void cbinactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbinactivoActionPerformed
        rbbusquedaesta.setSelected(false);
        cbactivo.setEnabled(false);
        cbactivo.setSelected(false);
        //CREAMOS UN OBJETO DE LA CLASE USUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        //LIMPIAMOS LA TABLA
        LimpiarTabla(tablausuarios);
        DefaultTableModel modelo=(DefaultTableModel)tablausuarios.getModel();
        //LLAMAMOS EL MÉTODO
        cu.BusquedaEstado(modelo,cbinactivo.getText());
    }//GEN-LAST:event_cbinactivoActionPerformed
    //ACCIÓN DEL BOTÓN LIMPIAR
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
        Iniciar();
    }//GEN-LAST:event_btnlimpiarActionPerformed
    //ACCIÓN DEL JTEXTFIELD USUARIO
    private void txtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyPressed
        //CREAMOS UN OBJETO DE LA CLASE USUARIOS
        ClaseUsuarios cu=new ClaseUsuarios();
        //LIMPIAMOS LA TABLA
        LimpiarTabla(tablausuarios);
        DefaultTableModel modelo=(DefaultTableModel)tablausuarios.getModel();
        //LLAMAMOS EL MÉTODO
        cu.BusquedaUsuario(modelo,txtusuario.getText());
    }//GEN-LAST:event_txtusuarioKeyPressed
    //CONVERTIR A MINÚSCULAS
    private void txtusuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyReleased
        Minusculas(txtusuario);
    }//GEN-LAST:event_txtusuarioKeyReleased
    //ACCIÓN DEL JTEXTFIELD PERFIL
    private void txtperfilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtperfilKeyPressed
        //CREAMOS UN OBJETO DE LA CLASE PERFILES
        ClasePerfiles cp=new ClasePerfiles();
        ResultSet rs=cp.Buscar(txtperfil.getText());
        try{
            if(rs.next()){
                int codigo=Integer.parseInt(rs.getString(1));
                //CREAMOS UN OBJETO DE LA CLASE USUARIOS
                ClaseUsuarios cu=new ClaseUsuarios();
                //LIMPIAMOS LA TABLA
                LimpiarTabla(tablausuarios);
                DefaultTableModel modelo=(DefaultTableModel)tablausuarios.getModel();
                //LLAMAMOS EL MÉTODO
                cu.BusquedaPerfil(modelo,codigo);}}
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
    }//GEN-LAST:event_txtperfilKeyPressed
    //LIMITACIÓN
    private void txtperfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtperfilKeyTyped
        if(txtperfil.getText().length()==25){
            evt.consume();}
        //MÉTODO PARA PONER MAYÚSCULA INICIAL
        JTextField txtdescrip=(JTextField)evt.getComponent();
        String texto=txtdescrip.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtperfil.setText(texto);}
    }//GEN-LAST:event_txtperfilKeyTyped
    /**
     * MÉTODO QUE VALIDA SI RESPUESTA ES UN NÚMERO
     * @param Respuesta que contiene un String que sera evaluado
     * @return un dato tipo Booleano
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private static boolean EsNumero(String Respuesta){
        try{
            Integer.parseInt(Respuesta);
            return true;}
        catch (NumberFormatException e){
           return false;}
    }
   /**
    * MÉTODO QUE VALIDA LETRAS
    * @param a que contiene un JTextField
    * @author Robinson Gallego Alzate
    * @version 1.1
    */
    private void Letras(final JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent KE){
                char c=KE.getKeyChar();
                if(Character.isDigit(c)){//AQUÍ ESTOY COMPARANDO SI ES UN NÚMERO
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();}}});//ANULA EVENTOS DEL TECLADO
    }
    /**
     * MÉTODO PARA CONVERTIR MAYÚSCULAS A MINÚSCULAS
     * @param txt que contiene un JTextField
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void Minusculas(javax.swing.JTextField txt){
        String texto=(txt.getText().toLowerCase());
        txt.setText(texto);
    }
    /**
     * MÉTODO LIMPIAR
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void Limpiar(){
        rbbusquedaiden.setSelected(false);
        rbbusquedausu.setSelected(false);
        rbbusquedaperfil.setSelected(false);
        rbbusquedaesta.setSelected(false);
        txtusuario.setEnabled(false);
        txtusuario.setText("");
        txtperfil.setEnabled(false);
        txtperfil.setText("");
        cbactivo.setEnabled(false);
        cbactivo.setSelected(false);
        cbinactivo.setEnabled(false);
        cbinactivo.setSelected(false);
    }
    /**
     * MÉTODO PRINCIPAL MAIN
     * @param args
     * @author Robinson Gallego Alzate
     * @version 1.1
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
            java.util.logging.Logger.getLogger(TablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new TablaUsuarios().setVisible(true);}});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnlimpiar;
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JCheckBox cbactivo;
    private javax.swing.JCheckBox cbinactivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JPanel ppreguntas;
    private javax.swing.JRadioButton rbbusquedaesta;
    private javax.swing.JRadioButton rbbusquedaiden;
    private javax.swing.JRadioButton rbbusquedaperfil;
    private javax.swing.JRadioButton rbbusquedausu;
    private javax.swing.JTable tablausuarios;
    private javax.swing.JTextField txtperfil;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
