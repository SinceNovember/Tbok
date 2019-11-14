package com.epoint.service.impl;

import com.epoint.core.AbstractService;
import com.epoint.dao.BlogMapper;
import com.epoint.model.entity.Article;
import com.epoint.service.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class BlogServiceImpl extends AbstractService<Article> implements BlogService{
    @Resource
    private BlogMapper blogMapper;

    @Override
    public List<Article> findByTypeId(int id) {
        return blogMapper.findByTypeId(id);
    }

    @Override
    public List<Article> findAllByCreateTimeDesc() {
        System.out.println("123");
        return null;
    }

    @Override
    public List<Article> findTop5Views() {
        System.out.println("234");
        return null;
    }

    @Override
    public List<Article> findAllByTypeIdAndCreateTimeDesc(int id) {
        return null;
    }

    @Override
    public List<Article> findAllByTagIdAndCreateTimeDesc(int id) {
        return null;
    }

    @Override
    public Map<String, List<Article>> archiveBlogList() {
        return null;
    }

    @Override
    public Integer blogCount() {
        return null;
    }

    @Override
    public List<Article> findAllByUpdateTimeDesc() {
        return null;
    }
}
