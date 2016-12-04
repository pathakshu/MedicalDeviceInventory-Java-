/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeviceScheduling;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Shubham
 */
public class ScheduleCatalog {
    
    private ArrayList<Schedule> scheduleList;
    
     public ScheduleCatalog(){
         scheduleList=new ArrayList<>();
    
    }

    public ArrayList<Schedule> getScheduleList() {
        return scheduleList;
    }
    
   
    public void setScheduleList(ArrayList<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }
    
    public Schedule addSchedule() {
        Schedule s = new Schedule();
        scheduleList.add(s);
        return s;
    }
    
    
}
