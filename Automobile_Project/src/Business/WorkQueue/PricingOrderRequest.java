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
public class PricingOrderRequest {
    
    String pricingOrderId;
    String quoteOrderId;
    private Car car;
    private int floorPrice;
    private int ceilingPrice;
    private int targetPrice;
    UserAccount marketing;
    Boolean isPriceGiven;

    public PricingOrderRequest() {
        car = new Car();
    }

    public String getQuoteOrderId() {
        return quoteOrderId;
    }

    public void setQuoteOrderId(String quoteOrderId) {
        this.quoteOrderId = quoteOrderId;
    }

    public Boolean getIsPriceGiven() {
        return isPriceGiven;
    }

    public void setIsPriceGiven(Boolean isPriceGiven) {
        this.isPriceGiven = isPriceGiven;
    }
    
    
    

    public String getPricingOrderId() {
        return pricingOrderId;
    }

    public void setPricingOrderId(String pricingOrderId) {
        this.pricingOrderId = pricingOrderId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(int ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public UserAccount getMarketing() {
        return marketing;
    }

    public void setMarketing(UserAccount marketing) {
        this.marketing = marketing;
    }
    
    @Override
    public String toString(){
        return pricingOrderId;
    }
    
}
