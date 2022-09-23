
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoeb-pc
 */
public class EmployesEntryRecord extends javax.swing.JFrame {

    Connection connect = null;
    ResultSet rs = null; 
    static String DatabaseName = "MOBILE_SHOP";
    
    /**
     * Creates new form EmployesEntryRecord
     */
    public EmployesEntryRecord() {
        initComponents();
        connect = SQLServerConnect.ConnectDB("sa", "123456789", "MOBILE_SHOP");
        GetTableData();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        employe_entry_record_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        a_back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("||| EMPLOYEES RECORD |||");
        setResizable(false);

        employe_entry_record_table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        employe_entry_record_table.setForeground(new java.awt.Color(0, 0, 0));
        employe_entry_record_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "GENDER", "DESIGNATION", "CONTACT NUMBER", "ADDRESS", "SALARY ", "USERNAME", "PASSWORD"
            }
        ));
        employe_entry_record_table.setToolTipText("");
        employe_entry_record_table.setGridColor(new java.awt.Color(204, 255, 255));
        employe_entry_record_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employe_entry_record_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employe_entry_record_table);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        a_back_button.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        a_back_button.setForeground(new java.awt.Color(0, 51, 51));
        a_back_button.setText("BACK");
        a_back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(a_back_button)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(a_back_button)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employe_entry_record_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employe_entry_record_tableMouseClicked
        // TODO add your handling code here:
        try{
            connect = SQLServerConnect.ConnectDB("sa", "123456789", "MOBILE_SHOP");
            
            int row= employe_entry_record_table.getSelectedRow();
            String table_click= employe_entry_record_table.getModel().getValueAt(row, 0).toString();
            String sql= "select * from EMPLOYEE_INFORMATION where EmployeeId = '" + table_click + "'";
            
            rs = SQLServerConnect.SearchDB(connect, sql);
            if(rs.next()){
                this.hide();
                EmployesEntry ce = new EmployesEntry();
                ce.setVisible(true);
                ce.e_entry_update.setEnabled(true);
                ce.e_entry_delete.setEnabled(true);
                ce.e_entry_save.setEnabled(false);
                ce.e_id.setEditable(false);
                ce.flag = 1;
                
                String add1=rs.getString("EmployeeId");
                ce.e_id.setText(add1);
                
                String add2=rs.getString("Name");
                ce.e_name.setText(add2);
                
                String add3=rs.getString("Gender");
                ce.e_gender_combo.setSelectedItem(add3);
                
                String add4=rs.getString("Salary");
                ce.e_since.setText(add4);
                
                String add5=rs.getString("Designation");
                ce.e_type_combo.setSelectedItem(add5);
                
                String add6=rs.getString("ContactNumber");
                ce.e_contact_number.setText(add6);
                
                String add7=rs.getString("EmployeeAddress");
                ce.e_address.setText(add7); 
                
                String add8=rs.getString("EmployeeName");
                ce.e_username.setText(add8);
                
                String add9=rs.getString("EmployeePass");
                ce.e_password.setText(add9);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,e);
        }    
    }//GEN-LAST:event_employe_entry_record_tableMouseClicked

    private void a_back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_back_buttonActionPerformed
        // TODO add your handling code here:
        if(StartPage.LoginAs == 0)
        {
            EmployesEntry ah = new EmployesEntry();
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
            java.util.logging.Logger.getLogger(EmployesEntryRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployesEntryRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployesEntryRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployesEntryRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployesEntryRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a_back_button;
    private javax.swing.JTable employe_entry_record_table;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void GetTableData() {
        String sql="select EmployeeId as [ID], Name, Gender, Salary, Designation, ContactNumber as [Contact Number], EmployeeAddress as [Address], EmployeeName as [User Name],EmployeePass as [Password] from EMPLOYEE_INFORMATION";
        try{
            rs = SQLServerConnect.SearchDB(connect, sql);
            employe_entry_record_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);        
        }
    }
}