package com.baobaotao.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baobaotao.reflect.Car;

@Configuration
public class Beans {
    
    @Bean(name = "car")
    public Car buildCar(){
        Car car = new Car();
        car.setBrand("HQ");
        car.setColor("RED");
        car.setSpeed(120);
        return car;
    }
}
