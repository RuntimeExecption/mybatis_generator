package com.yimayhd.resourcecenter.dao;

import com.yimayhd.resourcecenter.domain.RcArticleExtend;

public interface RcArticleExtendMapper {
    /**
     *  根据主键删除数据库的记录,rc_article_extend
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,rc_article_extend
     *
     * @param record
     */
    int insert(RcArticleExtend record);

    /**
     *  动态字段,写入数据库记录,rc_article_extend
     *
     * @param record
     */
    int insertSelective(RcArticleExtend record);

    /**
     *  根据指定主键获取一条数据库记录,rc_article_extend
     *
     * @param id
     */
    RcArticleExtend selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,rc_article_extend
     *
     * @param record
     */
    int updateByPrimaryKeySelective(RcArticleExtend record);

    /**
     *  根据主键来更新符合条件的数据库记录,rc_article_extend
     *
     * @param record
     */
    int updateByPrimaryKey(RcArticleExtend record);
}