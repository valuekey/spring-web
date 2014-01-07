package com.baobaotao.editor;

import java.beans.PropertyEditorSupport;

public class CustomCarEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text == null || text.indexOf(",") == -1) {
            System.out.println("geshibudui");
        }
        String[] infos = text.split(",");
        Car car = new Car();
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.parseInt(infos[1]));
        car.setPrice(Double.parseDouble(infos[2]));

        setValue(car);
    }

}
