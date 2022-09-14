package com.zhou.create.factory.simplefactory;

/**
 * 卡车
 * @author zhoubing
 * @date 2022-09-14 22:28
 */
public class VanCar extends AbstractCar {

    public VanCar() {
        this.brand = "江淮";
    }

    @Override
    public void run() {
        System.out.println("卡车哐哐哐跑。。。。。");
    }
}
