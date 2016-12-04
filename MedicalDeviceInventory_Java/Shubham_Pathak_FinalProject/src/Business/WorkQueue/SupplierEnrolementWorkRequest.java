/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.SupplierEnterprise;

/**
 *
 * @author Shubham
 */
public class SupplierEnrolementWorkRequest extends WorkRequest{
    
    private String testResult;
    private SupplierEnterprise supplierEnterprise;
    private String request;
    
    public SupplierEnrolementWorkRequest(){
    request="Pending";
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public SupplierEnterprise getSupplierEnterprise() {
        return supplierEnterprise;
    }

    public void setSupplierEnterprise(SupplierEnterprise supplierEnterprise) {
        this.supplierEnterprise = supplierEnterprise;
    }
    
    
}
