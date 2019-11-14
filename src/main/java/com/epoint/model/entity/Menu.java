package com.epoint.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "menu")
@NoArgsConstructor
@ToString
public class Menu{
    private int id;
    private String path;
    private String component;
    private String name;
    private String redirect;
    private List<Menu> children;
    private Meta meta;
    private Boolean alwaysShow;
    private Boolean hidden;

    @Data
    @NoArgsConstructor
    @ToString
    public static class Meta {
        private String title;
        private String icon;
        private Boolean affix;
        private Boolean noCache;
        private Boolean breadCrumb;
    }
}
