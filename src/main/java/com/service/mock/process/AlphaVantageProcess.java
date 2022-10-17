package com.service.mock.process;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.service.mock.models.AlphaVantageModel;
import com.service.mock.service.CurrencyExchangeRateService;
import com.service.mock.utils.Utilities;

@Component("alphaVProcess")
public class AlphaVantageProcess {

    @Autowired
    @Qualifier("currencyExchangeRateService")
    CurrencyExchangeRateService currencyExchangeRateService;
    Logger logger = LoggerFactory.getLogger(AlphaVantageProcess.class);

public void getMethod(HttpServletRequest request, HttpServletResponse response){
    final String function = request.getParameter("function");

    switch (function) {
        case "CURRENCY_EXCHANGE_RATE":
        Utilities.respond(response, currencyExchangeRateService.getExchangeRate());
       
        default:
            break;
    }

}

}
