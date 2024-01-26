package Jframe;
public class Portal extends javax.swing.JFrame {
     // Creates new form Portal
    public Portal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        TeacherPortal = new javax.swing.JButton();
        StudentPortal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(820, 430, 60, 60);

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(10, 430, 60, 60);

        TeacherPortal.setBackground(new java.awt.Color(255, 255, 255));
        TeacherPortal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teacherportal.png"))); // NOI18N
        TeacherPortal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherPortalActionPerformed(evt);
            }
        });
        jPanel1.add(TeacherPortal);
        TeacherPortal.setBounds(110, 80, 320, 380);

        StudentPortal.setBackground(new java.awt.Color(255, 255, 255));
        StudentPortal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/StudentPortal.png"))); // NOI18N
        StudentPortal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentPortalActionPerformed(evt);
            }
        });
        jPanel1.add(StudentPortal);
        StudentPortal.setBounds(460, 80, 320, 380);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("PORTAL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(330, 20, 240, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void TeacherPortalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherPortalActionPerformed
        this.setVisible(false);
        new TeacherPortal().setVisible(true);
    }//GEN-LAST:event_TeacherPortalActionPerformed
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       this.setVisible(false);
        new FrontPage().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed
    private void StudentPortalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentPortalActionPerformed
        this.setVisible(false);
        new StudentPortal().setVisible(true);
    }//GEN-LAST:event_StudentPortalActionPerformed
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
             System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Exit;
    private javax.swing.JButton StudentPortal;
    private javax.swing.JButton TeacherPortal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
