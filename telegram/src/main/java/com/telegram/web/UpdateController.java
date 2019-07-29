package com.telegram.web;

import com.telegram.core.Update;
import com.telegram.core.UpdateHandler;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-07-29 22:29
 */
@Path("api")
public class UpdateController {

    @Inject
    private UpdateHandler updateHandler;


    @Path("update")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void processUpdate(Update update) {
        updateHandler.onUpdate(update);
    }
}
