package org.encap;

public class User {
    private String username;
    private String password;
    private String uuid; 
    
    // Setters
    public void setUser(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    
    // Getters
    public String getUser() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getUuid() {
        return uuid;
    }
}