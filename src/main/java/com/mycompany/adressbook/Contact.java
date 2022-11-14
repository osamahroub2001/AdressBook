/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adressbook;

import java.util.regex.Pattern;

/**
 *
 * @author 7roub
 */
public class Contact {
    
    protected String  country, city, phoneNumber, email;
    protected int postalCode;
    

    public Contact() {
    }
    
    public Contact( String country, String city, String phoneNumber, String email, int postalCode) {
        this.setCountry(country);
        this.setCity(city);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
        this.postalCode = postalCode;
        
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
    
    
    public String getEmail() {
        return email;
    }
    
    public String getCountry() {
        return country;
    }
    
    public String getCity() {
        return city;
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
