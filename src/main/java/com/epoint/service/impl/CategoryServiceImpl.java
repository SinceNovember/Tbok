package com.epoint.service.impl;

import com.epoint.core.AbstractService;
import com.epoint.dao.CategoryMapper;
import com.epoint.model.entity.Category;
import com.epoint.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
