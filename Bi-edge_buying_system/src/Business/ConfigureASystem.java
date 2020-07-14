/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.AdminRole;


/**
 *
 * @author ricardo
 */
public class ConfigureASystem {
    
    public static BiedgeBuyingSystem configure(){
        
        BiedgeBuyingSystem system = BiedgeBuyingSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        //Employee employee = system.getEmployeeDirectory().createEmployee("admin");
        
        system.getUserAccountDirectory().createUserAccount("admin@gmail.com", "Ricardo" ,"sysadmin","admin", new AdminRole());
        
        return system;
    }
    
}
