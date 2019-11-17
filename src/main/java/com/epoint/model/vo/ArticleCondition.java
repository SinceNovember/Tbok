package com.epoint.model.vo;

import com.epoint.model.enums.ArticleType;
import lombok.Data;
import lombok.ToString;
import lombok.Value;

import java.util.Date;

@Data
@ToString
public class ArticleCondition {

    private ArticleType type;

    private String keyWord;

    private String recommend;

    private Date startDate;

    private Date endDate;


}
