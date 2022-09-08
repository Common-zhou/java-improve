package com.zhou.exercise.paper10;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2022/09/05 17:51
 */
public class TestList4 {


  public static void main(String[] args) {

    List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

    List<Integer> subList = list.subList(1, 4);

    //subList.remove(1);

    System.out.println(list);

    list.add(0);

    subList.remove(0);

    Integer index = 0;
    subList.remove(index);

    //System.out.println(subList.iterator());

    //subList.forEach(System.out::println);



  }
}
