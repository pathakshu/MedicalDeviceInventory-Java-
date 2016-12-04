/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.DeviceManagerOrganization;
import java.util.Date;

/**
 *
 * @author Shubham
 */
public class RequestToWarehouseManager extends WorkRequest {
    
    
    private DeviceManagerOrganization deviceManagerOrganization;
  //  private Date operationDate;
    private Date fromDate;
    private Date toDate;
    private String deviceType;
   // private String deviceName;
    
     private String hospitalName;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

//    public String getDeviceName() {
//        return deviceName;
//    }
//
//    public void setDeviceName(String deviceName) {
//        this.deviceName = deviceName;
//    }

//    public Date getOperationDate() {
//        return operationDate;
//    }
//
//    public void setOperationDate(Date operationDate) {
//        this.operationDate = operationDate;
//    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public DeviceManagerOrganization getDeviceManagerOrganization() {
        return deviceManagerOrganization;
    }

    public void setDeviceManagerOrganization(DeviceManagerOrganization deviceManagerOrganization) {
        this.deviceManagerOrganization = deviceManagerOrganization;
    }
    
    
    
}
