package com.dingkeji.wp.mapper.model;

public class WpPostVote {
    /**
     *  ,所属表字段为wp_post_vote.id
     */
    private Long id;

    /**
     *  ,所属表字段为wp_post_vote.user
     */
    private Integer user;

    /**
     *  ,所属表字段为wp_post_vote.post
     */
    private Integer post;

    /**
     *  ,所属表字段为wp_post_vote.rating
     */
    private String rating;

    /**
     *  ,所属表字段为wp_post_vote.ip
     */
    private String ip;

    /**
     * 获取  字段:wp_post_vote.id
     *
     * @return wp_post_vote.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:wp_post_vote.id
     *
     * @param id wp_post_vote.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:wp_post_vote.user
     *
     * @return wp_post_vote.user, 
     */
    public Integer getUser() {
        return user;
    }

    /**
     * 设置  字段:wp_post_vote.user
     *
     * @param user wp_post_vote.user, 
     */
    public void setUser(Integer user) {
        this.user = user;
    }

    /**
     * 获取  字段:wp_post_vote.post
     *
     * @return wp_post_vote.post, 
     */
    public Integer getPost() {
        return post;
    }

    /**
     * 设置  字段:wp_post_vote.post
     *
     * @param post wp_post_vote.post, 
     */
    public void setPost(Integer post) {
        this.post = post;
    }

    /**
     * 获取  字段:wp_post_vote.rating
     *
     * @return wp_post_vote.rating, 
     */
    public String getRating() {
        return rating;
    }

    /**
     * 设置  字段:wp_post_vote.rating
     *
     * @param rating wp_post_vote.rating, 
     */
    public void setRating(String rating) {
        this.rating = rating == null ? null : rating.trim();
    }

    /**
     * 获取  字段:wp_post_vote.ip
     *
     * @return wp_post_vote.ip, 
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置  字段:wp_post_vote.ip
     *
     * @param ip wp_post_vote.ip, 
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}