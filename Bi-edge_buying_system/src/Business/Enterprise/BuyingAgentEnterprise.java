/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vanit
 */
public class BuyingAgentEnterprise extends Enterprise {
    
    public BuyingAgentEnterprise(String networkName, String name, String networkID){
        super(networkName, name, EnterpriseType.Agent, networkID);
    }

    
}