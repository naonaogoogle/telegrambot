package com.telegram.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-07-29 22:35
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Update {

    /**
     * update_id : 525305156
     * message : {"message_id":2,"from":{"id":86633325,"is_bot":false,"first_name":"闹闹Google","username":"NaonaoGoogle","language_code":"zh-hans"},"chat":{"id":86633325,"first_name":"闹闹Google","username":"NaonaoGoogle","type":"private"},"date":1564409546,"text":"1"}
     */

    private int update_id;
    private Message message;

    public int getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(int update_id) {
        this.update_id = update_id;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
