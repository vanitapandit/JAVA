 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    private ArrayList<Enterprise> enterpriseList;
    
    private String name;
    
    private String networkName;
    
    private String enterpriseID;
    
    protected static int ID = 0;
    
    public enum EnterpriseType{
        Agent("Buying agent company"), Consulting("Consulting company");
        private String value;
        private EnterpriseType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public Enterprise(String networkName, String name, EnterpriseType enterpriseType, String networkID){
        
        this.networkName = networkName;
        this.name = name;
        this.enterpriseType = enterpriseType;
        this.enterpriseID = combineString(networkID, intToString(++ID));
        organizationDirectory=new OrganizationDirectory(enterpriseType, enterpriseID);
        enterpriseList = new ArrayList();
        
    }
    
    private String combineString(String leftPart,String rightPart)
    {
        return leftPart + ":" + rightPart;
    }
 
    private String intToString(int ID)
    {
        String tempID = String.valueOf(ID);
        while(tempID.length() < 4)
            tempID = "0" + tempID;
        return tempID;
    }

    public String getNetworkName() {
        return networkName;
    }
    
    
   
    

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void addJointEnterprise(Enterprise enterprise) {
        System.out.println("addJointEnterprise:" + enterpriseList.size());
        enterpriseList.add(enterprise);
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    


    public String getName() {
        return name;
    }


    public String getEnterpriseID() {
        return enterpriseID;
    }



    


    public OrganizationDirectory getOrganizationDirectory() {
        System.out.println("getOrganizationDirectory");
        return organizationDirectory;
    }
     
    
      @Override
    public String toString() {
        return getName();
    }
}
