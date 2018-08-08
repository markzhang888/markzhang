package com.springboot.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhang on 2018-07-27.
 */
public class SysUser implements Serializable {
    private Long id;
    private Long deptId;
    private String userName;
    private String loginName;
    private String password;
    private String phone;
    private String email;
    private int ifAdmin;
    private int ifLock;
    private int ifDelete;
    private Date updateDate;
    private Date  createDate;
    private String demo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIfAdmin() {
        return ifAdmin;
    }

    public void setIfAdmin(int ifAdmin) {
        this.ifAdmin = ifAdmin;
    }

    public int getIfLock() {
        return ifLock;
    }

    public void setIfLock(int ifLock) {
        this.ifLock = ifLock;
    }

    public int getIfDelete() {
        return ifDelete;
    }

    public void setIfDelete(int ifDelete) {
        this.ifDelete = ifDelete;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }
}
