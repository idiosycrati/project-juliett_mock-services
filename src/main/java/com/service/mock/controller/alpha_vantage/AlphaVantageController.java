package com.service.mock.controller.alpha_vantage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.spi.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.service.mock.process.AlphaVantageProcess;

/**
 * AlphaVantageController
 */
@RestController
@RequestMapping("alpha-vantage.p.rapidapi.com")
public class AlphaVantageController {
    Logger logger = LoggerFactory.getLogger(AlphaVantageController.class);

    @Autowired
    @Qualifier("alphaVProcess")
    private AlphaVantageProcess alphaVantageProcess;

@GetMapping(value = "/query")
public void query(HttpServletRequest request, HttpServletResponse response) throws Exception{
    if (verify(request.getHeader("X-RapidAPI-Key"), request.getHeader("X-RapidAPI-Host"))) {
        alphaVantageProcess.getMethod(request, response);
    }
}
public boolean verify(String key,String host) throws Exception{
    final String X_RAPID_API_KEY="eefd572afcmsh2097a3ea41f5f3bp15b4bfjsnc264f4271864";
    final String X_RAPID_API_HOST="alpha-vantage.p.rapidapi.com";
    logger.info("KEY: "+ X_RAPID_API_KEY);
    logger.info("HOST: "+ X_RAPID_API_HOST);
    if (X_RAPID_API_KEY.equals(key) && X_RAPID_API_HOST.equals(host) ) {
        return true;
    }else{
        throw new Exception("Auth Error");
        
    }   

} 
    
}