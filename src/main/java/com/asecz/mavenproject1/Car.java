/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asecz.mavenproject1;

/**
 *
 * @author MSI
 */
public class Car {

    String id;
    String brand;
    int year;
    String Color;
    int price;
    boolean solidState;
    
    Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice, boolean randomSoldState) {
        this.id = randomId;
        this.brand = randomBrand;
        this.year = randomYear;
        this.Color = randomColor;
        this.price = randomPrice;
        this.solidState = randomSoldState;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSolidState() {
        return solidState;
    }

    public void setSolidState(boolean solidState) {
        this.solidState = solidState;
    }
    
    
    
}
