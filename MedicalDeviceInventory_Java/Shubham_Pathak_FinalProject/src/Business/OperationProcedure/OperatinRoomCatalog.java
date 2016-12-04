/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OperationProcedure;

import java.util.ArrayList;

/**
 *
 * @author Shubham
 */
public class OperatinRoomCatalog {
    
     private ArrayList<OperatingRoom> operatingRoomList;
     
     public OperatinRoomCatalog(){
         operatingRoomList = new ArrayList<>();
     }

    public ArrayList<OperatingRoom> getOperatingRoomList() {
        return operatingRoomList;
    }

    public void setOperatingRoomList(ArrayList<OperatingRoom> operatingRoomList) {
        this.operatingRoomList = operatingRoomList;
    }
     
     public OperatingRoom createOperatingRoom(){
        OperatingRoom or = new OperatingRoom();      
        operatingRoomList.add(or);
        return or;
    }
}
