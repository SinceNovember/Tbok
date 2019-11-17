package com.epoint.controller;

import com.epoint.model.dto.ArticleDTO;
import com.epoint.model.enums.ArticleType;
import com.epoint.service.ArticleService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ArticleController {

    @Resource
    private ArticleService articleService;
    @GetMapping("/articles")
    public List<ArticleDTO> articles(@RequestParam(defaultValue = "1",value = "pageNumber") Integer pageNumber,@RequestParam(defaultValue = "10") Integer pageSize, ArticleType articleType) {
        PageHelper.startPage(pageNumber, pageSize);
        return articleService.convertTo(articleService.findAllByState(articleType));
    }
}
