package com.epoint.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@ToString
@EqualsAndHashCode
public class BaseEntity {

    private Date createTime;

    private Date updateTime;

    private Boolean deleted = false;

}
