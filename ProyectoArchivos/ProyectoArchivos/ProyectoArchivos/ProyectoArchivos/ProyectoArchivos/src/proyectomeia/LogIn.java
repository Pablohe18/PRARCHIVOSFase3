/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author garya
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */    
    public LogIn() throws IOException {
        initComponents();
        ProyectoMEIA.usuarioEnUso = null;
        File directorio = new File("C:/MEIA");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
        File directorio2 = new File("C:/MEIA/fotografia");
        if (!directorio2.exists()) {
            if (directorio2.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
        
                File directorio6 = new File("C:/MEIA/Donaciones");
        if (!directorio6.exists()) {
            if (directorio6.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
        
        
        File directorio3 = new File("C:/MEIA/Materiales");
        if (!directorio3.exists()) {
            if (directorio3.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
         File directorio4 = new File("C:/MEIA/Materiales/fotografia");
        if (!directorio4.exists()) {
            if (directorio4.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
        
        File usuario, usuarioMaestro, descriptorBitacora, descriptorMaestro;
        
        usuario = new File("C:/MEIA/bitacora_usuario.txt");
        usuarioMaestro = new File("C:/MEIA/usuario.txt");
        descriptorBitacora = new File("C:/MEIA/desc_usuariobitacora.txt");
        descriptorMaestro = new File("C:/MEIA/desc_usuario.txt");
        
        if(!usuario.exists())usuario.createNewFile();        
        if(!usuarioMaestro.exists())usuarioMaestro.createNewFile();        
        
        if(!descriptorBitacora.exists()){
            descriptorBitacora.createNewFile();
            DescriptorUsuario desc = new DescriptorUsuario("bitacora_usuario.txt"," "," "," "," ",0,0,0,10);
            Escritor.Escribir("C:/MEIA/desc_usuariobitacora.txt", desc.toString());
        }
        
        if(!descriptorMaestro.exists()){
            descriptorMaestro.createNewFile();
            DescriptorUsuario desc = new DescriptorUsuario("usuario.txt"," "," "," "," ",0,0,0,5);
            Escritor.Escribir("C:/MEIA/desc_usuario.txt", desc.toString());
        }
        
        
        //Materiales
        File Material, MaterialMaestro, descriptorBitacora1, descriptorMaestro1;
        
        Material = new File("C:/MEIA/Materiales/bitacora_Material.txt");
        MaterialMaestro = new File("C:/MEIA/Materiales/Material.txt");
        descriptorBitacora1 = new File("C:/MEIA/Materiales/desc_Materialbitacora.txt");
        descriptorMaestro1 = new File("C:/MEIA/Materiales/desc_Material.txt");
        
        if(!Material.exists())usuario.createNewFile();        
        if(!MaterialMaestro.exists())MaterialMaestro.createNewFile();        
        
        if(!descriptorBitacora1.exists()){
            descriptorBitacora1.createNewFile();
            DescriptorMaterial desc = new DescriptorMaterial("C:/MEIA/Materiales/bitacora_Material.txt"," "," "," "," ",0,0,0,10);
            Escritor.Escribir("C:/MEIA/Materiales/desc_Materialbitacora.txt", desc.toString());
        }
        
        if(!descriptorMaestro1.exists()){
            descriptorMaestro1.createNewFile();
            DescriptorMaterial desc = new DescriptorMaterial("C:/MEIA/Materiales/Material.txt"," "," "," "," ",0,0,0,5);
            Escritor.Escribir("C:/MEIA/Materiales/desc_Material.txt", desc.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Titulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        label_Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_Titulo.setText("Inicio de Sesión");

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel3.setText("¿No estas registrado?");

        btnRegistrar.setText("Registrarse");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectomeia/green file.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(label_Titulo)
                                .addGap(51, 51, 51))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(btnSalir))
                                .addComponent(btnRegistrar)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(label_Titulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnIngresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)
                        .addGap(35, 35, 35))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        if(!txtUsuario.getText().isEmpty()){
            if(!txtContraseña.getText().isEmpty()){
                LinkedList<Usuario> lista = OperacionesSecuencial.obtenerUsuarios(1);
                
                if(lista != null){
                    for (int i = 0; i < lista.size(); i++) {
                        if(lista.get(i).getUsuario().equals(txtUsuario.getText()) && lista.get(i).getContraseña().equals(OperacionesSecuencial.getMD5(txtContraseña.getText())) && lista.get(i).getEstatus() != 0){
                            JOptionPane.showMessageDialog(null,lista.get(i).getUsuario() + (lista.get(i).getRol() == 1 ? "Administrador" : "Usuario") + lista.get(i).getPathFoto());
                            ProyectoMEIA.usuarioEnUso = lista.get(i);
                        }
                    }                    
                }    
                else if(lista == null){
                    lista = OperacionesSecuencial.obtenerUsuarios(2);
                    
                    if(lista != null){
                        for (int i = 0; i < lista.size(); i++) {
                            if(lista.get(i).getUsuario().equals(txtUsuario.getText()) && lista.get(i).getContraseña().equals(OperacionesSecuencial.getMD5(txtContraseña.getText())) && lista.get(i).getEstatus() != 0){
                                JOptionPane.showMessageDialog(null,lista.get(i).getUsuario() + (lista.get(i).getRol() == 1 ? "\nAdministrador" : "\nUsuario") + lista.get(i).getPathFoto());
                                ProyectoMEIA.usuarioEnUso = lista.get(i);
                            }
                        }                    
                    }
                }  
                if(ProyectoMEIA.usuarioEnUso == null && lista == null){
                    JOptionPane.showMessageDialog(null,"No existen usuarios en el sistema, debe registrarse");
                }                
                else if(ProyectoMEIA.usuarioEnUso == null){
                    JOptionPane.showMessageDialog(null,"El nombre de usuario y contraseña que ingreso son incorrectos");
                }
                else{
                    if(ProyectoMEIA.usuarioEnUso.getRol()==1){
                        // TODO add your handling code here:
                        OpcionesAdministrador registro = new OpcionesAdministrador();
                        registro.setVisible(true);
                        this.setVisible(false);
                    }
                    else{
                        OpcionesUsuario registro = new OpcionesUsuario();
                        registro.setVisible(true);
                        this.setVisible(false);
                    }                     
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Debe ingresar la contraseña");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe ingresar el usuario");
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
 try {
            // TODO add your handling code here:
            RegistroUsuario registro = new RegistroUsuario(true);
            registro.setVisible(true);
            this.setVisible(false);
        } catch (ParseException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        DescriptorUsuario descBitacora=OperacionesSecuencial.obtenerDescriptorUsuario(2);
        if(descBitacora.getNumRegistros()!=0){
            try {
                OperacionesSecuencial.LlenarUsuariosMaestro();
            } catch (IOException ex) {
                Logger.getLogger(BuscarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.exit(0); 
        setDefaultCloseOperation(LogIn.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LogIn().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}