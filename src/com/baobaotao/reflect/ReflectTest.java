package com.baobaotao.reflect;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class ReflectTest {
    public static void main(String[] args) throws Throwable {
        Car car = initByDefaultConst();
        car.introduce();
    }

    public static Car initByDefaultConst() throws Throwable {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.baobaotao.reflect.Car");

        Constructor cons = clazz.getDeclaredConstructor((Class[])null);
        Car car = (Car)cons.newInstance();

        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "BMW");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "BLUE");
        Method setSpeed = clazz.getMethod("setSpeed", int.class);
        setSpeed.invoke(car, 120);

        return car;
    }
}
