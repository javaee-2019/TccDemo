package com.sensin.tcc.clientB.controller;

import com.sensin.model.general.ResultDTO;
import com.sensin.tcc.clientB.model.TDemo;
import com.sensin.tcc.clientB.service.TDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/cb")
public class TDemoController {

    @Autowired
    private TDemoService tDemoService;

    @RequestMapping("/hi")
    public String hello() {
        return new Date().toLocaleString();
    }

    @RequestMapping("/")
    public ResultDTO list() {
        return ResultDTO.success(tDemoService.list());
    }

    @RequestMapping("/add")
    public ResultDTO add(String appName) {
        tDemoService.add(appName);
        return ResultDTO.success();
    }

}
