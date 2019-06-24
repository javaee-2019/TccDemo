package com.sensin.tcc.clientA.mapper;

import java.util.List;

import com.sensin.tcc.clientA.model.TDemo;

public interface TDemoBaseMapper {

    int insertTDemo(TDemo object);

    int updateTDemo(TDemo object);

    int update(TDemo.UpdateBuilder object);

    List<TDemo> queryTDemo(TDemo object);

    TDemo queryTDemoLimit1(TDemo object);

}