package com.yimayhd.resourcecenter.dao;

import com.yimayhd.resourcecenter.domain.RcEvaluatingScore;

public interface RcEvaluatingScoreMapper {
    /**
     *  根据主键删除数据库的记录,rc_evaluating_score
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,rc_evaluating_score
     *
     * @param record
     */
    int insert(RcEvaluatingScore record);

    /**
     *  动态字段,写入数据库记录,rc_evaluating_score
     *
     * @param record
     */
    int insertSelective(RcEvaluatingScore record);

    /**
     *  根据指定主键获取一条数据库记录,rc_evaluating_score
     *
     * @param id
     */
    RcEvaluatingScore selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,rc_evaluating_score
     *
     * @param record
     */
    int updateByPrimaryKeySelective(RcEvaluatingScore record);

    /**
     *  根据主键来更新符合条件的数据库记录,rc_evaluating_score
     *
     * @param record
     */
    int updateByPrimaryKey(RcEvaluatingScore record);
}