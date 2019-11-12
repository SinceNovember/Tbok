package com.epoint.model.enums;

public enum LogType implements ValueEnum<Integer>{
    BLOG_INITIALIZED(0),
    POST_PUBLISHED(5),
    POST_EDITED(15),
    POST_DELETED(20),
    LOGIN_IN(25),
    LOGIN_OUT(30),
    LOGIN_FALIED(35),
    PASSWORD_UPDATED(40),
    PROFILE_UPDATE(45);

    private final Integer value;

    LogType(Integer value){
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
