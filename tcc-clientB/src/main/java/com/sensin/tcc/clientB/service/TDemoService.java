package com.sensin.tcc.clientB.service;


import com.sensin.tcc.clientB.model.TDemo;

import java.util.List;

public interface TDemoService {
    List<TDemo> list();

    int add(String appName);
}
