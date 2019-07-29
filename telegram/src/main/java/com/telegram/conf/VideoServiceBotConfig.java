package com.telegram.conf;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-07-29 22:53
 */
public class VideoServiceBotConfig extends ResourceConfig {

    public VideoServiceBotConfig() {
        register(new DependencyBinder());
        packages(true,"com.telegram");
    }
}
