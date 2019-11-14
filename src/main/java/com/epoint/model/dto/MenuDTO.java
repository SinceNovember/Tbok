package com.epoint.model.dto;

import com.epoint.model.dto.base.OutputConverter;
import com.epoint.model.entity.Menu;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@ToString
public class MenuDTO implements OutputConverter<MenuDTO,Menu> {
    private int id;
    private String path;
    private String component;
    private String name;
    private String redirect;
    private List<Menu> children;
    private Menu meta;
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

