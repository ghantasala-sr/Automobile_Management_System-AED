/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author srinivasarithikghantasala
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        SalesPerson("SalesPerson"),
        Marketing("Marketing"),
        Customer("Customer"),
        Distributor("Distributor"),
        Dealer("Dealer"),
        Manufacturer("Manufacturer"),
        ManufacturerPaint("Manufacturer Paint"),
        ManufacturerTechnical("ManufacturerTechnical"),
        Testing("Testing"),
        Logistics("Logistics");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
        
        
    }
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
    
}
