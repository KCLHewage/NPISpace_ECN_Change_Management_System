package View;
import Controller.StatementController;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ECN_DF_Dashboard extends javax.swing.JFrame {
    private String name,id,deptID;
    String dfVerified="No";

    public ECN_DF_Dashboard() {
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
                  //lblNotification.setText("You have "+result.getString(1)+" Pending ECN(s)");
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
        btn_external_ecn = new javax.swing.JButton();
        btn_internal_ecn = new javax.swing.JButton();
        FlightNoHeader3 = new javax.swing.JLabel();
        lbl_deptID = new javax.swing.JLabel();
        JPanelNotification = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNotification = new javax.swing.JLabel();
        lblNotification1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

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
        lbl_dashboard.setText("ECN DASHBOARD");

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

        btn_external_ecn.setBackground(new java.awt.Color(31, 31, 35));
        btn_external_ecn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_external_ecn.setForeground(new java.awt.Color(242, 242, 242));
        btn_external_ecn.setText("EXTERNAL ECN");
        btn_external_ecn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_external_ecnActionPerformed(evt);
            }
        });

        btn_internal_ecn.setBackground(new java.awt.Color(31, 31, 35));
        btn_internal_ecn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_internal_ecn.setForeground(new java.awt.Color(242, 242, 242));
        btn_internal_ecn.setText("INTERNAL ECN");
        btn_internal_ecn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_internal_ecnActionPerformed(evt);
            }
        });

        FlightNoHeader3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNoHeader3.setForeground(new java.awt.Color(255, 233, 177));
        FlightNoHeader3.setText("Department -");

        lbl_deptID.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_deptID.setForeground(new java.awt.Color(255, 233, 177));
        lbl_deptID.setText("0");

        JPanelNotification.setBackground(new java.awt.Color(47, 50, 52));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/bell_icon3.png"))); // NOI18N
        jLabel1.setToolTipText("");

        lblNotification.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNotification.setForeground(new java.awt.Color(242, 242, 242));
        lblNotification.setText("You have 8 Pending Internal ECN(s)");

        javax.swing.GroupLayout JPanelNotificationLayout = new javax.swing.GroupLayout(JPanelNotification);
        JPanelNotification.setLayout(JPanelNotificationLayout);
        JPanelNotificationLayout.setHorizontalGroup(
            JPanelNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelNotificationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        JPanelNotificationLayout.setVerticalGroup(
            JPanelNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelNotificationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanelNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNotification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblNotification1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNotification1.setForeground(new java.awt.Color(242, 242, 242));
        lblNotification1.setText("You have 5 Pending External ECN(s)");

        btn_back.setBackground(new java.awt.Color(14, 119, 89));
        btn_back.setForeground(new java.awt.Color(255, 233, 177));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/back.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JPanelNotification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNotification1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_internal_ecn, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_external_ecn, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(FlightNoHeader3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_deptID)
                        .addGap(86, 86, 86)
                        .addComponent(FlightNoHeader2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_userID)
                        .addGap(90, 90, 90))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_back)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_internal_ecn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_external_ecn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(JPanelNotification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNotification1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
            Login user_login=new Login();
            ECN_DF_Dashboard.this.setVisible(false);
            user_login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_external_ecnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_external_ecnActionPerformed
                ECN_External_Dashboard_DF ecn=new ECN_External_Dashboard_DF();
                ecn.setID(id);
                ecn.setName(name);
                ecn.setDeptID(deptID);
                ecn.setPendingECN();
                ECN_DF_Dashboard.this.setVisible(false);
                ecn.setVisible(true);
    }//GEN-LAST:event_btn_external_ecnActionPerformed

    private void btn_internal_ecnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_internal_ecnActionPerformed
            
                ECN_Internal_Dashboard_DF ecn=new ECN_Internal_Dashboard_DF();
                ecn.setID(id);
                ecn.setName(name);
                ecn.setDeptID(deptID);
                ecn.setPendingECN();
                ECN_DF_Dashboard.this.setVisible(false);
                ecn.setVisible(true);
            
            
    }//GEN-LAST:event_btn_internal_ecnActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        DF_Main_Dashboard ecn_dashboard=new DF_Main_Dashboard();
        ECN_DF_Dashboard.this.setVisible(false);
        ecn_dashboard.setID(id);
        ecn_dashboard.setName(name);
        ecn_dashboard.setDeptID(deptID);
        //ecn_dashboard.setPendingECN();
        ecn_dashboard.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ECN_DF_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FlightNoHeader2;
    private javax.swing.JLabel FlightNoHeader3;
    private javax.swing.JPanel JPanelNotification;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_external_ecn;
    private javax.swing.JButton btn_internal_ecn;
    private javax.swing.JButton btn_logout;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNotification;
    private javax.swing.JLabel lblNotification1;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_deptID;
    private javax.swing.JLabel lbl_userID;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel main_logo;
    // End of variables declaration//GEN-END:variables
}
