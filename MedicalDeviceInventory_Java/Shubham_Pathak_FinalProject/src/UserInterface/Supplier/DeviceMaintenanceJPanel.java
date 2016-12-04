/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Supplier;

import Business.EcoSystem;
import Business.Enterprise.SupplierEnterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MaintenanceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shubham
 */
public class DeviceMaintenanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeviceMaintenanceJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private SupplierEnterprise supplierEnterprise;
    private EcoSystem system;

    public DeviceMaintenanceJPanel(JPanel userProcessContainer, UserAccount userAccount, SupplierEnterprise supplierEnterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.supplierEnterprise = supplierEnterprise;
        this.system = system;

        populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblMaintenance.getModel();

        model.setRowCount(0);
        for (WorkRequest request : supplierEnterprise.getWorkQueue().getWorkRequestList()) {

            Object[] row = new Object[5];
            // row[0] = request;
            row[0] = request;
           // row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();

            row[1] = request.getSender().getEmployee().getName();
            // row[2] = request.getStatus();
            row[2] = ((MaintenanceWorkRequest) request).getProduct().getLastMaintenance();
            row[3] = ((MaintenanceWorkRequest) request).getProduct().getNextMaintenance();
            row[4] = ((MaintenanceWorkRequest) request).getProduct().getLocation();

            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaintenance = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cmbNextMaintenance = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        tblMaintenance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Supplier Name", "Last Maintenance Date", "Next Maintenance Date", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMaintenance);

        jButton1.setText("Perform Maintenance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Next Maintenance Date");

        jButton2.setText("Send Back To Warehouse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbNextMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(cmbNextMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMaintenance.getSelectedRow();

        Date today = new Date();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        WorkRequest request = (WorkRequest) tblMaintenance.getValueAt(selectedRow, 0);
        if (selectedRow >= 0) {
            if (request.getMessage().equalsIgnoreCase("Maintenance Required")) {
                ((MaintenanceWorkRequest) request).getProduct().setLastMaintenance(today);
                ((MaintenanceWorkRequest) request).getProduct().setNextMaintenance(cmbNextMaintenance.getDate());
                request.setMessage("Maintenance Completed");
                populateTable();
                JOptionPane.showMessageDialog(null, "Maintenance is Performed.Send back to Warehouse");
                
            } else  {
                JOptionPane.showMessageDialog(null, "Maintenance is Already Performed");
            }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblMaintenance.getSelectedRow();

        if (selectedRow >= 0) {

            WorkRequest request = (WorkRequest) tblMaintenance.getValueAt(selectedRow, 0);
            if(((MaintenanceWorkRequest)request).getProduct().getLocation().equalsIgnoreCase("SUPPLIER")){
            ((MaintenanceWorkRequest) request).getProduct().setLocation("WAREHOUSE");
            populateTable();
            JOptionPane.showMessageDialog(null, "Device Sent back to Warehouse");}
            
            else{JOptionPane.showMessageDialog(null, "Already sent to Warehouse");}

        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser cmbNextMaintenance;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMaintenance;
    // End of variables declaration//GEN-END:variables
}