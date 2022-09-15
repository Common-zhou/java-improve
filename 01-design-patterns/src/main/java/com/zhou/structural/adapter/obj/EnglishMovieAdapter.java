package com.zhou.structural.adapter.obj;

import com.zhou.structural.adapter.EnglishTranslator;
import com.zhou.structural.adapter.Player;
import com.zhou.structural.adapter.Translator;

/**
 *
 * @author zhoubing
 * @since 2022-09-15 09:22
 */
public class EnglishMovieAdapter implements Player {

    private Player player;
    private Translator translator = new EnglishTranslator();

    public EnglishMovieAdapter(Player player) {
        this.player = player;
    }

    @Override
    public String play() {
        String content = player.play();

        String englishContent = translator.translate(content);
        System.out.println("english: " + englishContent);

        return englishContent;
    }
}
