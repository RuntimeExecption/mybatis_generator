package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpUserpostFav;

public interface WpUserpostFavMapper {
    /**
     *  根据主键删除数据库的记录,wp_userpost_fav
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,wp_userpost_fav
     *
     * @param record
     */
    int insert(WpUserpostFav record);

    /**
     *  动态字段,写入数据库记录,wp_userpost_fav
     *
     * @param record
     */
    int insertSelective(WpUserpostFav record);

    /**
     *  根据指定主键获取一条数据库记录,wp_userpost_fav
     *
     * @param id
     */
    WpUserpostFav selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_userpost_fav
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpUserpostFav record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_userpost_fav
     *
     * @param record
     */
    int updateByPrimaryKey(WpUserpostFav record);
}