/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.WarehouseEnterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private WarehouseEnterprise warehouseEnterprise;
    private Enterprise enterprise;
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        populateTable();
        populateComboBox();
        
        txtTreasury.setVisible(true);
        lblTreasury.setVisible(true);
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
                
        model.setRowCount(0);
        for (Network network : system.getNetworkList()){
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();
                
                model.addRow(row);
            }
        }
    }
    
    private void populateComboBox(){
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
        
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()){
            enterpriseTypeJComboBox.addItem(type);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        lblTreasury = new javax.swing.JLabel();
        txtTreasury = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel1.setText("Network");

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Name");

        jLabel3.setText("Enterprise Type");

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });

        submitJButton.setBackground(new java.awt.Color(91, 176, 204));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        lblTreasury.setText("Warehouse Treasury");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblTreasury)
                                    .addComponent(jLabel3)
                                    .addComponent(backJButton))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTreasury, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(networkJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterpriseTypeJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTreasury, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTreasury, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();
        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
         String enterpriseName = nameJTextField.getText();
        if(enterpriseName.length()==0){
            JOptionPane.showMessageDialog(null,"Please enter a valid name");
            return;
        }
        
        if(type.getValue().equalsIgnoreCase("Warehouse")){
        //Logic to check only if one warehouse enterprise is created
            for(Network n: system.getNetworkList()){
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                    if (e.getEnterpriseType().getValue().equalsIgnoreCase("Warehouse")){
                         warehouseEnterprise = (WarehouseEnterprise) e;
                         warehouseEnterprise.setTreasury(Integer.parseInt(txtTreasury.getText()));
                        JOptionPane.showMessageDialog(null, "Warehouse enterprise already created.");
                        nameJTextField.setText("");
                        return;                   
                    }           
                }
            }
        }
       
        for(Network n: system.getNetworkList()){
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                if (e.getName().equalsIgnoreCase(enterpriseName)){
                    JOptionPane.showMessageDialog(null, "Same Enterprise with the same name already exists. Cannot create duplicate Enterprise");
                    nameJTextField.setText("");
                    return;                   
                }           
            }
        }
        enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(enterpriseName, type);
        populateTable();
        nameJTextField.setText("");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
//        if(((EnterpriseType)enterpriseTypeJComboBox.getSelectedItem()).getValue().equalsIgnoreCase("Hospital"))
//                {
//                    txtTreasury.setVisible(false);
//                    lblTreasury.setVisible(false);
//                }
//        else if(((EnterpriseType)enterpriseTypeJComboBox.getSelectedItem()).getValue().equalsIgnoreCase("Supplier"))
//                {
//                    txtTreasury.setVisible(false);
//                    lblTreasury.setVisible(false);
//                }
//        else if(((EnterpriseType)enterpriseTypeJComboBox.getSelectedItem()).getValue().equalsIgnoreCase("WareHouse"))
//                {
//                    txtTreasury.setVisible(true);
//                    lblTreasury.setVisible(true);
//                }
//        if((((EnterpriseType)enterpriseTypeJComboBox.getSelectedItem()).getValue().equalsIgnoreCase("Hospital"))&&((EnterpriseType)enterpriseTypeJComboBox.getSelectedItem()).getValue().equalsIgnoreCase("Supplier"))
//        {txtTreasury.setVisible(false);
//        lblTreasury.setVisible(false);
//        }
//        if(((EnterpriseType)enterpriseTypeJComboBox.getSelectedItem()).getValue().equalsIgnoreCase("Warehouse")){
//        txtTreasury.setVisible(true);
//        lblTreasury.setVisible(true);}
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTreasury;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField txtTreasury;
    // End of variables declaration//GEN-END:variables
}
