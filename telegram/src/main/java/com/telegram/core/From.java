package com.telegram.core;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-07-29 22:37
 */
public class From {
    /**
     * id : 86633325
     * is_bot : false
     * first_name : 闹闹Google
     * username : NaonaoGoogle
     * language_code : zh-hans
     */

    private int id;
    private boolean is_bot;
    private String first_name;
    private String username;
    private String language_code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_bot() {
        return is_bot;
    }

    public void setIs_bot(boolean is_bot) {
        this.is_bot = is_bot;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }
}
