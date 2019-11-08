package com.epoint.model.dto;

import com.epoint.model.dto.base.OutputConverter;
import com.epoint.model.entity.Category;
import lombok.Data;

import java.util.Date;

@Data
public class CategoryDTO implements OutputConverter<CategoryDTO,Category> {
    private Integer id;

    private String name;

    private String description;

    private Integer parentId;

    private Date createTime;
}
