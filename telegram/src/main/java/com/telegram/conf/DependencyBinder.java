package com.telegram.conf;

import com.telegram.core.Update;
import com.telegram.core.VideoSearchBotAPI;
import org.glassfish.jersey.internal.inject.AbstractBinder;

import javax.inject.Singleton;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-07-29 22:51
 */
public class DependencyBinder extends AbstractBinder {
    /**
     * Implement to provide binding definitions using the exposed binding methods.
     * 1123
     */
    @Override
    protected void configure() {
        bind(VideoSearchBotAPI.class).to(Update.class).in(Singleton.class);
    }
}
