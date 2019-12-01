package com.epoint.model.params;

import com.epoint.model.dto.base.InputConverter;
import com.epoint.model.entity.Article;
import com.epoint.model.entity.Category;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CategoryParam implements InputConverter<Category> {

    private Integer id;

    private String name;

    private String description;

    private Integer weight;

    private Integer parentId;
}
