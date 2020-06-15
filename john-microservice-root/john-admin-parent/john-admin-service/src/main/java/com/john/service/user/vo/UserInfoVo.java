package com.john.service.user.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.john.admin.vo.PageVo;
import com.john.core.vo.BaseVo;

/**
 * userInfo vo
 */
public class UserInfoVo extends BaseVo {

    @JsonSerialize(using = ToStringSerializer.class)
    private long id;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
