package com.epoint.model.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

//@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum LogType implements ValueEnum<Integer>{
    BLOG_INITIALIZED(0,"初始化"),
    POST_PUBLISHED(5,"初始化"),
    POST_EDITED(15,"初始化"),
    POST_DELETED(20,"初始化"),
    LOGIN_IN(25,"初始化"),
    LOGIN_OUT(30,"初始化"),
    LOGIN_FALIED(35,"初始化"),
    PASSWORD_UPDATED(40,"初始化"),
    PROFILE_UPDATE(45,"初始化");

    private final Integer value;
    private final String msg;

    LogType(Integer value,String msg){
        this.value = value;
        this.msg = msg;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    //前台页面只展示msg
    @JsonValue
    public String getMsg() {
        return msg;
    }
}
