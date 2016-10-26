package com.dingkeji.wp.mapper.model;

public class WpTermRelationshipsKey {
    /**
     *  ,所属表字段为wp_term_relationships.object_id
     */
    private Long objectId;

    /**
     *  ,所属表字段为wp_term_relationships.term_taxonomy_id
     */
    private Long termTaxonomyId;

    /**
     * 获取  字段:wp_term_relationships.object_id
     *
     * @return wp_term_relationships.object_id, 
     */
    public Long getObjectId() {
        return objectId;
    }

    /**
     * 设置  字段:wp_term_relationships.object_id
     *
     * @param objectId wp_term_relationships.object_id, 
     */
    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    /**
     * 获取  字段:wp_term_relationships.term_taxonomy_id
     *
     * @return wp_term_relationships.term_taxonomy_id, 
     */
    public Long getTermTaxonomyId() {
        return termTaxonomyId;
    }

    /**
     * 设置  字段:wp_term_relationships.term_taxonomy_id
     *
     * @param termTaxonomyId wp_term_relationships.term_taxonomy_id, 
     */
    public void setTermTaxonomyId(Long termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }
}