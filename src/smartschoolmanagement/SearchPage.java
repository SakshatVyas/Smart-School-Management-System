/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smartschoolmanagement;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 91826
 */
public class SearchPage extends javax.swing.JFrame {

    /**
     * Creates new form SearchPage
     */
    public SearchPage() {
        
        initComponents();
    }
    private void fetchtbclass()
    {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);  // Clear any existing data
        
        try {
            // Register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/smart", "root", "Sakshat11@")) {
                String query = "SELECT * FROM tbclass";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                ResultSet rs = preparedStatement.executeQuery();
                
                // Populate the JTable with data
                while (rs.next()) {
                    String classId = rs.getString("classid");
                    String className = rs.getString("classname");
                    model.addRow(new Object[]{classId, className});
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage());
        }
    }
    
    private void fetchtbfees()
    {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);  // Clear any existing data
        
        try {
            // Register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/smart", "root", "Sakshat11@")) {
                String query = "SELECT * FROM tbfees";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                ResultSet rs = preparedStatement.executeQuery();
                
                // Populate the JTable with data
                while (rs.next()) {
                    String name = rs.getString("name");
                    String fees = rs.getString("fees");
                    String balance = rs.getString("balance");
                    String classnum = rs.getString("classnum");
                    String sid = rs.getString("sid");
                    model.addRow(new Object[]{name,fees,balance,classnum,sid});
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage());
        }
    }

    private void fetchtbparent()
    {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);  // Clear any existing data
        
        try {
            // Register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/smart", "root", "Sakshat11@")) {
                String query = "SELECT * FROM tbparent";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                ResultSet rs = preparedStatement.executeQuery();
                
                // Populate the JTable with data
                while (rs.next()) {
                    String pid = rs.getString("pid");
                    String pname = rs.getString("pname");
                    String gender = rs.getString("gender");
                    String city = rs.getString("city");
                    String address = rs.getString("address");
                    String mobilenumber = rs.getString("mobilenumber");
                    String wardname = rs.getString("wardname");
                    model.addRow(new Object[]{pid, pname,gender,city,address,mobilenumber,wardname});
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage());
        }
    }
    
    private void fetchtbstudent()
    {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);  // Clear any existing data
        
        try {
            // Register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/smart", "root", "Sakshat11@")) {
                String query = "SELECT * FROM tbstudent";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                ResultSet rs = preparedStatement.executeQuery();
                
                // Populate the JTable with data
                while (rs.next()) {
                    String sid = rs.getString("sid");
                    String rollnumber = rs.getString("rollnumber");
                    String name = rs.getString("name");
                    String fathersname = rs.getString("fathername");
                    String mothersname = rs.getString("mothername");
                    String address = rs.getString("address");
                    String gender = rs.getString("gender");
                    String city = rs.getString("city");
                    String classroom = rs.getString("classroom");
                    String mb = rs.getString("mb");
                   
               
                    model.addRow(new Object[]{sid,rollnumber,name,fathersname, mothersname,address,gender,city,classroom,mb});
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage());
        }
    }
    
     private void fetchtbteacher()
    {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);  // Clear any existing data
        
        try {
            // Register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/smart", "root", "Sakshat11@")) {
                String query = "SELECT * FROM tbteacher";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                ResultSet rs = preparedStatement.executeQuery();
                
                // Populate the JTable with data
                while (rs.next()) {
                    String incharge = rs.getString("incharge");
                    String teacherid = rs.getString("teacherid");
                    String teachername = rs.getString("teachername");
                    String fathersname = rs.getString("fathersname");
                    String mothersname = rs.getString("mothersname");
                    String gender = rs.getString("gender");
                    String city = rs.getString("city");
                    String address = rs.getString("address");
                    String mobilenumber = rs.getString("mobilenumber");
                   
               
                    model.addRow(new Object[]{incharge,teacherid,teachername,fathersname, mothersname,gender,city,address,mobilenumber});
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage());
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbSearch = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("SEARCH PAGE");
        jLabel1.setAlignmentX(1.0F);
        jLabel1.setAlignmentY(1.0F);

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tbclass", "tbfees", "tbparent", "tbstudent", "tbteacher" }));

        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addComponent(cmbSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(280, 280, 280))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
    String selectedItem = (String) cmbSearch.getSelectedItem();
    switch (selectedItem) {
        case "tbclass":
            fetchtbclass();
            break;
        case "tbfees":
            fetchtbfees();
            break;
        case "tbparent":
            fetchtbparent();
            break;
        case "tbstudent":
            fetchtbstudent();
            break;
        case "tbteacher":
            fetchtbteacher();
            break;
        default:
            JOptionPane.showMessageDialog(null, "Invalid selection");
    }
  
    }//GEN-LAST:event_btnSearchMouseClicked

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
            java.util.logging.Logger.getLogger(SearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
