package com.onedirect.hystrixdemo.controller;

import com.onedirect.hystrixdemo.model.DataResponse;
import com.onedirect.hystrixdemo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataService dataService;

    @RequestMapping(value = "/getdata", method = RequestMethod.GET)
    public DataResponse fetchData() {
        DataResponse dataResponse = dataService.fetchAvailableData();

        return dataResponse;

    }
}
