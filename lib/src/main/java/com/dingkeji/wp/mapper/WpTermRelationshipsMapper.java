package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpTermRelationships;
import com.dingkeji.wp.mapper.model.WpTermRelationshipsKey;

public interface WpTermRelationshipsMapper {
    /**
     *  根据主键删除数据库的记录,wp_term_relationships
     *
     * @param key
     */
    int deleteByPrimaryKey(WpTermRelationshipsKey key);

    /**
     *  新写入数据库记录,wp_term_relationships
     *
     * @param record
     */
    int insert(WpTermRelationships record);

    /**
     *  动态字段,写入数据库记录,wp_term_relationships
     *
     * @param record
     */
    int insertSelective(WpTermRelationships record);

    /**
     *  根据指定主键获取一条数据库记录,wp_term_relationships
     *
     * @param key
     */
    WpTermRelationships selectByPrimaryKey(WpTermRelationshipsKey key);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_term_relationships
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpTermRelationships record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_term_relationships
     *
     * @param record
     */
    int updateByPrimaryKey(WpTermRelationships record);
}