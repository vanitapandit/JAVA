/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.BiedgeBuyingSystem;
import Business.Enterprise.Enterprise;
import Business.network.Network;
import java.awt.CardLayout;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author ricardo
 */
public class EnterpriseWorkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseWorkJPanel
     */
    private JPanel userProcessContainer;
    private BiedgeBuyingSystem system;
    private Enterprise enterprise;
    
    public EnterpriseWorkJPanel(JPanel userProcessContainer, BiedgeBuyingSystem system ,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.enterprise = enterprise;
        
        populateTree();
        populateTable();
    }
    
    public void populateTree(){
        
        valueLabel.setText(enterprise.getName());
        
        DefaultTreeModel model=(DefaultTreeModel)jTree3.getModel();
        Map<String, Network> networkMap=system.getNetworkMap();
        
        //ArrayList<Organization> organizationList;
        
        //Network network;
        //Enterprise enterprise;
        //Organization organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        
        int i = 0;
        for(Map.Entry<String, Network> network : networkMap.entrySet()){
            
            networkNode=new DefaultMutableTreeNode(network.getValue());
            networks.insert(networkNode, i ++);
            
            Map<String, Enterprise> enterpriseMap = network.getValue().
                    getEnterpriseDirectory().getEnterpriseNameMap();
            int j = 0;
            for(Map.Entry<String, Enterprise> enterprise : enterpriseMap.entrySet()){
                
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getValue());
                networkNode.insert(enterpriseNode, j++);
                
                
                }
            }
        
        model.reload();
    }
    
    private void addJointEnterprise(Enterprise enterpriseValue)
    {
        if(enterpriseValue.getName().equals(enterprise.getName()))
        {
            JOptionPane.showMessageDialog(null, "Please choose other enterprise!");
            return;
        }
        Network network1=system.getNetworkMap().get(enterprise.getNetworkName());
        Network network2=system.getNetworkMap().get(enterpriseValue.getNetworkName());
        
        
        network1.getEnterpriseDirectory().updateEnterprise(enterprise, enterpriseValue);
        system.getNetworkMap().put(enterprise.getNetworkName(), network1);
        
        network2.getEnterpriseDirectory().updateEnterprise(enterpriseValue, enterprise);
        system.getNetworkMap().put(enterpriseValue.getNetworkName(), network2);
    }
    
    private void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) enterpriseJTable.getModel();
        dtm.setRowCount(0);
        for(Enterprise enterpriseValue : enterprise.getEnterpriseList())
        {
            Object[] row = new Object[4];
            row[0] = enterpriseValue.getNetworkName();
            row[1] = enterpriseValue.getName();
            row[2] = enterpriseValue.getEnterpriseType();
            row[3] = enterpriseValue.getEnterpriseID();
            dtm.addRow(row);
        }
    }

    private boolean judgeEnterprise(String selectName)
    {
        
        Map<String, Network> networkMap=system.getNetworkMap();
        /*
        Network network = system.getNetworkMap().get(enterprise.getNetworkName());
        network.getEnterpriseDirectory().updateEnterprise(enterprise, joint);
        system.getNetworkMap().put(enterprise.getNetworkName(), network);
        */
        
        if(networkMap.containsKey(selectName))
            return false;
        else
            return true;
        /*
        Enterprise enterpriseTemp = null;
        
        for(Map.Entry<String, Network> network : networkMap.entrySet())
        {
            Map<String, Enterprise> enterpriseNameMap = network.getValue().
                    getEnterpriseDirectory().getEnterpriseNameMap();
            for(Map.Entry<String, Enterprise> enterpriseValue : enterpriseNameMap.entrySet())
            {
                if(enterpriseValue.getKey().equals(selectName))
                {
                    enterpriseTemp = enterpriseValue.getValue();
                }
            }
        }
        
        
        //system.getNetworkMap().get(networkName).getEnterpriseDirectory().
         //       getEnterpriseNameMap().get(enterprise.getName()).getEnterpriseList().add(enterpriseTemp);
         
        
        // network.getEnterpriseDirectory().getEnterpriseNameMap().get(name).getEnterpriseID()
        //populateTable();
        return enterpriseTemp;
        */
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTree3 = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageEmployeeJButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        addEnterprisejButton1 = new javax.swing.JButton();

        jTree3.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree3ValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jTree3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 289, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        manageEmployeeJButton.setBackground(new java.awt.Color(153, 153, 255));
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Network", "Enterprise", "Type", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(enterpriseJTable);

        jLabel2.setText("Joint venture");

        addEnterprisejButton1.setBackground(new java.awt.Color(153, 153, 255));
        addEnterprisejButton1.setText("Add");
        addEnterprisejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnterprisejButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(manageEmployeeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(addEnterprisejButton1)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGap(34, 34, 34)
                .addComponent(manageEmployeeJButton)
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addEnterprisejButton1)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTree3ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree3ValueChanged

        
    }//GEN-LAST:event_jTree3ValueChanged

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, system, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void addEnterprisejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnterprisejButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree3.getLastSelectedPathComponent();
        if(selectedNode!=null){
            if(judgeEnterprise(selectedNode.toString()))
            {
                Enterprise enterprise = (Enterprise) selectedNode.getUserObject();
                addJointEnterprise(enterprise);
            }
        
        }
        populateTable();
        
    }//GEN-LAST:event_addEnterprisejButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEnterprisejButton1;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTree jTree3;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
