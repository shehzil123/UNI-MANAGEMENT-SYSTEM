package Jframe;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class StudentPortal extends javax.swing.JFrame {
    //Creates new form StudentPortal
    public StudentPortal() {
        initComponents();
    }
 private void ColSortBtnActionPerformed(java.awt.event.ActionEvent evt) {  
   // MyTableView is jTable        
   TableRowSorter<TableModel> ColSort = new TableRowSorter<>(StudentDetail.getModel());
  StudentDetail.setRowSorter(ColSort);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        StudentDetail = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        StudentDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2021F-BSE-101","SOFTWARE ENGINEERING","A","2.8","42101500"},
                {"2021F-BSE-102","SOFTWARE ENGINEERING","A","3.2","42101501"},
                {"2021F-BSE-103","SOFTWARE ENGINEERING","A","3.1","42101502"},
                {"2021F-BSE-104","SOFTWARE ENGINEERING","A","3.25","42101503"},
                {"2021F-BSE-105","SOFTWARE ENGINEERING","A","2.8","42101504"},
                {"2021F-BSE-106","SOFTWARE ENGINEERING","A","3.5","42101505"},
                {"2021F-BSE-107","SOFTWARE ENGINEERING","A","3","42101506"},
                {"2021F-BSE-108","SOFTWARE ENGINEERING","A","2.6","42101507"},
                {"2021F-BSE-109","SOFTWARE ENGINEERING","A","3.4","42101508"},
                {"2021F-BSE-110","SOFTWARE ENGINEERING","A","3","42101509"},
                {"2021F-BSE-111","SOFTWARE ENGINEERING","A","2.4","42101510"},
                {"2021F-BSE-112","SOFTWARE ENGINEERING","A","2.3","42101511"},
                {"2021F-BSE-113","SOFTWARE ENGINEERING","A","2.1","42101512"},
                {"2021F-BSE-114","SOFTWARE ENGINEERING","A","3.5","42101513"},
                {"2021F-BSE-115","SOFTWARE ENGINEERING","A","3.6","42101514"},
                {"2021F-BSE-116","SOFTWARE ENGINEERING","A","3.3","42101515"},
                {"2021F-BSE-117","SOFTWARE ENGINEERING","A","3.7","42101516"},
                {"2021F-BSE-118","SOFTWARE ENGINEERING","A","2.5","42101517"},
                {"2021F-BSE-119","SOFTWARE ENGINEERING","A","2.8","42101518"},
                {"2021F-BSE-120","SOFTWARE ENGINEERING","A","2.6","42101519"},
                {"2021F-BSE-121","SOFTWARE ENGINEERING","A","2.9","42101520"},
                {"2021F-BSE-122","SOFTWARE ENGINEERING","A","3","42101521"},
                {"2021F-BSE-123","SOFTWARE ENGINEERING","A","3.1","42101522"},
                {"2021F-BSE-124","SOFTWARE ENGINEERING","A","3.8","42101523"},
                {"2021F-BSE-125","SOFTWARE ENGINEERING","A","2.6","42101524"},
                {"2021F-BSE-126","SOFTWARE ENGINEERING","B","3.64","42101525"},
                {"2021F-BSE-127","SOFTWARE ENGINEERING","B","2.12","42101526"},
                {"2021F-BSE-128","SOFTWARE ENGINEERING","B","2.53","42101527"},
                {"2021F-BSE-129","SOFTWARE ENGINEERING","B","2.33","42101528"},
                {"2021F-BSE-130","SOFTWARE ENGINEERING","B","3.12","42101529"},
                {"2021F-BSE-131","SOFTWARE ENGINEERING","B","3.06","42101530"},
                {"2021F-BSE-132","SOFTWARE ENGINEERING","B","2.63","42101531"},
                {"2021F-BSE-133","SOFTWARE ENGINEERING","B","2.33","42101532"},
                {"2021F-BSE-134","SOFTWARE ENGINEERING","B","2.55","42101533"},
                {"2021F-BSE-135","SOFTWARE ENGINEERING","B","2.04","42101534"},
                {"2021F-BSE-136","SOFTWARE ENGINEERING","B","3.95","42101535"},
                {"2021F-BSE-137","SOFTWARE ENGINEERING","B","2.06","42101536"},
                {"2021F-BSE-138","SOFTWARE ENGINEERING","B","3.04","42101537"},
                {"2021F-BSE-139","SOFTWARE ENGINEERING","B","3","42101538"},
                {"2021F-BSE-140","SOFTWARE ENGINEERING","B","2.41","42101539"},
                {"2021F-BSE-141","SOFTWARE ENGINEERING","B","3.22","42101540"},
                {"2021F-BSE-142","SOFTWARE ENGINEERING","B","2.98","42101541"},
                {"2021F-BSE-143","SOFTWARE ENGINEERING","B","3.46","42101542"},
                {"2021F-BSE-144","SOFTWARE ENGINEERING","B","2.51","42101543"},
                {"2021F-BSE-145","SOFTWARE ENGINEERING","B","2.63","42101544"},
                {"2021F-BSE-146","SOFTWARE ENGINEERING","B","3.25","42101545"},
                {"2021F-BSE-147","SOFTWARE ENGINEERING","B","3.06","42101546"},
                {"2021F-BSE-148","SOFTWARE ENGINEERING","B","3.33","42101547"},
                {"2021F-BSE-149","SOFTWARE ENGINEERING","B","2.4","42101548"},
                {"2021F-BSE-150","SOFTWARE ENGINEERING","B","2.33","42101549"},
                {"2021F-BCV-151","CIVIL ENGINEERING","A","2.5","42101550"},
                {"2021F-BCV-152","CIVIL ENGINEERING","A","3.62","42101551"},
                {"2021F-BCV-153","CIVIL ENGINEERING","A","3.2","42101552"},
                {"2021F-BCV-154","CIVIL ENGINEERING","A","3.05","42101553"},
                {"2021F-BCV-155","CIVIL ENGINEERING","A","2.63","42101554"},
                {"2021F-BCV-156","CIVIL ENGINEERING","A","2.4","42101555"},
                {"2021F-BCV-157","CIVIL ENGINEERING","A","2.14","42101556"},
                {"2021F-BCV-158","CIVIL ENGINEERING","A","2.05","42101557"},
                {"2021F-BCV-159","CIVIL ENGINEERING","A","3.22","42101558"},
                {"2021F-BCV-160","CIVIL ENGINEERING","A","3","42101559"},
                {"2021F-BCV-161","CIVIL ENGINEERING","A","2.63","42101560"},
                {"2021F-BCV-162","CIVIL ENGINEERING","A","2.59","42101561"},
                {"2021F-BCV-163","CIVIL ENGINEERING","A","2.95","42101562"},
                {"2021F-BCV-164","CIVIL ENGINEERING","A","2.52","42101563"},
                {"2021F-BCV-165","CIVIL ENGINEERING","A","3.05","42101564"},
                {"2021F-BCV-166","CIVIL ENGINEERING","A","3.22","42101565"},
                {"2021F-BCV-167","CIVIL ENGINEERING","A","3.51","42101566"},
                {"2021F-BCV-168","CIVIL ENGINEERING","A","2.13","42101567"},
                {"2021F-BCV-169","CIVIL ENGINEERING","A","2.05","42101568"},
                {"2021F-BCV-170","CIVIL ENGINEERING","A","3.06","42101569"},
                {"2021F-BCV-171","CIVIL ENGINEERING","A","3.6","42101570"},
                {"2021F-BCV-172","CIVIL ENGINEERING","A","2.55","42101571"},
                {"2021F-BCV-173","CIVIL ENGINEERING","A","2.4","42101572"},
                {"2021F-BCV-174","CIVIL ENGINEERING","A","2.6","42101573"},
                {"2021F-BCV-175","CIVIL ENGINEERING","A","2.8","42101574"},
                {"2021F-BCV-176","CIVIL ENGINEERING","B","3.67","42101575"},
                {"2021F-BCV-177","CIVIL ENGINEERING","B","2.03","42101576"},
                {"2021F-BCV-178","CIVIL ENGINEERING","B","2.15","42101577"},
                {"2021F-BCV-179","CIVIL ENGINEERING","B","3.26","42101578"},
                {"2021F-BCV-180","CIVIL ENGINEERING","B","3.05","42101579"},
                {"2021F-BCV-181","CIVIL ENGINEERING","B","3.55","42101580"},
                {"2021F-BCV-182","CIVIL ENGINEERING","B","3.62","42101581"},
                {"2021F-BCV-183","CIVIL ENGINEERING","B","3.02","42101582"},
                {"2021F-BCV-184","CIVIL ENGINEERING","B","3.56","42101583"},
                {"2021F-BCV-185","CIVIL ENGINEERING","B","3.19","42101584"},
                {"2021F-BCV-186","CIVIL ENGINEERING","B","3.27","42101585"},
                {"2021F-BCV-187","CIVIL ENGINEERING","B","3.52","42101586"},
                {"2021F-BCV-188","CIVIL ENGINEERING","B","3.04","42101587"},
                {"2021F-BCV-189","CIVIL ENGINEERING","B","3.01","42101588"},
                {"2021F-BCV-190","CIVIL ENGINEERING","B","2.06","42101589"},
                {"2021F-BCV-191","CIVIL ENGINEERING","B","2.53","42101590"},
                {"2021F-BCV-192","CIVIL ENGINEERING","B","2.41","42101591"},
                {"2021F-BCV-193","CIVIL ENGINEERING","B","2.5","42101592"},
                {"2021F-BCV-194","CIVIL ENGINEERING","B","2.31","42101593"},
                {"2021F-BCV-195","CIVIL ENGINEERING","B","2.36","42101594"},
                {"2021F-BCV-196","CIVIL ENGINEERING","B","2.09","42101595"},
                {"2021F-BCV-197","CIVIL ENGINEERING","B","3.01","42101596"},
                {"2021F-BCV-198","CIVIL ENGINEERING","B","3.26","42101597"},
                {"2021F-BCV-199","CIVIL ENGINEERING","B","3.22","42101598"},
                {"2021F-BCV-200","CIVIL ENGINEERING","B","3.14","42101599"},
                {"2021F-BEE-201","ELECTRICAL ENGINEERING","A","3.66","42101600"},
                {"2021F-BEE-202","ELECTRICAL ENGINEERING","A","3.02","42101601"},
                {"2021F-BEE-203","ELECTRICAL ENGINEERING","A","3.01","42101602"},
                {"2021F-BEE-204","ELECTRICAL ENGINEERING","A","2.65","42101603"},
                {"2021F-BEE-205","ELECTRICAL ENGINEERING","A","2.5","42101604"},
                {"2021F-BEE-206","ELECTRICAL ENGINEERING","A","3.5","42101605"},
                {"2021F-BEE-207","ELECTRICAL ENGINEERING","A","3.4","42101606"},
                {"2021F-BEE-208","ELECTRICAL ENGINEERING","A","3.88","42101607"},
                {"2021F-BEE-209","ELECTRICAL ENGINEERING","A","3.9","42101608"},
                {"2021F-BEE-210","ELECTRICAL ENGINEERING","A","2.63","42101609"},
                {"2021F-BEE-211","ELECTRICAL ENGINEERING","A","2.01","42101610"},
                {"2021F-BEE-212","ELECTRICAL ENGINEERING","A","2.05","42101611"},
                {"2021F-BEE-213","ELECTRICAL ENGINEERING","A","2.53","42101612"},
                {"2021F-BEE-214","ELECTRICAL ENGINEERING","A","2.01","42101613"},
                {"2021F-BEE-215","ELECTRICAL ENGINEERING","A","2.41","42101614"},
                {"2021F-BEE-216","ELECTRICAL ENGINEERING","A","2.56","42101615"},
                {"2021F-BEE-217","ELECTRICAL ENGINEERING","A","3.25","42101616"},
                {"2021F-BEE-218","ELECTRICAL ENGINEERING","A","3.01","42101617"},
                {"2021F-BEE-219","ELECTRICAL ENGINEERING","A","3.24","42101618"},
                {"2021F-BEE-220","ELECTRICAL ENGINEERING","A","3.6","42101619"},
                {"2021F-BEE-221","ELECTRICAL ENGINEERING","A","2.01","42101620"},
                {"2021F-BEE-222","ELECTRICAL ENGINEERING","A","2.6","42101621"},
                {"2021F-BEE-223","ELECTRICAL ENGINEERING","A","2.35","42101622"},
                {"2021F-BEE-224","ELECTRICAL ENGINEERING","A","2.1","42101623"},
                {"2021F-BEE-225","ELECTRICAL ENGINEERING","A","2.05","42101624"},
                {"2021F-BEE-226","ELECTRICAL ENGINEERING","B","3.6","42101625"},
                {"2021F-BEE-227","ELECTRICAL ENGINEERING","B","3.2","42101626"},
                {"2021F-BEE-228","ELECTRICAL ENGINEERING","B","3.5","42101627"},
                {"2021F-BEE-229","ELECTRICAL ENGINEERING","B","2.15","42101628"},
                {"2021F-BEE-230","ELECTRICAL ENGINEERING","B","2.45","42101629"},
                {"2021F-BEE-231","ELECTRICAL ENGINEERING","B","2.3","42101630"},
                {"2021F-BEE-232","ELECTRICAL ENGINEERING","B","2.6","42101631"},
                {"2021F-BEE-233","ELECTRICAL ENGINEERING","B","3.6","42101632"},
                {"2021F-BEE-234","ELECTRICAL ENGINEERING","B","3.2","42101633"},
                {"2021F-BEE-235","ELECTRICAL ENGINEERING","B","3.02","42101634"},
                {"2021F-BEE-236","ELECTRICAL ENGINEERING","B","2.53","42101635"},
                {"2021F-BEE-237","ELECTRICAL ENGINEERING","B","3.48","42101636"},
                {"2021F-BEE-238","ELECTRICAL ENGINEERING","B","3.16","42101637"},
                {"2021F-BEE-239","ELECTRICAL ENGINEERING","B","3.52","42101638"},
                {"2021F-BEE-240","ELECTRICAL ENGINEERING","B","3.2","42101639"},
                {"2021F-BEE-241","ELECTRICAL ENGINEERING","B","2.3","42101640"},
                {"2021F-BEE-242","ELECTRICAL ENGINEERING","B","2.56","42101641"},
                {"2021F-BEE-243","ELECTRICAL ENGINEERING","B","2.45","42101642"},
                {"2021F-BEE-244","ELECTRICAL ENGINEERING","B","2.87","42101643"},
                {"2021F-BEE-245","ELECTRICAL ENGINEERING","B","2.03","42101644"},
                {"2021F-BEE-246","ELECTRICAL ENGINEERING","B","2.3","42101645"},
                {"2021F-BEE-247","ELECTRICAL ENGINEERING","B","2.01","42101646"},
                {"2021F-BEE-248","ELECTRICAL ENGINEERING","B","2.36","42101647"},
                {"2021F-BEE-249","ELECTRICAL ENGINEERING","B","2.6","42101648"},
                {"2021F-BEE-250","ELECTRICAL ENGINEERING","B","2.46","42101649"}
            },

            new String [] {
                "Roll_Number", "Department", "Section", "G.P.A", "Finance"
            }
        ));
        jScrollPane2.setViewportView(StudentDetail);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(90, 80, 720, 380);

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(10, 430, 60, 60);

        Search.setBackground(new java.awt.Color(255, 255, 255));
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search);
        Search.setBounds(820, 10, 60, 60);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(820, 430, 60, 60);

        Name.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 204, 0));
        Name.setText("Student Portal");
        jPanel1.add(Name);
        Name.setBounds(330, 20, 250, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(0, 0, 900, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.setVisible(false);
        new Portal().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed
    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        this.setVisible(false);
        new StudentSearch().setVisible(true);
    }//GEN-LAST:event_SearchActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPortal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Name;
    private javax.swing.JButton Search;
    private javax.swing.JTable StudentDetail;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}