package com.dingkeji.wp.mapper.model;

public class WpUsermeta {
    /**
     *  ,所属表字段为wp_usermeta.umeta_id
     */
    private Long umetaId;

    /**
     *  ,所属表字段为wp_usermeta.user_id
     */
    private Long userId;

    /**
     *  ,所属表字段为wp_usermeta.meta_key
     */
    private String metaKey;

    /**
     *  ,所属表字段为wp_usermeta.meta_value
     */
    private String metaValue;

    /**
     * 获取  字段:wp_usermeta.umeta_id
     *
     * @return wp_usermeta.umeta_id, 
     */
    public Long getUmetaId() {
        return umetaId;
    }

    /**
     * 设置  字段:wp_usermeta.umeta_id
     *
     * @param umetaId wp_usermeta.umeta_id, 
     */
    public void setUmetaId(Long umetaId) {
        this.umetaId = umetaId;
    }

    /**
     * 获取  字段:wp_usermeta.user_id
     *
     * @return wp_usermeta.user_id, 
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置  字段:wp_usermeta.user_id
     *
     * @param userId wp_usermeta.user_id, 
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取  字段:wp_usermeta.meta_key
     *
     * @return wp_usermeta.meta_key, 
     */
    public String getMetaKey() {
        return metaKey;
    }

    /**
     * 设置  字段:wp_usermeta.meta_key
     *
     * @param metaKey wp_usermeta.meta_key, 
     */
    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey == null ? null : metaKey.trim();
    }

    /**
     * 获取  字段:wp_usermeta.meta_value
     *
     * @return wp_usermeta.meta_value, 
     */
    public String getMetaValue() {
        return metaValue;
    }

    /**
     * 设置  字段:wp_usermeta.meta_value
     *
     * @param metaValue wp_usermeta.meta_value, 
     */
    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue == null ? null : metaValue.trim();
    }
}