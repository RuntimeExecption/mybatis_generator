package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpOptions;

public interface WpOptionsMapper {
    /**
     *  根据主键删除数据库的记录,wp_options
     *
     * @param optionId
     */
    int deleteByPrimaryKey(Long optionId);

    /**
     *  新写入数据库记录,wp_options
     *
     * @param record
     */
    int insert(WpOptions record);

    /**
     *  动态字段,写入数据库记录,wp_options
     *
     * @param record
     */
    int insertSelective(WpOptions record);

    /**
     *  根据指定主键获取一条数据库记录,wp_options
     *
     * @param optionId
     */
    WpOptions selectByPrimaryKey(Long optionId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_options
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpOptions record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_options
     *
     * @param record
     */
    int updateByPrimaryKey(WpOptions record);
}