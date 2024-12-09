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
public class CarDirectory {
    
    private ArrayList<Car> carslist;
    
    public CarDirectory() {
        carslist = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarslist() {
        return carslist;
    }

    public void setCarslist(ArrayList<Car> carslist) {
        this.carslist = carslist;
    }
    
    public Car createCar(Car car) {
        carslist.add(car);
        return car;
    }
    
    
}
