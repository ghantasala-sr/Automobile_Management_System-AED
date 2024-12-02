/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author srinivasarithikghantasala
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Sales.getValue())) {
            organization = new SalesOrganization();
            organizationList.add(organization);
        }

        if (type.getValue().equals(Type.Customer.getValue())) {
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }

        if (type.getValue().equals(Type.Distributor.getValue())) {
            organization = new DistributorOrganization();
            organizationList.add(organization);
        }

        if (type.getValue().equals(Type.Dealer.getValue())) {
            organization = new DealerOrganization();
            organizationList.add(organization);
        }

        if (type.getValue().equals(Type.Manufacturer.getValue())) {
            organization = new ManufacturerOrganization();
            organizationList.add(organization);
        }

        if (type.getValue().equals(Type.ManufacturerPaint.getValue())) {
            organization = new ManufacturerPaintOrganization();
            organizationList.add(organization);
        }

        if (type.getValue().equals(Type.ManufacturerTechnical.getValue())) {
            organization = new ManufacturerTechnicalOrganization();
            organizationList.add(organization);
        }

        if (type.getValue().equals(Type.Testing.getValue())) {
            organization = new TestingOrganization();
            organizationList.add(organization);
        }

        if (type.getValue().equals(Type.Logistic.getValue())) {
            organization = new LogisticOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
    
}
