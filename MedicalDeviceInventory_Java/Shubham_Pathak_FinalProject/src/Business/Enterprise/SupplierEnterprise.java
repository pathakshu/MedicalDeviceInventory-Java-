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
public class SupplierEnterprise extends Enterprise {
    
    private Order order;
    private String enrolementStatus;
     
    
    public SupplierEnterprise(String name) {
        super(name, EnterpriseType.Supplier);
        enrolementStatus="Pending Approval";
    }

    public String getEnrolementStatus() {
        return enrolementStatus;
    }

    public void setEnrolementStatus(String enrolementStatus) {
        this.enrolementStatus = enrolementStatus;
    }
    
    
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        
       return null; 
    }
    
}
