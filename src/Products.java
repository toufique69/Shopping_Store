
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoeb-pc
 */
public class Products extends javax.swing.JFrame {

    Connection connect = null;
    ResultSet rs;
    static String DatabaseName = "MOBILE_SHOP";
    public int flag = 0;
    
    /**
     * Creates new form Products
     */
    public Products() {
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

        jPanel1 = new javax.swing.JPanel();
        a_back_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtModelName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtProductDescription = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbAvailability = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtProductCode = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCategoryId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        PINew = new javax.swing.JButton();
        PISave = new javax.swing.JButton();
        PIUpdate = new javax.swing.JButton();
        PIDelete = new javax.swing.JButton();
        PISearch = new javax.swing.JButton();
        nk_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Products Entry");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        a_back_button.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        a_back_button.setForeground(new java.awt.Color(0, 51, 51));
        a_back_button.setText("BACK");
        a_back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_back_buttonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Buxton Sketch", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/product.png"))); // NOI18N
        jLabel2.setText("Products Entry");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Product ID :");

        txtProductId.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Product Name :");

        txtBrandName.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        txtBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Category :");

        txtModelName.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        txtModelName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Description");

        txtProductDescription.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        txtProductDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductDescriptionActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 51, 51));
        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Price :");

        txtUnitPrice.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 51, 51));
        jLabel11.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Avaiability :");

        cmbAvailability.setSelectedIndex(-1);
        cmbAvailability.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        cmbAvailability.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        cmbAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAvailabilityActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 51, 51));
        jLabel10.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Product Code :");

        txtProductCode.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N

        jLabel12.setBackground(new java.awt.Color(0, 51, 51));
        jLabel12.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Brand Id :");

        txtCategoryId.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmbAvailability, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCategoryId)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUnitPrice)
                            .addComponent(txtProductDescription)
                            .addComponent(txtBrandName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtModelName)
                            .addComponent(txtProductId))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtModelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtProductDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PINew.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PINew.setText("NEW");
        PINew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PINewActionPerformed(evt);
            }
        });

        PISave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PISave.setText("SAVE");
        PISave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PISaveActionPerformed(evt);
            }
        });

        PIUpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PIUpdate.setText("UPDATE");
        PIUpdate.setEnabled(false);
        PIUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIUpdateActionPerformed(evt);
            }
        });

        PIDelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PIDelete.setText("DELETE");
        PIDelete.setEnabled(false);
        PIDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIDeleteActionPerformed(evt);
            }
        });

        PISearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PISearch.setText("VIEW PRODUCTS");
        PISearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PISearchActionPerformed(evt);
            }
        });

        nk_search.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nk_search.setText("VIEW BRANDS");
        nk_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nk_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PIUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PISearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PIDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PISave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PINew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nk_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PINew)
                .addGap(18, 18, 18)
                .addComponent(PISave)
                .addGap(18, 18, 18)
                .addComponent(PIUpdate)
                .addGap(18, 18, 18)
                .addComponent(PIDelete)
                .addGap(18, 18, 18)
                .addComponent(PISearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(nk_search)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(a_back_button))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(a_back_button)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a_back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_back_buttonActionPerformed
        // TODO add your handling code here:
        if(StartPage.LoginAs == 0)
        {
        AdminHome ah = new AdminHome();
        ah.setVisible(true);
        this.dispose();         
        }
        else if(StartPage.LoginAs == 1)
        {
        EmployeeHome eh = new EmployeeHome();
        eh.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_a_back_buttonActionPerformed

    private void PINewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PINewActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_PINewActionPerformed

    private void PISaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PISaveActionPerformed
        // TODO add your handling code here:
        SavePI();
    }//GEN-LAST:event_PISaveActionPerformed

    private void PIUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIUpdateActionPerformed
        // TODO add your handling code here:
        UpdatePI();
    }//GEN-LAST:event_PIUpdateActionPerformed

    private void PIDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIDeleteActionPerformed
        // TODO add your handling code here:
        DeletePI();
    }//GEN-LAST:event_PIDeleteActionPerformed

    private void PISearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PISearchActionPerformed
        // TODO add your handling code here:
        ProductRecord spr = new ProductRecord();
        spr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PISearchActionPerformed

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameActionPerformed

    private void txtModelNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNameActionPerformed

    private void txtProductDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductDescriptionActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void cmbAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAvailabilityActionPerformed

    private void nk_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nk_searchActionPerformed
        // TODO add your handling code here:
        CategoryRecord1 spr = new CategoryRecord1();
        spr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nk_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton PIDelete;
    public javax.swing.JButton PINew;
    public javax.swing.JButton PISave;
    public javax.swing.JButton PISearch;
    public javax.swing.JButton PIUpdate;
    private javax.swing.JButton a_back_button;
    public javax.swing.JComboBox cmbAvailability;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JButton nk_search;
    public javax.swing.JTextField txtBrandName;
    public javax.swing.JTextField txtCategoryId;
    public javax.swing.JTextField txtModelName;
    public javax.swing.JTextField txtProductCode;
    public javax.swing.JTextField txtProductDescription;
    public javax.swing.JTextField txtProductId;
    public javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void Reset() {
        flag = 0;
        txtProductId.setText("");
        txtBrandName.setText("");
        txtModelName.setText("");
        txtProductDescription.setText("");
        txtUnitPrice.setText("");
        cmbAvailability.setSelectedIndex(-1);
        txtProductCode.setText("");
        txtCategoryId.setText("");
        
        PISave.setEnabled(true);
        PIUpdate.setEnabled(false);
        PIDelete.setEnabled(false);
        txtProductId.setEditable(true);
        txtProductId.requestDefaultFocus();
    }

    private void SavePI() {
        try{
             connect = SQLServerConnect.ConnectDB("sa", "123456789", "MOBILE_SHOP");
             
             if (txtProductId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Product ID","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtBrandName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Brand","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            
            if (txtModelName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Model","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            
            if (txtProductDescription.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Description","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtUnitPrice.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Price","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
           
            
            if (cmbAvailability.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select Availability","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }         
           
            if (txtProductCode.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Product Code","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }                 
            
            if (txtCategoryId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Category Id","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             
            String sql="Select ProductId from PRODUCTS where ProductId= '" + txtProductId.getText() + "'";
            connect = SQLServerConnect.ConnectDB("sa", "123456789", "MOBILE_SHOP");
            rs= SQLServerConnect.SearchDB(connect, sql);
            
            if(rs.next()){
                JOptionPane.showMessageDialog( this, "Product ID already exists","Error", JOptionPane.ERROR_MESSAGE);
                txtProductId.setText("");
                txtProductId.requestDefaultFocus();
                return;
            }
            
            SQLServerConnect.Close(connect);
            
            sql= "insert into PRODUCTS(ProductId, Brand, Model, ProductDescription, Price, Available, ProductCode, CategoryId)values('"+ txtProductId.getText() + "','"+ txtBrandName.getText() + "','"+ txtModelName.getText() + "','"+ txtProductDescription.getText() + "','"+ txtUnitPrice.getText() + "','"+ cmbAvailability.getSelectedItem()+ "','" + txtProductCode.getText() + "','"+ txtCategoryId.getText() + "')";
            
            connect = SQLServerConnect.ConnectDB("sa", "123456789", "MOBILE_SHOP");
            SQLServerConnect.UpdateDB(connect, sql);
            SQLServerConnect.Close(connect);
            JOptionPane.showMessageDialog(this,"Successfully inserted","Record",JOptionPane.INFORMATION_MESSAGE);
            PISave.setEnabled(false);
            Reset();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this,e);        
        }
    }

    private void UpdatePI() {
       
        try{
        connect = SQLServerConnect.ConnectDB("sa", "123456789", "MOBILE_SHOP");
        
        String sql= "update PRODUCTS set Brand='"+ txtBrandName.getText() + "',Model='"+ txtModelName.getText() + "',ProductDescription='"+ txtProductDescription.getText() + "',Price='"+ txtUnitPrice.getText() + "',Available='" + cmbAvailability.getSelectedItem() + "',ProductCode='" + txtProductCode.getText() + "',CategoryId='"+ txtCategoryId.getText() + "' where ProductId='"+ txtProductId.getText() + "'";
        SQLServerConnect.UpdateDB(connect, sql);
        JOptionPane.showMessageDialog(this,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
        PIUpdate.setEnabled(false);
        Reset();
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this,e);
        }
        
        
      
    }

    private void DeletePI() {
       try{
            int sure = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);

            if(sure == 0){
               connect = SQLServerConnect.ConnectDB("sa", "123456789", "MOBILE_SHOP");
                String sql = "delete from PRODUCTS where ProductId = '" + txtProductId.getText() + "'";
                SQLServerConnect.UpdateDB(connect, sql);
                
                boolean success1 = SQLServerConnect.UpdateDB(connect, sql);

                if(!success1){
                    JOptionPane.showMessageDialog(this,"Couldn't Delete. Try Again","Record",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
                    Reset();
                }
            }

        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this,e);
        }
}
}
