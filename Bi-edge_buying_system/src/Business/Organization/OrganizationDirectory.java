/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization.Type;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private Map<Organization.Type, Organization> organizationTypeMap;

    public OrganizationDirectory(Enterprise.EnterpriseType enterpriseType, String enterpriseID) {
        organizationTypeMap = new HashMap();
        generateOrganizations(enterpriseType, enterpriseID);
    }

    public Map<Organization.Type, Organization> getOrganizationTypeMap() {
        return organizationTypeMap;
    }
    
    private void generateOrganizations(Enterprise.EnterpriseType enterpriseType, String enterpriseID)
    {
        if(enterpriseType.equals(Enterprise.EnterpriseType.Agent))
        {
            createOrganization(Organization.Type.Marketing, enterpriseID);
            createOrganization(Organization.Type.Sales, enterpriseID);
        }else {
            createOrganization(Organization.Type.Accounting, enterpriseID);
            createOrganization(Organization.Type.ShippingManagement, enterpriseID);
            createOrganization(Organization.Type.Technology, enterpriseID);
        }
    }
    
    private void createOrganization(Type type, String enterpriseID){

        
        if (type.equals(Type.Marketing)){
            Organization organization = new MarketingOrganization(enterpriseID);
            organizationTypeMap.put(type.Marketing, organization);
        }
        if (type.equals(Type.Sales)){
            Organization organization = new SalesOrganization(enterpriseID);
            organizationTypeMap.put(type.Sales, organization);
        }
        if (type.equals(Type.Accounting)){
            Organization organization = new AccountingOrganization(enterpriseID);
            organizationTypeMap.put(type.Accounting, organization);
        }
        if (type.equals(Type.ShippingManagement)){
            Organization organization = new ShippingManagementOrganization(enterpriseID);
            organizationTypeMap.put(type.ShippingManagement, organization);
        }
        if (type.equals(Type.Technology)){
            Organization organization = new TechnologyOrganization(enterpriseID);
            organizationTypeMap.put(type.Technology, organization);
        }
    }
    
}