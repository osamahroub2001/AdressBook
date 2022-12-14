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
public class Business extends Contact implements Serializable,Compare{
    private String website,genre ;
    private Person p1 ;

    public Business() {
    }

    public Business(String name, String website, String genre, Person p1, String country, String city, String phoneNumber, String email, String postalCode) {
        super(name,country, city, phoneNumber, email, postalCode);
        this.name = name;
        this.website = website;
        this.genre = genre;
        this.p1 = p1;
    }

   
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Person getP1() {
        return p1;
    }

    public void setP1(Person p1) {
        this.p1 = p1;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    public String toString(){return getName();}
    
    public boolean CompareTo(String ss) {
       return getName().regionMatches(0, ss, 0, 3);
    }


    
   
    
}
