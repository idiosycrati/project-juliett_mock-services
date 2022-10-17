package com.service.mock.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Response<T> {
    Logger logger = LoggerFactory.getLogger(Response.class);
    T data;


    public Response(T data){
        this.data=data;
    }

    public T respond(){
        logger.debug(this.data.toString());
        return data;
    }
}
