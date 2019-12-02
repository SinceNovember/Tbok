package com.epoint.service.impl;

import com.epoint.core.AbstractService;
import com.epoint.dao.CategoryMapper;
import com.epoint.model.dto.ArticleDTO;
import com.epoint.model.dto.CategoryDTO;
import com.epoint.model.entity.Category;
import com.epoint.service.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl  extends AbstractService<Category> implements CategoryService{
    @Resource
    private CategoryMapper categoryMapper;


    @Override
    public List<Category> listCategories() {
        List<Category> list = new ArrayList<>();
        //获取所有的根分类
        List<Category> rootCategories = categoryMapper.findRootType();
        for (Category category : rootCategories) {
            list.add(category);
            //添加所有的子分类
            list.addAll( categoryMapper.findByParentId(category.getId()));
        }
        return list;
    }

    @Override
    public List<Category> listRootType() {
        return categoryMapper.findRootType();
    }

    @Override
    public Category getById(Integer id) {
        return categoryMapper.getById(id).orElse(null);
    }


    @Override
    public Category saveCategory(Category category) {
        if (StringUtils.isEmpty(category.getParentId())) {
            category.setParentId(-1);
        }
        return super.save(category);
    }

    @Override
    public void updateCategory(Category category) {
        super.update(category);
    }


    @Override
    public CategoryDTO convertTo(Category category) {
        Assert.notNull(category,"category is not null");
        return new CategoryDTO().covertFrom(category);
    }

    @Override
    public List<CategoryDTO> convertTo(List<Category> categories) {
        return categories.stream()
                .map(this::convertTo)
                .collect(Collectors.toList());    }

}
