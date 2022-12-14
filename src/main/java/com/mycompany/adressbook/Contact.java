/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adressbook;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author 7roub
 */
public class Contact implements Serializable,Compare{
    private static final long serialVersionUID = -6470090944414208496L;
    protected String name, country, city, phoneNumber, email;
    protected String postalCode;
    

    public Contact() {
    }
    
    public Contact(String name, String country, String city, String phoneNumber, String email, String postalCode) {
        this.setCountry(country);
        this.setCity(city);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
        this.postalCode = postalCode;
        this.setName(name);
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public void setCity(String city) {
        
            this.city = city;
        
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public void setPhoneNumber(String phoneNumber) {
      
            this.phoneNumber = phoneNumber;
        
    }
    

    public void setCountry(String country) {
       
            this.country = country;
        
    }
    
    public void setEmail(String email) {
     
        this.email = email;
    }
    
    public String getPostalCode() {
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

    @Override
    public boolean CompareTo(String ss) {
       return getName().regionMatches(0, ss, 0, 3);
    }

   
  

}
