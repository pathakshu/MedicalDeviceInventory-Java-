/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OperationProcedure;

import Business.CareTeam.CareTeam;
import Business.Employee.Employee;
import Business.Enterprise.Product;


/**
 *
 * @author Shubham
 */
public class OperationProcedure {
    
    private Product product;
    //private OperatingRoom operatingRoom;
    private OperatingRoom operatingRoom;
    private Employee employee;
    private CareTeam careTeam;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OperatingRoom getOperatingRoom() {
        return operatingRoom;
    }

    public void setOperatingRoom(OperatingRoom operatingRoom) {
        this.operatingRoom = operatingRoom;
    }

    

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public CareTeam getCareTeam() {
        return careTeam;
    }

    public void setCareTeam(CareTeam careTeam) {
        this.careTeam = careTeam;
    }
    
    
    
    
}
