
package estetica;

public class cliente extends javax.swing.JFrame {

    ConexionCliente conexion;
  
    
    public cliente() {
        initComponents();
        conexion = new ConexionCliente(this);
        conexion.ejecutarConexion("127.0.0.1", 10000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Edad_cbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Nombre_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Registrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_banadoSecado = new javax.swing.JRadioButton();
        btn_CortePelo = new javax.swing.JRadioButton();
        btn_CorrteGarras = new javax.swing.JRadioButton();
        btn_Limpieza = new javax.swing.JRadioButton();
        btn_Humectacion = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        familia_txt = new javax.swing.JTextField();
        raza_cbox = new javax.swing.JComboBox<>();
        btn_Hongos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Edad");

        Edad_cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adulto", "Cachorro" }));
        Edad_cbox.setToolTipText("");
        Edad_cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edad_cboxActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del perro");

        Nombre_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_txtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel2.setText("Estetica canina MiAlegria");

        jLabel3.setText("Raza");

        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setText("Servicios");

        btn_banadoSecado.setText("Banado y secado");

        btn_CortePelo.setText("Corte de pelo");

        btn_CorrteGarras.setText("Corte de garras");

        btn_Limpieza.setText("Limpieza de ojos y orejas");

        btn_Humectacion.setText("Humectacion de nariz y patas");

        jLabel6.setText("Familia");

        raza_cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrico", "Afgano", "Akita", "Basenji", "Beagle", "Border Collie", "Boxer", "Boyero de berna", "Bull Terrier", "Pug", "Bulldog", "Bulldog Frances", "Shih Tzu", "Salchicha", "Collie de Pelo Largo", "Harrier", "Jindo coreano", "Pastor belga", "Pastor islandés", "Pequeño sabueso azul de Gascuña", "Sabueso", "Pudelpointer", "Pastor alemán" }));

        btn_Hongos.setText("Tratamiento para hongos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_CortePelo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_CorrteGarras, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_banadoSecado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(btn_Limpieza))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Hongos, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Humectacion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Registrar)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nombre_txt)
                    .addComponent(raza_cbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(familia_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(Edad_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(Edad_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(familia_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(raza_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_banadoSecado)
                            .addComponent(btn_Limpieza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_CortePelo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btn_Humectacion)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_CorrteGarras)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Registrar)
                            .addComponent(btn_Hongos))
                        .addGap(47, 47, 47))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Edad_cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edad_cboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Edad_cboxActionPerformed

    private void Nombre_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_txtActionPerformed
        
    }//GEN-LAST:event_Nombre_txtActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
       
         String familia;
         String nombre;
         String raza;
         String edad;

         boolean secado = true;
         boolean lavado = true;
         boolean corte = true;
         boolean unas = true;
         boolean limAreas = true;
         boolean humectacion = true;
         boolean hongos = true;
         
         nombre = Nombre_txt.getText();
         edad = Edad_cbox.getSelectedItem().toString();
         raza = raza_cbox.getSelectedItem().toString();
         familia = familia_txt.getText();
         
         if(btn_banadoSecado.isSelected()){
             lavado = false;
             secado = false;
         }
         
         if(btn_CortePelo.isSelected()){
             corte = false;
         }
         
         if(btn_CorrteGarras.isSelected()){
             unas = false;
         }
        
         if(btn_Limpieza.isSelected()){
             limAreas = false;
         }
         
         if(btn_Humectacion.isSelected()){
             humectacion = false;
         }
         
         if(btn_Hongos.isSelected()){
             hongos = false;
         }
         
         Data data = new Data(familia, nombre, raza, edad, secado, lavado, corte, unas, limAreas, humectacion, hongos);
         conexion.enviar(data);
         
    }//GEN-LAST:event_btn_RegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Edad_cbox;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JRadioButton btn_CorrteGarras;
    private javax.swing.JRadioButton btn_CortePelo;
    private javax.swing.JRadioButton btn_Hongos;
    private javax.swing.JRadioButton btn_Humectacion;
    private javax.swing.JRadioButton btn_Limpieza;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JRadioButton btn_banadoSecado;
    private javax.swing.JTextField familia_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> raza_cbox;
    // End of variables declaration//GEN-END:variables
}
