package com.service.mock.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utilities {
    
    public static String ObjectToJson(Object t){
        ObjectMapper obj = new ObjectMapper();
        try {
           return obj.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static void respond(HttpServletResponse response, Object data){
        response.setHeader("Content-Type", "application/json");
        response.setStatus(200);

        try {

            response.getWriter().println(ObjectToJson(data));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
