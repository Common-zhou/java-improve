package com.zhou.create.adapter.obj;

import com.zhou.create.adapter.EnglishTranslator;
import com.zhou.create.adapter.Player;
import com.zhou.create.adapter.Translator;

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
