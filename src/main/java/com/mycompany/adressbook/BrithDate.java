/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adressbook;

/**
 *
 * @author 7roub
 */
import java.time.LocalDate;

public class BrithDate {

    private int year;
    private int month;
    private int day;

    public BrithDate(int year, int month, int day) {

        setYear(year);
        setMonth(month);
        setDay(day);
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
        if (day >= 1 && day <= 30) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year >= LocalDate.now().getYear() - 130 && year <= LocalDate.now().getYear()) {
            this.year = year;
        }
    }
    public String getInfo(){return getDay()+"/"+getMonth()+"/"+getYear();}
}
