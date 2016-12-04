/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

/**
 *
 * @author Shubham
 */
public class OrderItem {
    
    private Product product;
    private int quantity;
    private String paymentStatus;
    
    public OrderItem(){
    paymentStatus="Pending";
    }

    public Product getProduct() {
        return product;
        
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    

    @Override
    public String toString() {
        return  product.getProdName();
    }
    
    
    
    
}
