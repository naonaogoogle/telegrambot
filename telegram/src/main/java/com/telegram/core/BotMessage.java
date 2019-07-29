package com.telegram.core;

import com.telegram.net.HttpClient;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-07-29 21:09
 */
public class BotMessage {

    private static final String TELEGRAM_RESOURCE = "https://api.telegram.org/bot641008686:AAGn4AWVk4bXN1s_kVy1H52vZMFOkLT0MR4";

    private final int chat_id;
    private final String text;

    public BotMessage(int chat_id, String text) {
        this.chat_id = chat_id;
        this.text = text;
    }

    public int getChat_id() {
        return chat_id;
    }

    public String getText() {
        return text;
    }

    public void send() {
        HttpClient.post(TELEGRAM_RESOURCE +"/sendMessage",this);
    }
}
