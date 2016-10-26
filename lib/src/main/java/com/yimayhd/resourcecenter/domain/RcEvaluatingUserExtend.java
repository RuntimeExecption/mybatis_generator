package com.yimayhd.resourcecenter.domain;

import java.util.Date;

public class RcEvaluatingUserExtend {
    /**
     *  ,所属表字段为rc_evaluating_user_extend.id
     */
    private Long id;

    /**
     *  ,所属表字段为rc_evaluating_user_extend.article_id
     */
    private Long articleId;

    /**
     *  ,所属表字段为rc_evaluating_user_extend.job
     */
    private String job;

    /**
     *  ,所属表字段为rc_evaluating_user_extend.age
     */
    private String age;

    /**
     *  皮肤肤质,所属表字段为rc_evaluating_user_extend.skin
     */
    private String skin;

    /**
     *  皮肤问题,所属表字段为rc_evaluating_user_extend.skin_problem
     */
    private String skinProblem;

    /**
     *  ,所属表字段为rc_evaluating_user_extend.status
     */
    private Integer status;

    /**
     *  ,所属表字段为rc_evaluating_user_extend.create_date
     */
    private Date createDate;

    /**
     *  ,所属表字段为rc_evaluating_user_extend.update_date
     */
    private Date updateDate;

    /**
     * 获取  字段:rc_evaluating_user_extend.id
     *
     * @return rc_evaluating_user_extend.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:rc_evaluating_user_extend.id
     *
     * @param id rc_evaluating_user_extend.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:rc_evaluating_user_extend.article_id
     *
     * @return rc_evaluating_user_extend.article_id, 
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * 设置  字段:rc_evaluating_user_extend.article_id
     *
     * @param articleId rc_evaluating_user_extend.article_id, 
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * 获取  字段:rc_evaluating_user_extend.job
     *
     * @return rc_evaluating_user_extend.job, 
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置  字段:rc_evaluating_user_extend.job
     *
     * @param job rc_evaluating_user_extend.job, 
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * 获取  字段:rc_evaluating_user_extend.age
     *
     * @return rc_evaluating_user_extend.age, 
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置  字段:rc_evaluating_user_extend.age
     *
     * @param age rc_evaluating_user_extend.age, 
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * 获取 皮肤肤质 字段:rc_evaluating_user_extend.skin
     *
     * @return rc_evaluating_user_extend.skin, 皮肤肤质
     */
    public String getSkin() {
        return skin;
    }

    /**
     * 设置 皮肤肤质 字段:rc_evaluating_user_extend.skin
     *
     * @param skin rc_evaluating_user_extend.skin, 皮肤肤质
     */
    public void setSkin(String skin) {
        this.skin = skin == null ? null : skin.trim();
    }

    /**
     * 获取 皮肤问题 字段:rc_evaluating_user_extend.skin_problem
     *
     * @return rc_evaluating_user_extend.skin_problem, 皮肤问题
     */
    public String getSkinProblem() {
        return skinProblem;
    }

    /**
     * 设置 皮肤问题 字段:rc_evaluating_user_extend.skin_problem
     *
     * @param skinProblem rc_evaluating_user_extend.skin_problem, 皮肤问题
     */
    public void setSkinProblem(String skinProblem) {
        this.skinProblem = skinProblem == null ? null : skinProblem.trim();
    }

    /**
     * 获取  字段:rc_evaluating_user_extend.status
     *
     * @return rc_evaluating_user_extend.status, 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置  字段:rc_evaluating_user_extend.status
     *
     * @param status rc_evaluating_user_extend.status, 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取  字段:rc_evaluating_user_extend.create_date
     *
     * @return rc_evaluating_user_extend.create_date, 
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置  字段:rc_evaluating_user_extend.create_date
     *
     * @param createDate rc_evaluating_user_extend.create_date, 
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取  字段:rc_evaluating_user_extend.update_date
     *
     * @return rc_evaluating_user_extend.update_date, 
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置  字段:rc_evaluating_user_extend.update_date
     *
     * @param updateDate rc_evaluating_user_extend.update_date, 
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}