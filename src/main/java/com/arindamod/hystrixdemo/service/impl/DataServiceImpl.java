package com.arindamod.hystrixdemo.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.arindamod.hystrixdemo.model.DataResponse;
import com.arindamod.hystrixdemo.service.DataService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service("dataService")
public class DataServiceImpl implements DataService {

    private final RestTemplate restTemplate;

    public DataServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    @HystrixCommand(fallbackMethod = "fetchStaticData")
    public DataResponse fetchAvailableData() {
        DataResponse dataResponse = new DataResponse();

        URI fetchUrl = URI.create("http://localhost:3000/data");

        return this.restTemplate.getForObject(fetchUrl, DataResponse.class);
    }

    public DataResponse fetchStaticData() {
        return new DataResponse(1L,"fall back item",false, 500);
    }
}
