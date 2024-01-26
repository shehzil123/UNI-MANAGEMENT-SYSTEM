package Jframe;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class TeacherPortal extends javax.swing.JFrame {
// Creates new form TeacherPortal
    public TeacherPortal() {
        initComponents();
    }
 private void ColSortBtnActionPerformed(java.awt.event.ActionEvent evt) {  
   // MyTableView is jTable        
   TableRowSorter<TableModel> ColSort = new TableRowSorter<>(teacherdetail.getModel());
  teacherdetail.setRowSorter(ColSort);
   List<RowSorter.SortKey> ColSortingKeys = new ArrayList<>();
   //"SortColNo" is use to set Column No for Sorting
   int SortColNo = 1;
   //"SortKey" is used for sort order for a particular column
   ColSortingKeys.add(new RowSorter.SortKey(SortColNo, SortOrder.ASCENDING));
 
   ColSort.setSortKeys(ColSortingKeys);
   ColSort.sort();
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Search = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Title_Name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        teacherdetail = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Search.setBackground(new java.awt.Color(255, 255, 255));
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search);
        Search.setBounds(820, 10, 60, 60);

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N
        Back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(10, 430, 60, 60);

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(820, 430, 60, 60);

        Title_Name.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Title_Name.setForeground(new java.awt.Color(153, 0, 153));
        Title_Name.setText("Teacher Portal");
        jPanel1.add(Title_Name);
        Title_Name.setBounds(330, 30, 230, 30);

        teacherdetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"DR. BASEERA AMBREEN", "ASSISTANT PROFESSOR", "SOFTWARE ENGINEERING"},
                {"DR. ZIA UL HASSAN", "ASSISTANT PROFESSOR", "SOFTWARE ENGINEERING"},
                {"PROF. DR. MUHAMMAD FAKHAR UL HAQ NOORI", "PROFESSOR", "SOFTWARE ENGINEERING"},
                {"PROF. DR. MUHAMMAD KAMRAN ", "PROFESSOR", "SOFTWARE ENGINEERING"},
                {"PROF. DR. ZAHID MUNIR KHAN AMIR", "PROFESSOR", "SOFTWARE ENGINEERING"},
                {"PROF. DR. SYED NAWAZISH I HUSAIN", "PROFESSOR", "SOFTWARE ENGINEERING"},
                {"DR. ABIDA LATIF", "ASSISTANT PROFESSOR", "SOFTWARE ENGINEERING"},
                {"DR. SYED ATIF RAZA", "ASSISTANT PROFESSOR", "SOFTWARE ENGINEERING"},
                {"PROF. DR. KHALID HUSSAIN", "PROFESSOR", "SOFTWARE ENGINEERING"},
                {"PROF. DR. NADEEM IRFAN BUKHARI", "PROFESSOR", "SOFTWARE ENGINEERING"},
                {"PROF. DR. JAVED IQBAL QAZI", "PROFESSOR", "CIVIL ENGINEERING"},
                {"PROF. DR. MUHAMMAD NAEEM KHAN", "PROFESSOR", "CIVIL ENGINEERING"},
                {"PROF. DR. SAYYID SALMAN RIZAVI", "PROFESSOR", "CIVIL ENGINEERING"},
                {"PROF. DR. HASSAN MOBEEN ALAM", "PROFESSOR", "CIVIL ENGINEERING"},
                {"PROF. DR. NASIRA JABEEN", "PROFESSOR", "CIVIL ENGINEERING"},
                {"PROF. DR. MUHAMMAD SALEEM HAIDER", "PROFESSOR", "CIVIL ENGINEERING"},
                {"PROF. DR. AMTUL JAMIL SAMI", "PROFESSOR", "CIVIL ENGINEERING"},
                {"PROF. DR. MUBBSHER MUNAWAR KHAN", "PROFESSOR", "CIVIL ENGINEERING"},
                {"PROF. DR. ABDUS SALAM", "PROFESSOR", "CIVIL ENGINEERING"},
                {"PROF. DR. MAHMOOD SALEEM", "PROFESSOR", "CIVIL ENGINEERING"},
                {"PROF. DR. RAFI ULLAH KHAN", "PROFESSOR", "ELECTRICAL ENGINEERING"},
                {"PROF. DR. SHAHID MUNIR", "PROFESSOR", "ELECTRICAL ENGINEERING"},
                {"PROF. DR. SAYYID MUHAMMAD AKRAM SHAH", "PROFESSOR", "ELECTRICAL ENGINEERING"},
                {"PROF. DR. MUHAMMAD TAQI ZAHID BUTT", "PROFESSOR", "ELECTRICAL ENGINEERING"},
                {"PROF. DR. RAFIQ AHMAD", "PROFESSOR", "ELECTRICAL ENGINEERING"},
                {"PROF. DR. MUHAMMAD FAISAL", "PROFESSOR", "ELECTRICAL ENGINEERING"},
                {"PROF. DR. IFTIKHAR AHMAD", "PROFESSOR", "ELECTRICAL ENGINEERING"},
                {"PROF. DR. SIKANDAR SULTAN", "PROFESSOR", "ELECTRICAL ENGINEERING"},
                {"PROF. DR. ANJUM NASIM SABIRI", "PROFESSOR", "ELECTRICAL ENGINEERING"},
                {"PROF. DR. MAZHAR UD DIN RANA", "PROFESSOR", "ELECTRICAL ENGINEERING"}
            },
            new String [] {
                "Name", "Designation", "Department"
            }));
            jScrollPane1.setViewportView(teacherdetail);

            jPanel1.add(jScrollPane1);
            jScrollPane1.setBounds(90, 90, 710, 370);

            Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
            Background.setText("jLabel1");
            jPanel1.add(Background);
            Background.setBounds(0, 0, 890, 500);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       this.setVisible(false);
        new Portal().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed
    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        this.setVisible(false);
        new TeacherSearch().setVisible(true);
    }//GEN-LAST:event_SearchActionPerformed
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
           System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherPortal().setVisible(true);

        File file = new File("C:\\Users\\Mutiullah\\Desktop\\New folder\\UNI MANAGEMENT SYSTEM\\details.txt");  


            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Search;
    private javax.swing.JLabel Title_Name;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable teacherdetail;
    // End of variables declaration//GEN-END:variables
}
