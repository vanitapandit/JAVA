/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.Employee.Employee;

/**
 *
 * @author ricardo
 */
public class Order {
    
    private String orderID;
    private Customer customer;
    private String productID;
    private String productName;
    private Employee salesman;
    private int quantity;
    private int salesPrice;
    
    private int totalPrice;
    private String trackingNo;
    private float totalRevenue;
    private float revConsultingCompany;
    private float revBuyingAgent;

    
    private static int ID = 0;
    
    public Order(String productID, Customer customer, String productName, Employee salesman, int quantity,
            int salesPrice, int totalPrice)
    {
        this.customer = customer;
        this.productID = productID;
        this.productName = productName;
        this.salesPrice = salesPrice;
        this.orderID = intToString(++ID);
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    private String intToString(int ID)
    {
        String tempID = String.valueOf(ID);
        while(tempID.length() < 4)
            tempID = "0" + tempID;
        return tempID;
    }
    
    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public String getOrderID() {
        return orderID;
    }

    public Employee getSalesman() {
        return salesman;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public float getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(int totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public float getRevConsultingCompany() {
        return revConsultingCompany;
    }

    public void setRevConsultingCompany(int revConsultingCompany) {
        this.revConsultingCompany = revConsultingCompany;
    }

    public float getRevBuyingAgent() {
        return revBuyingAgent;
    }

    public void setRevBuyingAgent(int revBuyingAgent) {
        this.revBuyingAgent = revBuyingAgent;
    }

    
    
}
