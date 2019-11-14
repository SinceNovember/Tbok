package com.epoint.service;

import com.epoint.model.dto.MenuDTO;
import com.epoint.model.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuService {

    List<Menu> findMenuByParentId(@Param("pid")int pid);

    List<Menu> getRootMenu();

    public MenuDTO convertTo(Menu menu) ;

    public List<MenuDTO> convertTo(List<Menu> menus) ;

    }
