package com.yimayhd.resourcecenter.domain;

import java.util.Date;

public class RcEvaluatingCategories {
    /**
     *  ,所属表字段为rc_evaluating_categories.id
     */
    private Long id;

    /**
     *  评分项名称,所属表字段为rc_evaluating_categories.name
     */
    private String name;

    /**
     *  是否必填项目,所属表字段为rc_evaluating_categories.required
     */
    private Byte required;

    /**
     *  排序,所属表字段为rc_evaluating_categories.rank
     */
    private Long rank;

    /**
     *  ,所属表字段为rc_evaluating_categories.status
     */
    private Integer status;

    /**
     *  ,所属表字段为rc_evaluating_categories.create_date
     */
    private Date createDate;

    /**
     *  ,所属表字段为rc_evaluating_categories.update_date
     */
    private Date updateDate;

    /**
     * 获取  字段:rc_evaluating_categories.id
     *
     * @return rc_evaluating_categories.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:rc_evaluating_categories.id
     *
     * @param id rc_evaluating_categories.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 评分项名称 字段:rc_evaluating_categories.name
     *
     * @return rc_evaluating_categories.name, 评分项名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 评分项名称 字段:rc_evaluating_categories.name
     *
     * @param name rc_evaluating_categories.name, 评分项名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 是否必填项目 字段:rc_evaluating_categories.required
     *
     * @return rc_evaluating_categories.required, 是否必填项目
     */
    public Byte getRequired() {
        return required;
    }

    /**
     * 设置 是否必填项目 字段:rc_evaluating_categories.required
     *
     * @param required rc_evaluating_categories.required, 是否必填项目
     */
    public void setRequired(Byte required) {
        this.required = required;
    }

    /**
     * 获取 排序 字段:rc_evaluating_categories.rank
     *
     * @return rc_evaluating_categories.rank, 排序
     */
    public Long getRank() {
        return rank;
    }

    /**
     * 设置 排序 字段:rc_evaluating_categories.rank
     *
     * @param rank rc_evaluating_categories.rank, 排序
     */
    public void setRank(Long rank) {
        this.rank = rank;
    }

    /**
     * 获取  字段:rc_evaluating_categories.status
     *
     * @return rc_evaluating_categories.status, 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置  字段:rc_evaluating_categories.status
     *
     * @param status rc_evaluating_categories.status, 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取  字段:rc_evaluating_categories.create_date
     *
     * @return rc_evaluating_categories.create_date, 
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置  字段:rc_evaluating_categories.create_date
     *
     * @param createDate rc_evaluating_categories.create_date, 
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取  字段:rc_evaluating_categories.update_date
     *
     * @return rc_evaluating_categories.update_date, 
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置  字段:rc_evaluating_categories.update_date
     *
     * @param updateDate rc_evaluating_categories.update_date, 
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}