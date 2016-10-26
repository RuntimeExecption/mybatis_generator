package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpTerms;

public interface WpTermsMapper {
    /**
     *  根据主键删除数据库的记录,wp_terms
     *
     * @param termId
     */
    int deleteByPrimaryKey(Long termId);

    /**
     *  新写入数据库记录,wp_terms
     *
     * @param record
     */
    int insert(WpTerms record);

    /**
     *  动态字段,写入数据库记录,wp_terms
     *
     * @param record
     */
    int insertSelective(WpTerms record);

    /**
     *  根据指定主键获取一条数据库记录,wp_terms
     *
     * @param termId
     */
    WpTerms selectByPrimaryKey(Long termId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_terms
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpTerms record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_terms
     *
     * @param record
     */
    int updateByPrimaryKey(WpTerms record);
}