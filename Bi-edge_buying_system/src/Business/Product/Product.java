/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

/**
 *
 * @author ricardo
 */
public class Product {
    private String productID;
    private String productName;
    private int salesPrice;
    private String source;
    private int quantity;
    private int salesVolume;
    private String deliveryDate;
    private int recommendationIndex;
    private int expertIndex;
    
    public Product(String productID, String productName, int salesPrice, String source,
            int quantity, int salesVolume, String deliveryDate)
    {
        this.productID = productID;
        this.productName = productName;
        this.salesPrice = salesPrice;
        this.source = source;
        this.quantity = quantity;
        this.salesVolume = salesVolume;
        this.deliveryDate = deliveryDate;
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

    public String getSource() {
        return source;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getRecommendationIndex() {
        return recommendationIndex;
    }

    public void setRecommendationIndex(int recommendationIndex) {
        this.recommendationIndex = recommendationIndex;
    }

    public int getExpertIndex() {
        return expertIndex;
    }

    public void setExpertIndex(int expertIndex) {
        this.expertIndex = expertIndex;
    }
    
    
    
}
