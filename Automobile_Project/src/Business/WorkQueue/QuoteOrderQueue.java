/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Car.Car;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author srinivasarithikghantasala
 */
public class QuoteOrderQueue {
    
    private ArrayList<QuoteOrderRequest> quoteOrderList;

    public QuoteOrderQueue() {
        quoteOrderList = new ArrayList();
    }

    public ArrayList<QuoteOrderRequest> getQuoteOrderRequestList() {
        return quoteOrderList;
    }

    public void setQuoteOrderList(ArrayList<QuoteOrderRequest> quoteOrderList) {
        this.quoteOrderList = quoteOrderList;
    }
    
    // Method to get top-selling car models
    public Map<String, Long> getTopSellingCarModels() {
        return quoteOrderList.stream()
                .filter(QuoteOrderRequest::getIsDelivered) // Filter only delivered orders
                .collect(Collectors.groupingBy(
                        request -> request.getCar().getModel(), 
                        Collectors.counting()
                ));
    }

    // Method to calculate total revenue generated
    public int getTotalRevenueGenerated() {
        return quoteOrderList.stream()
                .filter(QuoteOrderRequest::getIsDelivered) // Filter only delivered orders
                .mapToInt(request -> request.getPrice() * request.getQuantity()) // Multiply price by quantity
                .sum();
    }

    // Method to calculate total cars sold
    public int getTotalCarsSold() {
        return quoteOrderList.stream()
                .filter(QuoteOrderRequest::getIsDelivered) // Filter only delivered orders
                .mapToInt(QuoteOrderRequest::getQuantity)
                .sum();
    }

    // Method to get top 5 orders by price
    public List<QuoteOrderRequest> getTop5OrdersByPrice() {
        return quoteOrderList.stream()
                .filter(QuoteOrderRequest::getIsDelivered) // Filter only delivered orders
                .sorted(Comparator.comparingInt(QuoteOrderRequest::getPrice).reversed()) // Sort by price in descending order
                .limit(5) // Limit to top 5
                .collect(Collectors.toList());
    }
    
    
    
    
    
    
}
