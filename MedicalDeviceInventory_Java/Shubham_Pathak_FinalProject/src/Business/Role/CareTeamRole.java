/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.CareTeamOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CareTeamRole.CareTeamWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Shubham
 */
public class CareTeamRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new CareTeamWorkAreaJPanel(userProcessContainer, account, (CareTeamOrganization)organization,enterprise,system);
    }
    
}
