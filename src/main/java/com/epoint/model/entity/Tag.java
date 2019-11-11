package com.epoint.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Tag extends BaseEntity {
    /*
    标签编号
     */
    private int id;

    /*
    标签名称
     */
    private String name;

    /*
    标签别名
     */
    private String slugName;

}