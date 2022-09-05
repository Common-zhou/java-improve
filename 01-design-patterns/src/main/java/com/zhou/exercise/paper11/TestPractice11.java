package com.zhou.exercise.paper11;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * todo 添加日志
 *
 * @author zhoubing
 * @date 2022-09-05 08:48
 */
public class TestPractice11 {

    private List<String> wrongMethod(FooService fooService, Integer i, String s, String t) {
        System.out.printf("result %s %s %s %s", i + 1, s.equals("OK"), s.equals(t),
                new ConcurrentHashMap<String, String>().put(null, null));

        if (fooService.getBarService().getBar().equals("OK")) {
            System.out.println("OK");
        }

        return null;
    }


    public static void main(String[] args) {

    }
}
