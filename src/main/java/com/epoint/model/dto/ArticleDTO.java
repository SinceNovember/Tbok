package com.epoint.model.dto;

import com.epoint.model.dto.base.OutputConverter;
import com.epoint.model.entity.Article;
import com.epoint.model.enums.ArticleType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 博客DTO,继承了DTO从entity那获取数据
 */
@Data
public class ArticleDTO implements OutputConverter<ArticleDTO, Article> {

    private int id;

    private String title;

    private String content;

    private ArticleType type;

    private boolean recommend;

    private int views;

    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createTime;
}
