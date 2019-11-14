package com.epoint.service;

import com.epoint.core.Service;
import com.epoint.model.entity.Article;

import java.util.List;
import java.util.Map;

public interface BlogService extends Service<Article> {

    List<Article> findByTypeId(int id);

    List<Article> findAllByCreateTimeDesc();

    List<Article> findTop5Views();

    List<Article> findAllByTypeIdAndCreateTimeDesc(int id);

    List<Article> findAllByTagIdAndCreateTimeDesc(int id);

    Map<String,List<Article>> archiveBlogList();

    Integer blogCount();

    List<Article> findAllByUpdateTimeDesc();
}
