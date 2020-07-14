/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Role.Role;


/**
 *
 * @author ricardo
 */
public class UserAccount {
    
    private String username;
    private String name;
    private String email;
    private String password;
    //private Employee employee;
    //private WorkQueue workQueue;
    private Role role;
    
    

    public UserAccount(String email, String name, String password, String username, Role role) {
        
        this.username = username;
        this.email = email;
        this.name = name;
        this.password = password;
        this.role = role;
    }
       
    
    
    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }
    
    
    @Override
    public String toString() {
        return username;
    }
    
}
