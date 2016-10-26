package com.dingkeji.wp.mapper.model;

import java.util.Date;

public class WpPosts {
    /**
     *  ,所属表字段为wp_posts.ID
     */
    private Long id;

    /**
     *  ,所属表字段为wp_posts.post_author
     */
    private Long postAuthor;

    /**
     *  ,所属表字段为wp_posts.post_date
     */
    private Date postDate;

    /**
     *  ,所属表字段为wp_posts.post_date_gmt
     */
    private Date postDateGmt;

    /**
     *  ,所属表字段为wp_posts.post_content
     */
    private String postContent;

    /**
     *  ,所属表字段为wp_posts.post_title
     */
    private String postTitle;

    /**
     *  ,所属表字段为wp_posts.post_excerpt
     */
    private String postExcerpt;

    /**
     *  ,所属表字段为wp_posts.post_status
     */
    private String postStatus;

    /**
     *  ,所属表字段为wp_posts.comment_status
     */
    private String commentStatus;

    /**
     *  ,所属表字段为wp_posts.ping_status
     */
    private String pingStatus;

    /**
     *  ,所属表字段为wp_posts.post_password
     */
    private String postPassword;

    /**
     *  ,所属表字段为wp_posts.post_name
     */
    private String postName;

    /**
     *  ,所属表字段为wp_posts.to_ping
     */
    private String toPing;

    /**
     *  ,所属表字段为wp_posts.pinged
     */
    private String pinged;

    /**
     *  ,所属表字段为wp_posts.post_modified
     */
    private Date postModified;

    /**
     *  ,所属表字段为wp_posts.post_modified_gmt
     */
    private Date postModifiedGmt;

    /**
     *  ,所属表字段为wp_posts.post_content_filtered
     */
    private String postContentFiltered;

    /**
     *  ,所属表字段为wp_posts.post_parent
     */
    private Long postParent;

    /**
     *  ,所属表字段为wp_posts.guid
     */
    private String guid;

    /**
     *  ,所属表字段为wp_posts.menu_order
     */
    private Integer menuOrder;

    /**
     *  ,所属表字段为wp_posts.post_type
     */
    private String postType;

    /**
     *  ,所属表字段为wp_posts.post_mime_type
     */
    private String postMimeType;

    /**
     *  ,所属表字段为wp_posts.comment_count
     */
    private Long commentCount;

    /**
     *  ,所属表字段为wp_posts.pooldate
     */
    private String pooldate;

    /**
     * 获取  字段:wp_posts.ID
     *
     * @return wp_posts.ID, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:wp_posts.ID
     *
     * @param id wp_posts.ID, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:wp_posts.post_author
     *
     * @return wp_posts.post_author, 
     */
    public Long getPostAuthor() {
        return postAuthor;
    }

    /**
     * 设置  字段:wp_posts.post_author
     *
     * @param postAuthor wp_posts.post_author, 
     */
    public void setPostAuthor(Long postAuthor) {
        this.postAuthor = postAuthor;
    }

    /**
     * 获取  字段:wp_posts.post_date
     *
     * @return wp_posts.post_date, 
     */
    public Date getPostDate() {
        return postDate;
    }

    /**
     * 设置  字段:wp_posts.post_date
     *
     * @param postDate wp_posts.post_date, 
     */
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    /**
     * 获取  字段:wp_posts.post_date_gmt
     *
     * @return wp_posts.post_date_gmt, 
     */
    public Date getPostDateGmt() {
        return postDateGmt;
    }

    /**
     * 设置  字段:wp_posts.post_date_gmt
     *
     * @param postDateGmt wp_posts.post_date_gmt, 
     */
    public void setPostDateGmt(Date postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    /**
     * 获取  字段:wp_posts.post_content
     *
     * @return wp_posts.post_content, 
     */
    public String getPostContent() {
        return postContent;
    }

    /**
     * 设置  字段:wp_posts.post_content
     *
     * @param postContent wp_posts.post_content, 
     */
    public void setPostContent(String postContent) {
        this.postContent = postContent == null ? null : postContent.trim();
    }

    /**
     * 获取  字段:wp_posts.post_title
     *
     * @return wp_posts.post_title, 
     */
    public String getPostTitle() {
        return postTitle;
    }

    /**
     * 设置  字段:wp_posts.post_title
     *
     * @param postTitle wp_posts.post_title, 
     */
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    /**
     * 获取  字段:wp_posts.post_excerpt
     *
     * @return wp_posts.post_excerpt, 
     */
    public String getPostExcerpt() {
        return postExcerpt;
    }

    /**
     * 设置  字段:wp_posts.post_excerpt
     *
     * @param postExcerpt wp_posts.post_excerpt, 
     */
    public void setPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt == null ? null : postExcerpt.trim();
    }

    /**
     * 获取  字段:wp_posts.post_status
     *
     * @return wp_posts.post_status, 
     */
    public String getPostStatus() {
        return postStatus;
    }

