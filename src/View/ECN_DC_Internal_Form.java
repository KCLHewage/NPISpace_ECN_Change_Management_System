package View;

import Controller.StatementController;
import java.awt.Toolkit;

import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;


public class ECN_DC_Internal_Form extends javax.swing.JFrame {
    private String name, id, deptID;
    JTextField[] textboxes;
    JPanel contentPane = new JPanel();
    String myProducts[];
    private boolean clicked = false;
    private JFileChooser fileChooser;
    private JLabel statusLabel;
    
    String datapackName;
    int datapackID;
    String df_verified="No";
    
    Color background = new Color(31,31,35);
    Color foreground = new Color(242,242,242);
    
    int no_of_products=0;int prod=1;
    int myProd;
    String requested_date=null;String implemented_date=null;String customer;String description;
    String year;
    int ecn_num;
    String ecn_id;
    
    public ECN_DC_Internal_Form() {

        initComponents();
        setIcon();
        setTitle("NPI SPACE");
        this.setLocationRelativeTo(null);
         
        contentPane.setBackground(new java.awt.Color(47,50,52));
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS)); 
        JViewport viewport = new JViewport();
        viewport.setView(contentPane);
        jScrollPaneBody.setViewport(viewport);   
        jScrollPaneBody.setBackground(new java.awt.Color(47,50,52));
        
        jDescription.setBackground(new java.awt.Color(31, 31, 35));
        jDescription.setFont(new java.awt.Font("Dialog", 0, 16));
        jDescription.setForeground(new java.awt.Color(242, 242, 242));
        
              for( Component c : JDate_req.getComponents()){
                ((JComponent)c).setBackground(background );
                ((JComponent)c).setForeground(foreground );
              }
              for( Component c : JDate_imp.getComponents()){
                ((JComponent)c).setBackground(background);
                ((JComponent)c).setForeground(foreground );
              }
              Date date = new Date();
              JDate_imp.setDate(date);
              JDate_imp.setEditable(false);
              
        year = (Integer.toString(Year.now().getValue())).substring(2);
        
        //Get customer dropdown
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
              StatementController stcon = new StatementController();
              ResultSet result = stcon.selectData("SELECT customer FROM customer");
                
              while(result.next()) {
                  model.addElement(result.getString(1));
                }
              cmbCustomer.setModel(model);
             }
            catch(SQLException e)
             {
                JOptionPane.showMessageDialog(null, e.getMessage());
             }
        
            try {
              StatementController stcon = new StatementController();
              ResultSet result = stcon.selectData("SELECT COUNT(ecn_year) FROM ecn WHERE ecn_year='"+Integer.parseInt(year)+"'");
                
              while(result.next()) {
                  ecn_num=Integer.parseInt(result.getString(1))+1;
                  ecn_id = "ECN-"+year+"-"+ecn_num;  
                  txt_ecn_id.setText(ecn_id);
                  txt_ecn_id.setEditable(false);
                }
             }
            catch(SQLException e)
             {
                JOptionPane.showMessageDialog(null, e.getMessage());
             }

    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
    }
    public void setID(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
        lbl_welcome.setText("Welcome "+name);
    }
    public void setDeptID(String deptID){
        this.deptID=deptID;
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
        btn_submit = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        FirstNameText4 = new javax.swing.JLabel();
        FirstNameText5 = new javax.swing.JLabel();
        JDate_req = new org.jdesktop.swingx.JXDatePicker();
        JDate_imp = new org.jdesktop.swingx.JXDatePicker();
        txt_ecn_id = new javax.swing.JTextField();
        FirstNameText6 = new javax.swing.JLabel();
        lbl_customer = new javax.swing.JLabel();
        cmbCustomer = new javax.swing.JComboBox<>();
        FirstNameText7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDescription = new javax.swing.JTextArea();
        FirstNameText8 = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanelBody.setBackground(new java.awt.Color(47, 50, 52));

        lbl_dashboard.setBackground(new java.awt.Color(204, 204, 204));
        lbl_dashboard.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_dashboard.setForeground(new java.awt.Color(252, 253, 242));
        lbl_dashboard.setText("INTERNAL ECN");

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
        FirstNameText1.setText("Implemented Date");

        txt_no_of_products.setBackground(new java.awt.Color(31, 31, 35));
        txt_no_of_products.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_no_of_products.setForeground(new java.awt.Color(242, 242, 242));
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

        jScrollPaneBody.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPaneBody.setForeground(new java.awt.Color(47, 50, 52));
        jScrollPaneBody.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneBody.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneBody.setAutoscrolls(true);
        jScrollPaneBody.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPaneBody.setMaximumSize(new java.awt.Dimension(750, 420));
        jScrollPaneBody.setPreferredSize(new java.awt.Dimension(750, 420));
        jScrollPaneBody.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPaneBodyMouseClicked(evt);
            }
        });

        btn_submit.setBackground(new java.awt.Color(14, 119, 89));
        btn_submit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 233, 177));
        btn_submit.setText("SEND TO DF");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(new java.awt.Color(231, 76, 60));
        btn_cancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 233, 177));
        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        FirstNameText4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText4.setForeground(new java.awt.Color(252, 253, 242));
        FirstNameText4.setText("No of Products");

        FirstNameText5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText5.setForeground(new java.awt.Color(252, 253, 242));
        FirstNameText5.setText("Requested Date");

        JDate_req.setBackground(new java.awt.Color(47, 50, 52));

        JDate_imp.setForeground(new java.awt.Color(255, 255, 255));

        txt_ecn_id.setBackground(new java.awt.Color(31, 31, 35));
        txt_ecn_id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_ecn_id.setForeground(new java.awt.Color(242, 242, 242));
        txt_ecn_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ecn_idActionPerformed(evt);
            }
        });

        FirstNameText6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText6.setForeground(new java.awt.Color(252, 253, 242));
        FirstNameText6.setText("ECN ID");

        lbl_customer.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_customer.setForeground(new java.awt.Color(252, 253, 242));
        lbl_customer.setText("Customer");

        cmbCustomer.setBackground(new java.awt.Color(31, 31, 35));
        cmbCustomer.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cmbCustomer.setForeground(new java.awt.Color(242, 242, 242));
        cmbCustomer.setFocusable(false);
        cmbCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustomerActionPerformed(evt);
            }
        });

        FirstNameText7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText7.setForeground(new java.awt.Color(252, 253, 242));
        FirstNameText7.setText("Description:");

        jDescription.setColumns(20);
        jDescription.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jDescription.setForeground(new java.awt.Color(47, 50, 52));
        jDescription.setRows(5);
        jDescription.setCaretColor(new java.awt.Color(47, 50, 52));
        jScrollPane1.setViewportView(jDescription);

        FirstNameText8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText8.setForeground(new java.awt.Color(252, 253, 242));
        FirstNameText8.setText("Datapack:");

        uploadButton.setBackground(new java.awt.Color(14, 119, 89));
        uploadButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        uploadButton.setForeground(new java.awt.Color(255, 233, 177));
        uploadButton.setText("UPLOAD");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameText)
                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelBodyLayout.createSequentialGroup()
                            .addComponent(lbl_dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FirstNameText6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_ecn_id, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelBodyLayout.createSequentialGroup()
                                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelBodyLayout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(FirstNameText4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_no_of_products, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btn_back))
                                    .addGap(30, 30, 30)
                                    .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(lbl_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)
                                    .addComponent(cmbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPaneBody, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelBodyLayout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(FirstNameText5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JDate_req, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                    .addComponent(FirstNameText1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(JDate_imp, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                                        .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelBodyLayout.createSequentialGroup()
                                            .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36)
                                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(FirstNameText7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FirstNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbl_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ecn_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameText6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_no_of_products, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_enter)
                    .addComponent(FirstNameText4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDate_imp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameText5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDate_req, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPaneBody, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FirstNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FirstNameText7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        ECN_Internal_Dashboard ecn_dashboard=new ECN_Internal_Dashboard();
        ECN_DC_Internal_Form.this.setVisible(false);
        ecn_dashboard.setID(id);
        ecn_dashboard.setName(name);
        ecn_dashboard.setDeptID(deptID);
        ecn_dashboard.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_no_of_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_no_of_productsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_no_of_productsActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
            
       customer= cmbCustomer.getSelectedItem().toString();
       description=jDescription.getText();
       
       Date req_date =JDate_req.getDate();
       DateFormat dformat =new SimpleDateFormat("yyyy-MM-dd");
       if(JDate_req.getDate() != null) {
             requested_date = dformat.format(req_date);
       }
       Date imp_date =JDate_imp.getDate();
       DateFormat dformat2 =new SimpleDateFormat("yyyy-MM-dd");
       if(JDate_imp.getDate() != null) {
             implemented_date = dformat.format(imp_date);
       }
       
       if(JDate_req.getDate() == null) {
             JOptionPane.showMessageDialog(null,"Select a Request Date", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
       else if(JDate_imp.getDate() == null) {
             JOptionPane.showMessageDialog(null,"Select Implementation Date", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
       else{
            StatementController stcon1 = new StatementController();
            int row_count1= stcon1.insertUpdateDeleteData("INSERT INTO ecn (ecn_year, ecn_number,requested_date,implemented_date,no_of_products,customer,description,d_id,u_id,df_verified) VALUES ('"+year+"','"+ecn_num+"','"+requested_date+"','"+implemented_date+"','"+myProd+"','"+customer+"','"+description+"','"+datapackID+"','"+id+"','"+df_verified+"')");

            if (row_count1>0)  {
                   JOptionPane.showMessageDialog(null,"Successfully created ECN", "Signup",JOptionPane.INFORMATION_MESSAGE);
                   
                  Component[] children = contentPane.getComponents();
                  int successInsertion=0;
                  for (int i=0;i<children.length;i=i+2){
                  String text = ((JTextField)children[i]).getText();
                  System.out.println(text);
            
                  StatementController stcon = new StatementController();
                  int row_count= stcon.insertUpdateDeleteData("INSERT INTO product (d_type, p_name, p_date, ecn_year, ecn_number) VALUES ('"+deptID+"','"+text+"','"+implemented_date+"','"+year+"','"+ecn_num+"')");

                  if (row_count>0)  {
                       successInsertion=1;
                     //JOptionPane.showMessageDialog(null,"Successfully added Products", "Signup",JOptionPane.INFORMATION_MESSAGE);
                   }
               /*if(successInsertion==1) {  
                    JOptionPane.showMessageDialog(null,"Successfully added Products", "Signup",JOptionPane.INFORMATION_MESSAGE);
               }*/
                  }
                if(successInsertion==1) {  
                        JOptionPane.showMessageDialog(null,"Successfully added Products", "ECN Created",JOptionPane.INFORMATION_MESSAGE);
                 }
            }
            else {
                JOptionPane.showMessageDialog(null,"Error could not create ECN", "ECN Creation Failure",JOptionPane.INFORMATION_MESSAGE);
            }
            
            try {
                    StatementController stcon = new StatementController();
                    ResultSet result = stcon.selectData("SELECT user.u_email as user_data from user INNER JOIN customer ON user.u_id = customer.u_id INNER JOIN ecn ON customer.customer = ecn.customer");
                    if (result.next()) {
                        String ToEmail = result.getString(1);
                        String Subjects = "Pending Engineering Change Notice: " + ecn_id;
                        String Emessage = "Dear DF Engineer,\n" +
                                            "\n" +
                                            "This email is to inform you that a pending Engineering Change Notice (ECN) has been assigned to you. The details of the ECN are as follows:\n" +
                                            "\n" +
                                            "ECN ID: "+ecn_id+"\n" +
                                            "Description: "+description+"\n" +
                                            "Requested Date: "+requested_date+"\n" +
                                            "Please review the ECN and take appropriate action as necessary.\n" +
                                            "\n" +
                                            "Thank you for your attention to this matter.\n" +
                                            "\n" +
                                            "Best regards, "+name+"";
                        boolean sent = sendEmail(ToEmail, Subjects, Emessage);
                        if (sent) {
                            JOptionPane.showMessageDialog(this, "Email sent successfully!");
                        } else {
                            JOptionPane.showMessageDialog(this, "Failed to send email.");
                       }
                       
                        
                    } 
                    else {
                        System.out.println("No email found for customer.");
                    }
                } 
            catch (SQLException ex) {
                System.out.println("Error retrieving email: " + ex.getMessage());
            }

       }
       
       
               
       
       
    }//GEN-LAST:event_btn_submitActionPerformed
    public static boolean sendEmail(String ToEmail, String Subjects, String Emessage){
            String senderName = "NPI SPACE";
            String FromEmail = "npispace23@gmail.com";
            String FromEmailPassword = "dddfjfyhpgpekngh";
            
            Properties properties = new Properties();
            properties.put("mail.smtp.user",senderName);
            properties.put("mail.smtp.user",FromEmail);
            properties.put("mail.smtp.auth","true");
            properties.put("mail.smtp.starttls.enable","true");
            properties.put("mail.smtp.EnableSSL.enable","true");
            properties.put("mail.smtp.host","smtp.gmail.com");
            properties.put("mail.smtp.port","25");
            properties.put("mail.debug", "true");

            properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
            properties.setProperty("mail.smtp.socketFactory.fallback", "false");   
            properties.setProperty("mail.smtp.port", "465");   
            properties.setProperty("mail.smtp.socketFactory.port", "465");

            Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(FromEmail,FromEmailPassword);
                }
            });

            try{
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(FromEmail,senderName));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
                message.setSubject(Subjects);
                message.setText(Emessage);
                Transport.send(message);
                return true;
                //System.out.println("Done");
            }
            catch(MessagingException e){
                e.printStackTrace();
                return false;
            } 
            catch (UnsupportedEncodingException ex) {
             //Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
             return false;
            }    
        }
    
    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        User_Dashboard user_dashboard=new User_Dashboard();
        ECN_DC_Internal_Form.this.setVisible(false);
        user_dashboard.setID(id);
        user_dashboard.setName(name);
        user_dashboard.setDeptID(deptID);
        user_dashboard.setVisible(true);
        
    }//GEN-LAST:event_btn_cancelActionPerformed
    
    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed

       
       Pattern p = Pattern.compile("[0-9]+");
       Matcher m = p.matcher(txt_no_of_products.getText());
       
       
       if (txt_no_of_products.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Enter Number of DC Products to be Added", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
       else if (!(m.matches())) {
            JOptionPane.showMessageDialog(null,"Enter a Valid Number", "Invalid Input",JOptionPane.INFORMATION_MESSAGE); 
        }
       else {/*
            no_of_products = Integer.parseInt(txt_no_of_products.getText());
            textboxes=new JTextField[no_of_products];
            

            contentPane.removeAll();
            contentPane.updateUI();
            prod=1;
            while (no_of_products>0){
                
                JTextField product2 = new JTextField("Product "+prod);

                 product2.setBackground(new java.awt.Color(31, 31, 35));
                 product2.setFont(new java.awt.Font("Dialog", 0, 18));
                 product2.setForeground(new java.awt.Color(242, 242, 242));

                 product2.setPreferredSize(new Dimension(Integer.MAX_VALUE, 40));
                 product2.setMaximumSize( new Dimension(Integer.MAX_VALUE, product2.getPreferredSize().height)  );
                 

                 contentPane.add(product2);
                 contentPane.add(Box.createRigidArea(new Dimension(Integer.MAX_VALUE, 10)));    
                 contentPane.revalidate();            
                 no_of_products--;
                 textboxes[prod-1]=product2;
                 prod++;
                 product2.setVisible(false);
                 product2.setVisible(true);    
               
                
            }
             pack();
        */
        no_of_products = Integer.parseInt(txt_no_of_products.getText());
        myProd=no_of_products;
        textboxes=new JTextField[no_of_products];
        
        contentPane.removeAll();
        contentPane.updateUI();
        prod=1;
        while (no_of_products>0){
            JTextField product2 = new JTextField("Product "+prod);

            product2.setBackground(new java.awt.Color(31, 31, 35));
            product2.setFont(new java.awt.Font("Dialog", 0, 18));
            product2.setForeground(new java.awt.Color(242, 242, 242));

            product2.setPreferredSize(new Dimension(Integer.MAX_VALUE, 40));
            product2.setMaximumSize( new Dimension(Integer.MAX_VALUE, product2.getPreferredSize().height) );

            // Add an ActionListener to clear the text of the selected text field
            product2.addFocusListener(new FocusListener() {
                boolean firstTime = true;

                @Override
                public void focusGained(FocusEvent e) {
                    if (firstTime) {
                        product2.setText("");
                        firstTime = false;
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    // Do nothing
                }
            });

            contentPane.add(product2);
            contentPane.add(Box.createRigidArea(new Dimension(Integer.MAX_VALUE, 10)));
            contentPane.revalidate();
            no_of_products--;
            textboxes[prod-1]=product2;
            prod++;
            product2.setVisible(false);
            product2.setVisible(true);
        }
        pack();
       }
       
       
    }//GEN-LAST:event_btn_enterActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login user_login=new Login();
        ECN_DC_Internal_Form.this.setVisible(false);
        user_login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void txt_ecn_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ecn_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ecn_idActionPerformed

    private void jScrollPaneBodyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPaneBodyMouseClicked

    }//GEN-LAST:event_jScrollPaneBodyMouseClicked

    private void uploadFile(String filePath) {
        Thread thread = new Thread() {
            public void run() {
                try {
                    progressBar.setIndeterminate(true);                 
                    
                    File file = new File(filePath);
                       FileInputStream fis = new FileInputStream(file);
                       // Get the size of the file
                            long length = file.length();

                            // Create a byte array to hold the data
                            byte[] data = new byte[(int)length];

                            // Read in the bytes
                            int offset = 0;
                            int numRead = 0;
                            while (offset < data.length && (numRead = fis.read(data, offset, data.length - offset)) >= 0) {
                                offset += numRead;
                            }

                            // Make sure all the bytes have been read
                            if (offset != data.length) {
                                throw new IOException("Could not completely read file " + file.getName());
                            }

                                
                    // Save the zip file to the database
                    //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/npitest", "root", "");
                    
                    //PreparedStatement stmt = conn.prepareStatement(sql);
                    datapackName= fileChooser.getSelectedFile().getName();
                    StatementController stcon = new StatementController();
                    String sql = "INSERT INTO zip_files (name, data) VALUES (?, ?)";
                    PreparedStatement stmt2 = stcon.selectPreparedStatement(sql);
                    
                    stmt2.setString(1, fileChooser.getSelectedFile().getName());
                    stmt2.setBytes(2, data);
                    stmt2.executeUpdate();
                    stmt2.close();
                    
                    try {
                    StatementController stcon2 = new StatementController();
                    ResultSet result = stcon2.selectData("SELECT id FROM zip_files WHERE name='"+datapackName+"'");

                    while(result.next()) {
                        datapackID=Integer.parseInt(result.getString(1));
                      }
                    System.out.println(datapackID);
                   }
                  catch(SQLException e)
                   {
                      JOptionPane.showMessageDialog(null, e.getMessage());
                   }

                    //conn.close();

                    JOptionPane.showMessageDialog(null,"Upload Complete", "Upload Complete",JOptionPane.INFORMATION_MESSAGE); 
                } catch (IOException | SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Upload Failed", "Upload Failed",JOptionPane.INFORMATION_MESSAGE); 
                } finally {
                    progressBar.setIndeterminate(false);
                }
            }
        };
        thread.start();
    }
    private byte[] readAllBytes(ZipInputStream zipStream) throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    byte[] buffer = new byte[4096];
    int bytesRead;
    while ((bytesRead = zipStream.read(buffer)) != -1) {
        out.write(buffer, 0, bytesRead);
    }
    return out.toByteArray();
    }
    
    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        
        fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                   uploadFile(fileChooser.getSelectedFile().getAbsolutePath());
                   
                   
                }    
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void cmbCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(ECN_DC_Internal_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ECN_DC_Internal_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ECN_DC_Internal_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ECN_DC_Internal_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                
                new ECN_DC_Internal_Form().setVisible(true);
  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstNameText1;
    private javax.swing.JLabel FirstNameText4;
    private javax.swing.JLabel FirstNameText5;
    private javax.swing.JLabel FirstNameText6;
    private javax.swing.JLabel FirstNameText7;
    private javax.swing.JLabel FirstNameText8;
    private org.jdesktop.swingx.JXDatePicker JDate_imp;
    private org.jdesktop.swingx.JXDatePicker JDate_req;
    private javax.swing.JLabel LastNameText;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_enter;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> cmbCustomer;
    private javax.swing.JTextArea jDescription;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneBody;
    private javax.swing.JLabel lbl_customer;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_dashboard2;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel main_logo;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextField txt_ecn_id;
    private javax.swing.JTextField txt_no_of_products;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
