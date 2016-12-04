/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.OperationProcedure.OperatinRoomCatalog;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author shubham
 */
public abstract class Enterprise extends Organization{
    
    private MasterOrderCatalog moc;
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private ProductCatalog productCatalog;
    private String enrolementStatus;
    
    
    
    
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        productCatalog = new ProductCatalog();
        moc=new MasterOrderCatalog();
       
       // operatingRoomCatalog= new OperatinRoomCatalog();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Warehouse("Warehouse"),
        Supplier("Supplier");
//        PHSOffice("PHSOffice");
        
        private String value;
        
        

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

//    public String getEnrolementStatus() {
//        return enrolementStatus;
//    }
//
//    public void setEnrolementStatus(String enrolementStatus) {
//        this.enrolementStatus = enrolementStatus;
//    }

    public MasterOrderCatalog getMoc() {
        return moc;
    }

    public void setMoc(MasterOrderCatalog moc) {
        this.moc = moc;
    }
    
    
 
}
