/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Shubham
 */
public class Order {

    private ArrayList<OrderItem> order;
    private static int count;
    private int orderId;
    private int warehouseManagerid;
    private String shipmentStatus= "Pending";
   // private String paymentStatus;

    public Order() {
        count++;
        orderId = count;
       // paymentStatus="Payment Done";
        order = new ArrayList<OrderItem>();
       
    }

//    public String getPaymentStatus() {
//        return paymentStatus;
//    }
//
//    public void setPaymentStatus(String paymentStatus) {
//        this.paymentStatus = paymentStatus;
//    }

    
    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }
    
    public int getOrderId() {
        return orderId;
    }

    public int getWarehouseManagerid() {
        return warehouseManagerid;
    }

    public void setWarehouseManagerid(int warehouseManagerid) {
        this.warehouseManagerid = warehouseManagerid;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

  

    public ArrayList<OrderItem> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<OrderItem> order) {
        this.order = order;
    }

    public OrderItem addOrderItem(){
        OrderItem oi = new OrderItem();
        order.add(oi);
        return oi;
    
    }
    public void removeOrderItem(OrderItem oi){
    order.remove(oi);
    }

    @Override
    public String toString() {
        return  Integer.toString(orderId) ;
    }
    
}
