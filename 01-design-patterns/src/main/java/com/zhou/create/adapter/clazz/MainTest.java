package com.zhou.create.adapter.clazz;

import com.zhou.create.adapter.MoviePlayer;

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
