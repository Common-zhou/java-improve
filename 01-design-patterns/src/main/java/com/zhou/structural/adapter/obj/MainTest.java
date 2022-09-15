package com.zhou.structural.adapter.obj;

import com.zhou.structural.adapter.MoviePlayer;
import com.zhou.structural.adapter.clazz.EnglishMovieAdapter;

/**
 *
 * @author zhoubing
 * @since 2022-09-15 09:23
 */
public class MainTest {
    public static void main(String[] args) {
        com.zhou.structural.adapter.clazz.EnglishMovieAdapter adapter = new EnglishMovieAdapter(new MoviePlayer());
        adapter.play();
    }
}
