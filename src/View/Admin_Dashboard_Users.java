package View;
import Controller.StatementController;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Admin_Dashboard_Users extends javax.swing.JFrame {
    private String name,id,deptID;
    String dfVerified="No";

    public Admin_Dashboard_Users() {
        initComponents();
        setIcon();
        setTitle("NPI SPACE");
        this.setLocationRelativeTo(null);
        
        
                     
    }
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
    }
    public void setName(String name){
        this.name=name;
        lbl_welcome.setText("Welcome "+name);
    }
    public void setID(String id){
        this.id=id;
        lbl_userID.setText(id);
    }
    public void setDeptID(String deptID){
        this.deptID=deptID;
        lbl_deptID.setText(deptID);
    }
    
    public void setNotification(){
        try {
              StatementController stcon = new StatementController();
              ResultSet result = stcon.selectData("SELECT COUNT(ecn.ecn_year) AS ecn_count FROM ecn INNER JOIN customer ON ecn.customer = customer.customer WHERE ecn.df_verified ='"+dfVerified+"' AND customer.u_id = '"+Integer.parseInt(id)+"'");       
              while(result.next()) {
                  
                }
              stcon.selectCloseCon();
             }
            catch(SQLException e)
             {
                JOptionPane.showMessageDialog(null, e.getMessage());
             }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        main_logo = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        lbl_welcome = new javax.swing.JLabel();
        FlightNoHeader2 = new javax.swing.JLabel();
        lbl_userID = new javax.swing.JLabel();
        HANDOVERS = new javax.swing.JButton();
        ECN = new javax.swing.JButton();
        FlightNoHeader3 = new javax.swing.JLabel();
        lbl_deptID = new javax.swing.JLabel();
        HANDOVERS1 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 570));

        jPanel1.setBackground(new java.awt.Color(47, 50, 52));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 550));

        lbl_dashboard.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_dashboard.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard.setText("MANAGE USERS");

        jPanel2.setBackground(new java.awt.Color(14, 119, 89));

        main_logo.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        main_logo.setForeground(new java.awt.Color(255, 255, 255));
        main_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/npi-space-logo.png"))); // NOI18N

        btn_logout.setBackground(new java.awt.Color(14, 119, 89));
        btn_logout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 233, 177));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/logout.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.setFocusPainted(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        lbl_welcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_welcome.setForeground(new java.awt.Color(252, 253, 242));
        lbl_welcome.setText("Welcome User");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        FlightNoHeader2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNoHeader2.setForeground(new java.awt.Color(255, 233, 177));
        FlightNoHeader2.setText("UserID -");

        lbl_userID.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_userID.setForeground(new java.awt.Color(255, 233, 177));
        lbl_userID.setText("0");

        HANDOVERS.setBackground(new java.awt.Color(31, 31, 35));
        HANDOVERS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        HANDOVERS.setForeground(new java.awt.Color(242, 242, 242));
        HANDOVERS.setText("EDIT USERS");
        HANDOVERS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HANDOVERSActionPerformed(evt);
            }
        });

        ECN.setBackground(new java.awt.Color(31, 31, 35));
        ECN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ECN.setForeground(new java.awt.Color(242, 242, 242));
        ECN.setText("ADD USERS");
        ECN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECNActionPerformed(evt);
            }
        });

        FlightNoHeader3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNoHeader3.setForeground(new java.awt.Color(255, 233, 177));
        FlightNoHeader3.setText("Department -");

        lbl_deptID.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_deptID.setForeground(new java.awt.Color(255, 233, 177));
        lbl_deptID.setText("0");

        HANDOVERS1.setBackground(new java.awt.Color(31, 31, 35));
        HANDOVERS1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        HANDOVERS1.setForeground(new java.awt.Color(242, 242, 242));
        HANDOVERS1.setText("REMOVE USERS");
        HANDOVERS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HANDOVERS1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ECN, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(HANDOVERS, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(HANDOVERS1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(FlightNoHeader3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_deptID)
                        .addGap(86, 86, 86)
                        .addComponent(FlightNoHeader2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_userID)))
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FlightNoHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_deptID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FlightNoHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_userID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ECN, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HANDOVERS, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HANDOVERS1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
            Login user_login=new Login();
            Admin_Dashboard_Users.this.setVisible(false);
            user_login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void HANDOVERSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HANDOVERSActionPerformed
                Admin_Users_Update ecn=new Admin_Users_Update();
                ecn.setID(id);
                ecn.setName(name);
                ecn.setDeptID(deptID);
                //ecn.setPendingECN();
                Admin_Dashboard_Users.this.setVisible(false);
                ecn.setVisible(true);
    }//GEN-LAST:event_HANDOVERSActionPerformed

    private void ECNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECNActionPerformed
            
                Admin_Users_Add ecn=new Admin_Users_Add();
                ecn.setID(id);
                ecn.setName(name);
                ecn.setDeptID(deptID);
                //ecn.setPendingECN();
                Admin_Dashboard_Users.this.setVisible(false);
                ecn.setVisible(true);
            
            
    }//GEN-LAST:event_ECNActionPerformed

    private void HANDOVERS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HANDOVERS1ActionPerformed
                Admin_Users_Delete ecn=new Admin_Users_Delete();
                ecn.setID(id);
                ecn.setName(name);
                ecn.setDeptID(deptID);
                //ecn.setPendingECN();
                Admin_Dashboard_Users.this.setVisible(false);
                ecn.setVisible(true);
    }//GEN-LAST:event_HANDOVERS1ActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Dashboard_Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ECN;
    private javax.swing.JLabel FlightNoHeader2;
    private javax.swing.JLabel FlightNoHeader3;
    private javax.swing.JButton HANDOVERS;
    private javax.swing.JButton HANDOVERS1;
    private javax.swing.JButton btn_logout;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_deptID;
    private javax.swing.JLabel lbl_userID;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel main_logo;
    // End of variables declaration//GEN-END:variables
}
