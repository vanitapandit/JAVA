/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private Map<String, Enterprise> enterpriseNameMap;
    private Map<String, Enterprise> enterpriseIDMap;
   

    public Map<String, Enterprise> getEnterpriseNameMap() {
        return enterpriseNameMap;
    }
    
    public Map<String, Enterprise> getEnterpriseIDMap() {
        return enterpriseIDMap;
    }

    
    public EnterpriseDirectory(){
        enterpriseNameMap=new HashMap<String, Enterprise>();
        enterpriseIDMap=new HashMap<String, Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String networkName, String name,Enterprise.EnterpriseType type, String network){
        
        if(enterpriseNameMap.containsKey(name))
        {
            return null;
        }
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Agent){
            enterprise=new BuyingAgentEnterprise(networkName, name, network);
           
        }else if(type == Enterprise.EnterpriseType.Consulting){
             enterprise=new ConsultingEnterprise(networkName, name, network);
             
        }
        enterpriseNameMap.put(name, enterprise);
        enterpriseIDMap.put(enterprise.getEnterpriseID(), enterprise);
        return enterprise;
    }
    
    public boolean updateEnterprise(Enterprise enterpriseBody, Enterprise joint)
    {
        if(enterpriseNameMap.containsKey(enterpriseBody.getName()))
        {
            enterpriseBody.addJointEnterprise(joint);
            enterpriseNameMap.put(enterpriseBody.getName(), enterpriseBody);
            enterpriseIDMap.put(enterpriseBody.getEnterpriseID(), enterpriseBody);
            return true;
        }
        else
            return false;
    }
    
    public void deleteEnterprise(Enterprise enterprise){
        enterpriseNameMap.remove(enterprise.getName());
        enterpriseIDMap.remove(enterprise.getEnterpriseID());
    }
}
