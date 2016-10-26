package com.dingkeji.wp.mapper.model;

public class WpTermmeta {
    /**
     *  ,所属表字段为wp_termmeta.meta_id
     */
    private Long metaId;

    /**
     *  ,所属表字段为wp_termmeta.term_id
     */
    private Long termId;

    /**
     *  ,所属表字段为wp_termmeta.meta_key
     */
    private String metaKey;

    /**
     *  ,所属表字段为wp_termmeta.meta_value
     */
    private String metaValue;

    /**
     * 获取  字段:wp_termmeta.meta_id
     *
     * @return wp_termmeta.meta_id, 
     */
    public Long getMetaId() {
        return metaId;
    }

    /**
     * 设置  字段:wp_termmeta.meta_id
     *
     * @param metaId wp_termmeta.meta_id, 
     */
    public void setMetaId(Long metaId) {
        this.metaId = metaId;
    }

    /**
     * 获取  字段:wp_termmeta.term_id
     *
     * @return wp_termmeta.term_id, 
     */
    public Long getTermId() {
        return termId;
    }

    /**
     * 设置  字段:wp_termmeta.term_id
     *
     * @param termId wp_termmeta.term_id, 
     */
    public void setTermId(Long termId) {
        this.termId = termId;
    }

    /**
     * 获取  字段:wp_termmeta.meta_key
     *
     * @return wp_termmeta.meta_key, 
     */
    public String getMetaKey() {
        return metaKey;
    }

    /**
     * 设置  字段:wp_termmeta.meta_key
     *
     * @param metaKey wp_termmeta.meta_key, 
     */
    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey == null ? null : metaKey.trim();
    }

    /**
     * 获取  字段:wp_termmeta.meta_value
     *
     * @return wp_termmeta.meta_value, 
     */
    public String getMetaValue() {
        return metaValue;
    }

    /**
     * 设置  字段:wp_termmeta.meta_value
     *
     * @param metaValue wp_termmeta.meta_value, 
     */
    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue == null ? null : metaValue.trim();
    }
}