package com.epoint.controller.api;

import com.epoint.model.entity.Menu;
import com.epoint.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MenuController {
    @Resource
    private MenuService menuService;

    @GetMapping("/menus")
    public List<Menu> menus() {
        return menuService.getRootMenu();
    }

}
