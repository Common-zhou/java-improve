package com.zhou.create.factory.simplefactory;

import cn.hutool.core.lang.Assert;

/**
 * @author zhoubing
 * @date 2022-09-14 22:26
 */
public class MainTest {

    public static void main(String[] args) {
        AbstractCar car1 = SimpleFactory.getCar("五菱宏光");

        car1.run();

        AbstractCar car2 = SimpleFactory.getCar("江淮");
        car2.run();

        AbstractCar car3 = SimpleFactory.getCar("宝马");

        Assert.isNull(car3);

        Assert.notNull(car3);


    }
}
