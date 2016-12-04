/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Supplier.SupplierWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Shubham
 */
public class SupplierRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new SupplierWorkAreaJPanel(userProcessContainer, account, (SupplierOrganization)organization,(SupplierEnterprise)enterprise,system);
    }
    
}
