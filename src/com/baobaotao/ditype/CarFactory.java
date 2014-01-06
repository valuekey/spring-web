package com.baobaotao.ditype;

public class CarFactory {

    public static Car createHongQiCar() {
        Car car = new Car();
        car.setBrand("hongqi");
        return car;
    }
}
