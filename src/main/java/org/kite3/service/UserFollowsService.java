package org.kite3.service;

import java.util.List;

import org.kite3.entity.UserFollows;
import org.kite3.page.TailPage;

public interface UserFollowsService {

    /**
     * 根据id获取
     **/
    UserFollows getById(int id);

    /**
     * 获取所有
     **/
    List<UserFollows> queryAll(UserFollows queryEntity);

    /**
     * 分页获取
     **/
    TailPage<UserFollows> queryPage(UserFollows queryEntity, TailPage<UserFollows> page);

    /**
     * 删除
     **/
    void delete(UserFollows entity);

    /**
     * 创建
     **/
    void createSelectivity(UserFollows entity);

}
