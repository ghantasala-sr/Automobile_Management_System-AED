/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TestingRole;
import java.util.ArrayList;

/**
 *
 * @author srinivasarithikghantasala
 */
public class TestingOrganization extends Organization {

    public TestingOrganization() {
        super(Organization.Type.Testing.getValue());
    }
    
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TestingRole());
        return roles;
    }
    
}
