package com.sensin.tcc.clientA.service;

import com.sensin.tcc.clientA.model.TDemo;

import java.util.List;

public interface TDemoService {
    List<TDemo> list();

    int add(String appName);
}
