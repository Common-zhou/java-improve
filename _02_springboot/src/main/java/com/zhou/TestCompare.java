package com.zhou;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2022/09/08 10:56
 */
public class TestCompare {
  public static void main(String[] args) {
    List<String> oldList = Arrays.asList("a", "b", "c");
    List<String> newList = Arrays.asList("a", "d", "e");

    // 交集
    List<String> intersection = oldList.stream().filter(newList::contains)
        .collect(Collectors.toList());

    // 差集 旧的-新的 就是需要删除的
    List<String> difference = oldList.stream().filter(x -> !newList.contains(x))
        .collect(Collectors.toList());

    // 差集 新的-旧的 就是需要新增的
    List<String> difference2 = newList.stream().filter(x -> !oldList.contains(x))
        .collect(Collectors.toList());


    System.out.println(intersection);
    System.out.println(difference);
    System.out.println(difference2);
  }
}
