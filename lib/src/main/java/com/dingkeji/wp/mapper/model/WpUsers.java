package com.dingkeji.wp.mapper.model;

import java.util.Date;

public class WpUsers {
    /**
     *  ,所属表字段为wp_users.ID
     */
    private Long id;

    /**
     *  ,所属表字段为wp_users.user_login
     */
    private String userLogin;

    /**
     *  ,所属表字段为wp_users.user_pass
     */
    private String userPass;

    /**
     *  ,所属表字段为wp_users.user_nicename
     */
    private String userNicename;

    /**
     *  ,所属表字段为wp_users.user_email
     */
    private String userEmail;

    /**
     *  ,所属表字段为wp_users.user_url
     */
    private String userUrl;

    /**
     *  ,所属表字段为wp_users.user_registered
     */
    private Date userRegistered;

    /**
     *  ,所属表字段为wp_users.user_activation_key
     */
    private String userActivationKey;

    /**
     *  ,所属表字段为wp_users.user_status
     */
    private Integer userStatus;

    /**
     *  ,所属表字段为wp_users.display_name
     */
    private String displayName;

    /**
     * 获取  字段:wp_users.ID
     *
     * @return wp_users.ID, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:wp_users.ID
     *
     * @param id wp_users.ID, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取  字段:wp_users.user_login
     *
     * @return wp_users.user_login, 
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     * 设置  字段:wp_users.user_login
     *
     * @param userLogin wp_users.user_login, 
     */
    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin == null ? null : userLogin.trim();
    }

    /**
     * 获取  字段:wp_users.user_pass
     *
     * @return wp_users.user_pass, 
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * 设置  字段:wp_users.user_pass
     *
     * @param userPass wp_users.user_pass, 
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    /**
     * 获取  字段:wp_users.user_nicename
     *
     * @return wp_users.user_nicename, 
     */
    public String getUserNicename() {
        return userNicename;
    }

    /**
     * 设置  字段:wp_users.user_nicename
     *
     * @param userNicename wp_users.user_nicename, 
     */
    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename == null ? null : userNicename.trim();
    }

    /**
     * 获取  字段:wp_users.user_email
     *
     * @return wp_users.user_email, 
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置  字段:wp_users.user_email
     *
     * @param userEmail wp_users.user_email, 
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * 获取  字段:wp_users.user_url
     *
     * @return wp_users.user_url, 
     */
    public String getUserUrl() {
        return userUrl;
    }

    /**
     * 设置  字段:wp_users.user_url
     *
     * @param userUrl wp_users.user_url, 
     */
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl == null ? null : userUrl.trim();
    }

    /**
     * 获取  字段:wp_users.user_registered
     *
     * @return wp_users.user_registered, 
     */
    public Date getUserRegistered() {
        return userRegistered;
    }

    /**
     * 设置  字段:wp_users.user_registered
     *
     * @param userRegistered wp_users.user_registered, 
     */
    public void setUserRegistered(Date userRegistered) {
        this.userRegistered = userRegistered;
    }

    /**
     * 获取  字段:wp_users.user_activation_key
     *
     * @return wp_users.user_activation_key, 
     */
    public String getUserActivationKey() {
        return userActivationKey;
    }

    /**
     * 设置  字段:wp_users.user_activation_key
     *
     * @param userActivationKey wp_users.user_activation_key, 
     */
    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey == null ? null : userActivationKey.trim();
    }

    /**
     * 获取  字段:wp_users.user_status
     *
     * @return wp_users.user_status, 
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 设置  字段:wp_users.user_status
     *
     * @param userStatus wp_users.user_status, 
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 获取  字段:wp_users.display_name
     *
     * @return wp_users.display_name, 
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 设置  字段:wp_users.display_name
     *
     * @param displayName wp_users.display_name, 
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }
}