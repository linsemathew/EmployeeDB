/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.directory;

/**
 *
 * @author lm
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    
    public User(int ID, String FirstName, String LastName, String phone){
        this.id = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
    
    public int getId(){
        return id;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastNAme(){
        return lastName;
    }
    
    public String getPhone(){
        return phone;
    }
}
