/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoeb-pc
 */
public class EmployeeHome extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeHome
     */
    public EmployeeHome() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        nokia = new javax.swing.JMenuItem();
        samsung = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        simcards = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        customer_entry = new javax.swing.JMenuItem();
        jMenu21 = new javax.swing.JMenu();
        e_generate_bill = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenu();
        e_log_details = new javax.swing.JMenuItem();
        e_log_out = new javax.swing.JMenuItem();
        e_exit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenuItem25.setText("jMenuItem25");

        jMenuItem26.setText("jMenuItem26");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(776, 456));
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("::: EMPLOYEE HOME :::"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(896, 428));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu10.setBackground(new java.awt.Color(255, 255, 255));
        jMenu10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu10.setText("Product Information");
        jMenu10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N

        nokia.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        nokia.setText("View Brands");
        nokia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nokiaActionPerformed(evt);
            }
        });
        jMenu10.add(nokia);

        samsung.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        samsung.setText("View Product");
        samsung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samsungActionPerformed(evt);
            }
        });
        jMenu10.add(samsung);

        jMenuBar1.add(jMenu10);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("  Dealers Information");
        jMenu2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N

        simcards.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        simcards.setText("Dealer Search");
        simcards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simcardsActionPerformed(evt);
            }
        });
        jMenu2.add(simcards);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setText("   Customers ");
        jMenu3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N

        customer_entry.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        customer_entry.setText("Customers Entry");
        customer_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_entryActionPerformed(evt);
            }
        });
        jMenu3.add(customer_entry);

        jMenuBar1.add(jMenu3);

        jMenu21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu21.setText("   Customers Orders ");
        jMenu21.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N

        e_generate_bill.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        e_generate_bill.setText("Process Order");
        e_generate_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_generate_billActionPerformed(evt);
            }
        });
        jMenu21.add(e_generate_bill);

        jMenuItem2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jMenuItem2.setText("Orders Search");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem2);

        jMenuBar1.add(jMenu21);

        jMenu20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu20.setText("   About ");
        jMenu20.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N

        about.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenu20.add(about);

        jMenuBar1.add(jMenu20);

        jMenu18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu18.setText("  Users ");
        jMenu18.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N

        e_log_details.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        e_log_details.setText("Change Password");
        e_log_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_log_detailsActionPerformed(evt);
            }
        });
        jMenu18.add(e_log_details);

        e_log_out.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        e_log_out.setText("Log Out");
        e_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_log_outActionPerformed(evt);
            }
        });
        jMenu18.add(e_log_out);

        e_exit.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        e_exit.setText("Exit");
        e_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_exitActionPerformed(evt);
            }
        });
        jMenu18.add(e_exit);

        jMenuBar1.add(jMenu18);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void e_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_e_exitActionPerformed

    private void e_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_log_outActionPerformed
        // TODO add your handling code here:
        StartPage sp = new StartPage();
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_e_log_outActionPerformed

    private void nokiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nokiaActionPerformed
        // TODO add your handling code here:
        CategoryRecord aa = new CategoryRecord();
        aa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nokiaActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        About aa = new About();
        aa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aboutActionPerformed

    private void samsungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samsungActionPerformed
        // TODO add your handling code here:
        ProductRecord aa = new ProductRecord();
        aa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_samsungActionPerformed

    private void simcardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simcardsActionPerformed
        // TODO add your handling code here:
        DealerRecord aa = new DealerRecord();
        aa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_simcardsActionPerformed

    private void customer_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_entryActionPerformed
        // TODO add your handling code here:
        CustomersEntry aa = new CustomersEntry();
        aa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customer_entryActionPerformed

    private void e_log_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_log_detailsActionPerformed
        // TODO add your handling code here:
        ChangePassword cp = new ChangePassword();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_e_log_detailsActionPerformed

    private void e_generate_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_generate_billActionPerformed
        // TODO add your handling code here:
        BillGenerate bg = new BillGenerate();
        bg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_e_generate_billActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        OrderSearch bg = new OrderSearch();
        bg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem customer_entry;
    private javax.swing.JMenuItem e_exit;
    private javax.swing.JMenuItem e_generate_bill;
    private javax.swing.JMenuItem e_log_details;
    private javax.swing.JMenuItem e_log_out;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem nokia;
    private javax.swing.JMenuItem samsung;
    private javax.swing.JMenuItem simcards;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
