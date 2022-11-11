/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adressbook;

/**
 *
 * @author 7roub
 */
import java.util.regex.*;

public class Person {
    
    String firstName, lastNamee, country, city, phoneNumber, email;
    int postalCode;
    BrithDate bd1;
    
    public Person(String firstName, String lastNamee, String country, String city, String phoneNumber, String email, int postalCode, BrithDate bd1) {
        this.firstName = firstName;
        this.lastNamee = lastNamee;
        this.country = country;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.postalCode = postalCode;
        this.bd1 = bd1;
    }
    
    public void setBd1(BrithDate bd1) {
        this.bd1 = bd1;
    }
    
    public void setCity(String city) {
        if (isValidString(city)) {
            this.city = city;
        }
    }
    
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        if (isValidPhn(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
    }
    
    public void setFirstName(String firstName) {
        if (isValidString(firstName)) {
            this.firstName = firstName;
        }
    }
    
    public void setLastNamee(String lastNamee) {
        if (isValidString(lastNamee)) {
            this.lastNamee = lastNamee;
        }
    }
    
    public void setCountry(String country) {
        if (isValidString(country)) {
            this.country = country;
        }
    }
    
    public void setEmail(String email) {
        if(isValidE(email))
        this.email = email;
    }
    
    public int getPostalCode() {
        return postalCode;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getLastNamee() {
        return lastNamee;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getCountry() {
        return country;
    }
    
    public String getCity() {
        return city;
    }
    
    public BrithDate getBd1() {
        return bd1;
    }
    
    static boolean isValidString(String name) {

        //return m.matches();
        return Pattern.matches("[a-zA-Z]\\w{1,29}$+", name);
        
    }
    
    static boolean isValidPhn(String name) {

        //return m.matches();
        return Pattern.matches("^\\s*(?:\\+?(\\d{1,3}))?[-. (]*(\\d{3})[-. )]*(\\d{3})[-. ]*(\\d{4})(?: *x(\\d+))?\\s*$", name);
        
    }
    
    static boolean isValidE(String name) {

        //return m.matches();
        return Pattern.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", name);
        
    }
    
}
