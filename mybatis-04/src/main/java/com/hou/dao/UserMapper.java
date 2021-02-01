package com.hou.dao;

import com.hou.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //根据id查询用户
    User getUserById(@Param("id") int id);

    List<User> getUserByLimit(Map<String, Integer> map);

    List<User> getUserByRowBounds();


}