    /**
     * 设置  字段:wp_posts.post_status
     *
     * @param postStatus wp_posts.post_status, 
     */
    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus == null ? null : postStatus.trim();
    }

    /**
     * 获取  字段:wp_posts.comment_status
     *
     * @return wp_posts.comment_status, 
     */
    public String getCommentStatus() {
        return commentStatus;
    }

    /**
     * 设置  字段:wp_posts.comment_status
     *
     * @param commentStatus wp_posts.comment_status, 
     */
    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus == null ? null : commentStatus.trim();
    }

    /**
     * 获取  字段:wp_posts.ping_status
     *
     * @return wp_posts.ping_status, 
     */
    public String getPingStatus() {
        return pingStatus;
    }

    /**
     * 设置  字段:wp_posts.ping_status
     *
     * @param pingStatus wp_posts.ping_status, 
     */
    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus == null ? null : pingStatus.trim();
    }

    /**
     * 获取  字段:wp_posts.post_password
     *
     * @return wp_posts.post_password, 
     */
    public String getPostPassword() {
        return postPassword;
    }

    /**
     * 设置  字段:wp_posts.post_password
     *
     * @param postPassword wp_posts.post_password, 
     */
    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword == null ? null : postPassword.trim();
    }

    /**
     * 获取  字段:wp_posts.post_name
     *
     * @return wp_posts.post_name, 
     */
    public String getPostName() {
        return postName;
    }

    /**
     * 设置  字段:wp_posts.post_name
     *
     * @param postName wp_posts.post_name, 
     */
    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    /**
     * 获取  字段:wp_posts.to_ping
     *
     * @return wp_posts.to_ping, 
     */
    public String getToPing() {
        return toPing;
    }

    /**
     * 设置  字段:wp_posts.to_ping
     *
     * @param toPing wp_posts.to_ping, 
     */
    public void setToPing(String toPing) {
        this.toPing = toPing == null ? null : toPing.trim();
    }

    /**
     * 获取  字段:wp_posts.pinged
     *
     * @return wp_posts.pinged, 
     */
    public String getPinged() {
        return pinged;
    }

    /**
     * 设置  字段:wp_posts.pinged
     *
     * @param pinged wp_posts.pinged, 
     */
    public void setPinged(String pinged) {
        this.pinged = pinged == null ? null : pinged.trim();
    }

    /**
     * 获取  字段:wp_posts.post_modified
     *
     * @return wp_posts.post_modified, 
     */
    public Date getPostModified() {
        return postModified;
    }

    /**
     * 设置  字段:wp_posts.post_modified
     *
     * @param postModified wp_posts.post_modified, 
     */
    public void setPostModified(Date postModified) {
        this.postModified = postModified;
    }

    /**
     * 获取  字段:wp_posts.post_modified_gmt
     *
     * @return wp_posts.post_modified_gmt, 
     */
    public Date getPostModifiedGmt() {
        return postModifiedGmt;
    }

    /**
     * 设置  字段:wp_posts.post_modified_gmt
     *
     * @param postModifiedGmt wp_posts.post_modified_gmt, 
     */
    public void setPostModifiedGmt(Date postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    /**
     * 获取  字段:wp_posts.post_content_filtered
     *
     * @return wp_posts.post_content_filtered, 
     */
    public String getPostContentFiltered() {
        return postContentFiltered;
    }

    /**
     * 设置  字段:wp_posts.post_content_filtered
     *
     * @param postContentFiltered wp_posts.post_content_filtered, 
     */
    public void setPostContentFiltered(String postContentFiltered) {
        this.postContentFiltered = postContentFiltered == null ? null : postContentFiltered.trim();
    }

    /**
     * 获取  字段:wp_posts.post_parent
     *
     * @return wp_posts.post_parent, 
     */
    public Long getPostParent() {
        return postParent;
    }

    /**
     * 设置  字段:wp_posts.post_parent
     *
     * @param postParent wp_posts.post_parent, 
     */
    public void setPostParent(Long postParent) {
        this.postParent = postParent;
    }

    /**
     * 获取  字段:wp_posts.guid
     *
     * @return wp_posts.guid, 
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设置  字段:wp_posts.guid
     *
     * @param guid wp_posts.guid, 
     */
    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    /**
     * 获取  字段:wp_posts.menu_order
     *
     * @return wp_posts.menu_order, 
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     * 设置  字段:wp_posts.menu_order
     *
     * @param menuOrder wp_posts.menu_order, 
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * 获取  字段:wp_posts.post_type
     *
     * @return wp_posts.post_type, 
     */
    public String getPostType() {
        return postType;
    }

    /**
     * 设置  字段:wp_posts.post_type
     *
     * @param postType wp_posts.post_type, 
     */
    public void setPostType(String postType) {
        this.postType = postType == null ? null : postType.trim();
    }

    /**
     * 获取  字段:wp_posts.post_mime_type
     *
     * @return wp_posts.post_mime_type, 
     */
    public String getPostMimeType() {
        return postMimeType;
    }

    /**
     * 设置  字段:wp_posts.post_mime_type
     *
     * @param postMimeType wp_posts.post_mime_type, 
     */
    public void setPostMimeType(String postMimeType) {
        this.postMimeType = postMimeType == null ? null : postMimeType.trim();
    }

    /**
     * 获取  字段:wp_posts.comment_count
     *
     * @return wp_posts.comment_count, 
     */
    public Long getCommentCount() {
        return commentCount;
    }

    /**
     * 设置  字段:wp_posts.comment_count
     *
     * @param commentCount wp_posts.comment_count, 
     */
    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 获取  字段:wp_posts.pooldate
     *
     * @return wp_posts.pooldate, 
     */
    public String getPooldate() {
        return pooldate;
    }

    /**
     * 设置  字段:wp_posts.pooldate
     *
     * @param pooldate wp_posts.pooldate, 
     */
    public void setPooldate(String pooldate) {
        this.pooldate = pooldate == null ? null : pooldate.trim();
    }
}