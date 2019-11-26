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

    public ArticleType getType() {
        return type;
    }

    public void setType(ArticleType type) {
        this.type = type;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
