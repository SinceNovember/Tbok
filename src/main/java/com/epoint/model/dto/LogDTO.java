//package com.epoint.model.dto;
//
//import com.epoint.model.dto.base.OutputConverter;
//import com.epoint.model.entity.Log;
//import com.epoint.model.enums.LogType;
//import com.fasterxml.jackson.annotation.JsonFormat;
//import lombok.Data;
//import lombok.ToString;
//
//import java.util.Date;
//
//@Data
//@ToString
//public class LogDTO implements OutputConverter<LogDTO,Log> {
//    private int id;
//    private String logKey;
//    private LogType type;
//    private String content;
//    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
//    private Date createTime;
//}
