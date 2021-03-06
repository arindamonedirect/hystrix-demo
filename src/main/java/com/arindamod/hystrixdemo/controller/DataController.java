package com.arindamod.hystrixdemo.controller;

import com.arindamod.hystrixdemo.model.DataResponse;
import com.arindamod.hystrixdemo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arindamroy
 */
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
