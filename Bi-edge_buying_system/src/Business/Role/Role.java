/*
 * To change this template, choose Tools | Templates
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

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    private RoleType roleType;
    
    public enum RoleType{
        Admin("Admin"),
        Director("Enterprise Director"),
        Technician("Technician"),
        CourierAdministrator("Courier Administrator"),
        Salesman("Salesman"),
        Accounting("Accounting"),
        MarketEmployee("Market Employee"),
        Customer("Customer");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public Role(RoleType role) {
        this.roleType = role;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer, BiedgeBuyingSystem system ,Enterprise enterprise, Employee employee, Customer customer);
 

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}