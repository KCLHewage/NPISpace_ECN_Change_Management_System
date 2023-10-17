package View;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Controller.StatementController;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setIcon();
        setTitle("NPI SPACE");
        this.setLocationRelativeTo(null); 
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_login = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        main_logo = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 570));

        jPanel1.setBackground(new java.awt.Color(47, 50, 52));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 550));

        lbl_username.setBackground(new java.awt.Color(204, 204, 204));
        lbl_username.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(252, 253, 242));
        lbl_username.setText("Username");

        lbl_password.setBackground(new java.awt.Color(204, 204, 204));
        lbl_password.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(252, 253, 242));
        lbl_password.setText("Password");

        lbl_login.setBackground(new java.awt.Color(204, 204, 204));
        lbl_login.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(252, 253, 242));
        lbl_login.setText("LOGIN");

        txt_username.setBackground(new java.awt.Color(31, 31, 35));
        txt_username.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_username.setForeground(new java.awt.Color(242, 242, 242));
        txt_username.setCaretColor(new java.awt.Color(18, 30, 49));
        txt_username.setSelectedTextColor(new java.awt.Color(18, 30, 49));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(31, 31, 35));
        btn_login.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(242, 242, 242));
        btn_login.setText("Login");
        btn_login.setFocusPainted(false);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(14, 119, 89));

        main_logo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        main_logo.setForeground(new java.awt.Color(255, 255, 255));
        main_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/npi-space-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );

        txt_password.setBackground(new java.awt.Color(31, 31, 35));
        txt_password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_login, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(lbl_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lbl_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lbl_username)
                .addGap(1, 1, 1)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String name,password;
        name = txt_username.getText();
        password = String.valueOf(txt_password.getPassword());
        
        int isLogin=0;
        if (name.isEmpty()) {
            //JOptionPane.showMessageDialog(null,"Enter Username", "Invalid Login",JOptionPane.INFORMATION_MESSAGE); 
            ModernJOptionPane.showMessageDialog(null,"Enter Username", "Invalid Login",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(password.isEmpty()) {
             ModernJOptionPane.showMessageDialog(null,"Enter Password", "Invalid Login",JOptionPane.INFORMATION_MESSAGE); 
             
        }
        else {
            try
             {
              StatementController stcon = new StatementController();
              ResultSet result = stcon.selectData("SELECT u_name, password, d_type, u_id FROM user WHERE u_name='"+name+"' AND password='"+password+"'");
              while(result.next()) {
                if (name.equals(result.getString(1)) && password.equals(result.getString(2)))  {
                     isLogin=1;
                     if (result.getString(3).equals("DF")){
                        DF_Main_Dashboard ecn=new DF_Main_Dashboard();
                        ecn.setID(result.getString(4));
                        ecn.setName(result.getString(1));
                        ecn.setDeptID(result.getString(3));
                        ecn.setNotification();
                        Login.this.setVisible(false);
                        ecn.setVisible(true);
                    }
                    else if (result.getString(3).equals("DC")){
                        User_Dashboard user_dashboard=new User_Dashboard();
                        user_dashboard.setName(result.getString(1));
                        user_dashboard.setDeptID(result.getString(3));
                        user_dashboard.setID(result.getString(4));
                        Login.this.setVisible(false);
                        user_dashboard.setVisible(true);
                    }
                    else if (result.getString(3).equals("IE")){
                        RFQ_Dashboard_IE user_dashboard=new RFQ_Dashboard_IE();
                        user_dashboard.setName(result.getString(1));
                        user_dashboard.setDeptID(result.getString(3));
                        user_dashboard.setID(result.getString(4));
                        Login.this.setVisible(false);
                        user_dashboard.setVisible(true);
                    }
                    else if (result.getString(3).equals("AD")){
                        Admin_Dashboard user_dashboard=new Admin_Dashboard();
                        user_dashboard.setName(result.getString(1));
                        user_dashboard.setDeptID(result.getString(3));
                        user_dashboard.setID(result.getString(4));
                        Login.this.setVisible(false);
                        user_dashboard.setVisible(true);
                    }
                   }
                else {
                    isLogin=0;
                }
              }
              stcon.selectCloseCon();
              if (isLogin==0) {
                  ModernJOptionPane.showMessageDialog(null,"Incorrect Username and/or Password", "Invalid Login",JOptionPane.INFORMATION_MESSAGE);
              }
             }
            catch(SQLException e)
             {
                ModernJOptionPane.showMessageDialog(null, e.getMessage());
             }
        }         
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
    }//GEN-LAST:event_txt_usernameActionPerformed

    public static void main(String args[]) {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel main_logo;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}