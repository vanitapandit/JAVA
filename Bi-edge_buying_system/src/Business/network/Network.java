/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author ricardo
 */
public class Network {
    
    private String name;
    private String networkID;
    private EnterpriseDirectory enterpriseDirectory;
    
    protected static int ID = 0;
    

    
    public Network(String name) {
        this.name = name;
        enterpriseDirectory=new EnterpriseDirectory();
        this.networkID = intToString(++ID);

    }
    
    private String intToString(int ID)
    {
        String tempID = String.valueOf(ID);
        while(tempID.length() < 2)
            tempID = "0" + tempID;
        return tempID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getNetworkID() {
        return networkID;
    }

    
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
