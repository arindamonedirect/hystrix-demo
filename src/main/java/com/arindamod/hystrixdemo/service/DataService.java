package com.arindamod.hystrixdemo.service;

import com.arindamod.hystrixdemo.model.DataResponse;

/**
 * @author arindamroy
 */
public interface DataService {

    public DataResponse fetchAvailableData();
}
