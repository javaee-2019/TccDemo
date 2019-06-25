package com.sensin.tcc.clientB.service.impl;


import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.sensin.tcc.clientB.mapper.TDemoMapper;
import com.sensin.tcc.clientB.model.TDemo;
import com.sensin.tcc.clientB.service.TDemoService;
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

    @Override
    public List<TDemo> list() {
        return tDemoMapper.queryTDemo(null);
    }

    @Override
    @LcnTransaction
    public int add(String appName) {
        TDemo tDemo = new TDemo();
        tDemo.setAppName(appName);
        tDemo.setCreateTime(new Date());
        return tDemoMapper.insertTDemo(tDemo);
    }
}
