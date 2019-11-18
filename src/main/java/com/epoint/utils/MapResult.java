package com.epoint.utils;

import com.epoint.model.dto.ArticleDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapResult {
    public static Map<String, Object> ArticleResult(List<ArticleDTO> articleDTOS, Long count) {
        Map<String, Object> map = new HashMap<>();
        map.put("articles", articleDTOS);
        map.put("totalCount",count);
        return map;
    }
}
