package com.nju.ar.services;

import com.nju.ar.entities.TestEntity;

import java.util.List;

/**
 * @Author: XYF
 * @Date: 2020/12/24
 * @Time: 16:31
 * @Package: com.nju.ar.services
 */
public interface TestService {
    void insertTest(String test);

    List<TestEntity> listTests();
}
