package com.epoint.dao;

import com.epoint.core.MyMapper;
import com.epoint.model.entity.Category;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

public interface CategoryMapper extends MyMapper<Category> {
    @Select("select * from category where parent_id = #{id}")
    @ResultMap("BaseResultMap")
    Optional<Category> findByParentId(int id);


    @Select("select * from category")
    @ResultMap("BaseResultMap")
    List<Category> findCategoriesByCondition();

    @Select("select * from category where parent_id = -1")
    @ResultMap("BaseResultMap")
    List<Category> findRootType();
}

