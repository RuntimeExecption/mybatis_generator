package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpTermmeta;

public interface WpTermmetaMapper {
    /**
     *  根据主键删除数据库的记录,wp_termmeta
     *
     * @param metaId
     */
    int deleteByPrimaryKey(Long metaId);

    /**
     *  新写入数据库记录,wp_termmeta
     *
     * @param record
     */
    int insert(WpTermmeta record);

    /**
     *  动态字段,写入数据库记录,wp_termmeta
     *
     * @param record
     */
    int insertSelective(WpTermmeta record);

    /**
     *  根据指定主键获取一条数据库记录,wp_termmeta
     *
     * @param metaId
     */
    WpTermmeta selectByPrimaryKey(Long metaId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_termmeta
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpTermmeta record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_termmeta
     *
     * @param record
     */
    int updateByPrimaryKey(WpTermmeta record);
}