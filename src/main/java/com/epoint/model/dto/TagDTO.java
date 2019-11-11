package com.epoint.model.dto;

import com.epoint.model.dto.base.OutputConverter;
import com.epoint.model.entity.Tag;
import lombok.Data;

import java.util.Date;

@Data
public class TagDTO implements OutputConverter<TagDTO, Tag> {

    private int id;

    private String name;

    private String slugName;

    private Date createTime;
}
