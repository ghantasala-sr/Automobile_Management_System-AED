/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Car.CarDirectory;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.WorkQueue.InventoryOrderQueue;
import Business.WorkQueue.QuoteOrderQueue;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author srinivasarithikghantasala
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private EmployeeDirectory employeeList;
    private String email;
    private String address;
    private String distName;
    private String dealerName;
    private Role role;
    private WorkQueue workQueue;
    private InventoryOrderQueue inventoryOrderQueue;
    private QuoteOrderQueue quoteOrderQueue;
    private CarDirectory carDirectory;

    public UserAccount() {
        workQueue = new WorkQueue();
        inventoryOrderQueue = new InventoryOrderQueue();
        quoteOrderQueue = new QuoteOrderQueue();
        carDirectory = new CarDirectory();
    }

    public QuoteOrderQueue getQuoteOrderQueue() {
        return quoteOrderQueue;
    }

    public void setQuoteOrderQueue(QuoteOrderQueue quoteOrderQueue) {
        this.quoteOrderQueue = quoteOrderQueue;
    }

    
    
    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    
    
    
    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName;
    }
    
    

    public CarDirectory getCarDirectory() {
        return carDirectory;
    }

    public void setCarDirectory(CarDirectory carDirectory) {
        this.carDirectory = carDirectory;
    }
    

    public InventoryOrderQueue getInventoryOrderQueue() {
        return inventoryOrderQueue;
    }

    public void setInventoryOrderQueue(InventoryOrderQueue inventoryOrderQueue) {
        this.inventoryOrderQueue = inventoryOrderQueue;
    }
    
    

    public EmployeeDirectory getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(EmployeeDirectory employeeList) {
        this.employeeList = employeeList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}
