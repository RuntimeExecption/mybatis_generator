package com.dingkeji.wp.mapper.model;

import java.util.Date;

public class WpComments {
    /**
     *  ,所属表字段为wp_comments.comment_ID
     */
    private Long commentId;

    /**
     *  ,所属表字段为wp_comments.comment_post_ID
     */
    private Long commentPostId;

    /**
     *  ,所属表字段为wp_comments.comment_author
     */
    private String commentAuthor;

    /**
     *  ,所属表字段为wp_comments.comment_author_email
     */
    private String commentAuthorEmail;

    /**
     *  ,所属表字段为wp_comments.comment_author_url
     */
    private String commentAuthorUrl;

    /**
     *  ,所属表字段为wp_comments.comment_author_IP
     */
    private String commentAuthorIp;

    /**
     *  ,所属表字段为wp_comments.comment_date
     */
    private Date commentDate;

    /**
     *  ,所属表字段为wp_comments.comment_date_gmt
     */
    private Date commentDateGmt;

    /**
     *  ,所属表字段为wp_comments.comment_content
     */
    private String commentContent;

    /**
     *  ,所属表字段为wp_comments.comment_karma
     */
    private Integer commentKarma;

    /**
     *  ,所属表字段为wp_comments.comment_approved
     */
    private String commentApproved;

    /**
     *  ,所属表字段为wp_comments.comment_agent
     */
    private String commentAgent;

    /**
     *  ,所属表字段为wp_comments.comment_type
     */
    private String commentType;

    /**
     *  ,所属表字段为wp_comments.comment_parent
     */
    private Long commentParent;

    /**
     *  ,所属表字段为wp_comments.user_id
     */
    private Long userId;

    /**
     * 获取  字段:wp_comments.comment_ID
     *
     * @return wp_comments.comment_ID, 
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * 设置  字段:wp_comments.comment_ID
     *
     * @param commentId wp_comments.comment_ID, 
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取  字段:wp_comments.comment_post_ID
     *
     * @return wp_comments.comment_post_ID, 
     */
    public Long getCommentPostId() {
        return commentPostId;
    }

    /**
     * 设置  字段:wp_comments.comment_post_ID
     *
     * @param commentPostId wp_comments.comment_post_ID, 
     */
    public void setCommentPostId(Long commentPostId) {
        this.commentPostId = commentPostId;
    }

    /**
     * 获取  字段:wp_comments.comment_author
     *
     * @return wp_comments.comment_author, 
     */
    public String getCommentAuthor() {
        return commentAuthor;
    }

    /**
     * 设置  字段:wp_comments.comment_author
     *
     * @param commentAuthor wp_comments.comment_author, 
     */
    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor == null ? null : commentAuthor.trim();
    }

    /**
     * 获取  字段:wp_comments.comment_author_email
     *
     * @return wp_comments.comment_author_email, 
     */
    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }

    /**
     * 设置  字段:wp_comments.comment_author_email
     *
     * @param commentAuthorEmail wp_comments.comment_author_email, 
     */
    public void setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail == null ? null : commentAuthorEmail.trim();
    }

    /**
     * 获取  字段:wp_comments.comment_author_url
     *
     * @return wp_comments.comment_author_url, 
     */
    public String getCommentAuthorUrl() {
        return commentAuthorUrl;
    }

    /**
     * 设置  字段:wp_comments.comment_author_url
     *
     * @param commentAuthorUrl wp_comments.comment_author_url, 
     */
    public void setCommentAuthorUrl(String commentAuthorUrl) {
        this.commentAuthorUrl = commentAuthorUrl == null ? null : commentAuthorUrl.trim();
    }

    /**
     * 获取  字段:wp_comments.comment_author_IP
     *
     * @return wp_comments.comment_author_IP, 
     */
    public String getCommentAuthorIp() {
        return commentAuthorIp;
    }

    /**
     * 设置  字段:wp_comments.comment_author_IP
     *
     * @param commentAuthorIp wp_comments.comment_author_IP, 
     */
    public void setCommentAuthorIp(String commentAuthorIp) {
        this.commentAuthorIp = commentAuthorIp == null ? null : commentAuthorIp.trim();
    }

    /**
     * 获取  字段:wp_comments.comment_date
     *
     * @return wp_comments.comment_date, 
     */
    public Date getCommentDate() {
        return commentDate;
    }

    /**
     * 设置  字段:wp_comments.comment_date
     *
     * @param commentDate wp_comments.comment_date, 
     */
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    /**
     * 获取  字段:wp_comments.comment_date_gmt
     *
     * @return wp_comments.comment_date_gmt, 
     */
    public Date getCommentDateGmt() {
        return commentDateGmt;
    }

    /**
     * 设置  字段:wp_comments.comment_date_gmt
     *
     * @param commentDateGmt wp_comments.comment_date_gmt, 
     */
    public void setCommentDateGmt(Date commentDateGmt) {
        this.commentDateGmt = commentDateGmt;
    }

    /**
     * 获取  字段:wp_comments.comment_content
     *
     * @return wp_comments.comment_content, 
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * 设置  字段:wp_comments.comment_content
     *
     * @param commentContent wp_comments.comment_content, 
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    /**
     * 获取  字段:wp_comments.comment_karma
     *
     * @return wp_comments.comment_karma, 
     */
    public Integer getCommentKarma() {
        return commentKarma;
    }

    /**
     * 设置  字段:wp_comments.comment_karma
     *
     * @param commentKarma wp_comments.comment_karma, 
     */
    public void setCommentKarma(Integer commentKarma) {
        this.commentKarma = commentKarma;
    }

    /**
     * 获取  字段:wp_comments.comment_approved
     *
     * @return wp_comments.comment_approved, 
     */
    public String getCommentApproved() {
        return commentApproved;
    }

    /**
     * 设置  字段:wp_comments.comment_approved
     *
     * @param commentApproved wp_comments.comment_approved, 
     */
    public void setCommentApproved(String commentApproved) {
        this.commentApproved = commentApproved == null ? null : commentApproved.trim();
    }

    /**
     * 获取  字段:wp_comments.comment_agent
     *
     * @return wp_comments.comment_agent, 
     */
    public String getCommentAgent() {
        return commentAgent;
    }

    /**
     * 设置  字段:wp_comments.comment_agent
     *
     * @param commentAgent wp_comments.comment_agent, 
     */
    public void setCommentAgent(String commentAgent) {
        this.commentAgent = commentAgent == null ? null : commentAgent.trim();
    }

    /**
     * 获取  字段:wp_comments.comment_type
     *
     * @return wp_comments.comment_type, 
     */
    public String getCommentType() {
        return commentType;
    }

    /**
     * 设置  字段:wp_comments.comment_type
     *
     * @param commentType wp_comments.comment_type, 
     */
    public void setCommentType(String commentType) {
        this.commentType = commentType == null ? null : commentType.trim();
    }

    /**
     * 获取  字段:wp_comments.comment_parent
     *
     * @return wp_comments.comment_parent, 
     */
    public Long getCommentParent() {
        return commentParent;
    }

    /**
     * 设置  字段:wp_comments.comment_parent
     *
     * @param commentParent wp_comments.comment_parent, 
     */
    public void setCommentParent(Long commentParent) {
        this.commentParent = commentParent;
    }

    /**
     * 获取  字段:wp_comments.user_id
     *
     * @return wp_comments.user_id, 
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置  字段:wp_comments.user_id
     *
     * @param userId wp_comments.user_id, 
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}