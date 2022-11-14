/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adressbook;

/**
 *
 * @author 7roub
 */
public class Person extends Contact {

    private String firstName, lastName;
    BrithDate bd1;

    public Person() {
    }

    public Person(String firstName, String lastName, BrithDate bd1, String country, String city, String phoneNumber, String email, int postalCode) {
        super(country, city, phoneNumber, email, postalCode);
       this.setFirstName(firstName);
        this.setLastNamee(lastName);
        this.bd1 = bd1;
    }

    public BrithDate getBd1() {
        return bd1;
    }

    public void setBd1(BrithDate bd1) {
        this.bd1 = bd1;
    }

 
    public String getFirstName() {
        
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(isValidString(firstName))
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastNamee(String lastNamee) {
        if(isValidString(lastName))
        this.lastName = lastNamee;
    }
    
    

}
