package com.epoint.model.dto;

import com.epoint.model.enums.LogType;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LogDTO {
    private int id;
    private String logKey;
    private LogType type;
}
