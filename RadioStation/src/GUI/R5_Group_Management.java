/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import radiostation_POJO.Album;

/**
 *
 * @author ΛΕΝΑ
 */
public class R5_Group_Management extends javax.swing.JFrame {
    private R4_GroupList_View creator;
    /**
     * Creates new form R5_Group_Management
     */
    public R5_Group_Management() {
        initComponents();
    }
    
    public R5_Group_Management(R4_GroupList_View inJFrame) {
        initComponents();
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
        artistQuery = java.beans.Beans.isDesignTime() ? null : RadioStationPUEntityManager.createQuery("SELECT a FROM Artist a");
        artistList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : artistQuery.getResultList();
        albumQuery = java.beans.Beans.isDesignTime() ? null : RadioStationPUEntityManager.createQuery("SELECT a FROM Album a");
        albumList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : albumQuery.getResultList();
        musicgroupQuery = java.beans.Beans.isDesignTime() ? null : RadioStationPUEntityManager.createQuery("SELECT m FROM Musicgroup m");
        musicgroupList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : musicgroupQuery.getResultList();
        musicgroupArtistQuery = java.beans.Beans.isDesignTime() ? null : RadioStationPUEntityManager.createQuery("SELECT m FROM MusicgroupArtist m");
        musicgroupArtistList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : musicgroupArtistQuery.getResultList();
        artistQuery1 = java.beans.Beans.isDesignTime() ? null : RadioStationPUEntityManager.createQuery("SELECT a FROM Artist a");
        artistList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : artistQuery1.getResultList();
        artistQuery2 = java.beans.Beans.isDesignTime() ? null : RadioStationPUEntityManager.createQuery("SELECT a FROM Artist a");
        artistList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : artistQuery2.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldGroupName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonInput = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableGroupMebers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Διαχείρηση Συγκροτημάτων");

        jLabel2.setText("Επωνυμία Συγκροτήματος");

        jTextFieldGroupName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGroupNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Ημερομηνία Δημιουργίας");

        jTextFieldDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateActionPerformed(evt);
            }
        });

        jScrollPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jScrollPane1ComponentAdded(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, artistList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lastName}"));
        columnBinding.setColumnName("Last Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${firstName}"));
        columnBinding.setColumnName("First Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${artisticName}"));
        columnBinding.setColumnName("Artistic Name");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable1ComponentAdded(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jTable1ComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Διαθέσιμοι Καλλιτέχνες");

        jLabel5.setText("Μέλη Σγκροτήματος");

        jButtonInput.setText("Εισαγωγή");
        jButtonInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonInputMouseClicked(evt);
            }
        });
        jButtonInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInputActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Διαγραφή");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonSave.setText("Αποθήκευση");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Ακύρωση");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, artistList2, jTableGroupMebers);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lastName}"));
        columnBinding.setColumnName("Last Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${firstName}"));
        columnBinding.setColumnName("First Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${artisticName}"));
        columnBinding.setColumnName("Artistic Name");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane3.setViewportView(jTableGroupMebers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSave)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDelete))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnCancel))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonInput)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(btnCancel))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldGroupNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGroupNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGroupNameActionPerformed

    private void jTextFieldDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateActionPerformed

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentAdded

    private void jTable1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentHidden

    private void jButtonInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInputActionPerformed
     
        
            
       
      
    }//GEN-LAST:event_jButtonInputActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        // TODO add your handling code here:

       

    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        /*creator.setVisible(true);*/
        dispose(); 
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
/*int position = jTableGroupMebers.getSelectedRow();
     
        if(jTableGroupMebers.getSelectedRow()==-1)
            JOptionPane.showMessageDialog(null, "Δεν έχει επιλεγεί καλλιτέχνης!");
        else{
            Object[][] temp = new Object[data.length-1][2];
            for(int i=0;i<position;i++){
                temp[i][0] = data[i][0];
                temp[i][1] = data[i][1];
                
            }
            for(int i=position+1;i<data.length;i++){
                
                temp[i-1][0]=data[i][0];
                temp[i-1][1]=data[i][1];
                
                
            }
        data = temp;
        jTableGroupMebers.setModel(new DefaultTableModel(data,columnNames));
        
        }
        
  */      
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jScrollPane1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1ComponentAdded

    private void jButtonInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonInputMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(R5_Group_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(R5_Group_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(R5_Group_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(R5_Group_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new R5_Group_Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager RadioStationPUEntityManager;
    private java.util.List<radiostation_POJO.Album> albumList;
    private javax.persistence.Query albumQuery;
    private java.util.List<radiostation_POJO.Artist> artistList;
    private java.util.List<radiostation_POJO.Artist> artistList1;
    private java.util.List<radiostation_POJO.Artist> artistList2;
    private javax.persistence.Query artistQuery;
    private javax.persistence.Query artistQuery1;
    private javax.persistence.Query artistQuery2;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInput;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableGroupMebers;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldGroupName;
    private java.util.List<GUI.MusicgroupArtist> musicgroupArtistList;
    private javax.persistence.Query musicgroupArtistQuery;
    private java.util.List<radiostation_POJO.Musicgroup> musicgroupList;
    private javax.persistence.Query musicgroupQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
