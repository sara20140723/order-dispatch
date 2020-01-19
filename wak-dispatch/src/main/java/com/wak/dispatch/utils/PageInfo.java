package com.wak.dispatch.utils;

/**
 * Created by Answer on 2018-12-07 17:19
 *
 * MyBatis 分页插件实体类
 */
public class PageInfo {
    /** 当前页码 */
    private int currentPage;
    /** 每页显示记录数 */
    private int pageSize;

    public PageInfo(int currentPage, int pageSize) {
        if (currentPage < 1) {
            throw new IllegalArgumentException("currentPage must gt 0");
        }
        if (pageSize < 1) {
            throw new IllegalArgumentException("pageSize must gt 0");
        }
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}