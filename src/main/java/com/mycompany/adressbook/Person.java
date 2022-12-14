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
   class Person extends Contact implements Serializable,Compare{

    private String firstName;
    BrithDate bd1;
     

    public Person() {
    }

    public Person(String firstName, String name, BrithDate bd1, String country, String city, String phoneNumber, String email, String postalCode) {
        super(name,country, city, phoneNumber, email, postalCode);
        this.setFirstName(firstName);
     
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

    private void setFirstName(String firstName) {
        
        this.firstName = firstName;
    }


   @Override
    public String toString(){ 
    return getFirstName()+"  "+getName();
    }
public boolean CompareTo(String ss) {
       return getName().regionMatches(0, ss, 0, 3)|| getFirstName().regionMatches(0, ss, 0, 3);

    }


    

}
