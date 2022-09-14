package com.zhou.create.factory.simplefactory;

/**
 * @author zhoubing
 * @date 2022-09-14 22:31
 */
public class SimpleFactory {
    /**
     *
     * @param brand 品牌
     * @return 返回一辆小汽车。如果brand能生产。否则会返回null
     */
    public static AbstractCar getCar(String brand) {
        if ("江淮".equals(brand)) {
            return new VanCar();
        } else if ("五菱宏光".equals(brand)) {
            return new MiniCar();
        }
//        throw new IllegalArgumentException("not allowed car brand" + brand);
        return null;

    }
}
