package com.epoint.controller;

import com.epoint.model.dto.ArticleDTO;
import com.epoint.model.entity.Article;
import com.epoint.model.enums.ArticleType;
import com.epoint.model.vo.ArticleCondition;
import com.epoint.service.ArticleService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ArticleController {

    @Resource
    private ArticleService articleService;
    @GetMapping("/articles")
    public Map<String, Object> articles(@RequestParam(defaultValue = "1",value = "pageNumber") Integer pageNumber, @RequestParam(defaultValue = "10") Integer pageSize, ArticleCondition condition) {
        Map<String, Object> maps = new HashMap<>();
        PageHelper.startPage(pageNumber, pageSize);
//        List<Article> articles = articleService.findArticlesByCondtion(condition);
//        List<ArticleDTO> articleDTOS = articleService.convertTo(articles);
        maps.put("articles", articleService.convertTo(articleService.findArticlesByCondtion(condition)));
        maps.put("totalCount", articleService.convertTo(articleService.findArticlesByCondtion(condition)).size());
        return maps;
    }

    @GetMapping("/articleGroup")
    public List<Integer> getGroupByType() {
        return articleService.getGroupByType();
    }
}
