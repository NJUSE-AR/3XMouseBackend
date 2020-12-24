package com.nju.ar.entities;

import com.nju.ar.entities.basic.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @Author: XYF
 * @Date: 2020/12/24
 * @Time: 16:00
 * @Package: com.nju.ar.entities
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "test")
public class TestEntity extends BaseEntity {

    @Field("tt")
    private String tt;

}
