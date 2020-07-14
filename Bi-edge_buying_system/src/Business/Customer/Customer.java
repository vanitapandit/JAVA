/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.Product.Product;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author ricardo
 */
public class Customer {
    private String name;
    private String email;
    private String customerID;
    private Enterprise enterprise;
    private Employee salesman;
    private Role role;
    
    private ArrayList<Product> productList;
    private ArrayList<Order> orderList;
    
    public static int ID = 0;
    

    public Customer(String name, String email, Enterprise enterprise) {
        this.name = name;
        this.email = email;
        this.customerID = enterprise.getEnterpriseID() + ":" + intToString(++ID);
        this.enterprise = enterprise;
        this.role = new CustomerRole();
        this.productList = new ArrayList();
        this.orderList = new ArrayList();
        
    }
    
    private String intToString(int ID)
    {
        String tempID = String.valueOf(ID);
        while(tempID.length() < 8)
            tempID = "0" + tempID;
        return tempID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerID() {
        return customerID;
    }



    public Enterprise getEnterprise() {
        return enterprise;
    }

    public Employee getSalesman() {
        return salesman;
    }


    public Role getRole() {
        return role;
    }

    public void setSalesman(Employee salesman) {
        this.salesman = salesman;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    
    
    
}
