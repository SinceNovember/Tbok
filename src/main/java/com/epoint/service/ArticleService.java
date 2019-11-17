package com.epoint.service;

import com.epoint.core.Service;
import com.epoint.model.dto.ArticleDTO;
import com.epoint.model.dto.LogDTO;
import com.epoint.model.entity.Article;
import com.epoint.model.entity.Log;
import com.epoint.model.enums.ArticleType;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Map;

public interface ArticleService extends Service<Article> {

    @NonNull
     ArticleDTO convertTo(@NonNull Article article) ;

    @NonNull
     List<ArticleDTO> convertTo(@NonNull List<Article> articles) ;

     List<Article> findAllByState(ArticleType type);

}
