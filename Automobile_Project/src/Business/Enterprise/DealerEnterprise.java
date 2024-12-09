/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.DealerOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author srinivasarithikghantasala
 */
public class DealerEnterprise extends Enterprise {
    private List<Organization> organizations;
        
        public DealerEnterprise(String name){
            super(name, EnterpriseType.Dealer);
        }
        @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
