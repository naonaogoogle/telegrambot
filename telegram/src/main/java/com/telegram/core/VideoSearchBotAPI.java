package com.telegram.core;


/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-07-29 22:46
 */
public class VideoSearchBotAPI implements UpdateHandler {

    @Override
    public void onUpdate(Update update) {
        int chatId = update.getMessage().getChat().getId();
        String text = update.getMessage().getText();
        String user = update.getMessage().getFrom().getFirst_name();
        new BotMessage(chatId, text + " - " + user);
    }
}
