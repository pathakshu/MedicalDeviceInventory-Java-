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
public class MasterOrderCatalog {
    
    private ArrayList<Order> masterOrderCatalog;
    
    public MasterOrderCatalog(){
    masterOrderCatalog = new ArrayList<Order>();
    }

    public ArrayList<Order> getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(ArrayList<Order> masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }
    
    public Order addOrder(Order o){///not creating a blank object here but on UI side
    masterOrderCatalog.add(o);
    return o;
    }
    
}
