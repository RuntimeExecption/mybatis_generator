package com.dingkeji.wp.mapper.model;

public class WpTermRelationships extends WpTermRelationshipsKey {
    /**
     *  ,所属表字段为wp_term_relationships.term_order
     */
    private Integer termOrder;

    /**
     * 获取  字段:wp_term_relationships.term_order
     *
     * @return wp_term_relationships.term_order, 
     */
    public Integer getTermOrder() {
        return termOrder;
    }

    /**
     * 设置  字段:wp_term_relationships.term_order
     *
     * @param termOrder wp_term_relationships.term_order, 
     */
    public void setTermOrder(Integer termOrder) {
        this.termOrder = termOrder;
    }
}