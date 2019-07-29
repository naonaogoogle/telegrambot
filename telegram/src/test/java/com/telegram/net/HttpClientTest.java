package com.telegram.net;

import com.telegram.core.BotMessage;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description: 测试
 * @Author: HuangHaodong
 * @Date: 2019-07-29 22:08
 */
public class HttpClientTest {

    @Test
    public void post() {
        HttpClient.post(
                "https://api.telegram.org/bot641008686:AAGn4AWVk4bXN1s_kVy1H52vZMFOkLT0MR4/sendMessage",
                new BotMessage(86633325,"Hi there")
        );
    }
}