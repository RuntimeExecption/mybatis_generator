package com.dingkeji.wp.mapper.model;

public class WpTerms {
    /**
     *  ,所属表字段为wp_terms.term_id
     */
    private Long termId;

    /**
     *  ,所属表字段为wp_terms.name
     */
    private String name;

    /**
     *  ,所属表字段为wp_terms.slug
     */
    private String slug;

    /**
     *  ,所属表字段为wp_terms.term_group
     */
    private Long termGroup;

    /**
     * 获取  字段:wp_terms.term_id
     *
     * @return wp_terms.term_id, 
     */
    public Long getTermId() {
        return termId;
    }

    /**
     * 设置  字段:wp_terms.term_id
     *
     * @param termId wp_terms.term_id, 
     */
    public void setTermId(Long termId) {
        this.termId = termId;
    }

    /**
     * 获取  字段:wp_terms.name
     *
     * @return wp_terms.name, 
     */
    public String getName() {
        return name;
    }

    /**
     * 设置  字段:wp_terms.name
     *
     * @param name wp_terms.name, 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取  字段:wp_terms.slug
     *
     * @return wp_terms.slug, 
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 设置  字段:wp_terms.slug
     *
     * @param slug wp_terms.slug, 
     */
    public void setSlug(String slug) {
        this.slug = slug == null ? null : slug.trim();
    }

    /**
     * 获取  字段:wp_terms.term_group
     *
     * @return wp_terms.term_group, 
     */
    public Long getTermGroup() {
        return termGroup;
    }

    /**
     * 设置  字段:wp_terms.term_group
     *
     * @param termGroup wp_terms.term_group, 
     */
    public void setTermGroup(Long termGroup) {
        this.termGroup = termGroup;
    }
}