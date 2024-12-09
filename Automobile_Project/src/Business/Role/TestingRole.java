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
import ui.Manufacturer.TestingWorkAreaJPanel;


/**
 *
 * @author srinivasarithikghantasala
 */
public class TestingRole extends Role{

    public TestingRole() {
        this.type = RoleType.Testing;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        
        return new TestingWorkAreaJPanel(userProcessContainer, account,organization,enterprise , system);
    }
    
    
}
