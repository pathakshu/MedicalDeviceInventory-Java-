/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Product;
import Business.Enterprise.WarehouseEnterprise;

/**
 *
 * @author Shubham
 */
public class MaintenanceWorkRequest extends WorkRequest{
    
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    
    
    
    
}
