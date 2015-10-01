package Formularios;
/**
 * LIBRERÍAS IMPORTADAS
 * @author Robinson Gallego Alzate
 * @version 1.1
 */
import Clases.ClasePerfiles;
import Tablas.TablaPerfiles;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Perfiles extends javax.swing.JFrame{
    //IMAGENES DE LOS MENSAJES
    Icon warning=new ImageIcon(getClass().getResource("/Imagenes/warning_opt.png"));
    Icon informacion=new ImageIcon(getClass().getResource("/Imagenes/informacion_opt.png"));
    Icon pregunta=new ImageIcon(getClass().getResource("/Imagenes/pregunta_opt.png"));
    Icon error=new ImageIcon(getClass().getResource("/Imagenes/error2.png"));
    /**
     * CONSTRUCTOR Perfiles
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public Perfiles(){
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Perfiles Your Hospital");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/favicon2.png")).getImage());//PONER IMAGEN ICONO
        txtdescripcion.requestFocus();
        //VALIDACIONES LETRAS
        Letras(txtdescripcion);}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pperfiles = new javax.swing.JPanel();
        lblcodigo = new javax.swing.JLabel();
        lbldescripcion = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        btnguardar = new org.edisoncor.gui.button.ButtonTask();
        btnconsultar = new org.edisoncor.gui.button.ButtonTask();
        btnmodificar = new org.edisoncor.gui.button.ButtonTask();
        btnlistar = new org.edisoncor.gui.button.ButtonTask();
        btnregresar = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pperfiles.setBackground(new java.awt.Color(255, 255, 255));
        pperfiles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Perfiles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblcodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcodigo.setText("Código Perfil");

        lbldescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldescripcion.setText("Descripción Perfil");

        txtdescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });

        txtcodigo.setEditable(false);
        txtcodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtcodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout pperfilesLayout = new javax.swing.GroupLayout(pperfiles);
        pperfiles.setLayout(pperfilesLayout);
        pperfilesLayout.setHorizontalGroup(
            pperfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pperfilesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pperfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldescripcion)
                    .addComponent(lblcodigo))
                .addGap(18, 18, 18)
                .addGroup(pperfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pperfilesLayout.setVerticalGroup(
            pperfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pperfilesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pperfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigo)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pperfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldescripcion)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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
        btnguardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnguardarKeyTyped(evt);
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
        btnconsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnconsultarKeyTyped(evt);
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
        btnmodificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnmodificarKeyTyped(evt);
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
        btnlistar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnlistarKeyTyped(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pperfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pperfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //LIMITACIONES Y TRANSFERENCIA DE FOCUS
    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
        if(txtdescripcion.getText().length()==25){
            evt.consume();}
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtdescripcion){
            if(Contador==10){
                btnguardar.requestFocus();}}
        /**
         * MÉTODO PARA PONER MAYÚSCULA INICIAL
         * @author Robinson Gallego Alzate
         * @version 1.1
         */
        JTextField txtdescrip=(JTextField)evt.getComponent();
        String texto=txtdescrip.getText();
        if(texto.length()>0){
            char primera=texto.charAt(0);
            texto=Character.toUpperCase(primera)+texto.toLowerCase().substring(1,texto.length());
            txtdescripcion.setText(texto);}
    }//GEN-LAST:event_txtdescripcionKeyTyped
    //ACCIÓN DEL BOTÓN GUARDAR CON CLIC
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Guardar();
    }//GEN-LAST:event_btnguardarActionPerformed
    //ACCIÓN DEL BOTÓN CONSULTAR CON CLIC
    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        Consultar();
    }//GEN-LAST:event_btnconsultarActionPerformed
    //ACCIÓN DEL BOTÓN MODIFICAR CON CLIC
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        Modificar();
    }//GEN-LAST:event_btnmodificarActionPerformed
    //ACCIÓN DEL BOTÓN REGRESAR CON CLIC
    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        Menu menu=new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed
    //ACCIÓN DEL BOTÓN LISTAR CON CLIC
    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        this.dispose();
        Tablas.TablaPerfiles tp=new TablaPerfiles();
        tp.setVisible(true);
    }//GEN-LAST:event_btnlistarActionPerformed
    //ACCIÓN DEL BOTÓN GUARDAR CON TECLADO
    private void btnguardarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnguardarKeyTyped
        Guardar();
    }//GEN-LAST:event_btnguardarKeyTyped
    //ACCIÓN DEL BOTÓN CONSULTAR CON TECLADO
    private void btnconsultarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnconsultarKeyTyped
        Consultar();
    }//GEN-LAST:event_btnconsultarKeyTyped
    //ACCIÓN DEL BOTÓN MODIFICAR CON TECLADO
    private void btnmodificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnmodificarKeyTyped
        Modificar();
    }//GEN-LAST:event_btnmodificarKeyTyped
    //ACCIÓN DEL BOTÓN LISTAR CON TECLADO
    private void btnlistarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnlistarKeyTyped
        this.dispose();
        Tablas.TablaPerfiles tp=new TablaPerfiles();
        tp.setVisible(true);
    }//GEN-LAST:event_btnlistarKeyTyped
    //ACCIÓN DEL BOTÓN REGRESAR CON TECLADO
    private void btnregresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnregresarKeyTyped
        this.dispose();
        Menu menu=new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnregresarKeyTyped
    /**
     * MÉTODO PARA GUARDAR
     */
    private void Guardar(){
        if(txtdescripcion.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe ingresar la Descripción","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtdescripcion.requestFocus();}
        else if(String.valueOf(txtdescripcion.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(null,"La Descripción no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
            txtdescripcion.requestFocus();
            txtdescripcion.setText("");}
        else{
            try{
                int Respuesta=JOptionPane.showConfirmDialog(null,"Desea Guardar la Información?","Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,pregunta);
                    if(Respuesta==JOptionPane.YES_OPTION){
                        //CREAMOS UN OBJETO DE LA CLASE PERFILES
                        ClasePerfiles cp=new ClasePerfiles();
                        //CAPTURAMOS LOS DATOS
                        String descripcion=txtdescripcion.getText();
                        cp.GuardarPerfil(descripcion);
                        JOptionPane.showMessageDialog(null,"Registro guardado con Exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
                        Limpiar();}}
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error al grabar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}}}
    /**
     * MÉTODO PARA CONSULTAR
     */
    private void Consultar(){
        switch(btnconsultar.getText()){
            case "Consultar":
                String respuesta=((String)JOptionPane.showInputDialog(null,"Ingrese el código que desea Consultar","Consultar",JOptionPane.QUESTION_MESSAGE,pregunta,null,null));
                if(respuesta==null){}
                else if(!EsNumero(respuesta)){
                    JOptionPane.showMessageDialog(null,"Error en el Dato a Consultar.\nEl Dato debe ser un dato numérico.","Error",JOptionPane.ERROR_MESSAGE,error);}
                else{
                    int codigo=Integer.parseInt(respuesta);
                    //CREAMOS UN OBJETO DE LA CLASE PERFILES
                    ClasePerfiles cp=new ClasePerfiles();
                    ResultSet rs=cp.Buscar(codigo);
                    try{
                        if(rs.next()){
                            //ACTIVAMOS LOS BOTONES QUE ESTÁN INACTIVOS
                            btnguardar.setEnabled(false);
                            btnmodificar.setEnabled(true);
                            //DESACTIVAMOS LOS CAMPOS DE ESCRITURA
                            Inhabilitar();
                            //CAPTURAMOS LA INFORMACIÓN EN LAS CAJAS
                            txtcodigo.setText(rs.getString(1));
                            txtdescripcion.setText(rs.getString(2));
                            btnconsultar.setText("Limpiar");
                            btnconsultar.setDescription("Clean");
                            btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));}
                        else{
                            Limpiar();
                            Habilitar();
                            JOptionPane.showMessageDialog(null,"El dato buscado no existe","Información",JOptionPane.INFORMATION_MESSAGE,informacion);}}
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null,"Error al buscar los datos: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE,error);}
                break;}
            case "Limpiar":
                Limpiar();
                Habilitar();
                btnconsultar.setText("Consultar");
                btnconsultar.setDescription("Consult");
                btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
                btnguardar.setEnabled(true);
                btnmodificar.setEnabled(false);
                btnmodificar.setText("Modificar");
                btnmodificar.setDescription("Edit");
                btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png")));
                break;}}
    /**
     * MÉTODO PARA MODIFICAR
     */
    private void Modificar(){
        //HABILITAMOS EL CAMPO QUE SE MODIFICARA
        txtdescripcion.setEnabled(true);
        txtdescripcion.requestFocus();
        //DESACTIVAMOS LOS BOTONES
        btnguardar.setEnabled(false);
        btnconsultar.setText("Limpiar");
        btnconsultar.setDescription("Clean");
        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar_opt.png")));
        if(btnmodificar.getText().equals("Modificar")){
            btnmodificar.setText("Actualizar");
            btnmodificar.setDescription("Update");
            btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar2_opt.png")));}
        else{
            if(txtdescripcion.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Debe ingresar la Descripción","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtdescripcion.requestFocus();}
            else if(String.valueOf(txtdescripcion.getText().charAt(0)).equals(" ")){
                JOptionPane.showMessageDialog(null,"La Descripción no puede iniciar con espacio en blanco","Verificar",JOptionPane.WARNING_MESSAGE,warning);
                txtdescripcion.requestFocus();
                txtdescripcion.setText("");}
            else{
                //CREAMOS UN OBJETO DE LA CLASEPERFILES
                ClasePerfiles cp=new ClasePerfiles();
                //CAPTURAMOS LOS DATOS
                int codigo=Integer.parseInt(txtcodigo.getText());
                String descripcion=txtdescripcion.getText();
                cp.Actualizar(codigo,descripcion);
                Limpiar();
                JOptionPane.showMessageDialog(null,"Registro Actualizado con Exito","Confirmación",JOptionPane.INFORMATION_MESSAGE,informacion);
                btnconsultar.setText("Consultar");
                btnconsultar.setDescription("Consult");
                btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar_opt.png")));
                btnguardar.setEnabled(true);
                btnmodificar.setEnabled(false);
                btnmodificar.setText("Modificar");
                btnmodificar.setDescription("Edit");
                btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar3_opt.png")));
                btnmodificar.setEnabled(false);
                Habilitar();}}}
    /**
     * MÉTODO QUE VALIDA LETRAS
     * @param a que contiene un JTextField
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private void Letras(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent KE){
                char c=KE.getKeyChar();
                if(!Character.isLetter(c)&&c!=' '){//AQUÍ ESTOY COMPARANDO SI ES UNA LETRA O ESPACIO EN BLANCO
                    KE.consume();}}});}//ANULA EVENTOS DEL TECLADO   
    /**
     * MÉTODO QUE VALIDA SI RESPUESTA ES UN NÚMERO
     * @param Respuesta que contiene un String de sera evaluado
     * @return un dato de tipo Booleano
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    private static boolean EsNumero(String Respuesta){
        try{
            Integer.parseInt(Respuesta);
            return true;}
        catch(NumberFormatException e){
           return false;}}
    /**
     * MÉTODO PARA LIMPIAR TODO
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void Limpiar(){
        txtcodigo.setText("");
        txtdescripcion.setText("");
        txtdescripcion.requestFocus();}
    /**
     * MÉTODO PARA INHABILITAR CAMPOS
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void Inhabilitar(){
        txtcodigo.setEnabled(false);
        txtdescripcion.setEnabled(false);}
    /**
     * MÉTODO PARA HABILITAR CAMPOS
     * @author Robinson Gallego Alzate
     * @version 1.1
     */
    public void Habilitar(){
        txtcodigo.setEnabled(true);
        txtdescripcion.setEnabled(true);
        txtdescripcion.requestFocus();}
    /**
     * MÉTODO PRINCIPAL MAIN 
     * @param args que contiene un String de arreglos
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
            java.util.logging.Logger.getLogger(Perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Perfiles().setVisible(true);}});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btnconsultar;
    private org.edisoncor.gui.button.ButtonTask btnguardar;
    private org.edisoncor.gui.button.ButtonTask btnlistar;
    private org.edisoncor.gui.button.ButtonTask btnmodificar;
    private org.edisoncor.gui.button.ButtonTask btnregresar;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lbldescripcion;
    private javax.swing.JPanel pperfiles;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
