/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.OperationProcedure.OperatinRoomCatalog;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shubham
 */
public class HospitalEnterprise extends Enterprise{
    
    private OperatinRoomCatalog operatingRoomCatalog;

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
        operatingRoomCatalog= new OperatinRoomCatalog();
    }

    public OperatinRoomCatalog getOperatingRoomCatalog() {
        return operatingRoomCatalog;
    }

    public void setOperatingRoomCatalog(OperatinRoomCatalog operatingRoomCatalog) {
        this.operatingRoomCatalog = operatingRoomCatalog;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
