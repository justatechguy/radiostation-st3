/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import radiostation_POJO.Musicgroup;

/**
 *
 * @author eliastsourapas
 */
public class R4_GroupList_View extends javax.swing.JFrame {
    public boolean createMode; //δημιουργία καλλιτέχνη
    public boolean editMode; //επεξεργασία καλλιτέχνη
    private List<Musicgroup> mgs = new ArrayList();
    private EntityManager em;
    public Musicgroup newMusicgroup;
    private JFrame creator;
    

    /**
     * Creates new form R8_GroupAlbum_View
     */
    public R4_GroupList_View() {
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
        musicgroupQuery = java.beans.Beans.isDesignTime() ? null : RadioStationPUEntityManager.createQuery("SELECT m FROM Musicgroup m");
        musicgroupList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : musicgroupQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGroups = new javax.swing.JTable();
        addGroup = new javax.swing.JButton();
        deleteSelectedGroup = new javax.swing.JButton();
        editSelectedGroup = new javax.swing.JButton();
        exitGroup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Πίνακας Συγκροτημάτων");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, musicgroupList, tableGroups);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${musicgroupName}"));
        columnBinding.setColumnName("Musicgroup Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${formationDate}"));
        columnBinding.setColumnName("Formation Date");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tableGroups);

        addGroup.setText("Προσθήκη");
        addGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupActionPerformed(evt);
            }
        });

        deleteSelectedGroup.setText("Διαγραφή");

        editSelectedGroup.setText("Επεξεργασία");
        editSelectedGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSelectedGroupActionPerformed(evt);
            }
        });

        exitGroup.setText("Έξοδος");
        exitGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGroupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addGroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteSelectedGroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editSelectedGroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                        .addComponent(exitGroup))
                    .addComponent(jScrollPane1))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGroup)
                    .addComponent(deleteSelectedGroup)
                    .addComponent(editSelectedGroup)
                    .addComponent(exitGroup))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupActionPerformed
        // TODO add your handling code here:
        this.createMode = true;
        this.editMode = false;
        /*new R5_Group_Management(this).setVisible(true);*/
        this.setVisible(true);
    }//GEN-LAST:event_addGroupActionPerformed

    private void exitGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGroupActionPerformed
        // TODO add your handling code here:
        creator.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitGroupActionPerformed

    private void editSelectedGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSelectedGroupActionPerformed
        // TODO add your handling code here:
        this.createMode = false;
        this.editMode = true;
        if(tableGroups.getSelectedRow()==-1)
            JOptionPane.showMessageDialog(null, "Δεν έχει επιλεγεί συγκρότημα!");
        else{
            for(Musicgroup mg: mgs){
                if(mg.getMusicgroupName()==tableGroups.getValueAt(tableGroups.getSelectedRow(), 0)){
                    newMusicgroup = mg;
                    /*new R5_Group_Management(this).setVisible(true);*/
                    this.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_editSelectedGroupActionPerformed

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
            java.util.logging.Logger.getLogger(R4_GroupList_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(R4_GroupList_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(R4_GroupList_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(R4_GroupList_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new R4_GroupList_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager RadioStationPUEntityManager;
    private javax.swing.JButton addGroup;
    private javax.swing.JButton deleteSelectedGroup;
    private javax.swing.JButton editSelectedGroup;
    private javax.swing.JButton exitGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<radiostation_POJO.Musicgroup> musicgroupList;
    private javax.persistence.Query musicgroupQuery;
    private javax.swing.JTable tableGroups;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
