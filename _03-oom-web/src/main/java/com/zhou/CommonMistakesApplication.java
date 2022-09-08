package main.java.com.zhou;

import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * TODO
 *
 * @author zhoubing
 * @version 1.0.0
 * @since 2022/09/07 10:37
 */
public class CommonMistakesApplication {
  public static void main(String[] args) throws InterruptedException {

    //启动10个线程
    IntStream.rangeClosed(1, 10).mapToObj(i -> new Thread(() -> {
      while (true) {
        //每一个线程都是一个死循环，休眠10秒，打印10M数据
        String payload = IntStream.rangeClosed(1, 10000000)
            .mapToObj(__ -> "a")
            .collect(Collectors.joining("")) + UUID.randomUUID().toString();
        try {
          TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(payload.length());
      }
    })).forEach(Thread::start);


    System.out.println("VM options");
    System.out.println(ManagementFactory.getRuntimeMXBean().getInputArguments().stream().collect(Collectors.joining(System.lineSeparator())));
    System.out.println("Program arguments");
    System.out.println(Arrays.stream(args).collect(Collectors.joining(System.lineSeparator())));

    TimeUnit.HOURS.sleep(1);
  }
}
