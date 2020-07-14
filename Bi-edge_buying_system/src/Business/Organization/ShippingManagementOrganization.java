/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ShippingManagementRole;
import java.util.ArrayList;

/**
 *
 * @author vanit
 */
public class ShippingManagementOrganization extends Organization{

    public ShippingManagementOrganization(String enterpriseID) {
        super(Type.ShippingManagement,enterpriseID);
    }
    

    
}
