package com.zhou.structural.bridge;

/**
 * @author zhoubing
 * @date 2022-09-15 23:32
 */
public abstract class AbstractSale {
    private String type;
    private Integer price;

    public AbstractSale(String type, Integer price) {
        this.type = type;
        this.price = price;
    }

    String getSaleInfo() {
        return "渠道：" + type + "==>" + "价格：" + price;
    }
}
