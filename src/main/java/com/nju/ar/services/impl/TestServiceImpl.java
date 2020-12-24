package com.nju.ar.services.impl;

import com.nju.ar.entities.TestEntity;
import com.nju.ar.repositories.TestRepository;
import com.nju.ar.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: XYF
 * @Date: 2020/12/24
 * @Time: 16:32
 * @Package: com.nju.ar.services.impl
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public void insertTest(String test) {
        TestEntity testEntity = new TestEntity();
        testEntity.setTt(test);
        testRepository.save(testEntity);
    }

    @Override
    public List<TestEntity> listTests() {
        return testRepository.findAll();
    }
}
