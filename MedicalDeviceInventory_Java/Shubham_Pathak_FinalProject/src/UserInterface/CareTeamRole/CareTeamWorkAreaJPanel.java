/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CareTeamRole;

import Business.CareTeam.CareTeam;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.OperationProcedure.OperatingRoom;
import Business.Organization.CareTeamOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OperationRequestToCareTeamWorkRequest;
import Business.WorkQueue.WorkRequest;
import DeviceScheduling.Schedule;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shubham
 */
public class CareTeamWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CareTeamWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private CareTeamOrganization organization;
    private HospitalEnterprise hospitalEnterprise;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private NurseOrganization nurseOrganization;
    private CareTeam careTeam;
    private OperatingRoom operatingRoom;
    OperationRequestToCareTeamWorkRequest req;

    public CareTeamWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CareTeamOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        populateTable();
        populateNurseTable();
        careTeam = new CareTeam();
        //operatingRoom=new OperatingRoom();
        for (Network network : system.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {

                if (e instanceof HospitalEnterprise) {
                    hospitalEnterprise = (HospitalEnterprise) e;
                }
            }
        }

    
    }
     

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[8];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4] = ((OperationRequestToCareTeamWorkRequest) request).getCareTeamMembers();
            row[5] = ((OperationRequestToCareTeamWorkRequest) request).getOperationType();
            //row[6]=((OperationRequestToCareTeamWorkRequest)request).getDeviceName();
            row[6] = request.getOperationDate();
            row[7] = ((OperationRequestToCareTeamWorkRequest) request).getOperatingRoom();

            model.addRow(row);
        }
    }

    public void populateNurseTable() {

       
for (Network network : system.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof NurseOrganization) {
                        nurseOrganization = (NurseOrganization) org;
                    }
                }
            }
        }
        int rowCount = tblNurseList.getRowCount();

        DefaultTableModel model = (DefaultTableModel) tblNurseList.getModel();
        model.setRowCount(0);

        for (Employee employee : nurseOrganization.getEmployeeDirectory().getEmployeeList()) {
            if (nurseOrganization.getAvailability().equalsIgnoreCase("AVAILABLE")) {
                Object row[] = new Object[3];
                row[0] = employee;
                row[1] = employee.getId();
                row[2]=nurseOrganization.getAvailability();
                // row[2] = p.getPrice();
                model.addRow(row);
            }
        
    }}

    private void populateCareTeamTable() {
        int selectedRow = tblNurseList.getSelectedRow();
        int selectedRow1 = workRequestJTable.getSelectedRow();

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow1, 0);
        Employee employee = (Employee) tblNurseList.getValueAt(selectedRow, 0);
        if (selectedRow >= 0) {
            if (nurseOrganization.getAvailability().equalsIgnoreCase("AVAILABLE")) {
                // int size=careTeam.getCareTeamList().size();
                careTeam.getCareTeamList().add(employee);
                nurseOrganization.setAvailability("ASSIGNED");

        // int count=(((OperationRequestToCareTeamWorkRequest)request).getCareTeamMembers());
                // if(count==0){
                //if(careTeam.getCareTeamList().size()-1>(((OperationRequestToCareTeamWorkRequest)request).getCareTeamMembers())){
                //  JOptionPane.showMessageDialog(null, "Can't exceed number of CareTeam Members");
                // }
                DefaultTableModel dtm = (DefaultTableModel) tblCareTeamMember.getModel();
                dtm.setRowCount(0);
                for (Employee emp : careTeam.getCareTeamList()) {
                    Object row[] = new Object[2];
                    row[0] = emp;
                    row[1] = emp.getId();
                    

                    dtm.addRow(row);
                    // count=count-1;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nurse is not available");
            }
        }
    }

    public void populateRoomsTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblRooms.getModel();
        dtm.setRowCount(0);
        for (OperatingRoom o : hospitalEnterprise.getOperatingRoomCatalog().getOperatingRoomList()) {
            Object row[] = new Object[3];
            row[0] = o;
            row[1] = o.getAvailability();
          //  row[2] = o.getScheduledDate();
            row[2] = o.getMessage();

            dtm.addRow(row);

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNurseList = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCareTeamMember = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        txtRoomNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRooms = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Care Team Work Area");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "CareTeam Members", "Operation Type", "Operation Date", "Operation Room"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        tblNurseList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nurse Name", "Nurse Id", "Availability"
            }
        ));
        jScrollPane2.setViewportView(tblNurseList);

        jButton2.setText("Add CareTeam Member");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblCareTeamMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CareTeam Member Name", "Care Team Member Id"
            }
        ));
        jScrollPane3.setViewportView(tblCareTeamMember);

        jButton4.setText("Add Room");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Room No.");

        jButton1.setText("View All Rooms");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Room No", "Availability"
            }
        ));
        jScrollPane4.setViewportView(tblRooms);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(assignJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel2)
                                                .addGap(75, 75, 75)
                                                .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(100, 100, 100)
                                                .addComponent(jButton4))
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(jButton1)))
                                .addGap(0, 260, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(processJButton)
                .addGap(275, 275, 275)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshJButton)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshJButton)
                    .addComponent(processJButton)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignJButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        populateNurseTable();
       // populateCareTeamTable();
        populateRoomsTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {

            {
                JOptionPane.showMessageDialog(null, "Please Select A Row");
                return;
            }
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");

        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        int selectedRow1 = tblRooms.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }
        if (selectedRow >= 0) {

            req = (OperationRequestToCareTeamWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
            operatingRoom = (OperatingRoom) tblRooms.getValueAt(selectedRow1, 0);
            Schedule schedule = operatingRoom.getScheduleCatalog().addSchedule();

            req.getOperatingProcedure().setCareTeam(careTeam);
            req.getOperatingProcedure().setOperatingRoom(operatingRoom);
            req.setStatus("CareTeam Assigned");
            if(operatingRoom.getAvailability().equalsIgnoreCase("BOOKED")){JOptionPane.showMessageDialog(null, "THIS ROOM IS ALREADY BOOKED");}
            if (operatingRoom.getScheduledDate() == null) {
                req.setOperatingRoom(txtRoomNo.getText());
                schedule.setSchedulingDate(req.getOperationDate());
                operatingRoom.setAvailability("BOOKED");
                operatingRoom.setMessage("COMPLETE");

            } if ((operatingRoom.getScheduledDate() != null) && (operatingRoom.getAvailability().equalsIgnoreCase("BOOKED"))) {
                schedule.setSchedulingDate(req.getOperationDate());
                operatingRoom.setAvailability("PREBOOKED");
                operatingRoom.setMessage("INCOMPLETE");

            }
            
        }

    }//GEN-LAST:event_processJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateCareTeamTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        operatingRoom = hospitalEnterprise.getOperatingRoomCatalog().createOperatingRoom();
        operatingRoom.setRoomNo(txtRoomNo.getText());
        operatingRoom.setAvailability("AVAILABLE");


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateRoomsTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable tblCareTeamMember;
    private javax.swing.JTable tblNurseList;
    private javax.swing.JTable tblRooms;
    private javax.swing.JTextField txtRoomNo;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
