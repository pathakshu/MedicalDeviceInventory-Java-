/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WarehouseManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.WarehouseEnterprise;
import Business.Network.Network;
import Business.Organization.WarehouseManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RequestToWarehouseManager;
import Business.WorkQueue.SupplierEnrolementWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shubham
 */
public class WarehouseManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CareTeamWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private WarehouseManagerOrganization organization;
   // private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private WarehouseEnterprise warehouseEnterprise;
    private SupplierEnrolementWorkRequest req;
    
    public WarehouseManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, WarehouseManagerOrganization organization, WarehouseEnterprise enterprise,EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.warehouseEnterprise=enterprise;
        this.userAccount = account;
        this.system=system;
        
        
        populateTable();
        
      /*  for(Network network: system.getNetworkList()){
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getEnterpriseType().getValue().equalsIgnoreCase("Warehouse")){
                    warehouseEnterprise = (WarehouseEnterprise)e;
                }
            }
        }*/
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        for(WorkRequest request:warehouseEnterprise.getWorkQueue().getWorkRequestList())
        {
            if (request instanceof SupplierEnrolementWorkRequest){
            Object[] row = new Object[3];
           // row[0] = request;
            row[0] = request;
           // row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            
            row[1]=request.getSender().getEmployee().getName();
            row[2] = request.getStatus();
            
            model.addRow(row);
        }
    }}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnDeviceInventory = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Warehouse Manager Work Area");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Browse Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnOrderHistory.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnOrderHistory.setText("Order History");
        btnOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHistoryActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Message", "Supplier Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Request For Device");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnDeviceInventory.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDeviceInventory.setText("Device Inventoy");
        btnDeviceInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeviceInventoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrderHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeviceInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refreshJButton)
                            .addComponent(processJButton))
                        .addGap(172, 172, 172))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDeviceInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(processJButton)
                        .addGap(18, 18, 18)
                        .addComponent(refreshJButton)))
                .addGap(93, 93, 93))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        BrowseProductJPanel panel = new BrowseProductJPanel(userProcessContainer, system, userAccount,warehouseEnterprise);
        userProcessContainer.add("manageOrganizationJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHistoryActionPerformed
        // TODO add your handling code here:
     ViewOrderHistory panel = new ViewOrderHistory(userProcessContainer,system,userAccount,warehouseEnterprise);
     userProcessContainer.add("BrowseProduct", panel);
     CardLayout layout = (CardLayout)userProcessContainer.getLayout();
     layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrderHistoryActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0){
          
        
        
         req = (SupplierEnrolementWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        //warehouseEnterprise.getWorkQueue().getWorkRequestList();
        req.setStatus("Approved");
        req.setMessage("Approved");
        req.setRequest("Approved");
        req.getSupplierEnterprise().setEnrolementStatus("Approved");
        
        
        }

        

        //ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
        //userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        //CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        RequestToWarehouseManager r = new RequestToWarehouseManager();
        RequestForDeviceJPanel panel = new RequestForDeviceJPanel(userProcessContainer, r,userAccount,warehouseEnterprise,system);
        userProcessContainer.add("processWorkRequestJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDeviceInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeviceInventoryActionPerformed
        // TODO add your handling code here:
        DeviceInventoryJPanel panel = new DeviceInventoryJPanel(userProcessContainer ,system ,userAccount,warehouseEnterprise);
        userProcessContainer.add("DeviceInventoryJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDeviceInventoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeviceInventory;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
