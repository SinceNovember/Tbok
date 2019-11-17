package com.epoint.model.enums;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public enum  ArticleType implements ValueEnum<Integer>{
    PUBLISHED(1,"发布"),
    Draft(0,"草稿"),
    DUSTBIN(-1,"垃圾箱"),
    ENTITY(2,"所有");

    private final Integer value;
    private final String msg;

     ArticleType(Integer value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getMsg() {
         return msg;
    }

}
