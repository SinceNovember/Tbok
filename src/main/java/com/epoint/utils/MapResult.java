package com.epoint.utils;

import com.epoint.model.dto.ArticleDTO;
import com.epoint.model.dto.CategoryDTO;
import com.epoint.model.dto.CategoryWithArticleCountDTO;
import com.epoint.model.entity.Category;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapResult {
    public static Map<String, Object> ArticleResult(List<ArticleDTO> articleDTOS, Long count) {
        Map<String, Object> map = new HashMap<>();
        map.put("articles", articleDTOS);
        map.put("totalCount", count);
        return map;
    }

    public static Map<String, Object> CategoryResult(List<CategoryDTO> categoryDTOS, Long count) {
        Map<String, Object> map = new HashMap<>();
        map.put("categories", categoryDTOS);
        map.put("totalCount", count);
        return map;
    }
}
