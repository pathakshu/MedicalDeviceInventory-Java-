/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.DeviceManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DeviceManagerRole.DeviceManagementWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Shubham
 */
public class DeviceManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new DeviceManagementWorkAreaJPanel(userProcessContainer, account, (DeviceManagerOrganization )organization, (HospitalEnterprise)enterprise,system);
    }
    
}
