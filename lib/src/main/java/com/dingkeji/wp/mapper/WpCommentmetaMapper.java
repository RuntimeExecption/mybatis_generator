package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpCommentmeta;

public interface WpCommentmetaMapper {
    /**
     *  根据主键删除数据库的记录,wp_commentmeta
     *
     * @param metaId
     */
    int deleteByPrimaryKey(Long metaId);

    /**
     *  新写入数据库记录,wp_commentmeta
     *
     * @param record
     */
    int insert(WpCommentmeta record);

    /**
     *  动态字段,写入数据库记录,wp_commentmeta
     *
     * @param record
     */
    int insertSelective(WpCommentmeta record);

    /**
     *  根据指定主键获取一条数据库记录,wp_commentmeta
     *
     * @param metaId
     */
    WpCommentmeta selectByPrimaryKey(Long metaId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_commentmeta
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpCommentmeta record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_commentmeta
     *
     * @param record
     */
    int updateByPrimaryKey(WpCommentmeta record);
}