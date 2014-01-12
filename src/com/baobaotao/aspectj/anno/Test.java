package com.baobaotao.aspectj.anno;

import java.lang.reflect.Method;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Class clazz = ForumService.class;
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println(methods.length);
        for (Method method : methods){
            NeedTest nt = method.getAnnotation(NeedTest.class);
            if(nt != null) {
                if(nt.value()) {
                    System.out.println(method.getName() + "YES");
                }
                else {
                    System.out.println(method.getName() + "NO");
                }
            }
        }
    }

}
