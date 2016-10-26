package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpUsermeta;

public interface WpUsermetaMapper {
    /**
     *  根据主键删除数据库的记录,wp_usermeta
     *
     * @param umetaId
     */
    int deleteByPrimaryKey(Long umetaId);

    /**
     *  新写入数据库记录,wp_usermeta
     *
     * @param record
     */
    int insert(WpUsermeta record);

    /**
     *  动态字段,写入数据库记录,wp_usermeta
     *
     * @param record
     */
    int insertSelective(WpUsermeta record);

    /**
     *  根据指定主键获取一条数据库记录,wp_usermeta
     *
     * @param umetaId
     */
    WpUsermeta selectByPrimaryKey(Long umetaId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_usermeta
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpUsermeta record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_usermeta
     *
     * @param record
     */
    int updateByPrimaryKey(WpUsermeta record);
}