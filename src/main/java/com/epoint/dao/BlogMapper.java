package com.epoint.dao;

import com.epoint.core.MyMapper;
import com.epoint.model.entity.Article;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BlogMapper  extends MyMapper<Article> {
    @Select("select * from blog where typeid = #{id}")
    List<Article> findByTypeId(int id);
}
