package com.epoint.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.List;

@Data
@ToString
@Table(name = "category")
public class Category extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String name;

    private String description;

    private Integer weight;

    private Integer parentId;

    private List<Category> childrens;

}
