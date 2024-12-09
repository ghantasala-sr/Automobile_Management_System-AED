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
import ui.Customer.CustomerWorkAreaJPanel;
import ui.Manufacturer.ManufacturerWorkAreaJPanel;

/**
 *
 * @author srinivasarithikghantasala
 */
public class ManufacturerRole extends Role{

    public ManufacturerRole() {
        this.type = RoleType.Manufacturer;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        
        return new ManufacturerWorkAreaJPanel(userProcessContainer, account,organization,enterprise , system);
    }
}
    
    

