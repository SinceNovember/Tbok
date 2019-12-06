package com.epoint.model.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CategoryCondition {

    private String keyWord;

    private String description;

    private String startDate;

    private String endDate;
}
