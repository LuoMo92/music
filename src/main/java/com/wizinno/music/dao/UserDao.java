package com.wizinno.music.dao;

import com.wizinno.music.base.BaseDao;
import com.wizinno.music.domain.User;

import java.util.List;

/**
 * 用户数据处理层
 * @author Liumei
 */
public interface UserDao extends BaseDao<User,String> {

    /**
     * 通过用户名和状态获取用户
     * @param username
     * @param status
     * @return
     */
    List<User> findByUsernameAndStatus(String username, Integer status);

    /**
     * 通过状态和类型获取用户
     * @param status
     * @param type
     * @return
     */
    List<User> findByStatusAndType(Integer status, Integer type);
}
