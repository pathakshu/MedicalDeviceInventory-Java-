/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.OperationProcedure.OperatingRoom;
import Business.OperationProcedure.OperationProcedure;
import Business.Organization.DoctorOrganization;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author Shubham
 */
public class OperationRequestToCareTeamWorkRequest extends WorkRequest{
    
    private String testResult;
    private DoctorOrganization docOrganization;
    private OperationProcedure operatingProcedure;
   // private Date operationDate;
    private String doctorName;
    private String operationType;
    private String devicetype;
    private int careTeamMembers;

    public int getCareTeamMembers() {
        return careTeamMembers;
    }

    public void setCareTeamMembers(int careTeamMembers) {
        this.careTeamMembers = careTeamMembers;
    }
    
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }
    

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public DoctorOrganization getDocOrganization() {
        return docOrganization;
    }

    public void setDocOrganization(DoctorOrganization docOrganization) {
        this.docOrganization = docOrganization;
    }

    public OperationProcedure getOperatingProcedure() {
        return operatingProcedure;
    }

    public void setOperatingProcedure(OperationProcedure operatingProcedure) {
        this.operatingProcedure = operatingProcedure;
    }

   
 
}
