package com.dingkeji.wp.mapper.model;

public class WpCommentmeta {
    /**
     *  ,所属表字段为wp_commentmeta.meta_id
     */
    private Long metaId;

    /**
     *  ,所属表字段为wp_commentmeta.comment_id
     */
    private Long commentId;

    /**
     *  ,所属表字段为wp_commentmeta.meta_key
     */
    private String metaKey;

    /**
     *  ,所属表字段为wp_commentmeta.meta_value
     */
    private String metaValue;

    /**
     * 获取  字段:wp_commentmeta.meta_id
     *
     * @return wp_commentmeta.meta_id, 
     */
    public Long getMetaId() {
        return metaId;
    }

    /**
     * 设置  字段:wp_commentmeta.meta_id
     *
     * @param metaId wp_commentmeta.meta_id, 
     */
    public void setMetaId(Long metaId) {
        this.metaId = metaId;
    }

    /**
     * 获取  字段:wp_commentmeta.comment_id
     *
     * @return wp_commentmeta.comment_id, 
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * 设置  字段:wp_commentmeta.comment_id
     *
     * @param commentId wp_commentmeta.comment_id, 
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取  字段:wp_commentmeta.meta_key
     *
     * @return wp_commentmeta.meta_key, 
     */
    public String getMetaKey() {
        return metaKey;
    }

    /**
     * 设置  字段:wp_commentmeta.meta_key
     *
     * @param metaKey wp_commentmeta.meta_key, 
     */
    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey == null ? null : metaKey.trim();
    }

    /**
     * 获取  字段:wp_commentmeta.meta_value
     *
     * @return wp_commentmeta.meta_value, 
     */
    public String getMetaValue() {
        return metaValue;
    }

    /**
     * 设置  字段:wp_commentmeta.meta_value
     *
     * @param metaValue wp_commentmeta.meta_value, 
     */
    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue == null ? null : metaValue.trim();
    }
}