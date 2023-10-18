package gestionpedidos;

public class JFrame_gestionPedidos extends javax.swing.JFrame {
    public JFrame_gestionPedidos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList<>();
        cant = new javax.swing.JTextField();
        lblEnviar = new javax.swing.JLabel();
        ubi = new javax.swing.JComboBox<>();
        lblDestino = new javax.swing.JLabel();
        total = new javax.swing.JButton();
        tot = new javax.swing.JLabel();
        lblEntrega = new javax.swing.JLabel();
        envio = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(153, 51, 0));
        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de pedidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lstProductos.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        lstProductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Sistema de localizacion $120", "Centro de control $60", "Modem 65M $45" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstProductos);

        cant.setBackground(new java.awt.Color(255, 153, 153));
        cant.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N

        lblEnviar.setForeground(new java.awt.Color(255, 255, 255));
        lblEnviar.setText("Unidades:");

        ubi.setForeground(new java.awt.Color(102, 0, 0));
        ubi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Norte $20", "Centro $25", "Sur $30" }));

        lblDestino.setForeground(new java.awt.Color(255, 255, 255));
        lblDestino.setText("Destino:");

        total.setBackground(new java.awt.Color(255, 153, 102));
        total.setForeground(new java.awt.Color(23, 24, 26));
        total.setText("Calcular envio");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        tot.setBackground(new java.awt.Color(51, 51, 51));
        tot.setForeground(new java.awt.Color(255, 255, 255));
        tot.setOpaque(true);

        lblEntrega.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrega.setText("Tipo de entrega");

        envio.setForeground(new java.awt.Color(102, 0, 0));
        envio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal $3", "Urgente $10" }));
        envio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envioActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("SOBRE EL PEDIDO :p");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEnviar)
                        .addGap(24, 24, 24)
                        .addComponent(cant)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(ubi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(57, 57, 57))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(envio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEntrega))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(total)
                                    .addGap(1, 1, 1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEntrega)
                        .addGap(18, 18, 18)
                        .addComponent(envio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnviar)
                            .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
            //Declarar variables.
        int comprobador=0, TOTAL=0;
        double unidades, producto=0;
        
        //Productos.
                //Si 'Sistema de localizacion $120' es seleccionado...
        if(lstProductos.getSelectedIndex()==0){
            producto+=120;
            comprobador+=1;}
                //Si 'Centro de control $60' es seleccionado...
        if(lstProductos.getSelectedIndex()==1){
            producto+=60;
            comprobador+=1;}
                //Si 'Modem 65M $45' es seleccionado...
        if(lstProductos.getSelectedIndex()==2){
            producto+=45;
            comprobador+=1;}
                //Si nada ha sido seleccionado...
        if(lstProductos.getSelectedIndex()==-1){
            tot.setText("No ha elegido un producto.");}
        
        //Unidades.
            //Convertir lo ingresado en el TextField a número.
        unidades = Double.parseDouble(cant.getText());
        if(unidades==0){
            tot.setText("No ha ingresado la cantidad de unidades a llevar.");}
        
        //Destino
                //Si 'Norte $20' es seleccionado...
        if(ubi.getSelectedIndex()==0){
            TOTAL+=20;
            comprobador+=1;}
                //Si 'Centro $25' es seleccionado...
        if(ubi.getSelectedIndex()==1){
            TOTAL+=25;
            comprobador+=1;}
                //Si 'Sur $30' es seleccionado...
        if(ubi.getSelectedIndex()==2){
            TOTAL+=30;
            comprobador+=1;}
                //Si nada es seleccionado...
        if(ubi.getSelectedIndex()==-1){
            tot.setText("No ha ingresado el destino de envio.");}
        
        //Tipo de entrega.
                //Si 'Normal $3' es seleccionado...
        if(envio.getSelectedIndex()==0){
            TOTAL+=3;
            comprobador+=1;}
                //Si 'Urgente $10' es seleccionado...
        if(envio.getSelectedIndex()==1){
            TOTAL+=10;
            comprobador+=1;}
                //Si nada es seleccionado...
        if(envio.getSelectedIndex()==-1){
            tot.setText("No ha ingresado el tipo de entrega.");}
        
        //Label Total.
        TOTAL+=(unidades*producto);
        if(comprobador==0){
            tot.setText("Verique que haya llenado todos los campos.");
        }else{
            tot.setText("El total a pagar sera de: "+TOTAL);}
    }//GEN-LAST:event_totalActionPerformed

    private void envioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_envioActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_gestionPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_gestionPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_gestionPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_gestionPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_gestionPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cant;
    private javax.swing.JComboBox<String> envio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblEntrega;
    private javax.swing.JLabel lblEnviar;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JList<String> lstProductos;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel tot;
    private javax.swing.JButton total;
    private javax.swing.JComboBox<String> ubi;
    // End of variables declaration//GEN-END:variables
}
