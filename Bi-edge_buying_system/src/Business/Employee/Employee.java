/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Order.Order;
import Business.Product.Product;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private String employeeID;
    private String organizationName;
    private ArrayList<Product> productList;
    private ArrayList<Order> orderList;
    private Role role;
    private static int ID = 0;

    public Employee(String name, String organizationID, Role role) {
        this.name = name;
        this.employeeID = combineString(organizationID, intToString(++ID));
        this.organizationName = generateOrganizationName(role);
        this.role = role;
        productList = new ArrayList();
        orderList = new ArrayList();
    }
    
    private String generateOrganizationName(Role role)
    {
        if(role.getRoleType().equals(Role.RoleType.Accounting))
            return new String("Accounting");
        else if(role.getRoleType().equals(Role.RoleType.CourierAdministrator))
            return new String("ShippingManagement");
        else if(role.getRoleType().equals(Role.RoleType.MarketEmployee))
            return new String("Marketing");
        else if(role.getRoleType().equals(Role.RoleType.Salesman))
            return new String("Sales");
        else 
            return new String("Technology");
    }

    private String combineString(String leftPart,String rightPart)
    {
        return leftPart + ":" + rightPart;
    }
 
    private String intToString(int ID)
    {
        String tempID = String.valueOf(ID);
        while(tempID.length() < 6)
            tempID = "0" + tempID;
        return tempID;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return employeeID;
    }



    public String getOrganizationName() {
        return organizationName;
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
    
    

    public void deleteProductList()
    {
        this.productList.clear();
    }

    

    public Role getRole() {
        return role;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
