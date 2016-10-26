package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpPosts;

public interface WpPostsMapper {
    /**
     *  根据主键删除数据库的记录,wp_posts
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,wp_posts
     *
     * @param record
     */
    int insert(WpPosts record);

    /**
     *  动态字段,写入数据库记录,wp_posts
     *
     * @param record
     */
    int insertSelective(WpPosts record);

    /**
     *  根据指定主键获取一条数据库记录,wp_posts
     *
     * @param id
     */
    WpPosts selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_posts
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpPosts record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_posts
     *
     * @param record
     */
    int updateByPrimaryKey(WpPosts record);
}