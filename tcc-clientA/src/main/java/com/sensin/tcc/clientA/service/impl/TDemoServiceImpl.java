package com.sensin.tcc.clientA.service.impl;

import com.sensin.tcc.clientA.model.TDemo;
import com.sensin.tcc.clientA.service.TDemoService;
import com.sensin.tcc.clientA.mapper.TDemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
