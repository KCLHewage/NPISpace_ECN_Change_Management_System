package View;

import java.awt.Toolkit;

public class ECN_DC_Dashboard_Backup extends javax.swing.JFrame {
    private String name,id,deptID;

    public ECN_DC_Dashboard_Backup() {
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
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        main_logo = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        lbl_welcome = new javax.swing.JLabel();
        FlightNoHeader2 = new javax.swing.JLabel();
        lbl_userID = new javax.swing.JLabel();
        btn_rfq = new javax.swing.JButton();
        btn_discrepencies = new javax.swing.JButton();
        btn_internal_ecn = new javax.swing.JButton();
        btn_handovers = new javax.swing.JButton();
        FlightNoHeader3 = new javax.swing.JLabel();
        lbl_deptID = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

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

        btn_rfq.setBackground(new java.awt.Color(31, 31, 35));
        btn_rfq.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_rfq.setForeground(new java.awt.Color(242, 242, 242));
        btn_rfq.setText("EXTERNAL ECN");
        btn_rfq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rfqActionPerformed(evt);
            }
        });

        btn_discrepencies.setBackground(new java.awt.Color(31, 31, 35));
        btn_discrepencies.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_discrepencies.setForeground(new java.awt.Color(242, 242, 242));
        btn_discrepencies.setText("ABC");
        btn_discrepencies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_discrepenciesActionPerformed(evt);
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

        btn_handovers.setBackground(new java.awt.Color(31, 31, 35));
        btn_handovers.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_handovers.setForeground(new java.awt.Color(242, 242, 242));
        btn_handovers.setText("ABC");
        btn_handovers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_handoversActionPerformed(evt);
            }
        });

        FlightNoHeader3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNoHeader3.setForeground(new java.awt.Color(255, 233, 177));
        FlightNoHeader3.setText("Department -");

        lbl_deptID.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_deptID.setForeground(new java.awt.Color(255, 233, 177));
        lbl_deptID.setText("0");

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
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_internal_ecn, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_rfq, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_handovers, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_discrepencies, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_back)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_internal_ecn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_rfq, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_handovers, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_discrepencies, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
            Login user_login=new Login();
            ECN_DC_Dashboard_Backup.this.setVisible(false);
            user_login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_rfqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rfqActionPerformed
           
    }//GEN-LAST:event_btn_rfqActionPerformed

    private void btn_internal_ecnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_internal_ecnActionPerformed
            
            if (deptID.equals("DF")){
                //Must Connect
                ECN_DF ecn=new ECN_DF();
                ecn.setID(id);
                ecn.setName(name);
                ecn.setDeptID(deptID);
                ECN_DC_Dashboard_Backup.this.setVisible(false);
                ecn.setVisible(true);
            }
            else if (deptID.equals("DC")){
                //Link to internal ecn dashboard
                ECN_Internal_Dashboard ecn=new ECN_Internal_Dashboard();
                ecn.setID(id);
                ecn.setName(name);
                ecn.setDeptID(deptID);
                ECN_DC_Dashboard_Backup.this.setVisible(false);
                ecn.setVisible(true);
            }
    }//GEN-LAST:event_btn_internal_ecnActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        User_Dashboard user_dashboard=new User_Dashboard();
        ECN_DC_Dashboard_Backup.this.setVisible(false);
        user_dashboard.setID(id);
        user_dashboard.setName(name);
        user_dashboard.setDeptID(deptID);
        user_dashboard.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_discrepenciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_discrepenciesActionPerformed

    }//GEN-LAST:event_btn_discrepenciesActionPerformed

    private void btn_handoversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_handoversActionPerformed

    }//GEN-LAST:event_btn_handoversActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ECN_DC_Dashboard_Backup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FlightNoHeader2;
    private javax.swing.JLabel FlightNoHeader3;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_discrepencies;
    private javax.swing.JButton btn_handovers;
    private javax.swing.JButton btn_internal_ecn;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_rfq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_deptID;
    private javax.swing.JLabel lbl_userID;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel main_logo;
    // End of variables declaration//GEN-END:variables
}
