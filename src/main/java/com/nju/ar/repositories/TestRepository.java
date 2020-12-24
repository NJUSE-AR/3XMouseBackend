package com.nju.ar.repositories;

import com.nju.ar.entities.TestEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: XYF
 * @Date: 2020/12/24
 * @Time: 16:13
 * @Package: com.nju.ar.repositories
 */
@Repository
public interface TestRepository extends MongoRepository<TestEntity, String> {
}
