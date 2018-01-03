package org.elvis.wang.compute.service.impl;

import org.elvis.wang.compute.service.ComputeService;
import org.springframework.stereotype.Service;

/**
 * Created by wangzhiqun on 2018/1/3.
 */
public class ComputeServiceImpl implements ComputeService{

    public Integer add(int a, int b) {
        return a + b;
    }
}
