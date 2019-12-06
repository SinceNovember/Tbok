package com.epoint.model.vo;

import com.epoint.model.enums.ArticleType;
import lombok.Data;
import lombok.ToString;
import org.springframework.lang.Nullable;

import java.sql.Date;

@Data
@ToString
public class ArticleCondition {

    private ArticleType type;

    private String keyWord;

    private String recommend;

    private String startDate;

    private String endDate;

}
