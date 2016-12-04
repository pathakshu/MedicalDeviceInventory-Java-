/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.WarehouseEnterprise;
import Business.Organization.Organization;
import Business.Organization.WarehouseManagerOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.WarehouseManagerRole.WarehouseManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Shubham
 */
public class WarehouseManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new WarehouseManagerWorkAreaJPanel(userProcessContainer, account, (WarehouseManagerOrganization)organization, (WarehouseEnterprise)enterprise,system);
    }
    
    
}
