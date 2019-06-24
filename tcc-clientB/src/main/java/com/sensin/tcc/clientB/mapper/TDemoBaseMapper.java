package com.sensin.tcc.clientB.mapper;


import com.sensin.tcc.clientB.model.TDemo;

import java.util.List;

public interface TDemoBaseMapper {

    int insertTDemo(TDemo object);

    int updateTDemo(TDemo object);

    int update(TDemo.UpdateBuilder object);

    List<TDemo> queryTDemo(TDemo object);

    TDemo queryTDemoLimit1(TDemo object);

}