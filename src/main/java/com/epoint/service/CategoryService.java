package com.epoint.service;

import com.epoint.core.Service;
import com.epoint.model.dto.ArticleDTO;
import com.epoint.model.dto.CategoryDTO;
import com.epoint.model.dto.CategoryWithArticleCountDTO;
import com.epoint.model.entity.Article;
import com.epoint.model.entity.Category;
import com.epoint.model.vo.CategoryCondition;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface CategoryService extends Service<Category> {

    List<Category> listCategories(CategoryCondition condtion);

    List<Category> listRootType();

    Category getById(Integer id);

    Category saveCategory(@NonNull Category category);

    void updateCategory(@NonNull Category category);

    void deleteCategory(String ids);

    @NonNull
    CategoryDTO convertTo(@NonNull Category category) ;

    @NonNull
    List<CategoryDTO> convertTo(@NonNull List<Category> categories) ;


}
