package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpComments;

public interface WpCommentsMapper {
    /**
     *  根据主键删除数据库的记录,wp_comments
     *
     * @param commentId
     */
    int deleteByPrimaryKey(Long commentId);

    /**
     *  新写入数据库记录,wp_comments
     *
     * @param record
     */
    int insert(WpComments record);

    /**
     *  动态字段,写入数据库记录,wp_comments
     *
     * @param record
     */
    int insertSelective(WpComments record);

    /**
     *  根据指定主键获取一条数据库记录,wp_comments
     *
     * @param commentId
     */
    WpComments selectByPrimaryKey(Long commentId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_comments
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpComments record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_comments
     *
     * @param record
     */
    int updateByPrimaryKey(WpComments record);
}