package com.epoint.dao;

import com.epoint.core.MyMapper;
import com.epoint.model.entity.Article;
import com.epoint.model.enums.ArticleType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ArticleMapper extends MyMapper<Article> {

    @Select("select * from article  where type =#{type}")
    List<Article> findAllByState(ArticleType type);

    @Select("select * from blog where typeid = #{id}")
    List<Article> findByTypeId(int id);
}
