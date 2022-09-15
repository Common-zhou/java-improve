package com.zhou.create.adapter;

/**
 * @Author zhoubing
 * @Date 2022-09-15 08:51
 */
public class MoviePlayer implements Player {

    @Override
    public String play() {
        System.out.println("播放电影。。。。。");

        String content = "你好";
        System.out.println("原版字幕：" + content);
        return content;

    }
}
