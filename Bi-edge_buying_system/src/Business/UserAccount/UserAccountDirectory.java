package Business.UserAccount;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Business.Role.Role;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ricardo
 */
public class UserAccountDirectory {
    
    private Map<String, UserAccount> userAccountMap;
    
    private Map<String, UserAccount> usernameMap;

    public UserAccountDirectory() {
        userAccountMap = new HashMap<String, UserAccount>();
        usernameMap = new HashMap<String, UserAccount>();
    }

    public Map<String, UserAccount> getUserAccountMap() {
        return userAccountMap;
    }
    
    public UserAccount authenticateUser(String username, String password){
        
        if(emailPatternCorrect(username))
        {
            for (Map.Entry<String, UserAccount> ua : userAccountMap.entrySet())
            {
                if (ua.getKey().equals(username)){
                    if(ua.getValue().getPassword().equals(password))
                        return ua.getValue();
                }
            }
        } else {
            for (Map.Entry<String, UserAccount> ua : usernameMap.entrySet())
                if (ua.getKey().equals(username)){
                    if(ua.getValue().getPassword().equals(password))
                        return ua.getValue();
                }
        }
        return null;
    }
    
    private boolean emailPatternCorrect(String email)
    {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(email);
        boolean b = m.matches();
        return b;
    }
    

    
    public UserAccount createUserAccount(String email, String name, String password, String username, Role role){
        if(userAccountMap.containsKey(email))
        {
            return null;
        }
        UserAccount userAccount = new UserAccount(email, name, password, username, role);
        userAccountMap.put(email, userAccount);
        usernameMap.put(userAccount.getUsername(), userAccount);
        return userAccount;
    }
    
    
}
