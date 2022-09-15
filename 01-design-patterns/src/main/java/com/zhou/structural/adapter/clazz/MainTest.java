package com.zhou.structural.adapter.clazz;

import com.zhou.structural.adapter.MoviePlayer;

/**
 * 继承的方式
 * @author zhoubing
 * @since 2022-09-15 09:13
 */
public class MainTest {
    public static void main(String[] args) {
        EnglishMovieAdapter adapter = new EnglishMovieAdapter(new MoviePlayer());

        adapter.play();
    }
}
