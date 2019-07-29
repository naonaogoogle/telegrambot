package com.telegram.core;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-07-29 22:37
 */
public class Chat {

    /**
     * id : 86633325
     * first_name : 闹闹Google
     * username : NaonaoGoogle
     * type : private
     */

    private int id;
    private String first_name;
    private String username;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
