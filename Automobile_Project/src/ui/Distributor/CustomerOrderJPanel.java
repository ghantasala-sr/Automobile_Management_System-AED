/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Distributor;

import Business.Car.Car;
import Business.Car.CarDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InventoryOrderRequest;
import Business.WorkQueue.QuoteOrderRequest;
import java.awt.CardLayout;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.Dealer.ViewCarDetailsJPanel;

/**
 *
 * @author srinivasarithikghantasala
 */
public class CustomerOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerOrderJPanel
     */
    JPanel workArea;
    EcoSystem system;
    UserAccount account;
    String enName;
    Enterprise enterprise;
    Organization organization;
    
    Random random = new Random();
    public CustomerOrderJPanel(JPanel workArea, UserAccount account,Enterprise enterprise,Organization organization , EcoSystem system) {
        initComponents();
        this.workArea = workArea;
        this.system = system;
        this.account = account;
                this.enterprise = enterprise;
        this.organization = organization;
        enName = "DealerEnterprise";
        setSize(750, 530);
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblWorkArea.getModel();
        
        model.setRowCount(0);

        for(Network network:system.getNetworkList()){
            for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                if (ent.getName().equals(enterprise.getName())){
                    for(Organization org: ent.getOrganizationDirectory().getOrganizationList()){
                        if(org.getName().equals("Distributor Organization")){
                            for(QuoteOrderRequest req : org.getQuoteOrderQueue().getQuoteOrderRequestList()){
                                if(req.getDistributor().getUsername().equals(account.getUsername())){
                                    Object[] row = new Object[4];
                                    row[0] = req;
                                    row[1] = req.getCar().getModel();
                                    row[2] = req.getDealer()==null?"None":req.getDealer().getUsername();
                                    row[3] = req.getStatus();
                                    model.addRow(row);
                                }

                            }
                        }
                    }
                    
                }
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkArea = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblWorkArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Quote ID", "Car Model", "Dealer", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkArea);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCheck.setText("Check In Inventory");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign for delivery");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnCreate.setText("Create Order");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnViewOrder.setText("View Car Details");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Customer Orders");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAssign, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(290, 290, 290)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(257, 257, 257))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck)
                    .addComponent(btnViewOrder))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnCreate))
                .addGap(121, 121, 121))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkArea.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Pick a selected row", "Information", JOptionPane.INFORMATION_MESSAGE);

            return;
        } 
        QuoteOrderRequest req = (QuoteOrderRequest)tblWorkArea.getValueAt(selectedRow, 0);
        Car car = req.getCar();
        CarDirectory cd = account.getCarDirectory();
        for(Car c: cd.getCarslist()){
            if(c.getQuantity()>=1){
                if(c.getModel().equals(car.getModel()) && c.getEngine().equals(car.getEngine())
                    && c.getExteriorColor().equals(car.getExteriorColor()) && c.getInteriorColor().equals(car.getInteriorColor())
                    && c.getTransmission().equals(car.getTransmission())
                            && c.getVariant().equals(car.getVariant()))
                    {
                            if(!req.getIsReadyToDeliver()){
                                 req.setIsReadyToDeliver(true);
                            req.setStatus("Ready for delivery !!");
                            int quantity = c.getQuantity();
                            quantity -= 1;
                            c.setQuantity(quantity);
                            populateRequestTable();
                        
                           JOptionPane.showMessageDialog(this, "Allocated to the customer !!", "Information", JOptionPane.INFORMATION_MESSAGE);
                           return;
                            }
                           
            }
            }
            
        }
        
        JOptionPane.showMessageDialog(this, "Out of stock", "Information", JOptionPane.INFORMATION_MESSAGE);
                           return;

    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkArea.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Pick a selected row", "Information", JOptionPane.INFORMATION_MESSAGE);

            return;
        } 
        QuoteOrderRequest req = (QuoteOrderRequest)tblWorkArea.getValueAt(selectedRow, 0);
        Car car = req.getCar();
        CarDirectory cd = account.getCarDirectory();
        for(Car c: cd.getCarslist()){
            if(c.getQuantity()>=1){
                if(c.getModel().equals(car.getModel()) && c.getEngine().equals(car.getEngine())
                    && c.getExteriorColor().equals(car.getExteriorColor()) && c.getInteriorColor().equals(car.getInteriorColor())
                    && c.getTransmission().equals(car.getTransmission())
                            && c.getVariant().equals(car.getVariant()))
                    {
                
                           JOptionPane.showMessageDialog(this, "In stock", "Information", JOptionPane.INFORMATION_MESSAGE);
                           return;
                
            }
            }
            
        }
        
        JOptionPane.showMessageDialog(this, "Out of stock", "Information", JOptionPane.INFORMATION_MESSAGE);
                           return;
        
        
        
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkArea.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Pick a selected row", "Information", JOptionPane.INFORMATION_MESSAGE);

            return;
        } 
        QuoteOrderRequest req = (QuoteOrderRequest)tblWorkArea.getValueAt(selectedRow, 0);
        
        if(req.getIsOrderCreated()==true){
                   JOptionPane.showMessageDialog(this, "Order Already created !!", "Information", JOptionPane.INFORMATION_MESSAGE);
                   return;
        }
        
        InventoryOrderRequest ior = new InventoryOrderRequest();
        
        String name = req.getCar().getModel();
        String variant = req.getCar().getVariant();
        String engine = req.getCar().getEngine();
        String extColor = req.getCar().getExteriorColor();
        String intColor = req.getCar().getInteriorColor();
        String transmission = req.getCar().getTransmission();
        int quantity = 1;
        ior.getCar().setModel(name);
        ior.getCar().setVariant(variant);
        ior.getCar().setEngine(engine);
        ior.getCar().setExteriorColor(extColor);
        ior.getCar().setTransmission(transmission);
        ior.getCar().setInteriorColor(intColor);
        ior.getCar().setQuantity(quantity);
        ior.setOrderId(String.valueOf(random.nextInt(100)));
        ior.setQuantity(quantity);
        ior.setDistributor(account);
        ior.setStatus("Order created");
        ior.setManufacturer(null);
        ior.setManufacturerPaint(null);
        ior.setManufacturerTechnical(null);
        ior.setLogistics(null);
        ior.setTesting(null);
        ior.setIsManf(false);
        ior.setIsPaint(false);
        ior.setIsTech(false);
        ior.setIsTest(false);
        ior.setIsLog(false);
        ior.setDeliveryDate("Not yet");
        ior.setIsDelivered(false);
        req.setIsOrderCreated(true);
        

        for(Network network:system.getNetworkList()){
            for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                if (Enterprise.EnterpriseType.Manufacturer.equals(ent.getEnterpriseType())){
                    for(Organization org: ent.getOrganizationDirectory().getOrganizationList()){
                        org.getInventoryOrderQueue().getInventoryOrderRequestList().add(ior);
                    }
                    account.getInventoryOrderQueue().getInventoryOrderRequestList().add(ior);
                }
                if (Enterprise.EnterpriseType.Logistic.equals(ent.getEnterpriseType())){
                    for(Organization org: ent.getOrganizationDirectory().getOrganizationList()){
                        System.out.println(org.getName());
                        org.getInventoryOrderQueue().getInventoryOrderRequestList().add(ior);
                    }
                }
                
            }
        }
        
        req.setStatus("Order is under manufacturing !!");
        req.setDeliveryDate("Not yet");
        
        JOptionPane.showMessageDialog(this, "Order created successfully !!", "Information", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkArea.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Pick a selected row", "Information", JOptionPane.INFORMATION_MESSAGE);

            return;
        }

        QuoteOrderRequest req = (QuoteOrderRequest)tblWorkArea.getValueAt(selectedRow, 0);

        ViewCarDetailsJPanel viojp = new ViewCarDetailsJPanel(workArea, req);
        workArea.add("ViewCarDetailsJPanel",viojp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkArea;
    // End of variables declaration//GEN-END:variables
}
