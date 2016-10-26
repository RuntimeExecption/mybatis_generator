package com.dingkeji.wp.mapper.model;

public class WpTermTaxonomy {
    /**
     *  ,所属表字段为wp_term_taxonomy.term_taxonomy_id
     */
    private Long termTaxonomyId;

    /**
     *  ,所属表字段为wp_term_taxonomy.term_id
     */
    private Long termId;

    /**
     *  ,所属表字段为wp_term_taxonomy.taxonomy
     */
    private String taxonomy;

    /**
     *  ,所属表字段为wp_term_taxonomy.description
     */
    private String description;

    /**
     *  ,所属表字段为wp_term_taxonomy.parent
     */
    private Long parent;

    /**
     *  ,所属表字段为wp_term_taxonomy.count
     */
    private Long count;

    /**
     * 获取  字段:wp_term_taxonomy.term_taxonomy_id
     *
     * @return wp_term_taxonomy.term_taxonomy_id, 
     */
    public Long getTermTaxonomyId() {
        return termTaxonomyId;
    }

    /**
     * 设置  字段:wp_term_taxonomy.term_taxonomy_id
     *
     * @param termTaxonomyId wp_term_taxonomy.term_taxonomy_id, 
     */
    public void setTermTaxonomyId(Long termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }

    /**
     * 获取  字段:wp_term_taxonomy.term_id
     *
     * @return wp_term_taxonomy.term_id, 
     */
    public Long getTermId() {
        return termId;
    }

    /**
     * 设置  字段:wp_term_taxonomy.term_id
     *
     * @param termId wp_term_taxonomy.term_id, 
     */
    public void setTermId(Long termId) {
        this.termId = termId;
    }

    /**
     * 获取  字段:wp_term_taxonomy.taxonomy
     *
     * @return wp_term_taxonomy.taxonomy, 
     */
    public String getTaxonomy() {
        return taxonomy;
    }

    /**
     * 设置  字段:wp_term_taxonomy.taxonomy
     *
     * @param taxonomy wp_term_taxonomy.taxonomy, 
     */
    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy == null ? null : taxonomy.trim();
    }

    /**
     * 获取  字段:wp_term_taxonomy.description
     *
     * @return wp_term_taxonomy.description, 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置  字段:wp_term_taxonomy.description
     *
     * @param description wp_term_taxonomy.description, 
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取  字段:wp_term_taxonomy.parent
     *
     * @return wp_term_taxonomy.parent, 
     */
    public Long getParent() {
        return parent;
    }

    /**
     * 设置  字段:wp_term_taxonomy.parent
     *
     * @param parent wp_term_taxonomy.parent, 
     */
    public void setParent(Long parent) {
        this.parent = parent;
    }

    /**
     * 获取  字段:wp_term_taxonomy.count
     *
     * @return wp_term_taxonomy.count, 
     */
    public Long getCount() {
        return count;
    }

    /**
     * 设置  字段:wp_term_taxonomy.count
     *
     * @param count wp_term_taxonomy.count, 
     */
    public void setCount(Long count) {
        this.count = count;
    }
}