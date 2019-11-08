package com.epoint.model.dto;

import com.epoint.model.dto.base.OutputConverter;
import com.epoint.model.entity.Blog;
import lombok.Data;

/**
 * 博客DTO,继承了DTO从entity那获取数据
 */
@Data
public class BlogDTO implements OutputConverter<BlogDTO, Blog> {

    private int id;

    private String title;

    private String content;
}
