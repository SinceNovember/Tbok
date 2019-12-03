package com.epoint.dao;

import com.epoint.core.MyMapper;
import com.epoint.model.dto.CategoryDTO;
import com.epoint.model.dto.CategoryWithArticleCountDTO;
import com.epoint.model.entity.Category;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface CategoryMapper extends MyMapper<Category> {
    @Select("select * from category")
    @ResultMap("BaseResultMap")
    List<Category> findCategoriesByCondition();

    @Select("select * from category where parent_id = -1 order by weight desc")
    @ResultMap("BaseResultMap")
    List<Category> findRootType();

    @Select("select * from category where parent_id = #{parentId} order by weight desc")
    @ResultMap("BaseResultMap")
    List<Category> findByParentId(int parentId);

    @Select("select * from category where id = #{id}")
    @ResultMap("BaseResultMap")
    Optional<Category> findById(Integer id);

}

