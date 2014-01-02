package com.baobaotao.reflect;

public class Car {
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private String brand;
    private String color;
    private int speed;

    public Car(){}

    public Car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void introduce(){
        System.out.println("Brand:" + this.brand + " Color:" + this.color + " Speed:" + this.speed + "KM/H");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }
}
