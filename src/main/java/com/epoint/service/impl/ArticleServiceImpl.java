package com.epoint.service.impl;

import com.epoint.core.AbstractService;
import com.epoint.dao.ArticleMapper;
import com.epoint.model.dto.ArticleDTO;
import com.epoint.model.entity.Article;
import com.epoint.model.enums.ArticleType;
import com.epoint.model.vo.ArticleCondition;
import com.epoint.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl extends AbstractService<Article> implements ArticleService {
    @Resource
    private ArticleMapper blogMapper;



    @Override
    public List<Article> findAllByState(ArticleType type) {
        return blogMapper.findAllByState(type);
    }

    public List<Article> findByTypeId(int id) {
        return blogMapper.findByTypeId(id);
    }


    @Override
    public ArticleDTO convertTo(Article article) {
        Assert.notNull(article,"article is not null");
        return new ArticleDTO().covertFrom(article);
    }

    @Override
    public List<ArticleDTO> convertTo(List<Article> articles) {
       return articles.stream()
               .map(this::convertTo)
               .collect(Collectors.toList());
    }

    @Override
    public List<Article> findArticlesByCondtion(ArticleCondition condtion) {
         return blogMapper.findArticlesByCondtion(condtion);
    }

    @Override
    public List<Integer> getGroupByType() {
        return blogMapper.getGroupByType();
    }


}
