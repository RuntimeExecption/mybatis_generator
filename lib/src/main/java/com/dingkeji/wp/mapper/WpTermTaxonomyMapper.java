package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpTermTaxonomy;

public interface WpTermTaxonomyMapper {
    /**
     *  根据主键删除数据库的记录,wp_term_taxonomy
     *
     * @param termTaxonomyId
     */
    int deleteByPrimaryKey(Long termTaxonomyId);

    /**
     *  新写入数据库记录,wp_term_taxonomy
     *
     * @param record
     */
    int insert(WpTermTaxonomy record);

    /**
     *  动态字段,写入数据库记录,wp_term_taxonomy
     *
     * @param record
     */
    int insertSelective(WpTermTaxonomy record);

    /**
     *  根据指定主键获取一条数据库记录,wp_term_taxonomy
     *
     * @param termTaxonomyId
     */
    WpTermTaxonomy selectByPrimaryKey(Long termTaxonomyId);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_term_taxonomy
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpTermTaxonomy record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_term_taxonomy
     *
     * @param record
     */
    int updateByPrimaryKey(WpTermTaxonomy record);
}