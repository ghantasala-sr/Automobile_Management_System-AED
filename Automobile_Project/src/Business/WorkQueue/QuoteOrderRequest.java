/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Car.Car;
import Business.UserAccount.UserAccount;

/**
 *
 * @author srinivasarithikghantasala
 */
public class QuoteOrderRequest {
    String quoteOrderId;
    Car car;
    int quantity;
    int price;
    String status;
    String deliveryDate;
    UserAccount distributor;
    UserAccount sales;
    UserAccount dealer;
    UserAccount customer;
    Boolean isQuoteReq;
    Boolean isQuoteRes;
    Boolean isPriceAcceptable;
    Boolean isProcessing;
    Boolean isDelivered;
    Boolean isReadyToDeliver;
    Boolean isOrderCreated;
    Boolean isMarketPrice;
    
    
    public QuoteOrderRequest(){
        car = new Car();
    }

    public Boolean getIsMarketPrice() {
        return isMarketPrice;
    }

    public void setIsMarketPrice(Boolean isMarketPrice) {
        this.isMarketPrice = isMarketPrice;
    }
    
    

    public Boolean getIsOrderCreated() {
        return isOrderCreated;
    }

    public void setIsOrderCreated(Boolean isOrderCreated) {
        this.isOrderCreated = isOrderCreated;
    }
    
    

    public Boolean getIsReadyToDeliver() {
        return isReadyToDeliver;
    }

    public void setIsReadyToDeliver(Boolean isReadyToDeliver) {
        this.isReadyToDeliver = isReadyToDeliver;
    }
    
    

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
    public String getQuoteOrderId() {
        return quoteOrderId;
    }

    public void setQuoteOrderId(String quoteOrderId) {
        this.quoteOrderId = quoteOrderId;
    }

    

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public UserAccount getDistributor() {
        return distributor;
    }

    public void setDistributor(UserAccount distributor) {
        this.distributor = distributor;
    }

    public UserAccount getSales() {
        return sales;
    }

    public void setSales(UserAccount sales) {
        this.sales = sales;
    }

    public UserAccount getDealer() {
        return dealer;
    }

    public void setDealer(UserAccount dealer) {
        this.dealer = dealer;
    }

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }

    public Boolean getIsQuoteReq() {
        return isQuoteReq;
    }

    public void setIsQuoteReq(Boolean isQuoteReq) {
        this.isQuoteReq = isQuoteReq;
    }

    public Boolean getIsQuoteRes() {
        return isQuoteRes;
    }

    public void setIsQuoteRes(Boolean isQuoteRes) {
        this.isQuoteRes = isQuoteRes;
    }

    public Boolean getIsPriceAcceptable() {
        return isPriceAcceptable;
    }

    public void setIsPriceAcceptable(Boolean isPriceAcceptable) {
        this.isPriceAcceptable = isPriceAcceptable;
    }

    public Boolean getIsProcessing() {
        return isProcessing;
    }

    public void setIsProcessing(Boolean isProcessing) {
        this.isProcessing = isProcessing;
    }

    public Boolean getIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(Boolean isDelivered) {
        this.isDelivered = isDelivered;
    }
    
    @Override
    public String toString() {
        return quoteOrderId;
    }
}
