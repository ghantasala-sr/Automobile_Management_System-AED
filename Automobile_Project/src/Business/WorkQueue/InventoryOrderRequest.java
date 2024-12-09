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
public class InventoryOrderRequest {
    
    String orderId;
    Car car;
    int quantity;
    String status;
    String deliveryDate;
    UserAccount distributor;
    UserAccount manufacturer;
    UserAccount manufacturerPaint;
    UserAccount manufacturerTechnical;
    UserAccount testing;
    UserAccount logistics;
    Boolean isManf;
    Boolean isPaint;
    Boolean isTech;
    Boolean isTest;
    Boolean isLog;
    Boolean isDelivered;

    public InventoryOrderRequest() {
        car = new Car();
        status = "Order Created";
    }

    public Boolean getIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(Boolean isDelivered) {
        this.isDelivered = isDelivered;
    }
    
    

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public UserAccount getLogistics() {
        return logistics;
    }

    public void setLogistics(UserAccount logistics) {
        this.logistics = logistics;
    }

    public Boolean getIsLog() {
        return isLog;
    }

    public void setIsLog(Boolean isLog) {
        this.isLog = isLog;
    }
    
    

    public Boolean getIsManf() {
        return isManf;
    }

    public void setIsManf(Boolean isManf) {
        this.isManf = isManf;
    }

    public Boolean getIsPaint() {
        return isPaint;
    }

    public void setIsPaint(Boolean isPaint) {
        this.isPaint = isPaint;
    }

    public Boolean getIsTech() {
        return isTech;
    }

    public void setIsTech(Boolean isTech) {
        this.isTech = isTech;
    }

    public Boolean getIsTest() {
        return isTest;
    }

    public void setIsTest(Boolean isTest) {
        this.isTest = isTest;
    }
    
    

    public UserAccount getDistributor() {
        return distributor;
    }

    public void setDistributor(UserAccount distributor) {
        this.distributor = distributor;
    }

    public UserAccount getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(UserAccount manufacturer) {
        this.manufacturer = manufacturer;
    }

    public UserAccount getManufacturerPaint() {
        return manufacturerPaint;
    }

    public void setManufacturerPaint(UserAccount manufacturerPaint) {
        this.manufacturerPaint = manufacturerPaint;
    }

    public UserAccount getManufacturerTechnical() {
        return manufacturerTechnical;
    }

    public void setManufacturerTechnical(UserAccount manufacturerTechnical) {
        this.manufacturerTechnical = manufacturerTechnical;
    }

    public UserAccount getTesting() {
        return testing;
    }

    public void setTesting(UserAccount testing) {
        this.testing = testing;
    }
    
    

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
    
    @Override
    public String toString() {
        return orderId;
    }
    
    
}
