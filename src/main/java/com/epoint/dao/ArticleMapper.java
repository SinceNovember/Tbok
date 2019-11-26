package com.epoint.dao;

import com.epoint.core.MyMapper;
import com.epoint.model.entity.Article;
import com.epoint.model.enums.ArticleType;
import com.epoint.model.vo.ArticleCondition;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ArticleMapper extends MyMapper<Article> {

    @Select("select * from article  where type =#{type}")
    List<Article> findAllByState(ArticleType type);

    @Select("select * from blog where typeid = #{id}")
    List<Article> findByTypeId(int id);

    @Select({"<script>",
            "select * from article",
            "where 1 = 1",
            "<if test ='type != @com.epoint.model.enums.ArticleType@ENTITY '>",
            " and type =#{type} ",
            "</if>",
            "<if test='keyWord != null'>",
            "  and title like concat('%',#{keyWord},'%') ",
            "</if>",
            "<if test = 'recommend != null'>",
            " and recommend =#{recommend}",
            "</if>",
            "<if test='startDate !=null and startDate != \"\" and endDate != \"\" and endDate !=null'>",
            " and  DATE_FORMAT(create_time,'%Y-%m-%d') between #{startDate} and #{endDate}",
            "</if>",

            "</script>"
    })
    @ResultMap("BaseResultMap")
    List<Article> findArticlesByCondtion(ArticleCondition condtion);

    @Select(" select IFNULL(count(*),0) from article UNION ALL select IFNULL(count(*),0)  from article where type = 1  " +
            "UNION ALL select IFNULL(count(*),0)  from article where type = 0  UNION ALL select IFNULL(count(*),0)  from article where type = -1  ")
    List<Integer> getGroupByType();

}
