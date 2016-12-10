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
    private String department;
    private String firstName;
    private String lastName;
    private String phone;
    
    public User(int ID, String department, String firstName, String lastName, String phone){
        this.id = ID;
        this.department = department;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
    
    public int getId(){
        return id;
    }
    
    public String getDepartment(){
        return department;
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
