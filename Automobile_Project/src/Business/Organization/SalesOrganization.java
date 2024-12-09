/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.MarketingRole;
import Business.Role.Role;
import Business.Role.SalesRole;
import java.util.ArrayList;

/**
 *
 * @author srinivasarithikghantasala
 */
public class SalesOrganization extends Organization {

    public SalesOrganization() {
        super(Organization.Type.Sales.getValue());
    }
    
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalesRole());
        roles.add(new MarketingRole());
        return roles;
    }
    
}
