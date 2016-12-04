/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OperationProcedure;

import DeviceScheduling.ScheduleCatalog;
import java.util.Date;

/**
 *
 * @author Shubham
 */
public class OperatingRoom {
    
    private String availability;
    private String roomNo;
    private Date scheduledDate;
    private ScheduleCatalog scheduleCatalog;
    private String message;
    
    
    public OperatingRoom(){
    scheduleCatalog= new ScheduleCatalog();
    availability="AVAILABLE";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    

    public ScheduleCatalog getScheduleCatalog() {
        return scheduleCatalog;
    }

    public void setScheduleCatalog(ScheduleCatalog scheduleCatalog) {
        this.scheduleCatalog = scheduleCatalog;
    }
    
    

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    @Override
    public String toString() {
        return roomNo ;
    }
    
    

    
  
    
    
    
    
    
}
