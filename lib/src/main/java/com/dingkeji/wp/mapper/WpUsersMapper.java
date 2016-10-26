package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpUsers;

public interface WpUsersMapper {
    /**
     *  根据主键删除数据库的记录,wp_users
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,wp_users
     *
     * @param record
     */
    int insert(WpUsers record);

    /**
     *  动态字段,写入数据库记录,wp_users
     *
     * @param record
     */
    int insertSelective(WpUsers record);

    /**
     *  根据指定主键获取一条数据库记录,wp_users
     *
     * @param id
     */
    WpUsers selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_users
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpUsers record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_users
     *
     * @param record
     */
    int updateByPrimaryKey(WpUsers record);
}