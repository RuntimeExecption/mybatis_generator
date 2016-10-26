package com.yimayhd.resourcecenter.dao;

import com.yimayhd.resourcecenter.domain.RcEvaluatingCategories;

public interface RcEvaluatingCategoriesMapper {
    /**
     *  根据主键删除数据库的记录,rc_evaluating_categories
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,rc_evaluating_categories
     *
     * @param record
     */
    int insert(RcEvaluatingCategories record);

    /**
     *  动态字段,写入数据库记录,rc_evaluating_categories
     *
     * @param record
     */
    int insertSelective(RcEvaluatingCategories record);

    /**
     *  根据指定主键获取一条数据库记录,rc_evaluating_categories
     *
     * @param id
     */
    RcEvaluatingCategories selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,rc_evaluating_categories
     *
     * @param record
     */
    int updateByPrimaryKeySelective(RcEvaluatingCategories record);

    /**
     *  根据主键来更新符合条件的数据库记录,rc_evaluating_categories
     *
     * @param record
     */
    int updateByPrimaryKey(RcEvaluatingCategories record);
}