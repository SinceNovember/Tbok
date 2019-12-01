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
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl  extends AbstractService<Category> implements CategoryService{
    @Resource
    private CategoryMapper categoryMapper;
    @Override
    public Optional<Category> findByParentId(int id) {
        return categoryMapper.findByParentId(id);
    }

    @Override
    public List<Category> listCategories() {
        return categoryMapper.findCategoriesByCondition();
    }

    @Override
    public List<Category> listRootType() {
        return categoryMapper.findRootType();
    }

    @Override
    public Category saveCategory(Category category) {
        if (StringUtils.isEmpty(category.getParentId())) {
            category.setParentId(-1);
        }
        return super.save(category);
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
