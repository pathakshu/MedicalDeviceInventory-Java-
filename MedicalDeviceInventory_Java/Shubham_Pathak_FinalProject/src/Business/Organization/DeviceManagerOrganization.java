/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeviceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shubham
 */
public class DeviceManagerOrganization extends Organization{

    public DeviceManagerOrganization() {
        super(Organization.Type.DeviceManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DeviceManagerRole());
        return roles;
    }
     
}