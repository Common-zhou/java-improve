package com.zhou.create.builder;

/**
 * 这是使用env的类
 * @author zhoubing
 * @date 2022-09-04 23:02
 */
public class EnvUseClass {
    public static void main(String[] args) {

//        EnvProperties envProperties = new EnvProperties();
        EnvProperties.EnvPropertiesBuilder envPropertiesBuilder = EnvProperties.newBuilder();

        envPropertiesBuilder.userName("zhangsan");
        envPropertiesBuilder.password("lisi");

        EnvProperties build = envPropertiesBuilder.build();


    }
}
