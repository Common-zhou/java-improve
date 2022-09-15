package com.zhou.create.adapter.obj;

import com.zhou.create.adapter.MoviePlayer;
import com.zhou.create.adapter.clazz.EnglishMovieAdapter;

/**
 *
 * @author zhoubing
 * @since 2022-09-15 09:23
 */
public class MainTest {
    public static void main(String[] args) {
        EnglishMovieAdapter adapter = new EnglishMovieAdapter(new MoviePlayer());
        adapter.play();
    }
}
