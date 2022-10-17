package com.service.mock.service;

import org.springframework.stereotype.Service;

import com.service.mock.models.AlphaVantageModel;

/**
 * CurrencyExchangeRateServiceImpl
 */
@Service("currencyExchangeRateService")
public class CurrencyExchangeRateServiceImpl implements CurrencyExchangeRateService{

    @Override
    public AlphaVantageModel getExchangeRate() {

    AlphaVantageModel returnmodel = new AlphaVantageModel();
    returnmodel.setFromCurrencyCode("BTC");
    returnmodel.setFromCurrencyName("Bitcoin");
    returnmodel.setToCurrencyCode("USD");
    returnmodel.setToCurrencyName("United States Dollar");
    returnmodel.setExchangeRate("10347.92000000");
    returnmodel.setLastRefreshed("2020-02-12 19:05:01");
    returnmodel.setTimeZone("UTC");
    returnmodel.setBidPrice("10347.91000000");
    returnmodel.setAskPrice("10348.63000000");
    return returnmodel;
    }

    
}