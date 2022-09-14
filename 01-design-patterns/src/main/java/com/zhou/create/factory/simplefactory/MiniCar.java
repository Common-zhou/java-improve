package com.zhou.create.factory.simplefactory;

/**
 * @author zhoubing
 * @date 2022-09-14 22:29
 */
public class MiniCar extends AbstractCar {

    public MiniCar() {
        this.brand = "五菱宏光";
    }

    @Override
    public void run() {
        System.out.println("小汽车嗡嗡跑。。。。");
    }
}
