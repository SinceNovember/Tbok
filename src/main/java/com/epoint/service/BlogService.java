package com.epoint.service;

import com.epoint.core.Service;
import com.epoint.model.entity.Blog;

import java.util.List;
import java.util.Map;

public interface BlogService extends Service<Blog> {

    List<Blog> findByTypeId(int id);

    List<Blog> findAllByCreateTimeDesc();

    List<Blog> findTop5Views();

    List<Blog> findAllByTypeIdAndCreateTimeDesc(int id);

    List<Blog> findAllByTagIdAndCreateTimeDesc(int id);

    Map<String,List<Blog>> archiveBlogList();

    Integer blogCount();

    List<Blog> findAllByUpdateTimeDesc();
}
