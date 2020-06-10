package com.john.admin.vo;

import java.io.Serializable;

/**
 * @author john_xue
 * @description 分页VO
 * @date 2020/6/6 16:29
 */
public class PageVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pageSize;
    private Integer pageNum;
    private Integer total;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PageVo{" +
                "pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                ", total=" + total +
                '}';
    }
}
