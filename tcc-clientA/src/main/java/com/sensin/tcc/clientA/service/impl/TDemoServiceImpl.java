package com.sensin.tcc.clientA.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.sensin.tcc.clientA.feign.ClientBFeignService;
import com.sensin.tcc.clientA.model.TDemo;
import com.sensin.tcc.clientA.service.TDemoService;
import com.sensin.tcc.clientA.mapper.TDemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDemoServiceImpl implements TDemoService {

    @Autowired
    private TDemoMapper tDemoMapper;
    @Autowired
    private ClientBFeignService clientBFeignService;


    @Override
    public List<TDemo> list() {
        return tDemoMapper.queryTDemo(null);
    }

    @Override
    @LcnTransaction//表明使用lcn模式
    public int add(String appName) {
        clientBFeignService.add(appName);
        addByName(appName + "333");
        int i = 1 / 0;
        return 0;
    }

    private void addByName(String appName) {
        TDemo tDemo = new TDemo();
        tDemo.setAppName(appName);
        tDemo.setCreateTime(new Date());
        tDemoMapper.insertTDemo(tDemo);
    }
}
