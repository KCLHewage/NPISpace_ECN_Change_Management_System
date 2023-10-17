package View;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

import Controller.StatementController;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class DynamicGUITest2 extends javax.swing.JFrame {
    private String name, id;

    
    public DynamicGUITest2() {

        initComponents();
        setIcon();
        setTitle("NPI SPACE");
        this.setLocationRelativeTo(null);

    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
    }
    
    public void setID(String id){
        this.id=id;
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        main_logo = new javax.swing.JLabel();
        lbl_welcome = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        jPanelBody = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        lbl_dashboard2 = new javax.swing.JLabel();
        FirstNameText1 = new javax.swing.JLabel();
        txt_no_of_products = new javax.swing.JTextField();
        btn_enter = new javax.swing.JButton();
        LastNameText = new javax.swing.JLabel();
        jScrollPaneBody = new javax.swing.JScrollPane();
        InnerJPanel = new javax.swing.JPanel();
        btn_confirm = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(47, 50, 52));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 570));

        jPanel2.setBackground(new java.awt.Color(14, 119, 89));

        main_logo.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        main_logo.setForeground(new java.awt.Color(255, 255, 255));
        main_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/npi-space-logo.png"))); // NOI18N

        lbl_welcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_welcome.setForeground(new java.awt.Color(252, 253, 242));
        lbl_welcome.setText("Welcome User");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelBody.setBackground(new java.awt.Color(47, 50, 52));

        lbl_dashboard.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_dashboard.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard.setText("ELECTRONIC CHANGE NOTICE");

        btn_back.setBackground(new java.awt.Color(14, 119, 89));
        btn_back.setForeground(new java.awt.Color(255, 233, 177));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/back.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        lbl_dashboard2.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_dashboard2.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard2.setText("FORM DC");

        FirstNameText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText1.setForeground(new java.awt.Color(252, 253, 242));
        FirstNameText1.setText("No of Products");

        txt_no_of_products.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_no_of_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_no_of_productsActionPerformed(evt);
            }
        });

        btn_enter.setBackground(new java.awt.Color(14, 119, 89));
        btn_enter.setForeground(new java.awt.Color(255, 233, 177));
        btn_enter.setText("Enter");
        btn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enterActionPerformed(evt);
            }
        });

        LastNameText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText.setForeground(new java.awt.Color(252, 253, 242));
        LastNameText.setText("Products:");

        jScrollPaneBody.setBackground(new java.awt.Color(47, 50, 52));
        jScrollPaneBody.setForeground(new java.awt.Color(47, 50, 52));
        jScrollPaneBody.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneBody.setAutoscrolls(true);
        jScrollPaneBody.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        InnerJPanel.setBackground(new java.awt.Color(47, 50, 52));
        InnerJPanel.setAutoscrolls(true);

        javax.swing.GroupLayout InnerJPanelLayout = new javax.swing.GroupLayout(InnerJPanel);
        InnerJPanel.setLayout(InnerJPanelLayout);
        InnerJPanelLayout.setHorizontalGroup(
            InnerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 933, Short.MAX_VALUE)
        );
        InnerJPanelLayout.setVerticalGroup(
            InnerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jScrollPaneBody.setViewportView(InnerJPanel);

        btn_confirm.setBackground(new java.awt.Color(14, 119, 89));
        btn_confirm.setForeground(new java.awt.Color(255, 233, 177));
        btn_confirm.setText("Confirm");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(new java.awt.Color(14, 119, 89));
        btn_cancel.setForeground(new java.awt.Color(255, 233, 177));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(jScrollPaneBody, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_back)
                    .addComponent(lbl_dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(FirstNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txt_no_of_products, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LastNameText))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_no_of_products, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_enter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneBody, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        User_Dashboard user_dashboard=new User_Dashboard();
        DynamicGUITest2.this.setVisible(false);
        user_dashboard.setID(id);
        user_dashboard.setName(name);
        user_dashboard.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login user_login=new Login();
        DynamicGUITest2.this.setVisible(false);
        user_login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void txt_no_of_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_no_of_productsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_no_of_productsActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
  
    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        User_Dashboard user_dashboard=new User_Dashboard();
        DynamicGUITest2.this.setVisible(false);
        user_dashboard.setID(id);
        user_dashboard.setName(name);
        user_dashboard.setVisible(true);
        
    }//GEN-LAST:event_btn_cancelActionPerformed
    
    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed
       int no_of_products = Integer.parseInt(txt_no_of_products.getText());
       int y= 10;
       int prod=1;
        while (no_of_products>0){
            
            JTextField product2 = new JTextField("Product "+prod);
            product2.setFont(new java.awt.Font("Dialog", 0, 18));
            product2.setBounds(33, y, 390, 30);
            InnerJPanel.add(product2);
            pack(); 
            no_of_products--;
            y=y+40;
            prod++;
            product2.setVisible(false);
            product2.setVisible(true);

        }
       JScrollPane products = new JScrollPane(new JTextField());  
       getContentPane().add(products);
       setVisible(true);
       
        

       /* if (no_of_products==2){
            JTextField product2 = new JTextField();
            product2.setFont(new java.awt.Font("Dialog", 0, 18));
            product2.setBounds(33, 360, 390, 40);
            jPanelBody.add(product2);
            jPanelBody.add(createTextFieldsPanel(), BorderLayout.CENTER);
            pack();
            jPanelBody.setLayout(null);
            product2.setVisible(true);
        }*/

        
        //set size of the text box
       
        //add elements to the frame
        
    }//GEN-LAST:event_btn_enterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //EventQueue.invokeLater(() -> new My_Flights().createAndDisplayGui());
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
            java.util.logging.Logger.getLogger(DynamicGUITest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DynamicGUITest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DynamicGUITest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DynamicGUITest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new DynamicGUITest2().setVisible(true);
  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstNameText1;
    private javax.swing.JPanel InnerJPanel;
    private javax.swing.JLabel LastNameText;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_enter;
    private javax.swing.JButton btn_logout;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JScrollPane jScrollPaneBody;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_dashboard2;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel main_logo;
    private javax.swing.JTextField txt_no_of_products;
    // End of variables declaration//GEN-END:variables
}
