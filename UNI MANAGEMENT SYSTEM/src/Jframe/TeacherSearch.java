package Jframe;
import java.util.Vector;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
 import javax.swing.table.TableModel;
 import java.util.ArrayList;
 import java.util.List;
 import javax.swing.table.TableRowSorter;
 import javax.swing.RowSorter;
 import javax.swing.SortOrder;
public class TeacherSearch extends javax.swing.JFrame {  
Vector originalTableModel;
DocumentListener documentListener;
public TeacherSearch() {
        initComponents();
        setLocationRelativeTo(null);
    //backup of original values to check
    originalTableModel = (Vector) ((DefaultTableModel) detail.getModel()).getDataVector().clone();
    //add document listener to jtextfield to search contents as soon as something typed on it
    addDocumentListener();
	
      detail.setAutoCreateRowSorter(true);
    }
     private void addDocumentListener() {
        documentListener = new DocumentListener() {
        public void changedUpdate(DocumentEvent documentEvent) {
            search();
        }
        public void insertUpdate(DocumentEvent documentEvent) {
            search();
        }
        public void removeUpdate(DocumentEvent documentEvent) {
            search();
        }
        private void search() {
            searchTableContents(jTextField2.getText());
        }
    };
     jCheckBox1.setSelected(true);
    }
 private void ColSortBtnActionPerformed(java.awt.event.ActionEvent evt) {  
   // MyTableView is jTable        
   TableRowSorter<TableModel> ColSort = new TableRowSorter<>(detail.getModel());
  detail.setRowSorter(ColSort);
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
        Search_lebel = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detail = new javax.swing.JTable();
        searching = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        Exit = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Search_lebel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Search_lebel.setForeground(new java.awt.Color(0, 204, 0));
        Search_lebel.setText("Searching For Teacher ");
        jPanel1.add(Search_lebel);
        Search_lebel.setBounds(250, 20, 360, 60);

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(10, 430, 60, 60);

        detail.setAutoCreateRowSorter(true);
        detail.setModel(new javax.swing.table.DefaultTableModel(
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
            }

        ));
        jScrollPane1.setViewportView(detail);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 160, 720, 290);

        searching.setBackground(new java.awt.Color(255, 255, 255));
        searching.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        searching.setForeground(new java.awt.Color(153, 0, 153));
        searching.setText("SEARCH");
        searching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchingActionPerformed(evt);
            }
        });
        jPanel1.add(searching);
        searching.setBounds(460, 90, 120, 40);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(110, 90, 270, 40);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(153, 0, 153));
        jCheckBox1.setText("Search On Type");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(680, 90, 120, 40);

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(820, 430, 60, 60);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(0, 0, 890, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
           new Portal().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed
    private void searchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchingActionPerformed
      searchTableContents(jTextField2.getText());
    }//GEN-LAST:event_searchingActionPerformed
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
                System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jTextField2.getDocument().addDocumentListener(documentListener);
       }
       else {
            jTextField2.getDocument().addDocumentListener(null);
       }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    public void searchTableContents(String searchString) {
        DefaultTableModel Model = (DefaultTableModel) detail.getModel();
        //To empty the table before search
         Model.setRowCount(0);
         //To search for contents from original table content
         for (Object rows : originalTableModel) {
            Vector rowVector = (Vector) rows;
            for (Object column : rowVector) {
                if (column.toString().contains(searchString)) {
                //content found so adding to table
                    Model.addRow(rowVector);
                        break;
                }
            }

         }
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherSearch().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Search_lebel;
    private javax.swing.JTable detail;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton searching;
    // End of variables declaration//GEN-END:variables
}

