package com.epoint.model.params;

import com.epoint.model.dto.base.InputConverter;
import com.epoint.model.entity.Article;
import com.epoint.model.enums.ArticleType;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ArticleParam implements InputConverter<Article> {

    private Integer id;

    private ArticleType type;

    private Boolean commentabled;

    private Boolean recommend;


}
