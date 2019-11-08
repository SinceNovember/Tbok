package com.epoint.dao;

import com.epoint.core.MyMapper;
import com.epoint.model.entity.Blog;
import com.epoint.model.entity.Category;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategoryMapper extends MyMapper<Category> {
    @Select("select * from category where parent_id = #{id}")
    @ResultMap("BaseResultMap")
    List<Category> findByParentId(int id);
}
