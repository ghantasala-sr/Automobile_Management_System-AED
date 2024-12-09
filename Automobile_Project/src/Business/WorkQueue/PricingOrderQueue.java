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
public class PricingOrderQueue {
    
    private ArrayList<PricingOrderRequest> priceOrderList;

    public PricingOrderQueue() {
        priceOrderList = new ArrayList();
    }

    public ArrayList<PricingOrderRequest> getPriceOrderList() {
        return priceOrderList;
    }

    public void setPriceOrderList(ArrayList<PricingOrderRequest> priceOrderList) {
        this.priceOrderList = priceOrderList;
    }
    
        public PricingOrderRequest findByQuoteOrderId(String quoteOrderId) {
        for (PricingOrderRequest request : priceOrderList) {
            if (request.getQuoteOrderId().equals(quoteOrderId)) {
                return request;
            }
        }
        return null; // Return null if not found
    }
    
    
}
