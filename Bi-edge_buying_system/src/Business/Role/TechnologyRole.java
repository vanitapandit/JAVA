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
import userinterface.TechnologyRole.TechnologyAllTaskJPanel;


/**
 *
 * @author vanit
 */
public class TechnologyRole extends Role{
    
    public TechnologyRole(){
        super(RoleType.Technician);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, BiedgeBuyingSystem system ,Enterprise enterprise, Employee employee, Customer customer) {
         return new TechnologyAllTaskJPanel(userProcessContainer, system, enterprise, employee);
    }

    
    
}

