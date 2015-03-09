/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/*import java.util.List;*/
import radiostation_POJO.Album;
import radiostation_POJO.Musicgroup;
import radiostation_POJO.Musicproductioncompany;
import radiostation.RadioStation;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.*;
import javax.persistence.EntityManager;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
/**
 *
 * @author Panos
 */
public class R9_GroupAlbum_Management extends javax.swing.JFrame {
        /*private List<Musicgroup> groups;*/
    /*private JComboBox MusicGroupList;*/
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    private String m;
    
    
    private R8_GroupAlbum_View creator;
    private EntityManager em;
    private int cComp;
    private Album Alb;
    Musicgroup MG;
    /*private String MG;*/
    /*private Musicgroup MG;*/
    /*private RadioStation rs = new RadioStation();*/
    /**
     * Creates new form R9_GroupAlbum_Management
     */
    public R9_GroupAlbum_Management() {
        /*this.rs = new RadioStation();*/
        initComponents();
        /*RadioStation.createConnection();*/
    }
    
    public R9_GroupAlbum_Management(R8_GroupAlbum_View inJFrame) {  //(((R9 test)))
        
        initComponents();
        this.creator = inJFrame;
        MusicGroupList.setSelectedItem(null);
        
        /*this.em = creator.ap.getLocalEntityManager();*/
        
        
        
        
        /*for (Musicgroup mg : groups) {
            String displayMsg = "Όνομα.: " + mg.getMusicgroupName();
            MusicGroupList.addItem(displayMsg);
        }
        MusicGroupList.setSelectedIndex(-1);*/
        
        
        /*this.creator = inJFrame;*/
        /*conn=javaconnect.ConnecrDb();*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        RadioStationPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("RadioStationPU").createEntityManager();
        musicgroupQuery = java.beans.Beans.isDesignTime() ? null : RadioStationPUEntityManager.createQuery("SELECT m.musicgroupName FROM Musicgroup m");
        musicgroupList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : musicgroupQuery.getResultList();
        musicproductioncompanyQuery = java.beans.Beans.isDesignTime() ? null : RadioStationPUEntityManager.createQuery("SELECT m.mpcName FROM Musicproductioncompany m");
        musicproductioncompanyList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : musicproductioncompanyQuery.getResultList();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        insertSong = new javax.swing.JButton();
        deleteSong = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Type = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MpcList = new javax.swing.JComboBox();
        MusicGroupList = new javax.swing.JComboBox();
        ReleaseDt = new org.jdesktop.swingx.JXDatePicker();
        DiscNr = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnSave.setText("Αποθήκευση");
        btnSave.setMaximumSize(new java.awt.Dimension(110, 23));
        btnSave.setMinimumSize(new java.awt.Dimension(110, 23));
        btnSave.setPreferredSize(new java.awt.Dimension(110, 23));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Άκυρο");
        btnCancel.setMaximumSize(new java.awt.Dimension(110, 23));
        btnCancel.setMinimumSize(new java.awt.Dimension(110, 23));
        btnCancel.setPreferredSize(new java.awt.Dimension(110, 23));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Διαχείριση Άλμπουμ Συγκροτήματος");
        jLabel7.setMaximumSize(new java.awt.Dimension(400, 22));
        jLabel7.setMinimumSize(new java.awt.Dimension(400, 22));
        jLabel7.setName(""); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(400, 22));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 295));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(736, 342));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Αριθμός σειράς", "Τίτλος", "Διάρκεια"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(400, 64));
        jTable1.setMinimumSize(new java.awt.Dimension(400, 64));
        jTable1.setPreferredSize(new java.awt.Dimension(400, 64));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        insertSong.setText("Εισαγωγή");
        insertSong.setMaximumSize(new java.awt.Dimension(110, 23));
        insertSong.setMinimumSize(new java.awt.Dimension(110, 23));
        insertSong.setPreferredSize(new java.awt.Dimension(110, 23));
        insertSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertSongActionPerformed(evt);
            }
        });

        deleteSong.setText("Διαγραφή");
        deleteSong.setMaximumSize(new java.awt.Dimension(110, 23));
        deleteSong.setMinimumSize(new java.awt.Dimension(110, 23));
        deleteSong.setPreferredSize(new java.awt.Dimension(110, 23));
        deleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSongActionPerformed(evt);
            }
        });

        jLabel8.setText("Λίστα τραγουδιών");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(insertSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Ημ/νία Κυκλοφορίας");

        jLabel1.setText("Τίτλος");
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 14));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 14));

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });

        jLabel2.setText("Συγκρότημα");
        jLabel2.setMaximumSize(new java.awt.Dimension(70, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(70, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(70, 14));

        jLabel3.setText("Εταιρία Παραγωγής");

        Type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "CD Single", "Extended Play", "Long Play" }));
        Type.setMinimumSize(new java.awt.Dimension(100, 20));
        Type.setPreferredSize(new java.awt.Dimension(100, 20));
        Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeActionPerformed(evt);
            }
        });

        jLabel4.setText("Τύπος");

        jLabel5.setText("Αριθμός Δίσκου");

        MpcList.setPreferredSize(new java.awt.Dimension(300, 20));

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, musicproductioncompanyList, MpcList);
        bindingGroup.addBinding(jComboBoxBinding);

        MusicGroupList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        MusicGroupList.setSelectedIndex(-1);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, musicgroupList, MusicGroupList);
        bindingGroup.addBinding(jComboBoxBinding);

        MusicGroupList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicGroupListActionPerformed(evt);
            }
        });

        ReleaseDt.setMaximumSize(new java.awt.Dimension(32767, 32767));
        ReleaseDt.setMinimumSize(new java.awt.Dimension(100, 20));
        ReleaseDt.setPreferredSize(new java.awt.Dimension(100, 20));
        ReleaseDt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReleaseDtActionPerformed(evt);
            }
        });

        DiscNr.setMaximumRowCount(5);
        DiscNr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        DiscNr.setMinimumSize(new java.awt.Dimension(100, 20));
        DiscNr.setPreferredSize(new java.awt.Dimension(100, 20));
        DiscNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscNrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(MpcList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                        .addComponent(MusicGroupList, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiscNr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReleaseDt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel6)))
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MusicGroupList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiscNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MpcList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReleaseDt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(creator.createMode&&!creator.deleteMode&&!creator.editMode){
            cComp = checkComponents();
            if(cComp==0){
                JOptionPane.showMessageDialog(rootPane, "Παρακαλώ εισάγεται Τίτλο Άλμπουμ", "Σφάλμα", 1);
            }else if(cComp==1){
                JOptionPane.showMessageDialog(rootPane, "Παρακαλώ επιλέξτε Τύπος Άλμπουμ", "Σφάλμα", 1);
            }else if(cComp==2){
                JOptionPane.showMessageDialog(rootPane, "Παρακαλώ επιλέξτε Συγκρότημα", "Σφάλμα", 1);
            }else if(cComp==3){
                JOptionPane.showMessageDialog(rootPane, "Παρακαλώ εισάγεται αριθμό δίσκου", "Σφάλμα", 1);
            }else if(cComp==4){
                JOptionPane.showMessageDialog(rootPane, "Παρακαλώ επιλέξτε Εταιρία Παραγωγής", "Σφάλμα", 1);
            }else if(cComp==5){
                JOptionPane.showMessageDialog(rootPane, "Παρακαλώ εισάγεται Ημερομηνία Κυκλοφορίας", "Σφάλμα", 1);
            }else{
                /*Album Alb = new Album();
                Musicgroup MG;
                
                Alb.setTitle(this.txtTitle.getText());
                Alb.setAlbumType((String)Type.getSelectedItem());*/
                
                /*m = (String)MusicGroupList.getSelectedItem();
                MG = m.getMusicgroupName();
                Alb.setMusicgroupName(MG);*/
                /*MGname = creator.ge;*/
                /*Alb.setMusicgroupName((Musicgroup)MusicGroupList.getSelectedItem());*/
                /*Alb.setDiscNumber(this.DiscNr.getComponentCount());*/
                /*m = (String)MpcList.getSelectedItem();*/
                /*Alb.setMpcName((Musicproductioncompany)MpcList.getSelectedItem());*/
                /*Alb.setReleaseDate(this.ReleaseDt.getDate());*/
                /*creator.resetForm();*/
                /*creator.setVisible(true);*/
                /*creator.newAlbum = Alb;*/
                String NewtxtTitle = txtTitle.getText();
                String NewType = (String)Type.getSelectedItem();
                MG = radiostation.RadioStation.getMGroupByName(MusicGroupList.getSelectedItem().toString());
                
                dispose();
            }
        }
        else if(!creator.createMode&&!creator.deleteMode&&creator.editMode){
            /*dispose();*/
        
        
        
        }
        else if(!creator.createMode&&creator.deleteMode&&!creator.editMode){
            /*dispose();*/
        
        
        
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed
    
    int checkComponents(){
        if(this.txtTitle.getText().isEmpty()){
            return (0);
        }
        if(this.Type.getSelectedIndex()==0){
            return (1);
        }
        if(this.MusicGroupList.getSelectedIndex()==0){
            return (2);
        }
        if(this.DiscNr.getSelectedIndex()==0){
            return (3);
        }
        if(this.MpcList.getSelectedIndex()==0){
            return (4);
        }
        if(this.ReleaseDt.getDate()==null){
            return (5);
        }
        else{
        return (6);
        }
    }
    
    private void insertSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertSongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertSongActionPerformed

    private void deleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteSongActionPerformed

    private void MusicGroupListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicGroupListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MusicGroupListActionPerformed

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void DiscNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscNrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiscNrActionPerformed

    private void TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeActionPerformed

    private void ReleaseDtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReleaseDtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReleaseDtActionPerformed
    
    /**
     * @param args the command line arguments
     */
    /*private void MGL_fill(){
    try{
        String query = "select * from Musicgroup";
        PreparedStatement pst = conn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            MusicGroupList.addItem(rs.getString("MUSICGROUP_NAME"));
    
    }
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
    
    
    }*/
    
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(R9_GroupAlbum_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(R9_GroupAlbum_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(R9_GroupAlbum_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(R9_GroupAlbum_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new R9_GroupAlbum_Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox DiscNr;
    private javax.swing.JComboBox MpcList;
    private javax.swing.JComboBox MusicGroupList;
    private javax.persistence.EntityManager RadioStationPUEntityManager;
    private org.jdesktop.swingx.JXDatePicker ReleaseDt;
    private javax.swing.JComboBox Type;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton deleteSong;
    private javax.swing.JButton insertSong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<radiostation_POJO.Musicgroup> musicgroupList;
    private javax.persistence.Query musicgroupQuery;
    private java.util.List<radiostation_POJO.Musicproductioncompany> musicproductioncompanyList;
    private javax.persistence.Query musicproductioncompanyQuery;
    private javax.swing.JTextField txtTitle;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
