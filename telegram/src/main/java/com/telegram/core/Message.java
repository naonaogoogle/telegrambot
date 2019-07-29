package com.telegram.core;

import java.util.Date;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-07-29 22:31
 */
public class Message {
    /**
     * message_id : 2
     * from : {"id":86633325,"is_bot":false,"first_name":"闹闹Google","username":"NaonaoGoogle","language_code":"zh-hans"}
     * chat : {"id":86633325,"first_name":"闹闹Google","username":"NaonaoGoogle","type":"private"}
     * date : 1564409546
     * text : 1
     */

    private int message_id;
    private From from;
    private Chat chat;
    private Date date;
    private String text;

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
