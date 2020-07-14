/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Role.Role;
import Business.Workqueue.WorkQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ricardo
 */
public abstract class Organization {
    
    //private String name;
    private Type type;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private String organizationID;
    private String enterpriseID;
    
    private Map<String, Customer> customerEmailMap;
    
    public enum Type{
        Technology("Technology Organization"), ShippingManagement("Shipping Management Organization"), 
        Accounting("Accounting Organization"), Marketing("Marketing Organization"), 
        Sales("Sales Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(Type type, String enterpriseID) {
        //this.name = name;
        this.type = type;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        this.organizationID = enterpriseID + ":" + generateOrganizationID(type);
        this.enterpriseID = enterpriseID;
        this.customerEmailMap = new HashMap();
    }
    
    private String generateOrganizationID(Type type)
    {
        if(type.equals(Type.Technology))
            return new String("1");
        else if(type.equals(Type.ShippingManagement))
            return new String("2");
        else if(type.equals(Type.Accounting))
            return new String("3");
        else if(type.equals(Type.Marketing))
            return new String("4");
        else 
            return new String("5");
    }
    

    public String getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getEnterpriseID() {
        return enterpriseID;
    }

    public Type getType() {
        return type;
    }

    public Map<String, Customer> getCustomerEmailMap() {
        return customerEmailMap;
    }

    public Customer createCustomer(String name, String email, Enterprise enterprise) {
        if(customerEmailMap.containsKey(email))
            return null;
        Customer customer = new Customer(name, email, enterprise);
        customerEmailMap.put(customer.getEmail(), customer);
        return customer;
    }


    
    
    
    

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    /*
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
*/
    
    
}
