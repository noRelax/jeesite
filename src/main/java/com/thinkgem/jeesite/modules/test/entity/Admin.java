package com.thinkgem.jeesite.modules.test.entity;

import com.thinkgem.jeesite.common.persistence.DataEntity;

import java.io.Serializable;
import java.util.Date;

public class Admin extends DataEntity<Admin> implements Serializable {
    private static final long serialVersionUID = 341739631852247157L;

    private String id;

    private String name;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码（加盐）
     */
    private String password;

    private String salt;

    /**
     * 媒立方用户名
     */
    private String mlfUsername;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 是否禁用
     */
    private Boolean isDisabled;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username 
	 *            用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return 密码（加盐）
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password 
	 *            密码（加盐）
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * @return 媒立方用户名
     */
    public String getMlfUsername() {
        return mlfUsername;
    }

    /**
     * @param mlfUsername 
	 *            媒立方用户名
     */
    public void setMlfUsername(String mlfUsername) {
        this.mlfUsername = mlfUsername;
    }

    /**
     * @return 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt 
	 *            创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return 是否禁用
     */
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    /**
     * @param isDisabled 
	 *            是否禁用
     */
    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }
}