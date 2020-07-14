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
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SalesRole.SalesAllTaskJPanel;

/**
 *
 * @author vanit
 */
public class SalesRole extends Role{
    
    public SalesRole(){
        super(RoleType.Salesman);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, BiedgeBuyingSystem system ,Enterprise enterprise, Employee employee, Customer customer) {
         return new SalesAllTaskJPanel(userProcessContainer,system, enterprise, employee);

    }

    
    
}

