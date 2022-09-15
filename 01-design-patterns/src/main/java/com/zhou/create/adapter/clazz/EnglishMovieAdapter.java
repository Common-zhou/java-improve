package com.zhou.create.adapter.clazz;

import com.zhou.create.adapter.EnglishTranslator;
import com.zhou.create.adapter.Player;

/**
 *
 * @author zhoubing
 * @since 2022-09-15 09:18
 */
public class EnglishMovieAdapter extends EnglishTranslator implements Player {

    private Player player;

    public EnglishMovieAdapter(Player player) {
        this.player = player;
    }

    @Override
    public String play() {

        String content = player.play();

        String englishContent = translate(content);
        System.out.println("english: " + englishContent);

        return englishContent;
    }
}
