package com.epoint.dao;

import com.epoint.core.MyMapper;
import com.epoint.model.entity.Blog;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BlogMapper  extends MyMapper<Blog> {
    @Select("select * from blog where typeid = #{id}")
    List<Blog> findByTypeId(int id);
}
