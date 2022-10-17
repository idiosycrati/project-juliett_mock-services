package com.service.mock.service;

import com.service.mock.models.AlphaVantageModel;

/**
 * CurrencyExchangeRateService
 */
public interface CurrencyExchangeRateService {

    public AlphaVantageModel getExchangeRate();
    
}