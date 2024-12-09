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
import ui.Logistics.LogisticsWorkAreaJPanel;
import ui.Marketing.MarketingWorkAreaJPanel;

/**
 *
 * @author srinivasarithikghantasala
 */
public class MarketingRole extends Role{
    
    public MarketingRole(){
        this.type = RoleType.Marketing;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        
        return new MarketingWorkAreaJPanel(userProcessContainer, account, system);
    }
    
}
