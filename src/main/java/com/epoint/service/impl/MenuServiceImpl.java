package com.epoint.service.impl;

import com.epoint.dao.MenuMapper;
import com.epoint.model.dto.MenuDTO;
import com.epoint.model.entity.Menu;
import com.epoint.service.MenuService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menu> findMenuByParentId(int pid) {
        return menuMapper.findMenuByParentId(pid);
    }

    @Override
    public List<Menu> getRootMenu() {
        return menuMapper.getRootMenu();
    }


    public MenuDTO convertTo(Menu menu) {
        Assert.notNull(menu,"menu must not be null");
        return new MenuDTO().covertFrom(menu);
    }

    public List<MenuDTO> convertTo(List<Menu> menus) {
        if (CollectionUtils.isEmpty(menus)) {
            return Collections.emptyList();
        }

        return menus.stream()
                .map(this::convertTo)
                .collect(Collectors.toList());
    }
}
