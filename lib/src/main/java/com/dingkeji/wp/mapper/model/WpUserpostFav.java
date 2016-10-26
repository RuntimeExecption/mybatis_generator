package com.dingkeji.wp.mapper.model;

public class WpUserpostFav {
    /**
     *  ,所属表字段为wp_userpost_fav.id
     */
    private Long id;

    /**
     *  ,所属表字段为wp_userpost_fav.user
     */
    private Integer user;

    /**
     *  ,所属表字段为wp_userpost_fav.post
     */
    private Integer post;

    /**
     *  ,所属表字段为wp_userpost_fav.vote_date
     */
    private Integer voteDate;

    /**
     * 获取  字段:wp_userpost_fav.id
     *
     * @return wp_userpost_fav.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:wp_userpost_fav.id
     *
     * @param id wp_userpost_fav.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:wp_userpost_fav.user
     *
     * @return wp_userpost_fav.user, 
     */
    public Integer getUser() {
        return user;
    }

    /**
     * 设置  字段:wp_userpost_fav.user
     *
     * @param user wp_userpost_fav.user, 
     */
    public void setUser(Integer user) {
        this.user = user;
    }

    /**
     * 获取  字段:wp_userpost_fav.post
     *
     * @return wp_userpost_fav.post, 
     */
    public Integer getPost() {
        return post;
    }

    /**
     * 设置  字段:wp_userpost_fav.post
     *
     * @param post wp_userpost_fav.post, 
     */
    public void setPost(Integer post) {
        this.post = post;
    }

    /**
     * 获取  字段:wp_userpost_fav.vote_date
     *
     * @return wp_userpost_fav.vote_date, 
     */
    public Integer getVoteDate() {
        return voteDate;
    }

    /**
     * 设置  字段:wp_userpost_fav.vote_date
     *
     * @param voteDate wp_userpost_fav.vote_date, 
     */
    public void setVoteDate(Integer voteDate) {
        this.voteDate = voteDate;
    }
}