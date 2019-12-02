package com.epoint.service;

import com.epoint.core.Service;
import com.epoint.model.dto.ArticleDTO;
import com.epoint.model.dto.CategoryDTO;
import com.epoint.model.entity.Article;
import com.epoint.model.entity.Category;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface CategoryService extends Service<Category> {

    List<Category> listCategories();

    List<Category> listRootType();

    Category saveCategory(@NonNull Category category);

    void updateCategory(@NonNull Category category);

    @NonNull
    CategoryDTO convertTo(@NonNull Category category) ;

    @NonNull
    List<CategoryDTO> convertTo(@NonNull List<Category> categories) ;


}
