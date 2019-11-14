package com.epoint.service;

import com.epoint.core.Service;
import com.epoint.model.entity.Category;

import java.util.Optional;

public interface CategoryService extends Service<Category> {

    Optional<Category> findByParentId(int id);

}
