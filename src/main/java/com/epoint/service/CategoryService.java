package com.epoint.service;

import com.epoint.core.Service;
import com.epoint.model.entity.Blog;
import com.epoint.model.entity.Category;

import java.util.List;
import java.util.Map;

public interface CategoryService extends Service<Category> {

    List<Category> findByParentId(int id);

}
