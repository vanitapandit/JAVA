/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterfaceCustomerRole;

import Business.BiedgeBuyingSystem;
import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.Organization.Organization;
import Business.Product.Product;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.MarketingRole.ManageCustomerJPanel;

/**
 *
 * @author vanit
 */
public class CustomerOrderPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private BiedgeBuyingSystem system;
    private Customer customer;
    private ArrayList<Product> productList;

    /**
     * Creates new form CustomerOrderPanel
     */
    public CustomerOrderPanel(JPanel userProcessContainer,BiedgeBuyingSystem system,Customer customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.customer = customer;
        this.productList = customer.getProductList();
        
        populateTable();
        populateCombox();
    }
    
    private void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) SalesTbl.getModel();
        dtm.setRowCount(0);
        for(Product product : productList)
        {
            Object[] row = new Object[8];
            row[0] = product.getProductID();
            row[1] = product.getProductName();
            row[2] = product.getSalesPrice();
            row[3] = product.getQuantity();
            row[4] = product.getSalesVolume();
            row[5] = product.getDeliveryDate();
            row[6] = product.getRecommendationIndex();
            row[7] = product.getExpertIndex();
            dtm.addRow(row);
        }
    }
    
    private void populateCombox()
    {
        SalemanComboBox.removeAllItems();
        //enterpriseTypeJComboBox.removeAllItems();
        for(Map.Entry<String, Employee> employees : customer.getEnterprise().getOrganizationDirectory().
                getOrganizationTypeMap().get(Organization.Type.Sales).getEmployeeDirectory().getEmployeeIDMap().entrySet())
        {
            
            
            SalemanComboBox.addItem(employees.getValue());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalesTbl = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SalemanComboBox = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();

        btnSubmit.setBackground(new java.awt.Color(153, 153, 255));
        btnSubmit.setText("Confirm");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        SalesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prod ID", "Name", "Sales Price", "Quantity", "Sales Volumn", "Delivery Date", "Recommendation Index", "Expert Index"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(SalesTbl);

        btnBack.setBackground(new java.awt.Color(153, 153, 255));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantity");

        jLabel2.setText("Salesman");

        SalemanComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SalemanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalemanComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack)
                                    .addComponent(btnSubmit))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SalemanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SalemanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(140, 140, 140))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        int selectedrow = SalesTbl.getSelectedRow();
        Product product = null;
        if(selectedrow >= 0)
        {
            String productID = (String)SalesTbl.getValueAt(selectedrow, 0);
            String productName = (String)SalesTbl.getValueAt(selectedrow, 1);
            int salesPrice = (int)SalesTbl.getValueAt(selectedrow, 2);
            int quantity= (int)SalesTbl.getValueAt(selectedrow, 3);
            int salesVolumn = (int)SalesTbl.getValueAt(selectedrow, 4);
            String deliveryDate = (String)SalesTbl.getValueAt(selectedrow, 5);
            int recommendation = (int)SalesTbl.getValueAt(selectedrow, 6);
            int expertIndex = (int)SalesTbl.getValueAt(selectedrow, 7);
            product = new Product(productID,productName,salesPrice,null,quantity, salesVolumn, deliveryDate);
            product.setRecommendationIndex(recommendation);
            product.setExpertIndex(expertIndex);
            
            
        }else {
                 JOptionPane.showMessageDialog(null, "Please select any row");
                 return;
        }
        
        int quantity = 0;
        if(!jTextField1.getText().equals(""))
        {
            try{


                    Integer.parseInt(jTextField1.getText());
                    

            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please try in a valid quantity!");
                return;
            }
            
            quantity = Integer.parseInt(jTextField1.getText());
            if(quantity < 0 || quantity > product.getQuantity())
            {
                JOptionPane.showMessageDialog(null, "Please try in a valid quantity!");
                return;
            }
        }else {
            JOptionPane.showMessageDialog(null, "Please try in a a valid quantity!");
                return;
        } 
        
        Employee salesman = (Employee) SalemanComboBox.getSelectedItem();
        
        Order order = new Order(product.getProductID(),customer,product.getProductName(),salesman,quantity, product.getSalesPrice(),product.getSalesPrice() * quantity);
        system.getNetworkMap().get(customer.getEnterprise().getNetworkName()).getEnterpriseDirectory().
                getEnterpriseNameMap().get(customer.getEnterprise().getName()).getOrganizationDirectory().
                getOrganizationTypeMap().get(Organization.Type.Marketing).getCustomerEmailMap().
                get(customer.getEmail()).getOrderList().add(order);
        customer.setSalesman(salesman);
        system.getNetworkMap().get(customer.getEnterprise().getNetworkName()).getEnterpriseDirectory().
                getEnterpriseNameMap().get(customer.getEnterprise().getName()).getOrganizationDirectory().
                getOrganizationTypeMap().get(Organization.Type.Sales).getEmployeeDirectory().
                getEmployeeIDMap().get(customer.getSalesman().getEmployeeID()).getOrderList().add(order);
        
        for(Order order1 : customer.getOrderList())
        {
            System.out.println(order.getOrderID());
        }
        
        CustomerViewJPanel customerViewJPanel = new CustomerViewJPanel(userProcessContainer, customer.getOrderList());
        userProcessContainer.add("manageEmployeeJPanel", customerViewJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void SalemanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalemanComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalemanComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox SalemanComboBox;
    private javax.swing.JTable SalesTbl;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
