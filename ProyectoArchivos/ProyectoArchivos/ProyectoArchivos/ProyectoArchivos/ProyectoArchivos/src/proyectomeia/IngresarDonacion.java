/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class IngresarDonacion extends javax.swing.JFrame {

    /**
     * Creates new form IngresarDonacion
     */
    public IngresarDonacion() {
        initComponents();
        String linealeida1="";
        ArrayList<String> Opciones = new ArrayList<String>();
        try { //Se busca al usuario ingresado en el archivo de texto
                FileReader BitacoraMateriales = new FileReader("C:/MEIA/Materiales/bitacora_Material.txt");
                BufferedReader MaterialesBitacora = new BufferedReader(BitacoraMateriales);
                while (((linealeida1 = MaterialesBitacora.readLine()) != null)) 
                {   
                    String [] ExtraerMaterial = linealeida1.split("\\|");
                    Opciones.add(ExtraerMaterial[0]);
                }
                MaterialesBitacora.close();
                BitacoraMateriales.close();
                FileReader Materiales = new FileReader("C:/MEIA/Materiales/Material.txt");
                BufferedReader Materialestxt = new BufferedReader(Materiales);
                while (((linealeida1 = Materialestxt.readLine()) != null)) 
                {   
                    String [] ExtraerMaterial = linealeida1.split("\\|");
                    Opciones.add(ExtraerMaterial[0]);
                }
                Materialestxt.close();
                Materiales.close();
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        for(String mat : Opciones)
        {
            this.jcMateriales.addItem(mat);
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

        tfDescripcion = new javax.swing.JTextField();
        jcMateriales = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tfPeso = new javax.swing.JTextField();
        btDonar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        taEvento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcMateriales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Peso:");

        tfPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btDonar.setText("Donar");
        btDonar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDonarMouseClicked(evt);
            }
        });
        btDonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDonarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Ingresa tus Donaciones");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Lista de Materiales:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Descripción:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Evento:");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectomeia/green file.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcMateriales, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPeso)
                            .addComponent(tfDescripcion)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(taEvento)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btDonar, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btDonar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDonarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDonarMouseClicked
        String Material = String.valueOf(jcMateriales.getSelectedItem());
        String Descripcion = tfDescripcion.getText();
        String Peso = tfPeso.getText();
        String Evento = taEvento.getText();
        Month mes = LocalDate.now().getMonth();
        Calendar fecha = new GregorianCalendar();
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        Date fdate = new Date();
        String FechaBack = dia +"/"+ mes+"/2019";
        HacerNuevaDonacion(ProyectoMEIA.usuarioEnUso.getUsuario(),Material,FechaBack,Peso,Descripcion,Evento,ProyectoMEIA.usuarioEnUso.getUsuario(),FechaBack);
        JOptionPane.showMessageDialog(null,"Donacion Ingresada" + String.valueOf(jcMateriales.getSelectedItem()));
        
        //ActualizarDescriptores();
    }//GEN-LAST:event_btDonarMouseClicked

    private void btDonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDonarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDonarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          OpcionesAdministrador registro = new OpcionesAdministrador();
                        registro.setVisible(true);
                        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    public void HacerNuevaDonacion(String usuario,String material,String fecha,String Peso, String descripcion, String evento, String usuariologueado, String fechaActual)
    {
        String nuevoRgistroDonacion = usuario +"|"+ material+"|"+fecha+"|"+ Peso +"|"+ descripcion +"|"+evento+"|"+usuariologueado+"|"+fechaActual+"|"+1;
        String llave = usuario +","+ material+","+fecha;
        if (!Encontrado(usuario, material, fecha)) 
        {
            String direccion = InsertarIndexadoMaster(nuevoRgistroDonacion, 3);
            InsertarIndexadoIndex(llave, direccion);
            ActualizarDescriptores();
            ActualizarDescriptorIndexDonacion();
        }
    }
    
    
    public boolean Encontrado(String usuario, String material, String fecha)
    {
        boolean resultado = false;
        boolean usuarioencontrado = false;
        boolean materialencontrado = false;
        boolean fechaencontrada = false;
        ArrayList<String> lista = new ArrayList<>();
        String ruta = "C:\\MEIA\\Donaciones\\DonacionIndex.txt";
        String linea = "";
        File f = new File(ruta);
        try{
            if (!f.exists()) {
                f.createNewFile();
            }
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            linea = br.readLine();
            while(linea!=null){
                lista.add(linea);
                linea = br.readLine();
            }
            for(String x : lista)
            {
                if(x.contains(usuario)){
                    usuarioencontrado = true;
                }
            }
            if (usuarioencontrado) {
                for(String x : lista)
                {
                    if(x.contains(usuario+","+material)){
                        materialencontrado = true;
                    }
                }
            }
            if (materialencontrado){
                for(String x : lista)
                {
                    if(x.contains(usuario+","+material+","+fecha)){
                        fechaencontrada = true;
                    }
                }
            }
            if (fechaencontrada){
                resultado = true;
            }
        }catch(IOException ex){
            Logger.getLogger(IngresarDonacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  resultado;
    }
    
    public String InsertarIndexadoMaster(String LineaInsertar,int MaxLineas)
    {
        boolean Escrito = false;
        int Bloque = 1;
        int IndiceLinea = 1;
        String ext = ".txt";
        String inicio = "C:\\MEIA\\Donaciones\\Donacion_";
        String ruta = inicio + Bloque + ext;
        String linea = "";
        String direccion = "";
        ArrayList<String> lista = new ArrayList<>();
        try {
        while (!Escrito) {
            File f = new File(ruta);
            if (!f.exists()) {
                f.createNewFile();
            }
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            linea = br.readLine();
            while (linea!=null) {
                lista.add(linea);
                IndiceLinea++;
                linea = br.readLine();
            }
            fr.close();
            br.close();
            if (IndiceLinea<=MaxLineas) {
                f.delete();
                f.createNewFile();
                FileWriter fw = new FileWriter(ruta);
                BufferedWriter bw = new BufferedWriter(fw);
                for (String x :lista) {
                    bw.write(x);
                    bw.newLine();
                }
                bw.write(LineaInsertar);
                //fw.close();
                bw.close();
                Escrito = true;
                direccion = Bloque+"."+IndiceLinea;
            }else{
                IndiceLinea = 1;
                lista = new ArrayList<>();
            }
            Bloque++;
            ruta = inicio + Bloque + ext;
        }
        } catch (IOException ex) {
            Logger.getLogger(IngresarDonacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (direccion);
    }
    
    public void InsertarIndexadoIndex(String llave, String direccion)
    {
        ArrayList<String> lista = new ArrayList<>();
        String ruta = "C:\\MEIA\\Donaciones\\DonacionIndex.txt";
        String linea = "";
        File f = new File(ruta);
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            linea = br.readLine();
            while(linea!=null){
                lista.add(linea);
                linea = br.readLine();
            }
            fr.close();
            br.close();
            f.delete();
            f.createNewFile();
            FileWriter fw = new FileWriter(ruta);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String x :lista) {
                    bw.write(x);
                    bw.newLine();
                }
                bw.write(llave+","+direccion);
            //fw.close();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(IngresarDonacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ActualizarDescriptores()
    {
        int Bloque = 1;
        int registros = 0;
        String inicioDesc = "C:\\MEIA\\Donaciones\\DonacionDescriptor_";
        String inicioFile = "C:\\MEIA\\Donaciones\\Donacion_";
        String ext = ".txt";
        String rutaDesc = inicioDesc+Bloque+ext;
        String rutaFile = inicioFile+Bloque+ext;
        File fD = new File(rutaDesc);
        File fF = new File(rutaFile);
        FileReader filefr = null;
        BufferedReader filebr = null;
        FileWriter descfw = null;
        BufferedWriter descbw = null;
        String lineaFile = "";
        String adminuser = "";
        while(fF.exists()){
            try {
                filefr = new FileReader(rutaFile);
                filebr = new BufferedReader(filefr);
                lineaFile = filebr.readLine();
                while(lineaFile!=null){
                    registros++;
                    lineaFile = filebr.readLine();
                }
                filefr.close();
                filebr.close();
                if (fD.exists()) {
                    fD.delete();
                }
                fD.createNewFile();
                descfw = new FileWriter(rutaDesc);
                descbw = new BufferedWriter(descfw);
                String nombreArchivo = "Nombre del archivo:Donacion_"+Bloque+ext;
                String usuarioCreador = "Usuario creador:";
                File usuarios = new File("C:\\MEIA\\usuario.txt");
                if (usuarios.exists()) {
                    FileReader usuariofr = new FileReader(usuarios);
                    BufferedReader usuariosbr = new BufferedReader(usuariofr);
                    String tempUser = usuariosbr.readLine();
                    if (tempUser!=null){
                        usuarioCreador += tempUser.split("\\|")[0];
                    }else{
                        File bitacora = new File("C:\\MEIA\\bitacora_usuario.txt");
                        if (bitacora.exists()){
                            FileReader bitacorafr = new FileReader(bitacora);
                            BufferedReader bitacorabr = new BufferedReader(bitacorafr);
                            tempUser = bitacorabr.readLine();
                            if (tempUser!=null){
                            usuarioCreador += tempUser.split("\\|")[0];
                            }
                            bitacorabr.close();
                        }
                    }
                    usuariofr.close();
                    usuariosbr.close();
                }
                Date fdate = new Date();
                String fecha = "Fecha de creacion:"+ fdate.getDay() +"/"+ fdate.getMonth() +"/2019";
                String cantidadregistros = "Cantidad de registros:" + registros;
                String cantidadregistrosactivos = "Cantidad de registros activos:" + registros;
                String cantidadregistrosinactivos = "Cantidad de registros inactivos:" + 0;
                String maxporbloquedato = "Maximos por bloque:" + 3;
                descbw.write(nombreArchivo);
                descbw.newLine();
                descbw.write(usuarioCreador);
                descbw.newLine();
                descbw.write(fecha);
                descbw.newLine();
                descbw.write(cantidadregistros);
                descbw.newLine();
                descbw.write(cantidadregistrosactivos);
                descbw.newLine();
                descbw.write(cantidadregistrosinactivos);
                descbw.newLine();
                descbw.write(maxporbloquedato);
                descbw.newLine();
                //descfw.close();
                descbw.close();
            } catch (IOException ex) {
                Logger.getLogger(IngresarDonacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            Bloque++;
            registros = 0;
            rutaDesc = inicioDesc+Bloque+ext;
            rutaFile = inicioFile+Bloque+ext;
            fD = new File(rutaDesc);
            fF = new File(rutaFile);
        }
    }
    
    public void ActualizarDescriptorIndexDonacion()
    {
        File index = new File("C:\\MEIA\\Donaciones\\DonacionIndex.txt");
        File desci = new File("C:\\MEIA\\Donaciones\\DonacionIndexDesc.txt");
        if (index.exists()){
            try {
                if (desci.exists()){
                    desci.delete();
                }
                desci.createNewFile();
                FileWriter descifw = new FileWriter(desci);
                BufferedWriter descibw = new BufferedWriter(descifw);
                String usuarioCreador = "Usuario creador:";
                File usuarios = new File("C:\\MEIA\\usuario.txt");
                if (usuarios.exists()) {
                    FileReader usuariofr = new FileReader(usuarios);
                    BufferedReader usuariosbr = new BufferedReader(usuariofr);
                    String tempUser = usuariosbr.readLine();
                    if (tempUser!=null){
                        usuarioCreador += tempUser.split("\\|")[0];
                    }else{
                        File bitacora = new File("C:\\MEIA\\bitacora_usuario.txt");
                        if (bitacora.exists()){
                            FileReader bitacorafr = new FileReader(bitacora);
                            BufferedReader bitacorabr = new BufferedReader(bitacorafr);
                            tempUser = bitacorabr.readLine();
                            if (tempUser!=null){
                            usuarioCreador += tempUser.split("\\|")[0];
                            }
                            bitacorabr.close();
                        }
                    }
                    usuariofr.close();
                    usuariosbr.close();
                }
                FileReader indexfr = new FileReader(index);
                BufferedReader indexbr = new BufferedReader(indexfr);
                String temp = indexbr.readLine();
                int registros = 0;
                while (temp!=null){
                    registros++;
                    temp = indexbr.readLine();
                }
                indexfr.close();
                indexbr.close();
                Date fdate = new Date();
                descibw.write("Nombre del Archivo:DonacionIndex.txt");
                descibw.newLine();
                descibw.write(usuarioCreador);
                descibw.newLine();
                descibw.write("Fecha creacion:" + fdate.getDay() + "/" + fdate.getMonth() + "/2019");
                descibw.newLine();
                descibw.write("Total registros:" + registros);
                descibw.newLine();
                descibw.write("Registros activos:" + registros);
                descibw.newLine();
                descibw.write("Registros inactivos:" + 0);
                descibw.newLine();
                descibw.close();
            } catch (IOException ex) {
                Logger.getLogger(IngresarDonacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
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
            java.util.logging.Logger.getLogger(IngresarDonacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarDonacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarDonacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarDonacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarDonacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDonar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jcMateriales;
    private javax.swing.JTextField taEvento;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfPeso;
    // End of variables declaration//GEN-END:variables
}
