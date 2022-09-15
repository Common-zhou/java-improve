package com.zhou.structural.adapter;

/**
 * @Author zhoubing
 * @Date 2022-09-15 09:03
 */
public class MainTest {
    public static void main(String[] args) {
        // 产品需求：需要播放原有的电影，还需要打印字幕
        Player moviePlayer = new MoviePlayer();
        moviePlayer.play();

    }
}
