package com.john.service.user.vo;

import com.john.admin.vo.PageVo;

/**
 * userInfo vo
 */
public class UserInfoVo {

    private int id;
    private String name;
    private String mail;
    //分页
    private PageVo pageVo;

    public PageVo getPageVo() {
        return pageVo;
    }

    public void setPageVo(PageVo pageVo) {
        this.pageVo = pageVo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }


}
