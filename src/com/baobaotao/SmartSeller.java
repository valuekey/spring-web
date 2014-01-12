package com.baobaotao;

public class SmartSeller implements Seller{
@Override
public void sell(String goods, String name) {
    System.out.println("Sell " + goods + " to " + name);
}
}
