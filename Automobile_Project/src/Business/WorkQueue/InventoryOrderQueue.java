/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author srinivasarithikghantasala
 */
public class InventoryOrderQueue {
    
    private ArrayList<InventoryOrderRequest> inventoryOrderList;

    public InventoryOrderQueue() {
        inventoryOrderList = new ArrayList();
    }
    
    public ArrayList<InventoryOrderRequest> getInventoryOrderRequestList(){
        return inventoryOrderList;
    }
    
    public InventoryOrderRequest createInventoryOrder(){
        InventoryOrderRequest ior = new InventoryOrderRequest();
        inventoryOrderList.add(ior);
        return ior;
    }
    
    
    
}
