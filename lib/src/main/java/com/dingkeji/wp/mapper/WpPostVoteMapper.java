package com.dingkeji.wp.mapper;

import com.dingkeji.wp.mapper.model.WpPostVote;

public interface WpPostVoteMapper {
    /**
     *  根据主键删除数据库的记录,wp_post_vote
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,wp_post_vote
     *
     * @param record
     */
    int insert(WpPostVote record);

    /**
     *  动态字段,写入数据库记录,wp_post_vote
     *
     * @param record
     */
    int insertSelective(WpPostVote record);

    /**
     *  根据指定主键获取一条数据库记录,wp_post_vote
     *
     * @param id
     */
    WpPostVote selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,wp_post_vote
     *
     * @param record
     */
    int updateByPrimaryKeySelective(WpPostVote record);

    /**
     *  根据主键来更新符合条件的数据库记录,wp_post_vote
     *
     * @param record
     */
    int updateByPrimaryKey(WpPostVote record);
}