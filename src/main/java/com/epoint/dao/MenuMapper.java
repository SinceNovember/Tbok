package com.epoint.dao;

import com.epoint.model.entity.Menu;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MenuMapper {
    @Select("select * from menu where pid =#{pid}")
    @ResultMap("BaseResultMap")
    List<Menu> findMenuByParentId(@Param("pid")int pid);

    @Select("select * from menu where pid is null")
    @ResultMap("BaseResultMap")
    List<Menu> getRootMenu();
}
