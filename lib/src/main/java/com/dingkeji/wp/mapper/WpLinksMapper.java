package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpLinks;

public interface WpLinksMapper {
    /**
     *  根据主键删除数据库的记录,wp_links
     *
     * @param linkId
     */
    int deleteByPrimaryKey(Long linkId);

    /**
     *  新写入数据库记录,wp_links
     *
     * @param record
     */
    int insert(WpLinks record);

    /**
     *  动态字段,写入数据库记录,wp_links
     *
     * @param record
     */
    int insertSelective(WpLinks record);

    /**
     *  根据指定主键获取一条数据库记录,wp_links
     *
     * @param linkId
     */
    WpLinks selectByPrimaryKey(Long linkId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_links
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpLinks record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_links
     *
     * @param record
     */
    int updateByPrimaryKey(WpLinks record);
}