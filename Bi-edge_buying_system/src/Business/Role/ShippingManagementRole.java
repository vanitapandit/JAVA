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
import userinterface.ShippingRole.ShippingAllTaskJPanel;

/**
 *
 * @author vanit
 */
public class ShippingManagementRole extends Role{
    
    public ShippingManagementRole(){
        super(RoleType.CourierAdministrator);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, BiedgeBuyingSystem system ,Enterprise enterprise, Employee employee, Customer customer) {
         return new ShippingAllTaskJPanel(userProcessContainer, system, enterprise, employee);
        
    }

    
    
}
