/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.DistributorRole;
import Business.Role.ManufacturerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author srinivasarithikghantasala
 */
public class ConfigureASystem {
        public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Network network = system.createAndAddNetwork();
        network.setName("AutomobileNetwork");
        
               Enterprise customerEn = network.getEnterpriseDirectory().createAndAddEnterprise("CustomerEnterprise", Enterprise.EnterpriseType.Customer);
               System.out.println(customerEn);
        Organization customerOrg = customerEn.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
        customerOrg.setName("CustomerOrg");
        
        Enterprise systemAdminEn = network.getEnterpriseDirectory().createAndAddEnterprise("SystemAdminEnterprise", Enterprise.EnterpriseType.SystemAdmin);
        System.out.println(systemAdminEn.getEnterpriseType().getValue());
        Organization systemAdminOrg = systemAdminEn.getOrganizationDirectory().createOrganization(Organization.Type.SystemAdmin);
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount sysadmin = systemAdminOrg.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin",employee ,new SystemAdminRole());
        System.out.println(sysadmin.getRole().toString().equals("SystemAdmin"));
        //Manufacturing Enterprise
//        Enterprise manufEn = network.getEnterpriseDirectory().createAndAddEnterprise("ManufacturingEnterprise", Enterprise.EnterpriseType.Manufacturer);
//        Organization manufOrg = manufEn.getOrganizationDirectory().createOrganization(Organization.Type.Manufacturer);
//        Organization manufPaintOrg = manufEn.getOrganizationDirectory().createOrganization(Organization.Type.ManufacturerPaint);
//        Organization manufTechOrg = manufEn.getOrganizationDirectory().createOrganization(Organization.Type.ManufacturerTechnical);
//        Organization testingOrg = manufEn.getOrganizationDirectory().createOrganization(Organization.Type.Testing);
//        manufOrg.setName("ManufacturerOrg");
//        manufPaintOrg.setName("ManufacturerPaintOrg");
//        manufTechOrg.setName("ManufacturerTechnicalOrg");
//        testingOrg.setName("TestingOrg");
//    //    UserAccount manf = manufOrg.getUserAccountDirectory().createUserAccount("manf", "manf", new ManufacturerRole());
//        System.out.println(manufOrg.getName());
//        Enterprise distributorEn = network.getEnterpriseDirectory().createAndAddEnterprise("DistributorEnterprise", Enterprise.EnterpriseType.Distributor);
//        Organization distOrg = distributorEn.getOrganizationDirectory().createOrganization(Organization.Type.Distributor);
//        distOrg.setName("DistributorOrg");
//     //   UserAccount dist = distOrg.getUserAccountDirectory().createUserAccount("dist", "dist", new DistributorRole());
//        
//        System.out.println(manufEn.getUserAccountDirectory().getUserAccountList().size());
//        
//        //Logistics Enterprise
//        Enterprise logisticsEn = network.getEnterpriseDirectory().createAndAddEnterprise("LogisticsEnterprise", Enterprise.EnterpriseType.Logistic);
//        Organization logOrg = logisticsEn.getOrganizationDirectory().createOrganization(Organization.Type.Logistic);
//        logOrg.setName("LogisticsOrg");
//        
//        //Dealer
//        Enterprise dealerEn = network.getEnterpriseDirectory().createAndAddEnterprise("DealerEnterprise", Enterprise.EnterpriseType.Dealer);
//        Organization dealerOrg = dealerEn.getOrganizationDirectory().createOrganization(Organization.Type.Dealer);
//        dealerOrg.setName("DealerOrg");
//         Organization salesOrg = dealerEn.getOrganizationDirectory().createOrganization(Organization.Type.Sales);
//        salesOrg.setName("SalesOrg");
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        return system;
    }
    
    
}
