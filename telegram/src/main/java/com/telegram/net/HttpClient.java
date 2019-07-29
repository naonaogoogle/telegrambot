package com.telegram.net;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-07-29 21:52
 */
public class HttpClient {

    private static final Client CLIENT = ClientBuilder.newClient();

    public static Response post(String url, Object date) {
        Response response = CLIENT.target(url)
                .request(MediaType.APPLICATION_JSON_PATCH_JSON_TYPE)
                .post(Entity.entity(date,MediaType.APPLICATION_JSON_TYPE));
        response.readEntity(Object.class);
        return response;
    }
}
