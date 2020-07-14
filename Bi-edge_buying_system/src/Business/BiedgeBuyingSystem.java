/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.UserAccount.UserAccountDirectory;
import Business.network.Network;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ricardo
 */
public class BiedgeBuyingSystem {
    
    private static BiedgeBuyingSystem business;
    private Map<String, Network> networkMap;
    
    private UserAccountDirectory userAccountDirectory;
    public static BiedgeBuyingSystem getInstance(){
        if(business == null){
            business = new BiedgeBuyingSystem();
        }
        return business;
    }
    
    private BiedgeBuyingSystem(){
        networkMap=new HashMap<String, Network>();
        userAccountDirectory = new UserAccountDirectory();
    }
    
    public Network createAndAddNetwork(String name){
        if(networkMap.containsKey(name))
        {
            return null;
        }
        Network network=new Network(name);
        networkMap.put(network.getName(), network);
        return network;
    }
    /*
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private BiedgeBuyingSystem(){
        networkList=new ArrayList<Network>();
    }
*/
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public Map<String, Network> getNetworkMap() {
        return networkMap;
    }


    
    
    
    
    
}
