/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Car;

import java.util.ArrayList;

/**
 *
 * @author srinivasarithikghantasala
 */
public class Car {
    
    String Model;
    String Variant;
    String Engine;
    String Transmission;
    String ExteriorColor;
    String InteriorColor;
    int quantity;
    
    public Car(){
        
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getVariant() {
        return Variant;
    }

    public void setVariant(String Variant) {
        this.Variant = Variant;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String Transmission) {
        this.Transmission = Transmission;
    }

    public String getExteriorColor() {
        return ExteriorColor;
    }

    public void setExteriorColor(String ExteriorColor) {
        this.ExteriorColor = ExteriorColor;
    }

    public String getInteriorColor() {
        return InteriorColor;
    }

    public void setInteriorColor(String InteriorColor) {
        this.InteriorColor = InteriorColor;
    }
    
    @Override
    public String toString(){
        return Model;
    }
    
    
}
