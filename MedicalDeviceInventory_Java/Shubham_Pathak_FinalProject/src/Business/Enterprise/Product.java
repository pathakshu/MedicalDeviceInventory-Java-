/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import DeviceScheduling.ScheduleCatalog;
import java.util.Date;

/**
 *
 * @author Shubham
 */
public class Product {
    private static int count = 0;
    private String prodName;
    private int price;
    private int modelNumber;
    private int avalaibility;
    private int counter=0;
    //private String productType;
    private int warrantyPeriod;
    private String manufacturer;
    //private Date purchaseDate;
    private Date lastMaintenance;
    private Date nextMaintenance;
    private Date manuFacturingDate;
    private String availability;
    private int totalCost;
    private float weight;
    private float power;
    private int lifeSpan;
    private String status;
    private ScheduleCatalog scheduleCatalog;
    private Date toDate;
    private Date fromDate;
    private String location;
    
    
    public Product() {
        count++;
        modelNumber = count;
        status="abc";
        availability="AVAILABLE";
        scheduleCatalog=new ScheduleCatalog();
        location="SUPPLIER";
        
       
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    
    
    public ScheduleCatalog getScheduleCatalog() {
        return scheduleCatalog;
    }

    public void setScheduleCatalog(ScheduleCatalog scheduleCatalog) {
        this.scheduleCatalog = scheduleCatalog;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {    
        this.status = status;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
    
    

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }
    

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

//    public Date getPurchaseDate() {
//        return purchaseDate;
//    }
//
//    public void setPurchaseDate(Date purchaseDate) {
//        this.purchaseDate = purchaseDate;
//    }

    public Date getLastMaintenance() {
        return lastMaintenance;
    }

    public void setLastMaintenance(Date lastMaintenance) {
        this.lastMaintenance = lastMaintenance;
    }

    public Date getNextMaintenance() {
        return nextMaintenance;
    }

    public void setNextMaintenance(Date nextMaintenance) {
        this.nextMaintenance = nextMaintenance;
    }

    public Date getManuFacturingDate() {
        return manuFacturingDate;
    }

    public void setManuFacturingDate(Date manuFacturingDate) {
        this.manuFacturingDate = manuFacturingDate;
    }

  
    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
   
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }
    
    public int getAvalaibility() {
        return avalaibility;
    }

    public void setAvalaibility(int avalaibility) {
        this.avalaibility = avalaibility;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    

    
    @Override
    public String toString() {
        return prodName;
    }
    
}
