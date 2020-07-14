/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.BiedgeBuyingSystem;
import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;

import javax.swing.JPanel;
import userinterface.MarketingRole.MarketingAllTaskJPanel;

/**
 *
 * @author vanit
 */
public class MarketingRole extends Role{
    
    public MarketingRole(){
        super(RoleType.MarketEmployee);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, BiedgeBuyingSystem system ,Enterprise enterprise, Employee employee, Customer customer) {
         return new MarketingAllTaskJPanel(userProcessContainer, system, enterprise, employee);
        
    }

    
    
}

