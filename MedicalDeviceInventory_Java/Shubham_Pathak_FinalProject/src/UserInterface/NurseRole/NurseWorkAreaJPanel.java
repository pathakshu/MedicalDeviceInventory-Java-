/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NurseRole;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.NurseOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;


/**
 *
 * @author raunak
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private NurseOrganization organization;
    private HospitalEnterprise hospitalEnterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public NurseWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, NurseOrganization organization, HospitalEnterprise enterprise,EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.hospitalEnterprise = enterprise;
        this.userAccount = account;
        this.system=system;
        
        
    
    
    
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
