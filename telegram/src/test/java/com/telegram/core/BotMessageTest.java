package com.telegram.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-07-29 22:27
 */
public class BotMessageTest {

    @Test
    public void send() {
        new BotMessage(86633325,"Hi there again!").send();
    }
}