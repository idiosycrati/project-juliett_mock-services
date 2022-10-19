package com.service.mock.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.service.mock.models.AlphaVantageModel;

/**
 * CurrencyExchangeRateServiceImpl
 */
@Service("currencyExchangeRateService")
public class CurrencyExchangeRateServiceImpl implements CurrencyExchangeRateService{

    @Override
    public AlphaVantageModel getExchangeRate() {

    Random rand = new Random();
    
    double max =50000.0000;
    double min = 10000.0000;

    AlphaVantageModel returnmodel = new AlphaVantageModel();
    returnmodel.setFromCurrencyCode("BTC");
    returnmodel.setFromCurrencyName("Bitcoin");
    returnmodel.setToCurrencyCode("USD");
    returnmodel.setToCurrencyName("United States Dollar");
    
    returnmodel.setExchangeRate(String.valueOf((min + (max - min) * rand.nextDouble())));
    returnmodel.setLastRefreshed("2020-02-12 19:05:01");
    returnmodel.setTimeZone("UTC");
    returnmodel.setBidPrice("10347.91000000");
    returnmodel.setAskPrice("10348.63000000");
    return returnmodel;
    }

    
}