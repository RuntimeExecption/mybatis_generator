package com.yimayhd.resourcecenter.domain;

import java.util.Date;

public class RcEvaluatingScore {
    /**
     *  ,所属表字段为rc_evaluating_score.id
     */
    private Long id;

    /**
     *  ,所属表字段为rc_evaluating_score.categories_id
     */
    private Long categoriesId;

    /**
     *  ,所属表字段为rc_evaluating_score.score
     */
    private Long score;

    /**
     *  ,所属表字段为rc_evaluating_score.status
     */
    private Integer status;

    /**
     *  ,所属表字段为rc_evaluating_score.create_date
     */
    private Date createDate;

    /**
     *  ,所属表字段为rc_evaluating_score.update_date
     */
    private Date updateDate;

    /**
     * 获取  字段:rc_evaluating_score.id
     *
     * @return rc_evaluating_score.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:rc_evaluating_score.id
     *
     * @param id rc_evaluating_score.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:rc_evaluating_score.categories_id
     *
     * @return rc_evaluating_score.categories_id, 
     */
    public Long getCategoriesId() {
        return categoriesId;
    }

    /**
     * 设置  字段:rc_evaluating_score.categories_id
     *
     * @param categoriesId rc_evaluating_score.categories_id, 
     */
    public void setCategoriesId(Long categoriesId) {
        this.categoriesId = categoriesId;
    }

    /**
     * 获取  字段:rc_evaluating_score.score
     *
     * @return rc_evaluating_score.score, 
     */
    public Long getScore() {
        return score;
    }

    /**
     * 设置  字段:rc_evaluating_score.score
     *
     * @param score rc_evaluating_score.score, 
     */
    public void setScore(Long score) {
        this.score = score;
    }

    /**
     * 获取  字段:rc_evaluating_score.status
     *
     * @return rc_evaluating_score.status, 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置  字段:rc_evaluating_score.status
     *
     * @param status rc_evaluating_score.status, 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取  字段:rc_evaluating_score.create_date
     *
     * @return rc_evaluating_score.create_date, 
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置  字段:rc_evaluating_score.create_date
     *
     * @param createDate rc_evaluating_score.create_date, 
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取  字段:rc_evaluating_score.update_date
     *
     * @return rc_evaluating_score.update_date, 
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置  字段:rc_evaluating_score.update_date
     *
     * @param updateDate rc_evaluating_score.update_date, 
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}