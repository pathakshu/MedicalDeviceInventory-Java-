/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CareTeamRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shubham
 */
public class CareTeamOrganization extends Organization {

    public CareTeamOrganization() {
        super(Organization.Type.CareTeam.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CareTeamRole());
        return roles;
    }
    
}
