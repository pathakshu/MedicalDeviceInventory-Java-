/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shubham
 */
public class WarehouseEnterprise extends Enterprise {
       
   private Order order;
    private int treasury;
    
    public WarehouseEnterprise(String name) {
        
        super(name, EnterpriseType.Warehouse);
        
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    

    public int getTreasury() {
        return treasury;
    }

    public void setTreasury(int treasury) {
        this.treasury = treasury;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        return null;
        
    }
    
}
