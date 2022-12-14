/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adressbook;

/**
 *
 * @author 7roub
 */
import java.io.Serializable;
import java.time.LocalDate;

public class BrithDate implements Serializable{

    private int year;
    private int month;
    private int day;

    public BrithDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

  

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {

        return year;
    }

    public void setDay(int day) {
        
            this.day = day;
        
    }

    public void setMonth(int month) {
        
            this.month = month;
        
    }

    public void setYear(int year) {
       
            this.year = year;
        
    }
    public String toString(){return getDay()+"/"+getMonth()+"/"+getYear();}
}
