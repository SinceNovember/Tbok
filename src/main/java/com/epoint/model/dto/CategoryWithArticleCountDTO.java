package com.epoint.model.dto;

import com.epoint.model.dto.base.OutputConverter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CategoryWithArticleCountDTO extends CategoryDTO {

    private Long articleCount;
}
