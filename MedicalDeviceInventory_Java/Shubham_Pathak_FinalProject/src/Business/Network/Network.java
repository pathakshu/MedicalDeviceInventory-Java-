/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Shubham
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public Network() {
        super();
        enterpriseDirectory = new EnterpriseDirectory();
    }
public enum NetworkType{
    PHS("PHS Network");
    private String value;
    private NetworkType(String value){
        this.value=value;
    }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    
}
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
