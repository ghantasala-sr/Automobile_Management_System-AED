/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.ManufacturerPaintRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author srinivasarithikghantasala
 */
public class ManufacturerPaintOrganization extends Organization {

    public ManufacturerPaintOrganization() {
        super(Organization.Type.ManufacturerPaint.getValue());
    }
    
       @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManufacturerPaintRole());
        return roles;
    }
    
}
