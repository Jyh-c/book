package com.jmp.util;

/**
 * 分页工具类
 * @author JYH
 * @version 1.0
 * @date 2020/6/23 11:42
 */

public class PageBean {

    /**
     * 页码
     */
    private int page;

    /**
     * 每页条数
     */
    private int rows;

    /**
     * 总数
     */
    private int total;

    /**
     * 是否分页
     */
    private boolean pagination = true;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotal(String total) {
        this.total = Integer.parseInt(total);
    }

    public boolean isPagination() {
        return pagination;
    }

    public void setPagination(boolean pagination) {
        this.pagination = pagination;
    }

    /**
     * 获得起始记录的下标
     * @return
     */
    public int getStartIndex() {
        return (this.page - 1) * this.rows;
    }

    @Override
    public String toString() {
        return "PageBean [page=" + page + ", rows=" + rows + ", total=" + total + ", pagination=" + pagination + "]";
    }

}