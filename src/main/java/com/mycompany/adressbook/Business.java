/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adressbook;

/**
 *
 * @author 7roub
 */
public class Business extends Contact{
    String Title,website,genre ;
    Person p1 ;

    public Business() {
    }

    public Business(String Title, String website, String genre, Person p1, String country, String city, String phoneNumber, String email, int postalCode) {
        super(country, city, phoneNumber, email, postalCode);
        this.Title = Title;
        this.website = website;
        this.genre = genre;
        this.p1 = p1;
    }

   
    

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
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
    
    
    
    
}
