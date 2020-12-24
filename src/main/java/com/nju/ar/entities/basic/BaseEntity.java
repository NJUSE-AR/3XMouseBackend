package com.nju.ar.entities.basic;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @Author: XYF
 * @Date: 2020/12/24
 * @Time: 15:57
 * @Package: com.nju.ar.entities.basic
 */

@Data
public class BaseEntity {

    @Id
    private String id;

    @Field("created_at")
    @CreatedDate
    private Date createdAt;

    @Field("updated_at")
    private Date updatedAt;
}
