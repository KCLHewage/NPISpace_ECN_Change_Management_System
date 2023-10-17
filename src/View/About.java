package View;
import java.awt.Toolkit;

public class About extends javax.swing.JFrame {

    public About() {
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
        jPanel2 = new javax.swing.JPanel();
        main_logo1 = new javax.swing.JLabel();
        lbl_airline = new javax.swing.JLabel();
        lbl_developedby = new javax.swing.JLabel();
        lbl_developer = new javax.swing.JLabel();
        lbl_index = new javax.swing.JLabel();
        OwnerName2 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        btn_trademark = new javax.swing.JLabel();
        lbl_aboutus = new javax.swing.JLabel();
        lbl_developer1 = new javax.swing.JLabel();
        lbl_index1 = new javax.swing.JLabel();
        OwnerName3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 570));

        jPanel1.setBackground(new java.awt.Color(14, 119, 89));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 550));

        jPanel2.setBackground(new java.awt.Color(59, 52, 134));

        main_logo1.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        main_logo1.setForeground(new java.awt.Color(255, 255, 255));
        main_logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(main_logo1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_logo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbl_airline.setBackground(new java.awt.Color(204, 204, 204));
        lbl_airline.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_airline.setForeground(new java.awt.Color(255, 255, 255));
        lbl_airline.setText("NPI Space ECN Management System");

        lbl_developedby.setBackground(new java.awt.Color(204, 204, 204));
        lbl_developedby.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_developedby.setForeground(new java.awt.Color(255, 255, 255));
        lbl_developedby.setText("Developed by");

        lbl_developer.setBackground(new java.awt.Color(204, 204, 204));
        lbl_developer.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_developer.setForeground(new java.awt.Color(255, 255, 255));
        lbl_developer.setText("Lakshan Hewage - CODSE213F-024");

        lbl_index.setBackground(new java.awt.Color(204, 204, 204));
        lbl_index.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_index.setForeground(new java.awt.Color(255, 255, 255));
        lbl_index.setText("Kavinda Appuhamy - CODSE213F-007");

        OwnerName2.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OwnerName2.setForeground(new java.awt.Color(255, 255, 255));
        OwnerName2.setText("DSE 21.3F Final Project ");

        btn_close.setBackground(new java.awt.Color(31, 31, 35));
        btn_close.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_close.setForeground(new java.awt.Color(242, 242, 242));
        btn_close.setText("CLOSE");
        btn_close.setFocusPainted(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        btn_trademark.setBackground(new java.awt.Color(204, 204, 204));
        btn_trademark.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_trademark.setForeground(new java.awt.Color(255, 255, 255));
        btn_trademark.setText("© 2023 NPI Space");

        lbl_aboutus.setBackground(new java.awt.Color(204, 204, 204));
        lbl_aboutus.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_aboutus.setForeground(new java.awt.Color(255, 255, 255));
        lbl_aboutus.setText("ABOUT US");

        lbl_developer1.setBackground(new java.awt.Color(204, 204, 204));
        lbl_developer1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_developer1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_developer1.setText("Oneli Kumarasinghe - CODSE213F-014");

        lbl_index1.setBackground(new java.awt.Color(204, 204, 204));
        lbl_index1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_index1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_index1.setText("Thilina Nuraj - CODSE213F-008");

        OwnerName3.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OwnerName3.setForeground(new java.awt.Color(255, 255, 255));
        OwnerName3.setText("National Institute of Business Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OwnerName3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_developer1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_index1)
                    .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_trademark, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OwnerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_developedby, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_aboutus, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_airline, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_developer, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_index))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(lbl_aboutus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbl_airline)
                .addGap(18, 18, 18)
                .addComponent(lbl_developedby, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_developer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_index, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lbl_developer1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_index1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OwnerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OwnerName3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_trademark)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OwnerName2;
    private javax.swing.JLabel OwnerName3;
    private javax.swing.JButton btn_close;
    private javax.swing.JLabel btn_trademark;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_aboutus;
    private javax.swing.JLabel lbl_airline;
    private javax.swing.JLabel lbl_developedby;
    private javax.swing.JLabel lbl_developer;
    private javax.swing.JLabel lbl_developer1;
    private javax.swing.JLabel lbl_index;
    private javax.swing.JLabel lbl_index1;
    private javax.swing.JLabel main_logo1;
    // End of variables declaration//GEN-END:variables
}
