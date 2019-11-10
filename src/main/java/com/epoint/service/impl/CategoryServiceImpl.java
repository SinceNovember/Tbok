package com.epoint.service.impl;

import com.epoint.core.AbstractService;
import com.epoint.dao.CategoryMapper;
import com.epoint.model.entity.Blog;
import com.epoint.model.entity.Category;
import com.epoint.service.CategoryService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl  extends AbstractService<Category> implements CategoryService{
    @Resource
    private CategoryMapper categoryMapper;
    @Override
    public Optional<Category> findByParentId(int id) {
        return categoryMapper.findByParentId(id);
    }

}
