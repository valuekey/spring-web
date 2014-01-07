package com.baobaotao.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("com/baobaotao/i18n/resource",Locale.US);
        System.out.println(bundle.getString("greeting.common"));
    }

}
