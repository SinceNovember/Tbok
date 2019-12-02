package com.epoint.controller.api;

import com.epoint.model.dto.CategoryDTO;
import com.epoint.model.entity.Article;
import com.epoint.model.entity.Category;
import com.epoint.model.params.CategoryParam;
import com.epoint.service.CategoryService;
import com.epoint.utils.MapResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admin/categories")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @GetMapping
    public Map<String, Object> categories(@RequestParam(defaultValue = "1",value = "currentPage") Integer pageNumber, @RequestParam(defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        PageInfo<Category> list = new PageInfo<>(categoryService.listCategories());
        return MapResult.CategoryResult(categoryService.convertTo(list.getList()),list.getTotal());
    }

    @GetMapping("type")
    public List<CategoryDTO> rootType() {
        List<Category> categories  = categoryService.listRootType();
        return categoryService.convertTo(categories);
    }

    @GetMapping("get")
    public CategoryDTO getBy(@RequestParam("id") Integer id) {
        return categoryService.convertTo(categoryService.getById(id));
    }

    @PostMapping
    public void addCategory(@RequestBody CategoryParam categoryParam) {
        Category category = categoryParam.convertTo();
        categoryService.saveCategory(category);
    }

    @PutMapping
    public void updateCategory(@RequestBody CategoryParam categoryParam) {
        Category category = categoryParam.convertTo();
        categoryService.updateCategory(category);
    }
}
