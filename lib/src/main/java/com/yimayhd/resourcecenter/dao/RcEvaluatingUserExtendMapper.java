package com.yimayhd.resourcecenter.dao;

import com.yimayhd.resourcecenter.domain.RcEvaluatingUserExtend;

public interface RcEvaluatingUserExtendMapper {
    /**
     *  根据主键删除数据库的记录,rc_evaluating_user_extend
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,rc_evaluating_user_extend
     *
     * @param record
     */
    int insert(RcEvaluatingUserExtend record);

    /**
     *  动态字段,写入数据库记录,rc_evaluating_user_extend
     *
     * @param record
     */
    int insertSelective(RcEvaluatingUserExtend record);

    /**
     *  根据指定主键获取一条数据库记录,rc_evaluating_user_extend
     *
     * @param id
     */
    RcEvaluatingUserExtend selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,rc_evaluating_user_extend
     *
     * @param record
     */
    int updateByPrimaryKeySelective(RcEvaluatingUserExtend record);

    /**
     *  根据主键来更新符合条件的数据库记录,rc_evaluating_user_extend
     *
     * @param record
     */
    int updateByPrimaryKey(RcEvaluatingUserExtend record);
}