package com.epoint.dao;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

public interface ArticleCategoryMapper {

    /*
    根据分类的id获取其关联的文章数
     */
    @Select("select count(id) from article_category where category_id =#{id}")
    @ResultType(Long.class)
    Long countByCategoryId(Integer id);

    /*
    根据父类的id获取子类所有关联文章数
     */
    @Select("select count(id) from article_category where category_id in (select id from category where parent_id = #{id})")
    @ResultType(Long.class)
    Long countByParentId(Integer id);
}
