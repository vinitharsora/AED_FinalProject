/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.NationalEnterprise;

import Business.Enterprise.Enterprise;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */

//Initializing class CDC extends Enterprise
public class CDC extends Enterprise{

    public CDC(String name) {
        super(name, EnterpriseType.CDC);
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
        
    }
    
}
