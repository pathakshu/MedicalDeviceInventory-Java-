/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.Role;
import Business.Role.WarehouseManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Shubham
 */
public class WarehouseManagerOrganization extends Organization{

    public WarehouseManagerOrganization() {
        super(Type.WarehouseManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WarehouseManagerRole());
        return roles;
    }
     
}
