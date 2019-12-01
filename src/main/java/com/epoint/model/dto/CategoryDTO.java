package com.epoint.model.dto;

import com.epoint.model.dto.base.OutputConverter;
import com.epoint.model.entity.Category;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class CategoryDTO implements OutputConverter<CategoryDTO,Category> {
    private Integer id;

    private String name;

    private String description;

    private Integer parentId;

    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createTime;
}
