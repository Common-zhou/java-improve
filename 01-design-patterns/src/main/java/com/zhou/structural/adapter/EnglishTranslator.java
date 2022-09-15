package com.zhou.structural.adapter;

/**
 * @Author zhoubing
 * @Date 2022-09-15 08:56
 */
public class EnglishTranslator implements Translator {
    @Override
    public String translate(String content) {

        if ("你好".equals(content)) {
            return "hello";
        } else if ("什么".equals(content)) {
            return "what";
        }

        return "*****";
    }
}
